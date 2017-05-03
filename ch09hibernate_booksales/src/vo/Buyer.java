package vo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Buyer entity. @author MyEclipse Persistence Tools
 */

public class Buyer implements java.io.Serializable {

	// Fields

	private Integer buyerId;
	private Customer customer;
	private String buyerName;
	private String buyerAccount;
	private String buyerPassword;
	private Date createdDate;
	private Integer buyFrequency;
	private Set ordermains = new HashSet(0);

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
			Date createdDate, Integer buyFrequency, Set ordermains) {
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

	public Integer getBuyerId() {
		return this.buyerId;
	}

	public void setBuyerId(Integer buyerId) {
		this.buyerId = buyerId;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getBuyerName() {
		return this.buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public String getBuyerAccount() {
		return this.buyerAccount;
	}

	public void setBuyerAccount(String buyerAccount) {
		this.buyerAccount = buyerAccount;
	}

	public String getBuyerPassword() {
		return this.buyerPassword;
	}

	public void setBuyerPassword(String buyerPassword) {
		this.buyerPassword = buyerPassword;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Integer getBuyFrequency() {
		return this.buyFrequency;
	}

	public void setBuyFrequency(Integer buyFrequency) {
		this.buyFrequency = buyFrequency;
	}

	public Set getOrdermains() {
		return this.ordermains;
	}

	public void setOrdermains(Set ordermains) {
		this.ordermains = ordermains;
	}

}