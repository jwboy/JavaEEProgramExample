package vo;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;






/**
 * Member entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "member", catalog = "booksales")

public class Member implements java.io.Serializable {

	// Fields

	@GeneratedValue
	private Integer id;
	private String username;
	private String password;
	private String resume;
	private String photo;
	private Date createdate;

	// Constructors

	/** default constructor */
	public Member() {
	}

	/** full constructor */
	public Member(Integer id, String username, String password, String resume, String photo, Date createdate) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.resume = resume;
		this.photo = photo;
		this.createdate = createdate;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id" )
	public Integer getId() {
		return this.id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "username", nullable = false, length = 20)

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "password", nullable = false, length = 20)

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "resume", nullable = false, length = 16383)

	public String getResume() {
		return this.resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	@Column(name = "photo", nullable = false)

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "createdate", nullable = false, length = 10)

	public Date getCreatedate() {
		return this.createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

}