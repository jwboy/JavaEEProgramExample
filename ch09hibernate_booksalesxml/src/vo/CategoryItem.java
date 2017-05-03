package vo;

/**
 * CategoryItem entity. @author MyEclipse Persistence Tools
 */

public class CategoryItem implements java.io.Serializable {

	// Fields

	private CategoryItemId id;
	private Book book;
	private Category category;

	// Constructors

	/** default constructor */
	public CategoryItem() {
	}

	/** full constructor */
	public CategoryItem(CategoryItemId id, Book book, Category category) {
		this.id = id;
		this.book = book;
		this.category = category;
	}

	// Property accessors

	public CategoryItemId getId() {
		return this.id;
	}

	public void setId(CategoryItemId id) {
		this.id = id;
	}

	public Book getBook() {
		return this.book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}