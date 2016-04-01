package com.vector.jinterface.db.model.user;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Users entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "Users", schema = "dbo", catalog = "KoudaiDBV19",
        uniqueConstraints = @UniqueConstraint(columnNames = "Name"))
public class User implements java.io.Serializable {

	private Integer id;
	private String username;
	private String password;
	private String pwdSalt;
	private String realName;
	private String signature;
	private String pic;
	private String sfmUid;
	private String deviceType;
	private Integer enabled;
    private Timestamp created;
    private Integer remainTryTimes;

    @Column(name = "RemainTryTimes")
    public Integer getRemainTryTimes() {
        return remainTryTimes;
    }

    public void setRemainTryTimes(Integer remainTryTimes) {
        this.remainTryTimes = remainTryTimes;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    // Property accessors
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "Pwd")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	@Column(name = "PwdSalt")
	public String getPwdSalt() {
		return this.pwdSalt;
	}



	public void setPwdSalt(String pwdSalt) {
		this.pwdSalt = pwdSalt;
	}

	@Column(name = "RealName")
	public String getRealName() {
		return this.realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}


	@Column(name = "Signature")
	public String getSignature() {
		return this.signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	@Column(name = "Pic")
	public String getPic() {
		return this.pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	@Column(name = "SfmUid")
	public String getSfmUid() {
		return this.sfmUid;
	}

	public void setSfmUid(String sfmUid) {
		this.sfmUid = sfmUid;
	}

	@Column(name = "DeviceType")
	public String getDeviceType() {
		return this.deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	@Column(name = "Enabled")
	public Integer getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}

	@Column(name = "Name", length = 250)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}



}