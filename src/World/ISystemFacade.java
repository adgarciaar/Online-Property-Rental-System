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
    
}
