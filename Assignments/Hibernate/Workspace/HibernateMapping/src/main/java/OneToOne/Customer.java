package OneToOne;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "CUSTOMER")
public class Customer {

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private int id;

	@Column(name = "NAME")
	private String name;

	@OnDelete(action=OnDeleteAction.CASCADE)
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "ENQUIRY")
	private Enquiry enquiry;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Enquiry getEnquiry() {
		return enquiry;
	}

	public void setEnquiry(Enquiry enquiry) {
		this.enquiry = enquiry;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", enquiry=" + enquiry + "]";
	}

	public Customer(String name, Enquiry enquiry) {
		super();
		this.name = name;
		this.enquiry = enquiry;
	}

	public Customer() {
		super();
	}
	
}