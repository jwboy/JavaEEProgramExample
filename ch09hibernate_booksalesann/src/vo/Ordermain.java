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
 * Ordermain entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "ordermain", catalog = "booksales")

public class Ordermain implements java.io.Serializable {

	// Fields

	private Integer orderId;
	private Buyer buyer;
	private String orderName;
	private Integer orderStatus;
	private Date createDate;
	private String buyerName;
	private Set<Orderdetail> orderdetails = new HashSet<Orderdetail>(0);

	// Constructors

	/** default constructor */
	public Ordermain() {
	}

	/** minimal constructor */
	public Ordermain(Integer orderId, Buyer buyer, String orderName, Integer orderStatus, Date createDate,
			String buyerName) {
		this.orderId = orderId;
		this.buyer = buyer;
		this.orderName = orderName;
		this.orderStatus = orderStatus;
		this.createDate = createDate;
		this.buyerName = buyerName;
	}

	/** full constructor */
	public Ordermain(Integer orderId, Buyer buyer, String orderName, Integer orderStatus, Date createDate,
			String buyerName, Set<Orderdetail> orderdetails) {
		this.orderId = orderId;
		this.buyer = buyer;
		this.orderName = orderName;
		this.orderStatus = orderStatus;
		this.createDate = createDate;
		this.buyerName = buyerName;
		this.orderdetails = orderdetails;
	}

	// Property accessors
	@Id

	@Column(name = "order_id", unique = true, nullable = false)

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "buyer_id", nullable = false)

	public Buyer getBuyer() {
		return this.buyer;
	}

	public void setBuyer(Buyer buyer) {
		this.buyer = buyer;
	}

	@Column(name = "order_name", nullable = false, length = 50)

	public String getOrderName() {
		return this.orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	@Column(name = "order_status", nullable = false)

	public Integer getOrderStatus() {
		return this.orderStatus;
	}

	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "create_date", nullable = false, length = 10)

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Column(name = "buyer_name", nullable = false, length = 50)

	public String getBuyerName() {
		return this.buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "ordermain")

	public Set<Orderdetail> getOrderdetails() {
		return this.orderdetails;
	}

	public void setOrderdetails(Set<Orderdetail> orderdetails) {
		this.orderdetails = orderdetails;
	}

}