package vo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Buyer entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "buyer", catalog = "booksales")

public class Buyer implements java.io.Serializable {

	// Fields

	private Integer buyerId;
	private Customer customer;
	private String buyerName;
	private String buyerAccount;
	private String buyerPassword;
	private Date createdDate;
	private Integer buyFrequency;
	private Set<Ordermain> ordermains = new HashSet<Ordermain>(0);

	// Constructors

	/** default constructor */
	public Buyer() {
	}

	/** minimal constructor */
	public Buyer(Integer buyerId, Customer customer, String buyerName, String buyerAccount, String buyerPassword,
			Date createdDate, Integer buyFrequency) {
		this.buyerId = buyerId;
		this.customer = customer;
		this.buyerName = buyerName;
		this.buyerAccount = buyerAccount;
		this.buyerPassword = buyerPassword;
		this.createdDate = createdDate;
		this.buyFrequency = buyFrequency;
	}

	/** full constructor */
	public Buyer(Integer buyerId, Customer customer, String buyerName, String buyerAccount, String buyerPassword,
			Date createdDate, Integer buyFrequency, Set<Ordermain> ordermains) {
		this.buyerId = buyerId;
		this.customer = customer;
		this.buyerName = buyerName;
		this.buyerAccount = buyerAccount;
		this.buyerPassword = buyerPassword;
		this.createdDate = createdDate;
		this.buyFrequency = buyFrequency;
		this.ordermains = ordermains;
	}

	// Property accessors
	@Id

	@Column(name = "buyer_id", unique = true, nullable = false)

	public Integer getBuyerId() {
		return this.buyerId;
	}

	public void setBuyerId(Integer buyerId) {
		this.buyerId = buyerId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "customer_id", nullable = false)

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Column(name = "buyer_name", nullable = false, length = 50)

	public String getBuyerName() {
		return this.buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	@Column(name = "buyer_account", nullable = false, length = 50)

	public String getBuyerAccount() {
		return this.buyerAccount;
	}

	public void setBuyerAccount(String buyerAccount) {
		this.buyerAccount = buyerAccount;
	}

	@Column(name = "buyer_password", nullable = false, length = 50)

	public String getBuyerPassword() {
		return this.buyerPassword;
	}

	public void setBuyerPassword(String buyerPassword) {
		this.buyerPassword = buyerPassword;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "created_date", nullable = false, length = 10)

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Column(name = "buy_frequency", nullable = false)

	public Integer getBuyFrequency() {
		return this.buyFrequency;
	}

	public void setBuyFrequency(Integer buyFrequency) {
		this.buyFrequency = buyFrequency;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "buyer")

	public Set<Ordermain> getOrdermains() {
		return this.ordermains;
	}

	public void setOrdermains(Set<Ordermain> ordermains) {
		this.ordermains = ordermains;
	}

}