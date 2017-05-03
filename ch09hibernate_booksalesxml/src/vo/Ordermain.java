package vo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Ordermain entity. @author MyEclipse Persistence Tools
 */

public class Ordermain implements java.io.Serializable {

	// Fields

	private Integer orderId;
	private Buyer buyer;
	private String orderName;
	private Integer orderStatus;
	private Date createDate;
	private String buyerName;
	private Set orderdetails = new HashSet(0);

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
			String buyerName, Set orderdetails) {
		this.orderId = orderId;
		this.buyer = buyer;
		this.orderName = orderName;
		this.orderStatus = orderStatus;
		this.createDate = createDate;
		this.buyerName = buyerName;
		this.orderdetails = orderdetails;
	}

	// Property accessors

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Buyer getBuyer() {
		return this.buyer;
	}

	public void setBuyer(Buyer buyer) {
		this.buyer = buyer;
	}

	public String getOrderName() {
		return this.orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public Integer getOrderStatus() {
		return this.orderStatus;
	}

	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getBuyerName() {
		return this.buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public Set getOrderdetails() {
		return this.orderdetails;
	}

	public void setOrderdetails(Set orderdetails) {
		this.orderdetails = orderdetails;
	}

}