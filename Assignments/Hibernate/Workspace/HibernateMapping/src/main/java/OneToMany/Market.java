package OneToMany;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "MARKET")
public class Market {

	@Id
	@GeneratedValue
	@Column(name = "M_ID")
	private int id;

	@Column(name = "NAME")
	private String name;

	@OnDelete(action=OnDeleteAction.CASCADE)
	@OneToMany(mappedBy = "market", cascade = { CascadeType.ALL })
	private Set<Stock> stocks;

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

	public Set<Stock> getStocks() {
		return stocks;
	}

	public void setStocks(Set<Stock> stocks) {
		this.stocks = stocks;
	}

	@Override
	public String toString() {
		return "Market [id=" + id + ", name=" + name + ", stocks=" + stocks + "]";
	}

	public Market(String name, Set<Stock> stocks) {
		super();
		this.name = name;
		this.stocks = stocks;
	}

	public Market() {
		super();
	}

}