package edu.gyansetu.tcs.oops.revision.baisc;

public class Acc {

	private long accNum;
	private String accType;
	private long balance;
	
	
	

	public Acc(long accNum, String accType, long balance) {
		super();
		this.accNum = accNum;
		this.accType = accType;
		this.balance = balance;
	}

	public Acc(long accNu, String accType) {
		accNum = accNu;
		this.accType = accType;
	}

	public Acc() {

	}

	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(Acc acc, Acc acc2, long accNum) {
		acc.accNum = accNum;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}
	

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	@Override
	public String toString() {
		return "Acc [accNum=" + accNum + ", accType=" + accType + ", balance=" + balance + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Acc other = (Acc) obj;
		if (accNum != other.accNum)
			return false;
		if (accType == null) {
			if (other.accType != null)
				return false;
		} else if (!accType.equals(other.accType))
			return false;
		if (balance != other.balance)
			return false;
		return true;
	}

	

}
