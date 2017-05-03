package vo;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * OrderdetailId entity. @author MyEclipse Persistence Tools
 */
@Embeddable

public class OrderdetailId implements java.io.Serializable {

	// Fields

	private Integer orderdetailId;
	private Integer orderId;

	// Constructors

	/** default constructor */
	public OrderdetailId() {
	}

	/** full constructor */
	public OrderdetailId(Integer orderdetailId, Integer orderId) {
		this.orderdetailId = orderdetailId;
		this.orderId = orderId;
	}

	// Property accessors

	@Column(name = "orderdetail_id", nullable = false)

	public Integer getOrderdetailId() {
		return this.orderdetailId;
	}

	public void setOrderdetailId(Integer orderdetailId) {
		this.orderdetailId = orderdetailId;
	}

	@Column(name = "order_id", nullable = false)

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof OrderdetailId))
			return false;
		OrderdetailId castOther = (OrderdetailId) other;

		return ((this.getOrderdetailId() == castOther.getOrderdetailId())
				|| (this.getOrderdetailId() != null && castOther.getOrderdetailId() != null
						&& this.getOrderdetailId().equals(castOther.getOrderdetailId())))
				&& ((this.getOrderId() == castOther.getOrderId()) || (this.getOrderId() != null
						&& castOther.getOrderId() != null && this.getOrderId().equals(castOther.getOrderId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getOrderdetailId() == null ? 0 : this.getOrderdetailId().hashCode());
		result = 37 * result + (getOrderId() == null ? 0 : this.getOrderId().hashCode());
		return result;
	}

}