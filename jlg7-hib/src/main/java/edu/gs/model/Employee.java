package edu.gs.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
//select * from ecap_employee where first_name =?1

@NamedQueries(@NamedQuery(name = "Employee.getEmpByFname", query = "select e from employee e where e.firstName =:fname"))

@Table(name = "ecap_employee")
@Entity(name = "employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ecap_employee_gen")
	@SequenceGenerator(name = "ecap_employee_gen", sequenceName = "ecap_employee_sq", initialValue = 1, allocationSize = 1)
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
	private String oldFirstName; // Dont : persist

	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Address> addresses;

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

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public Date getToj() {
		return toj;
	}

	public void setToj(Date toj) {
		this.toj = toj;
	}

	public Date getFdoj() {
		return fdoj;
	}

	public void setFdoj(Date fdoj) {
		this.fdoj = fdoj;
	}

	public String getOldFirstName() {
		return oldFirstName;
	}

	public void setOldFirstName(String oldFirstName) {
		this.oldFirstName = oldFirstName;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
