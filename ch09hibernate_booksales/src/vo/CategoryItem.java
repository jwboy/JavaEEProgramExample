package vo;

/**
 * CategoryItem entity. @author MyEclipse Persistence Tools
 */

public class CategoryItem implements java.io.Serializable {

	// Fields

	private CategoryItemId id;

	// Constructors

	/** default constructor */
	public CategoryItem() {
	}

	/** full constructor */
	public CategoryItem(CategoryItemId id) {
		this.id = id;
	}

	// Property accessors

	public CategoryItemId getId() {
		return this.id;
	}

	public void setId(CategoryItemId id) {
		this.id = id;
	}

}