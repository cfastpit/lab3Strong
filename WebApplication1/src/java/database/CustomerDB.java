package database;

import domain.Customer;
import domain.LoginException;
import java.util.ArrayList;

public class CustomerDB {
    
    private static ArrayList<Customer> customerList = new ArrayList<Customer>(5);
    
    public static void add(Customer c) {
        customerList.add(c);
    }
    
    public static Customer find(int id) {
        for(int i = 0; i < customerList.size(); i++)
            if(customerList.get(i).getCustomerId() == id)
                return customerList.get(i);
        return null;
    }
    
    public static Customer get(int i) {
        return customerList.get(i);
    }
    
    public static int getNumberOfCustomers() {
        return customerList.size();
    }
    
    public static void initialize(){
        if (customerList.size() <= 0) {
            Customer c;
        
            c = new Customer();
            c.setCustomerId(100);
            c.setCustomerName("Customer One");
            c.setCustomerPhoneNumber(5551212);
            c.setUserID("x");
            c.setPassword("x");
            c.add();
       
            c = new Customer();
            c.setCustomerId(200);
            c.setCustomerName("Customer Two");
            c.setCustomerPhoneNumber(4172121);
            c.setUserID("Cust2");
            c.setPassword("cust2");
            c.add();
       
            c = new Customer();
            c.setCustomerId(300);
            c.setCustomerName("Customer Three");
            c.setCustomerPhoneNumber(5553125);
            c.setUserID("Cust3");
            c.setPassword("cust3");
            c.add();
        }
    }
    
    public static Customer login(String uid, String pass) throws LoginException {
        Customer c = null;
        
        for (int i = 0; i < customerList.size(); i++) {
            
            if (uid.equals(customerList.get(i).getUserID())){
                c = customerList.get(i);
                if (pass.equals(c.getPassword())){
                    return c;
                }
                LoginException e = new LoginException("Invalid Password");
                throw e;
            }
        }
        LoginException e = new LoginException("User Id not Found");
        throw e;
    }
}