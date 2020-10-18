import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import models.Expense;
import models.Group;
import models.Split;
import models.User;
import services.BillSharingOrchestrator;

public class Driver {
	public static void main(String[] args) {
		User u1 = new User("u1", "dinesh", "d@abc.com", "9999988888");
		User u2 = new User("u2", "dilip", "dr@abc.com", "9999988880");

		List<User> listOfUsers = new ArrayList<User>();
		listOfUsers.add(u1);
		listOfUsers.add(u2);
		Group g1 = new Group(listOfUsers, "group1", null);

		List<User> listOfUsers2 = new ArrayList<User>();
		User u3 = new User("u3", "Remo", "rem@abc.com", "9999988881");
		listOfUsers2.add(u3);
		Group g2 = new Group(listOfUsers2, "group2", null);
		User u4 = new User("u4", "ram", "ram@abc.com", "9999912121");
		g2.addUserToGroup(u4);
		
		
		List<Group> listOfGroups = new ArrayList<Group>();
		listOfGroups.add(g1);
		listOfGroups.add(g2);
//		BillSharingOrchestrator billSharingOrchestrator = new BillSharingOrchestrator(listOfGroups);
		BillSharingOrchestrator.setGroupsInApp(listOfGroups);

		System.out.println("welcome to bill sharing app");
		String isExit = "false";
		
		while (true) {
			System.out.println("Please type a choice:");
			System.out.print("i)Add Bill ii)GroupwiseBalances\n");
			Scanner sc = new Scanner(System.in);
			String userChoice = sc.nextLine();

			if (userChoice.equals("Add Bill")) {
//				System.out.println("***Adding Bill***");
//				System.out.println("enter total amount:\n");
//				double totalAmount = sc.nextDouble();
//				sc.nextLine();
//				System.out.println("enter people-amount: \n");
//				String amountPerHead = sc.nextLine();
//				System.out.println("enter group name: \n");
//				String groupNameToAdd = sc.nextLine();
				
				double totalAmount = 300;
				String amountPerHead = "dinesh-100,dilip-200";
				String groupNameToAdd = "group1";
				String[] splitInput = amountPerHead.split(",");
				List<Split> splitsPerPerson = new ArrayList<Split>();
				for (String s : splitInput) {
					splitsPerPerson.add(new Split(s.split("-")[0], Double.parseDouble(s.split("-")[1])));
				}
				System.out.println("adding bill1");
				BillSharingOrchestrator.addBillToGroup(totalAmount, splitsPerPerson, groupNameToAdd);
				
				
				System.out.println("adding bill2");
				amountPerHead = "dinesh-250,dilip-250";
				splitInput = amountPerHead.split(",");
				splitsPerPerson = new ArrayList<Split>();
				for (String s : splitInput) {
					splitsPerPerson.add(new Split(s.split("-")[0], Double.parseDouble(s.split("-")[1])));
				}
				BillSharingOrchestrator.addBillToGroup(500, splitsPerPerson,"group1");
			} else if (userChoice.equals("GroupwiseBalances")) {
				System.out.println("Getting Group wise Bill:");
				BillSharingOrchestrator.groupWiseBalancesOfUser("dinesh", listOfGroups);
			} else {
				System.out.println("**Invalid Choice**");
			}

//			System.out.println("Do you want to Exit App(enter true/false)?");
//			sc.nextLine();
//			isExit = sc.nextLine();
//			if (isExit.equals("false")) {
//				break;
//			}
		}
	}
}
