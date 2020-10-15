package models;

import java.util.List;

public class Expense {
	private double totalAmount;
	private List<Split> splits;
   //	hashmap
	
	public Expense(double totalAmount, List<Split> splits) {
		this.totalAmount = totalAmount;
		this.splits = splits;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public List<Split> getSplits() {
		return splits;
	}

	public void setSplits(List<Split> splits) {
		this.splits = splits;
	}
}
