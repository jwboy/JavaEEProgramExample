package vo;

/**
 * Orderdetail entity. @author MyEclipse Persistence Tools
 */

public class Orderdetail implements java.io.Serializable {

	// Fields

	private OrderdetailId id;
	private Book book;
	private String bookName;
	private Integer quantity;
	private Float unuprice;

	// Constructors

	/** default constructor */
	public Orderdetail() {
	}

	/** full constructor */
	public Orderdetail(OrderdetailId id, Book book, String bookName, Integer quantity, Float unuprice) {
		this.id = id;
		this.book = book;
		this.bookName = bookName;
		this.quantity = quantity;
		this.unuprice = unuprice;
	}

	// Property accessors

	public OrderdetailId getId() {
		return this.id;
	}

	public void setId(OrderdetailId id) {
		this.id = id;
	}

	public Book getBook() {
		return this.book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public String getBookName() {
		return this.bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Float getUnuprice() {
		return this.unuprice;
	}

	public void setUnuprice(Float unuprice) {
		this.unuprice = unuprice;
	}

}