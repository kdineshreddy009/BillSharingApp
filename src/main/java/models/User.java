package models;

public class User {
	private String userName;
	private String userId;
	private String mobileNumber;
	private String emailId;

	public User(String name, String id, String mobile, String mailId) {
		this.userName = name;
		this.emailId = mailId;
		this.mobileNumber = mobile;
		this.userId = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
}
