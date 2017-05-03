package vo;

/**
 * OrderdetailId entity. @author MyEclipse Persistence Tools
 */

public class OrderdetailId implements java.io.Serializable {

	// Fields

	private Integer orderdetailId;
	private Ordermain ordermain;

	// Constructors

	/** default constructor */
	public OrderdetailId() {
	}

	/** full constructor */
	public OrderdetailId(Integer orderdetailId, Ordermain ordermain) {
		this.orderdetailId = orderdetailId;
		this.ordermain = ordermain;
	}

	// Property accessors

	public Integer getOrderdetailId() {
		return this.orderdetailId;
	}

	public void setOrderdetailId(Integer orderdetailId) {
		this.orderdetailId = orderdetailId;
	}

	public Ordermain getOrdermain() {
		return this.ordermain;
	}

	public void setOrdermain(Ordermain ordermain) {
		this.ordermain = ordermain;
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
				&& ((this.getOrdermain() == castOther.getOrdermain()) || (this.getOrdermain() != null
						&& castOther.getOrdermain() != null && this.getOrdermain().equals(castOther.getOrdermain())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getOrderdetailId() == null ? 0 : this.getOrderdetailId().hashCode());
		result = 37 * result + (getOrdermain() == null ? 0 : this.getOrdermain().hashCode());
		return result;
	}

}