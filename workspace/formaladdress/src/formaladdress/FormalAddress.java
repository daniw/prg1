/**
 * FormalAddress can create Formal forms of adresses concerning the age and 
 * gender of a person. 
 *
 * @author Daniel Winz
 * @version 2013.10.10
 */
package formaladdress;

import java.util.Calendar;

public class FormalAddress
{
    // Prename of the person
    private String prename;
    // Surname
    private String surname;
    // Year of birth
    private int year;
    // Gender of the person
    private boolean gender;

    /**
     * Create a new person with given prename, surname and gender. 
     */
    public FormalAddress(String newprename, String newsurname, int newyear, boolean newgender)
    {
        prename = newprename;
        surname = newsurname;
        year = newyear;
        gender = newgender;
    }

    /**
     * Create a formal form of address. 
     */
    public String createFormalFormOfAddress(int today)
    {
    	String ffoa;
    	if((today - year) <= 16) {
    		ffoa = "Hello " + prename;
    	}
    	else {
    		if(gender == true) {
    			ffoa = "Dear Mr. " + surname;
    		}
    		else {
    			ffoa = "Dear Ms. " + surname;
    		}
    	}
        return ffoa;
    }

    /**
     * Create a formal form of address. 
     */
    public String createFormalFormOfAddress()
    {
    	String ffoa;
    	if((Calendar.getInstance().get(Calendar.YEAR) - year) <= 16) {
    		ffoa = "Hello " + prename;
    	}
    	else {
    		if(gender == true) {
    			ffoa = "Dear Mr. " + surname;
    		}
    		else {
    			ffoa = "Dear Ms. " + surname;
    		}
    	}
    	return ffoa;
    }

}
