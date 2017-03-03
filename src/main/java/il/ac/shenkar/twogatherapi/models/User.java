package il.ac.shenkar.twogatherapi.models;

import il.ac.shenkar.twogatherapi.enums.DisabilityType;
import il.ac.shenkar.twogatherapi.enums.UserType;

import java.util.List;

public class User {

	private int id;
	private String username;
	private String firstName;
	private String lastName;
	private List<DisabilityType> disabilityTypes;
	private UserType userType;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public List<DisabilityType> getDisabilityTypes() {
		return disabilityTypes;
	}

	public void setDisabilityTypes(List<DisabilityType> disabilityTypes) {
		this.disabilityTypes = disabilityTypes;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	@Override public String toString() {
		return "User{" + "id=" + id + ", username='" + username + '\'' + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\''
				+ ", disabilityTypes=" + disabilityTypes + ", userType=" + userType + '}';
	}
}
