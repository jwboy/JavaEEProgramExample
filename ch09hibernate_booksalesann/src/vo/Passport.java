package vo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Passport entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "passport", catalog = "booksales")

public class Passport implements java.io.Serializable {

	// Fields

	private Integer passportId;
	private String passportNo;
	private Integer passportType;
	private Date expiredDate;
	private Set<Customer> customers = new HashSet<Customer>(0);

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
	public Passport(Integer passportId, String passportNo, Integer passportType, Date expiredDate,
			Set<Customer> customers) {
		this.passportId = passportId;
		this.passportNo = passportNo;
		this.passportType = passportType;
		this.expiredDate = expiredDate;
		this.customers = customers;
	}

	// Property accessors
	@Id

	@Column(name = "passport_id", unique = true, nullable = false)

	public Integer getPassportId() {
		return this.passportId;
	}

	public void setPassportId(Integer passportId) {
		this.passportId = passportId;
	}

	@Column(name = "passport_no", nullable = false, length = 50)

	public String getPassportNo() {
		return this.passportNo;
	}

	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}

	@Column(name = "passport_type", nullable = false)

	public Integer getPassportType() {
		return this.passportType;
	}

	public void setPassportType(Integer passportType) {
		this.passportType = passportType;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "expired_date", nullable = false, length = 10)

	public Date getExpiredDate() {
		return this.expiredDate;
	}

	public void setExpiredDate(Date expiredDate) {
		this.expiredDate = expiredDate;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "passport")

	public Set<Customer> getCustomers() {
		return this.customers;
	}

	public void setCustomers(Set<Customer> customers) {
		this.customers = customers;
	}

}