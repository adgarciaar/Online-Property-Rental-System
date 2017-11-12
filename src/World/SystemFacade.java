/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package World;

import DataAccess.AgentDAO;
import DataAccess.CountryDAO;
import DataAccess.CustomerDAO;
import DataAccess.LocationDAO;
import DataAccess.OwnerDAO;
import DataAccess.PropertyDAO;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adrian
 */
public class SystemFacade implements ISystemFacade{

    public SystemFacade() {
    }   
    
    @Override
    public Person searchPerson(String username, String password, String personType) {
          
        if (personType.compareTo("Agent") == 0){
            return AgentDAO.searchAgent(username, password);
        }else if(personType.compareTo("Customer") == 0){
            return CustomerDAO.searchCustomer(username, password);
        }else{
            return OwnerDAO.searchOwner(username, password);
        }
        
    }

    @Override
    public boolean createUser(User user) {        
        if (user instanceof Customer){
            return CustomerDAO.createCustomer((Customer) user);
        }else{
            return OwnerDAO.createOwner((Owner) user);        
        }
       
    }

    @Override
    public boolean validateUsername(String username, String userType) {       
        if (userType.compareTo("Customer") == 0){
            return CustomerDAO.validateUsername(username);
        }else{
            return OwnerDAO.validateUsername(username);
        }        
    }

    @Override
    public boolean deleteUser(User user) {
        if (user instanceof Customer){
            return CustomerDAO.deleteCustomer((Customer) user);
        }else{
            return OwnerDAO.deleteOwner((Owner) user);     
        }
    }

    @Override
    public boolean addProperty(Property property) {
        return PropertyDAO.addProperty(property);
    }

    @Override
    public LinkedHashMap<Integer, Location> retrieveLocations() {
        return LocationDAO.retrieveLocations();
    }

    @Override
    public LinkedHashMap<Integer, Country> retrieveCountries() {
        return CountryDAO.retrieveCountries();
    }

    @Override
    public LinkedHashMap<Integer,Property> propertiesByOwner(int idOwner, String order) {
        try {
            return PropertyDAO.searchPropertiesByOwner(idOwner, order);
        } catch (IOException ex) {
            Logger.getLogger(SystemFacade.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public boolean deleteProperty(int idProperty) {
        return PropertyDAO.deleteProperty(idProperty);
    }
    
}
