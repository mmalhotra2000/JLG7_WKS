package edu.gyansetu.tcs.eqaulscontract;

public class Department {
	private long did;
	private String dname;

	public Department(long did, String dname) {
		super();
		this.did = did;
		this.dname = dname;
	}

	public long getDid() {
		return did;
	}

	public void setDid(long did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (did ^ (did >>> 32));
		result = prime * result + ((dname == null) ? 0 : dname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Department))
			return false;
		Department other = (Department) obj;
		if (did != other.did)
			return false;
		if (dname == null) {
			if (other.dname != null)
				return false;
		} else if (!dname.equals(other.dname))
			return false;
		return true;
	}

}
