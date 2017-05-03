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
 * Customer entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "customer", catalog = "booksales")

public class Customer implements java.io.Serializable {

	// Fields

	private Integer customerId;
	private Passport passport;
	private String customerName;
	private String customerAccount;
	private String customerPassword;
	private Date customerDate;
	private Set<Seller> sellers = new HashSet<Seller>(0);
	private Set<Buyer> buyers = new HashSet<Buyer>(0);

	// Constructors

	/** default constructor */
	public Customer() {
	}

	/** minimal constructor */
	public Customer(Integer customerId, Passport passport, String customerName, String customerAccount,
			String customerPassword, Date customerDate) {
		this.customerId = customerId;
		this.passport = passport;
		this.customerName = customerName;
		this.customerAccount = customerAccount;
		this.customerPassword = customerPassword;
		this.customerDate = customerDate;
	}

	/** full constructor */
	public Customer(Integer customerId, Passport passport, String customerName, String customerAccount,
			String customerPassword, Date customerDate, Set<Seller> sellers, Set<Buyer> buyers) {
		this.customerId = customerId;
		this.passport = passport;
		this.customerName = customerName;
		this.customerAccount = customerAccount;
		this.customerPassword = customerPassword;
		this.customerDate = customerDate;
		this.sellers = sellers;
		this.buyers = buyers;
	}

	// Property accessors
	@Id

	@Column(name = "customer_id", unique = true, nullable = false)

	public Integer getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "passport_id", nullable = false)

	public Passport getPassport() {
		return this.passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	@Column(name = "customer_name", nullable = false, length = 50)

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	@Column(name = "customer_account", nullable = false, length = 50)

	public String getCustomerAccount() {
		return this.customerAccount;
	}

	public void setCustomerAccount(String customerAccount) {
		this.customerAccount = customerAccount;
	}

	@Column(name = "customer_password", nullable = false, length = 50)

	public String getCustomerPassword() {
		return this.customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "customer_date", nullable = false, length = 10)

	public Date getCustomerDate() {
		return this.customerDate;
	}

	public void setCustomerDate(Date customerDate) {
		this.customerDate = customerDate;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "customer")

	public Set<Seller> getSellers() {
		return this.sellers;
	}

	public void setSellers(Set<Seller> sellers) {
		this.sellers = sellers;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "customer")

	public Set<Buyer> getBuyers() {
		return this.buyers;
	}

	public void setBuyers(Set<Buyer> buyers) {
		this.buyers = buyers;
	}

}