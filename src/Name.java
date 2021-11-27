/**
* F21SF Assignment 1
* This class handles the names for each competitor and
* provides methods for displaying the names in various formats
* @author zeyad
*/
public class Name
{
	// Instance variables
	private String firstName;
	private String middleName;
	private String lastName;
 
	// Constructors 
	public Name(String firstName, String middleName, String lastName)
	{
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}
	
	public Name(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.middleName = "";
		this.lastName = lastName;
	}
	
	// Looks for each element of the competitors' full name and assigns them to instance variables.
	public Name(String fullName)
	{
		int spacePos1 = fullName.indexOf(' ');
		int spacePos2 = fullName.lastIndexOf(' ');
		firstName = fullName.substring(0, spacePos1);
		// Checks the middle name exists or not, if so assigns it accordingly
		if (spacePos1 == spacePos2)
		{
			middleName = "";
		}
		else
		{
			middleName = fullName.substring(spacePos1+1, spacePos2);
		}
		lastName = fullName.substring(spacePos2 + 1);
	} 

	// Methods to get instance variables
	public String getFirstName()             { return firstName;                     }
	public String getMiddleName()            { return middleName;                    }
	public String getLastName()              { return lastName;                      }
	
	// Sets the last name with a string input
	public void setLastName(String lastName) { this.lastName = lastName;             }
	
	// Gets the first and last names with a space in between
	public String getFirstLastName() { return firstName + " " + lastName;            }

	// Gets the last name followed by a comma then the first name
	public String getLastThenFirst() { return lastName + ", " + firstName;           }
	
	// Gets the initial, period then the last name
	public String getInitThenLast()  { return firstName.charAt(0) + ". " + lastName; }
	
	// Gets full name including first, middle (if applicable) and last
	public String getFullName()
	{
		String result = firstName+" ";
		// Checks if middle name exists, if so adds it to return
		if (!middleName.equals("")) { result += middleName+" "; }
		result += lastName;
		return result;
	}
}
