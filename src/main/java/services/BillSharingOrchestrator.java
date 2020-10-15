package services;

import java.util.ArrayList;
import java.util.List;

import models.Expense;
import models.Group;
import models.Split;
import models.User;

public class BillSharingOrchestrator {

	static List<Group> groupsInApp;

	public BillSharingOrchestrator(List<Group> groupsInApp) {
		this.groupsInApp = groupsInApp;
	}

	public List<Group> getGroupsInApp() {
		return groupsInApp;
	}

	public void setGroupsInApp(List<Group> groupsInApp) {
		this.groupsInApp = groupsInApp;
	}

	public static void addBillToGroup(double totalCost, List<Split> splitsPerPerson, String groupName) {
		System.out.println("splitsPerPerson");
		for(Split x: splitsPerPerson) {
			System.out.println(x.getSplitSharedAmount());
		}
		for (Group group : groupsInApp) {
			if (groupName.equals(group.getGroupName())) {
				List<Expense> listOfExpenses = new ArrayList<Expense>();
				Expense expense = new Expense(totalCost, splitsPerPerson);
				listOfExpenses.add(expense);
				group.setListOfExpenses(listOfExpenses);
				System.out.println("Added expense to group");
			}
		}
	}

	public static void totalBalancesOfUser(User user) {

	}

	public static void groupWiseBalancesOfUser(String userName, List<Group> listOfGroups) {
		String totalAmountStr = "";
		double totalAmount = 0;
		for (Group group : groupsInApp) {
			List<Expense> listOfExpensesInGroup = group.getListOfExpenses();
			for (Expense exp : listOfExpensesInGroup) {
				List<Split> splits = exp.getSplits();
				for (Split split : splits) {
					
					System.out.println("split.getSplitSharedUser().equals(userName)");
					System.out.println(split.getSplitSharedUser().equals(userName));
					if (split.getSplitSharedUser().equals(userName)) {
						totalAmountStr += "" + group.getGroupName() + "-" + split.getSplitSharedAmount();
						totalAmount += split.getSplitSharedAmount();
					}
				}
			}
		}
//		Exception in thread "main" java.lang.NullPointerException
//		at services.BillSharingOrchestrator.groupWiseBalancesOfUser(BillSharingOrchestrator.java:52)
//		at Driver.main(Driver.java:80)
		
		System.out.println("*****");
		System.out.println(totalAmountStr);
		System.out.println(totalAmount);
		System.out.println("*****");		
	}
}
