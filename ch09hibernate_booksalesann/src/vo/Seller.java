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
 * Seller entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "seller", catalog = "booksales")

public class Seller implements java.io.Serializable {

	// Fields

	private Integer sellerId;
	private Customer customer;
	private String sellerName;
	private String sellerAccount;
	private String sellerPassword;
	private Date createdDate;
	private Float createdAmount;
	private Set<Book> books = new HashSet<Book>(0);

	// Constructors

	/** default constructor */
	public Seller() {
	}

	/** minimal constructor */
	public Seller(Integer sellerId, Customer customer, String sellerName, String sellerAccount, String sellerPassword,
			Date createdDate, Float createdAmount) {
		this.sellerId = sellerId;
		this.customer = customer;
		this.sellerName = sellerName;
		this.sellerAccount = sellerAccount;
		this.sellerPassword = sellerPassword;
		this.createdDate = createdDate;
		this.createdAmount = createdAmount;
	}

	/** full constructor */
	public Seller(Integer sellerId, Customer customer, String sellerName, String sellerAccount, String sellerPassword,
			Date createdDate, Float createdAmount, Set<Book> books) {
		this.sellerId = sellerId;
		this.customer = customer;
		this.sellerName = sellerName;
		this.sellerAccount = sellerAccount;
		this.sellerPassword = sellerPassword;
		this.createdDate = createdDate;
		this.createdAmount = createdAmount;
		this.books = books;
	}

	// Property accessors
	@Id

	@Column(name = "seller_id", unique = true, nullable = false)

	public Integer getSellerId() {
		return this.sellerId;
	}

	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "customer_id", nullable = false)

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Column(name = "seller_name", nullable = false, length = 50)

	public String getSellerName() {
		return this.sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	@Column(name = "seller_account", nullable = false, length = 50)

	public String getSellerAccount() {
		return this.sellerAccount;
	}

	public void setSellerAccount(String sellerAccount) {
		this.sellerAccount = sellerAccount;
	}

	@Column(name = "seller_password", nullable = false, length = 50)

	public String getSellerPassword() {
		return this.sellerPassword;
	}

	public void setSellerPassword(String sellerPassword) {
		this.sellerPassword = sellerPassword;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "created_date", nullable = false, length = 10)

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Column(name = "created_amount", nullable = false, precision = 10)

	public Float getCreatedAmount() {
		return this.createdAmount;
	}

	public void setCreatedAmount(Float createdAmount) {
		this.createdAmount = createdAmount;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "seller")

	public Set<Book> getBooks() {
		return this.books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}

}