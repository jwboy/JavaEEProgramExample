package vo;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Orderdetail entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "orderdetail", catalog = "booksales")

public class Orderdetail implements java.io.Serializable {

	// Fields

	private OrderdetailId id;
	private Book book;
	private Ordermain ordermain;
	private String bookName;
	private Integer quantity;
	private Float unuprice;

	// Constructors

	/** default constructor */
	public Orderdetail() {
	}

	/** full constructor */
	public Orderdetail(OrderdetailId id, Book book, Ordermain ordermain, String bookName, Integer quantity,
			Float unuprice) {
		this.id = id;
		this.book = book;
		this.ordermain = ordermain;
		this.bookName = bookName;
		this.quantity = quantity;
		this.unuprice = unuprice;
	}

	// Property accessors
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "orderdetailId", column = @Column(name = "orderdetail_id", nullable = false)),
			@AttributeOverride(name = "orderId", column = @Column(name = "order_id", nullable = false)) })

	public OrderdetailId getId() {
		return this.id;
	}

	public void setId(OrderdetailId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "book_id", nullable = false)

	public Book getBook() {
		return this.book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "order_id", nullable = false, insertable = false, updatable = false)

	public Ordermain getOrdermain() {
		return this.ordermain;
	}

	public void setOrdermain(Ordermain ordermain) {
		this.ordermain = ordermain;
	}

	@Column(name = "book_name", nullable = false, length = 50)

	public String getBookName() {
		return this.bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	@Column(name = "quantity", nullable = false)

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Column(name = "unuprice", nullable = false, precision = 12, scale = 0)

	public Float getUnuprice() {
		return this.unuprice;
	}

	public void setUnuprice(Float unuprice) {
		this.unuprice = unuprice;
	}

}