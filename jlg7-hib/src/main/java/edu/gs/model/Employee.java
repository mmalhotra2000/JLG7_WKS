package edu.gs.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Table(name = "ecap_employee")
@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	// first_name
	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;
	
	@Temporal(TemporalType.DATE)
	private Date doj;
	
	@Temporal(TemporalType.TIME)
	private Date toj;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fdoj;
	
	@Transient
	private String oldFirstName; //  Dont : persist 

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	public Employee(String firstName, String lastName, Date doj, Date toj, Date fdoj, String oldFirstName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.doj = doj;
		this.toj = toj;
		this.fdoj = fdoj;
		this.oldFirstName = oldFirstName;
	}





	public Employee(long id, String firstName, String lastName, Date doj, Date toj, Date fdoj, String oldFirstName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.doj = doj;
		this.toj = toj;
		this.fdoj = fdoj;
		this.oldFirstName = oldFirstName;
	}





	public Employee(long id, String firstName, String lastName, Date doj, Date toj, Date fdoj) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.doj = doj;
		this.toj = toj;
		this.fdoj = fdoj;
	}



	public Employee(long id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
