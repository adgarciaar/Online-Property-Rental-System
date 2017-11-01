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
        
        boolean b = false;        
        switch (personType) {
            case "Agent":
                return AgentDAO.searchAgent(username, password);
            case "Customer":
                return CustomerDAO.searchCustomer(username, password);
            case "Owner":
                return OwnerDAO.searchOwner(username, password);
        }
        return b;        
    }
    
}
