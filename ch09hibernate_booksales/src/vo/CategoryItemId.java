package vo;

/**
 * CategoryItemId entity. @author MyEclipse Persistence Tools
 */

public class CategoryItemId implements java.io.Serializable {

	// Fields

	private Category category;
	private Book book;

	// Constructors

	/** default constructor */
	public CategoryItemId() {
	}

	/** full constructor */
	public CategoryItemId(Category category, Book book) {
		this.category = category;
		this.book = book;
	}

	// Property accessors

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Book getBook() {
		return this.book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CategoryItemId))
			return false;
		CategoryItemId castOther = (CategoryItemId) other;

		return ((this.getCategory() == castOther.getCategory()) || (this.getCategory() != null
				&& castOther.getCategory() != null && this.getCategory().equals(castOther.getCategory())))
				&& ((this.getBook() == castOther.getBook()) || (this.getBook() != null && castOther.getBook() != null
						&& this.getBook().equals(castOther.getBook())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getCategory() == null ? 0 : this.getCategory().hashCode());
		result = 37 * result + (getBook() == null ? 0 : this.getBook().hashCode());
		return result;
	}

}