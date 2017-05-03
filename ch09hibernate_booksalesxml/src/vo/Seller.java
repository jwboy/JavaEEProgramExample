package vo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Seller entity. @author MyEclipse Persistence Tools
 */

public class Seller implements java.io.Serializable {

	// Fields

	private Integer sellerId;
	private Customer customer;
	private String sellerName;
	private String sellerAccount;
	private String sellerPassword;
	private Date createdDate;
	private Float createdAmount;
	private Set books = new HashSet(0);

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
			Date createdDate, Float createdAmount, Set books) {
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

	public Integer getSellerId() {
		return this.sellerId;
	}

	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getSellerName() {
		return this.sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public String getSellerAccount() {
		return this.sellerAccount;
	}

	public void setSellerAccount(String sellerAccount) {
		this.sellerAccount = sellerAccount;
	}

	public String getSellerPassword() {
		return this.sellerPassword;
	}

	public void setSellerPassword(String sellerPassword) {
		this.sellerPassword = sellerPassword;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Float getCreatedAmount() {
		return this.createdAmount;
	}

	public void setCreatedAmount(Float createdAmount) {
		this.createdAmount = createdAmount;
	}

	public Set getBooks() {
		return this.books;
	}

	public void setBooks(Set books) {
		this.books = books;
	}

}