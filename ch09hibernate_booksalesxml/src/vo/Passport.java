package vo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Passport entity. @author MyEclipse Persistence Tools
 */

public class Passport implements java.io.Serializable {

	// Fields

	private Integer passportId;
	private String passportNo;
	private Integer passportType;
	private Date expiredDate;
	private Set customers = new HashSet(0);

	// Constructors

	/** default constructor */
	public Passport() {
	}

	/** minimal constructor */
	public Passport(Integer passportId, String passportNo, Integer passportType, Date expiredDate) {
		this.passportId = passportId;
		this.passportNo = passportNo;
		this.passportType = passportType;
		this.expiredDate = expiredDate;
	}

	/** full constructor */
	public Passport(Integer passportId, String passportNo, Integer passportType, Date expiredDate, Set customers) {
		this.passportId = passportId;
		this.passportNo = passportNo;
		this.passportType = passportType;
		this.expiredDate = expiredDate;
		this.customers = customers;
	}

	// Property accessors

	public Integer getPassportId() {
		return this.passportId;
	}

	public void setPassportId(Integer passportId) {
		this.passportId = passportId;
	}

	public String getPassportNo() {
		return this.passportNo;
	}

	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}

	public Integer getPassportType() {
		return this.passportType;
	}

	public void setPassportType(Integer passportType) {
		this.passportType = passportType;
	}

	public Date getExpiredDate() {
		return this.expiredDate;
	}

	public void setExpiredDate(Date expiredDate) {
		this.expiredDate = expiredDate;
	}

	public Set getCustomers() {
		return this.customers;
	}

	public void setCustomers(Set customers) {
		this.customers = customers;
	}

}