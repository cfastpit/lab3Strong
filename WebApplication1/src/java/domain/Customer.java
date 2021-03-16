package domain;

import database.CustomerDB;

public class Customer {
    private int customerId;
    private String customerName;
    private int customerPhoneNumber;
    private String password;
    private String userID;
    
    public void add() {
        CustomerDB.add(this);
    }
    
    public static Customer find(int id){
        return CustomerDB.find(id);
    }
    
    public static Customer get(int i) {
        return CustomerDB.get(i);
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }
    
    public int getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }
    
    public static int getNumberOfCustomers() {
        return CustomerDB.getNumberOfCustomers();
    }

    public String getPassword() {
        return password;
    }

    public String getUserID() {
        return userID;
    }
    
    public static void initialize(){
        CustomerDB.initialize();
    }
    
    public static Customer login(String uid, String pass) throws LoginException {
        return CustomerDB.login(uid, pass);
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setCustomerName(String name) {
        this.customerName = name;
    }
  
    public void setCustomerPhoneNumber(int phoneNumber) {
        this.customerPhoneNumber = phoneNumber;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
    
    public String toString() {
        return customerId + "   " + getCustomerName() + "   " + getCustomerPhoneNumber();
    }
}