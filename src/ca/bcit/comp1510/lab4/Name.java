/**
 * 
 */
package ca.bcit.comp1510.lab4;

/**
 * Class Name1.
 * @author nirajanmanandhar
 * @version 1.0
 *
 */
public class Name {
    /**First.**/
    private String first;
    
    /**Second.**/
    private String middle;
    
    /**Third.**/
    private String last;
    
    /**
     * Javadoc.
     * @param firstName used
     * @param middleName used
     * @param lastName used 
    **/
    public Name(String firstName, String middleName, String lastName) {
        
        first = firstName;
        middle = middleName;
        last = lastName;
        
    }
    
    /**
     * Gets a first name.
     * @return used
     */
    public String getFirstName() {
        return first;
    }
    
    /**
     * Gets a last name.
     * @return used
     */
    public String getLastName() {
        return last;
    }
    
    /**
     * Gets a middle name.
     * @return used
     */
    public String getMiddleName() {
        return first;
    }
    
    
    /**
     * Sets the first name.
     * @param firstName used
     */
    public void setFirstName(String firstName) {
        first = firstName;
    }
    
    /**
     * Sets the middle name.
     * @param middleName used
     */
    public void setMiddleName(String middleName) {
        middle = middleName;
    }
    
    /**
     * Sets the last name.
     * @param lastName used
     */
    public void setLastName(String lastName) {
        last = lastName;
    }
    
    /**
     * Prints a concatonated string.
     * @return used
     */
    public String toString() {
        return first + middle + last;
    }

}
