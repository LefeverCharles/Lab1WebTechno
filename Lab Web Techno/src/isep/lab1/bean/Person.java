package isep.lab1.bean;


/**
 * Session Bean implementation class Person
 */

public class Person {
	
	private String firstName;
	private String lastName;
	private String birthDay;
	private String sex;
    /**
     * Default constructor. 
     */
    public Person() {
        // TODO Auto-generated constructor stub
    }
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

    
}
