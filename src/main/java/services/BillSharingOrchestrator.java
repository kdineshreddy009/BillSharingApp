package services;

import java.util.ArrayList;
import java.util.List;

import models.Expense;
import models.Group;
import models.Split;
import models.User;

public class BillSharingOrchestrator {
	// Keeping groups in the App as static for simplicity
	static List<Group> groupsInApp;

	public static List<Group> getGroupsInApp() {
		return groupsInApp;
	}

	public static void setGroupsInApp(List<Group> groups) {
		groupsInApp = groups;
	}

	public static void addBillToGroup(double totalCost, List<Split> splitsPerPerson, String groupName) {
		List<Group> groups = BillSharingOrchestrator.getGroupsInApp();
		for (Group group : groups) {
			if (groupName.equals(group.getGroupName())) {

				List<Expense> listOfExpenses = group.getListOfExpenses() == null ? new ArrayList<Expense>()
						: group.getListOfExpenses();
				Expense expense = new Expense(totalCost, splitsPerPerson);
				listOfExpenses.add(expense);
				group.addListOfExpenses(listOfExpenses);
			}
		}
		System.out.println("Added expense to group");
	}

//	public static void totalBalancesOfUser(User user) {
//
//	}

	public static void groupWiseBalancesOfUser(String userName, List<Group> listOfGroups) {
		String totalAmountStr = "";
		double totalAmount = 0;
		listOfGroups = BillSharingOrchestrator.getGroupsInApp();
		for (Group group : listOfGroups) {
			List<Expense> listOfExpensesInGroup = group.getListOfExpenses();
			if (listOfExpensesInGroup != null) {
				for (Expense exp : listOfExpensesInGroup) {
					List<Split> splits = exp.getSplits();
					for (Split split : splits) {
						if (split.getSplitSharedUser().equals(userName)) {
							totalAmountStr += "" + group.getGroupName() + "-" + split.getSplitSharedAmount();
							totalAmount += split.getSplitSharedAmount();
						}
					}
				}
			}

		}
		System.out.println("Amount of User: " + userName + "groupwise");
		System.out.println(totalAmountStr);
		System.out.print("Total Amount of User: " + userName);
		System.out.println(totalAmount);
	}
}
