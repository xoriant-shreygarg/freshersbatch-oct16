package OneToMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "MARKET")
public class Market {

	@Id
	@GeneratedValue
	@Column(name = "M_ID")
	private int id;

	@Column(name = "NAME")
	private String name;

	@OneToMany(mappedBy = "market", cascade = { CascadeType.ALL })
	private List<Stock> stocks;

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

	public List<Stock> getStocks() {
		return stocks;
	}

	public void setStocks(List<Stock> stocks) {
		this.stocks = stocks;
	}

	@Override
	public String toString() {
		return "Market [id=" + id + ", name=" + name + ", stocks=" + stocks + "]";
	}

	public Market(String name, List<Stock> stocks) {
		super();
		this.name = name;
		this.stocks = stocks;
	}

	public Market() {
		super();
	}

}
