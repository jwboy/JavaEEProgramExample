package vo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Customer entity. @author MyEclipse Persistence Tools
 */

public class Customer implements java.io.Serializable {

	// Fields

	private Integer customerId;
	private Passport passport;
	private String customerName;
	private String customerAccount;
	private String customerPassword;
	private Date customerDate;
	private Set sellers = new HashSet(0);
	private Set buyers = new HashSet(0);

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
			String customerPassword, Date customerDate, Set sellers, Set buyers) {
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

	public Integer getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Passport getPassport() {
		return this.passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAccount() {
		return this.customerAccount;
	}

	public void setCustomerAccount(String customerAccount) {
		this.customerAccount = customerAccount;
	}

	public String getCustomerPassword() {
		return this.customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public Date getCustomerDate() {
		return this.customerDate;
	}

	public void setCustomerDate(Date customerDate) {
		this.customerDate = customerDate;
	}

	public Set getSellers() {
		return this.sellers;
	}

	public void setSellers(Set sellers) {
		this.sellers = sellers;
	}

	public Set getBuyers() {
		return this.buyers;
	}

	public void setBuyers(Set buyers) {
		this.buyers = buyers;
	}

}