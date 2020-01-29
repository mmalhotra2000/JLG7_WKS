package edu.gs.test;

public class EmpAddTempModel {

	private String addLine1;
	private String fName;
	private String doj;

	public EmpAddTempModel(String addLine1, String fName, String doj) {
		super();
		this.addLine1 = addLine1;
		this.fName = fName;
		this.doj = doj;
	}

	public String getAddLine1() {
		return addLine1;
	}

	public void setAddLine1(String addLine1) {
		this.addLine1 = addLine1;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	@Override
	public String toString() {
		return "EmpAddTempModel [addLine1=" + addLine1 + ", fName=" + fName + ", doj=" + doj + "]";
	}

}
