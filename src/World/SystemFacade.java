/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package World;

import DataAccess.AgentDAO;
import DataAccess.CountryDAO;
import DataAccess.CreditCardDAO;
import DataAccess.CustomerDAO;
import DataAccess.LocationDAO;
import DataAccess.OwnerDAO;
import DataAccess.PhotoDAO;
import DataAccess.PropertyDAO;
import DataAccess.RentDAO;
import DataAccess.RentRequestDAO;
import DataAccess.VisitDAO;
import java.io.IOException;
import java.util.HashMap;
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

    @Override
    public LinkedHashMap<Integer, Property> propertiesByCriteria(String type, 
            String numberRooms, String minRent, String maxRent, HashMap<Integer, String> listSelectedLocations) {
        try {
            return PropertyDAO.searchPropertiesByCriteria(type, numberRooms, minRent, maxRent, listSelectedLocations);
        } catch (IOException ex) {
            Logger.getLogger(SystemFacade.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public String retrieveNameLocation(int idLocation) {
        return LocationDAO.retrieveNameLocation(idLocation);
    }

    @Override
    public String retrieveNameCountry(int idCountry) {
        return CountryDAO.retrieveNameCountry(idCountry);
    }

    @Override
    public LinkedHashMap<Integer, Photo> retrievePhotos(int propertyId, String order) {
        try {
            return PhotoDAO.retrievePhotos(propertyId, order);
        } catch (IOException ex) {
            Logger.getLogger(SystemFacade.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public boolean scheduleVisit(Visit visit) {
        return VisitDAO.scheduleVisit(visit);
    }

    @Override
    public boolean searchVisitsByCustomerProperty(int idCustomer, int idProperty) {
        return VisitDAO.searchVisitsByCustomerProperty(idCustomer, idProperty);
    }

    @Override
    public boolean validateRentCostumer(int idCustomer, int idProperty) {
        return CustomerDAO.validateRentCostumer(idCustomer, idProperty);
    }

    @Override
    public LinkedHashMap<Integer, Property> searchPropertiesFromVisitingList(int idCustomer) {
        try {
            return PropertyDAO.searchPropertiesFromVisitingList(idCustomer);
        } catch (IOException ex) {
            Logger.getLogger(SystemFacade.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public LinkedHashMap<Integer, Visit> retrieveVisits(int idCustomer, int idProperty) {
        return VisitDAO.retrieveVisits(idCustomer, idProperty);
    }

    @Override
    public boolean addCreditCard(CreditCard creditCard) {
        return CreditCardDAO.addCreditCard(creditCard);
    }

    @Override
    public boolean addRentRequest(RentRequest rentRequest) {
        return RentRequestDAO.addRentRequest(rentRequest);
    }

    @Override
    public boolean addRent(Rent rent) {
        return RentDAO.addRent(rent);
    }

    @Override
    public boolean updateEmail(int idCustomer, String email) {
        return CustomerDAO.updateEmail(idCustomer, email);
    }

    @Override
    public int getLastIdRentRequest(int idCustomer, int idProperty) {
        return RentRequestDAO.getLastIdRentRequest(idCustomer, idProperty);
    }

    @Override
    public LinkedHashMap<Integer, Property> buscarPropiedadesPorAprobar() {
        try {
            return PropertyDAO.buscarPropiedadesPorAprobar();
        } catch (IOException ex) {
            Logger.getLogger(SystemFacade.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public String traerNombrePropietario(int idPropietario) {
        return OwnerDAO.traerNombrePropietario(idPropietario);
    }

    @Override
    public boolean activarPropiedadPendiente(int idPropiedad) {
        return PropertyDAO.activarPropiedadPendiente(idPropiedad);
    }
    
}
