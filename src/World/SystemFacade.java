/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package World;

import DataAccess.AgentDAO;
import DataAccess.CustomerDAO;
import DataAccess.OwnerDAO;

/**
 *
 * @author adrian
 */
public class SystemFacade implements ISystemFacade{

    public SystemFacade() {
    }   
    
    @Override
    public boolean searchPerson(String username, String password, String personType) {
          
        if (personType.compareTo("Agent") == 0){
            return AgentDAO.searchAgent(username, password);
        }else if(personType.compareTo("Customer") == 0){
            return CustomerDAO.searchCustomer(username, password);
        }else{
            return OwnerDAO.searchOwner(username, password);
        }
        
    }

    @Override
    public Person loadPerson(String username, String personType) {
        
        if (personType.compareTo("Agent") == 0){
            return AgentDAO.LoadAgent(username);
        }else if(personType.compareTo("Customer") == 0){
            return null;
        }else{
            return null;
        }
       
    }

    @Override
    public boolean createUser(User user, String userType) {
        boolean success = false;
        if (userType.compareTo("Customer") == 0){
            success = CustomerDAO.createCustomer((Customer) user);
        }else{
            success = OwnerDAO.createOwner((Owner) user);
        }
        return success;
    }
    
}
