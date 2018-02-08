/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package propercontactmanager;

/**
 *
 * @author Sebastian
 */
public class ContactApp{
    
    Contact[] contacts = new Contact[100];
    
    int contactCount = 0;
    
    
    public String[] getContactFields(int selected){
    
        if (selected > -1) {
            
            Contact c = contacts[selected];
            
            String[] fields = new String[4];
            fields[0] = c.getFirstName();
            fields[1] = c.getLastName();
            fields[2] = c.getPhoneNumber();
            fields[3] = c.getEmail();
            
            return fields;
        } else {
            return null;
        }
    }
    
    public String[] getContactsList() {

        String[] stringArray = new String[contacts.length];
        for (int i = 0; i < contacts.length; i++) {
            stringArray[i] = contacts.toString();
            }
        return stringArray;
    }
    
    void addContact(String firstName, String lastName, String phoneNumber, String email) {
        
        Contact newC = new Contact(firstName, lastName, phoneNumber, email);
        
        newC.setFirstName(firstName);
        newC.setLastName(lastName);
        newC.setPhoneNumber(phoneNumber);
        newC.setEmail(email);
            
        contacts[contactCount++] = newC;
        
    }
    
    void deleteContact(Contact c) {
        
        delete contacts[c];
        contacts[c] = null;
        
    }
    
    void editContact(Contact c, String firstName, String lastName, String phoneNumber, String email) {
        
        c.setFirstName(firstName);
        c.setLastName(lastName);
        c.setPhoneNumber(phoneNumber);
        c.setEmail(email);
    }
    
}



