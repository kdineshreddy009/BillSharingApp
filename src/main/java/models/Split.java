package models;

public class Split {
	private String splitSharedUser;
	private double splitSharedAmount;

	public Split(String splitSharedUser, double splitSharedAmount) {
		this.splitSharedUser = splitSharedUser;
		this.splitSharedAmount = splitSharedAmount;
	}

	public String getSplitSharedUser() {
		return splitSharedUser;
	}

	public void setSplitSharedUser(String splitSharedUser) {
		this.splitSharedUser = splitSharedUser;
	}

	public double getSplitSharedAmount() {
		return splitSharedAmount;
	}

	public void setSplitSharedAmount(double splitSharedAmount) {
		this.splitSharedAmount = splitSharedAmount;
	}

}
