package vn.com.journaltechlog.entities;

import vn.com.journaltechlog.utils.StringUtils;

public class User {
	private String id;
	private String firstName;
	private String lastName;
	private int gender;
	private long dateOfBirth;
	private String email;
	private String phone;
	private String address;
	private String username;
	private String password;
	private long dateOfCreate;
	
	public User(String id, String firstName, String lastName, String email, String username, String password,
			long dateOfCreate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.username = username;
		setPassword(password);
		this.dateOfCreate = dateOfCreate;
	}

	public User(String id, String firstName, String lastName, int gender, long dateOfBirth, String email, String phone,
			String address, String username, String password, long dateOfCreate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.username = username;
		setPassword(password);
		this.dateOfCreate = dateOfCreate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public long getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(long dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public boolean checkPassword(String password) {
		String encyptString = StringUtils.encyptionString(password);
		if(password.equals(encyptString)) {
			return true;
		}
		else return false;
	}

	public void setPassword(String password) {
		this.password = StringUtils.encyptionString(password);
	}

	public long getDateOfCreate() {
		return dateOfCreate;
	}

	public void setDateOfCreate(long dateOfCreate) {
		this.dateOfCreate = dateOfCreate;
	}
	
}
