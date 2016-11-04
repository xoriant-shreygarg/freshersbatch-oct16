package OneToOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ENQUIRY")
public class Enquiry {

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private int id;
	
	@Column(name = "QUERY")
	private String query;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	@Override
	public String toString() {
		return "Enquiry [id=" + id + ", query=" + query + "]";
	}

	public Enquiry() {
		super();
	}

	public Enquiry(String query) {
		super();
		this.query = query;
	}
	
}
