package models;

import java.util.List;

public class Group {
	private List<User> usersInGroup;
	private String groupName;
	private List<Expense> listOfExpenses;

	public Group(List<User> usersInGroup, String groupName, List<Expense> listOfExpenses) {
		super();
		this.usersInGroup = usersInGroup;
		this.groupName = groupName;
		this.listOfExpenses = listOfExpenses;
	}
	
	public void addUserToGroup(User user) {
		this.usersInGroup.add(user);
	}


	public List<User> getUsersInGroup() {
		return usersInGroup;
	}

	public void setUsersInGroup(List<User> usersInGroup) {
		this.usersInGroup = usersInGroup;
	}
	

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public List<Expense> getListOfExpenses() {
		return listOfExpenses;
	}

	public void setListOfExpenses(List<Expense> listOfExpenses) {
		this.listOfExpenses = listOfExpenses;
	}
}
