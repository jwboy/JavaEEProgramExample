package vo;

public class Member implements java.io.Serializable {
	private Integer id; // 属性id
	private String username; // 属性username
	private String password; // 属性password

	public Member() { // 无参构造方法
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean equals(Object other) {
		if (this == other)
			return true;
		if (id == null)
			return false;
		if (!(other instanceof Member))
			return false;
		return this.id.intValue() == ((Member)other).getId().intValue();
	}

	public int hashCode() {
		return this.id == null ? System.identityHashCode(this) : this.id
				.hashCode();
	}
}
