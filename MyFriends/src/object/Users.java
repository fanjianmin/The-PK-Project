package object;

import java.util.Date;
import javax.persistence.Entity;

/**
 * Users entity. @author MyEclipse Persistence Tools
 */

@Entity
public class Users implements java.io.Serializable {

	// Fields

	private String id;
	private String name;
	private Date birthday;
	private String sex;
	private String university;
	private String major;
	private String nativeplace;
	private String qq;

	// Constructors

	/** default constructor */
	public Users() {
	}

	/** full constructor */
	public Users(String id, String name, Date birthday, String sex,
			String university, String major, String nativeplace, String qq) {
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.sex = sex;
		this.university = university;
		this.major = major;
		this.nativeplace = nativeplace;
		this.qq = qq;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getUniversity() {
		return this.university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getMajor() {
		return this.major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getNativeplace() {
		return this.nativeplace;
	}

	public void setNativeplace(String nativeplace) {
		this.nativeplace = nativeplace;
	}

	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

}