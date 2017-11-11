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
import java.util.HashMap;

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
    public boolean createProperty(Property property) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HashMap<Integer, Location> retrieveLocations() {
        return LocationDAO.retrieveLocations();
    }

    @Override
    public HashMap<Integer, Country> retrieveCountries() {
        return CountryDAO.retrieveCountries();
    }
    
}
