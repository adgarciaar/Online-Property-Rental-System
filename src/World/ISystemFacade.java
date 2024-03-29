/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package World;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 *
 * @author adrian
 */
public interface ISystemFacade {
    
    public Person searchPerson(String username, String password, String personType);
    
    public boolean createUser(User user);
    
    public boolean validateUsername(String username, String userType);
    
    public boolean deleteUser(User user);
    
    public boolean addProperty(Property property);
    
    public LinkedHashMap<Integer, Location> retrieveLocations();
    
    public LinkedHashMap<Integer, Country> retrieveCountries();
    
    public LinkedHashMap<Integer,Property> propertiesByOwner(int idOwner, String order);
    
    public boolean deleteProperty(int idProperty);
    
    public LinkedHashMap<Integer,Property> propertiesByCriteria(String type,
            String numberRooms, String minRent,String maxRent,HashMap<Integer,String> listSelectedLocations);
    
    public String retrieveNameLocation(int idLocation);
    
    public String retrieveNameCountry(int idCountry);
    
    public LinkedHashMap<Integer, Photo> retrievePhotos(int propertyId, String order);
    
    public boolean scheduleVisit(Visit visit);
    
    public boolean searchVisitsByCustomerProperty(int idCustomer, int idProperty);
    
    public boolean validateRentCostumer(int idCustomer, int idProperty);
    
    public LinkedHashMap<Integer,Property> searchPropertiesFromVisitingList(int idCustomer);
    
    public LinkedHashMap<Integer, Visit> retrieveVisits(int idCustomer, int idProperty);
    
    public boolean addCreditCard(CreditCard creditCard);
    
    public boolean addRentRequest(RentRequest rentRequest);
    
    public boolean addRent(Rent rent);
    
    public boolean updateEmail(int idCustomer, String email);
    
    public int getLastIdRentRequest(int idCustomer, int idProperty);
    
    public LinkedHashMap<Integer,Property> buscarPropiedadesPorAprobar();
    
    public String traerNombrePropietario(int idPropietario);
    
    public boolean activarPropiedadPendiente(int idPropiedad);
    
}
