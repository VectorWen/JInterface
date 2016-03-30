package com.vector.jinterface.db.model.user;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Users entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "Users", schema = "dbo", catalog = "KoudaiDBV19", uniqueConstraints = @UniqueConstraint(columnNames = "Name"))
public class User implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static final Integer ENABLED_TRUE = 1;
	public static final Integer ENABLED_FALSE = 0;
	
	private Integer id;
	private String username;
	private String password;
	private String pwdSalt;
	private String realName;
	private String title;
	private String url;
	private Long profileId;
	private Integer groupId;
	private Integer categoryId;
	private Long templateId;
	private String email;
	private String qq;
	private String msn;
	private Integer provinceId1;
	private Integer provinceId2;
	private String city1;
	private String city2;
	private Integer gender;
	private Integer relationship;
	private Integer blood;
	private Integer degree;
	private Integer zodiac;
	private Integer birthYear;
	private Integer birthMonth;
	private Integer birthDay;
	private Integer friendCount;
	private Integer memberCount;
	private Integer followingCount;
	private Integer followersCount;
	private Integer credit;
	private Integer loginCount;
	private Integer loginDay;
	private Integer msgCount;
	private Integer msgNewCount;
	private Integer newNotificationCount;
	private Integer postCount;
	private Integer microblogAt;
	private Integer microblogAtUnread;
	private Integer pins;
	private Integer likes;
	private Integer hits;
	private String lastLoginIp;
	private Timestamp lastLoginTime;
	private Timestamp lastUpdateTime;
	private Integer status;
	private String signature;
	private String security;
	private Timestamp created;
	private Long rankId;
	private Integer isEmailConfirmed;
	private Integer isBind;
	private Long loginType;
	private Double balance;
	private Double goldBeans;
	private Integer allowDevices;
	private Integer modifyPwdTimesDay;
	private Integer findPwdTimesDay;
	private Integer modifyPwdTimesMonth;
	private Integer findPwdTimesMonth;
	private Integer remainTryTimes;
	private Timestamp nextAvailableTimeSpan;
	private String pic;
	private Integer isPicError;
	private Long roleId;
	private Long dgProfileId;
	private String rongToken;
	private Timestamp rongTokenExpired;
	private Integer idtype;
	private String idnumber;
	private String sfmUid;
	private String deviceToken;
	private String deviceType;
	private Integer enabled;
	private String oauthUsername;
	private String accessToken;
	private Integer authoritiesId;
	private String phone;
	

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "Id", unique = true, nullable = false)
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

	@Column(name = "Title")
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "Url")
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Column(name = "ProfileId")
	public Long getProfileId() {
		return this.profileId;
	}

	public void setProfileId(Long profileId) {
		this.profileId = profileId;
	}

	@Column(name = "GroupId")
	public Integer getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	@Column(name = "CategoryId")
	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	@Column(name = "TemplateId")
	public Long getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(Long templateId) {
		this.templateId = templateId;
	}

	@Column(name = "Email")
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "QQ")
	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	@Column(name = "MSN")
	public String getMsn() {
		return this.msn;
	}

	public void setMsn(String msn) {
		this.msn = msn;
	}

	@Column(name = "ProvinceId1")
	public Integer getProvinceId1() {
		return this.provinceId1;
	}

	public void setProvinceId1(Integer provinceId1) {
		this.provinceId1 = provinceId1;
	}

	@Column(name = "ProvinceId2")
	public Integer getProvinceId2() {
		return this.provinceId2;
	}

	public void setProvinceId2(Integer provinceId2) {
		this.provinceId2 = provinceId2;
	}

	@Column(name = "City1")
	public String getCity1() {
		return this.city1;
	}

	public void setCity1(String city1) {
		this.city1 = city1;
	}

	@Column(name = "City2")
	public String getCity2() {
		return this.city2;
	}

	public void setCity2(String city2) {
		this.city2 = city2;
	}

	@Column(name = "Gender")
	public Integer getGender() {
		return this.gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	@Column(name = "Relationship")
	public Integer getRelationship() {
		return this.relationship;
	}

	public void setRelationship(Integer relationship) {
		this.relationship = relationship;
	}

	@Column(name = "Blood")
	public Integer getBlood() {
		return this.blood;
	}

	public void setBlood(Integer blood) {
		this.blood = blood;
	}

	@Column(name = "Degree")
	public Integer getDegree() {
		return this.degree;
	}

	public void setDegree(Integer degree) {
		this.degree = degree;
	}

	@Column(name = "Zodiac")
	public Integer getZodiac() {
		return this.zodiac;
	}

	public void setZodiac(Integer zodiac) {
		this.zodiac = zodiac;
	}

	@Column(name = "BirthYear")
	public Integer getBirthYear() {
		return this.birthYear;
	}

	public void setBirthYear(Integer birthYear) {
		this.birthYear = birthYear;
	}

	@Column(name = "BirthMonth")
	public Integer getBirthMonth() {
		return this.birthMonth;
	}

	public void setBirthMonth(Integer birthMonth) {
		this.birthMonth = birthMonth;
	}

	@Column(name = "BirthDay")
	public Integer getBirthDay() {
		return this.birthDay;
	}

	public void setBirthDay(Integer birthDay) {
		this.birthDay = birthDay;
	}

	@Column(name = "FriendCount")
	public Integer getFriendCount() {
		return this.friendCount;
	}

	public void setFriendCount(Integer friendCount) {
		this.friendCount = friendCount;
	}

	@Column(name = "MemberCount")
	public Integer getMemberCount() {
		return this.memberCount;
	}

	public void setMemberCount(Integer memberCount) {
		this.memberCount = memberCount;
	}

	@Column(name = "FollowingCount")
	public Integer getFollowingCount() {
		return this.followingCount;
	}

	public void setFollowingCount(Integer followingCount) {
		this.followingCount = followingCount;
	}

	@Column(name = "FollowersCount")
	public Integer getFollowersCount() {
		return this.followersCount;
	}

	public void setFollowersCount(Integer followersCount) {
		this.followersCount = followersCount;
	}

	@Column(name = "Credit")
	public Integer getCredit() {
		return this.credit;
	}

	public void setCredit(Integer credit) {
		this.credit = credit;
	}

	@Column(name = "LoginCount")
	public Integer getLoginCount() {
		return this.loginCount;
	}

	public void setLoginCount(Integer loginCount) {
		this.loginCount = loginCount;
	}

	@Column(name = "LoginDay")
	public Integer getLoginDay() {
		return this.loginDay;
	}

	public void setLoginDay(Integer loginDay) {
		this.loginDay = loginDay;
	}

	@Column(name = "MsgCount")
	public Integer getMsgCount() {
		return this.msgCount;
	}

	public void setMsgCount(Integer msgCount) {
		this.msgCount = msgCount;
	}

	@Column(name = "MsgNewCount")
	public Integer getMsgNewCount() {
		return this.msgNewCount;
	}

	public void setMsgNewCount(Integer msgNewCount) {
		this.msgNewCount = msgNewCount;
	}

	@Column(name = "NewNotificationCount")
	public Integer getNewNotificationCount() {
		return this.newNotificationCount;
	}

	public void setNewNotificationCount(Integer newNotificationCount) {
		this.newNotificationCount = newNotificationCount;
	}

	@Column(name = "PostCount")
	public Integer getPostCount() {
		return this.postCount;
	}

	public void setPostCount(Integer postCount) {
		this.postCount = postCount;
	}

	@Column(name = "MicroblogAt")
	public Integer getMicroblogAt() {
		return this.microblogAt;
	}

	public void setMicroblogAt(Integer microblogAt) {
		this.microblogAt = microblogAt;
	}

	@Column(name = "MicroblogAtUnread")
	public Integer getMicroblogAtUnread() {
		return this.microblogAtUnread;
	}

	public void setMicroblogAtUnread(Integer microblogAtUnread) {
		this.microblogAtUnread = microblogAtUnread;
	}

	@Column(name = "Pins")
	public Integer getPins() {
		return this.pins;
	}

	public void setPins(Integer pins) {
		this.pins = pins;
	}

	@Column(name = "Likes")
	public Integer getLikes() {
		return this.likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	@Column(name = "Hits")
	public Integer getHits() {
		return this.hits;
	}

	public void setHits(Integer hits) {
		this.hits = hits;
	}

	@Column(name = "LastLoginIp")
	public String getLastLoginIp() {
		return this.lastLoginIp;
	}

	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	@Column(name = "LastLoginTime", length = 23)
	public Timestamp getLastLoginTime() {
		return this.lastLoginTime;
	}

	public void setLastLoginTime(Timestamp lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	@Column(name = "LastUpdateTime", length = 23)
	public Timestamp getLastUpdateTime() {
		return this.lastUpdateTime;
	}

	public void setLastUpdateTime(Timestamp lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	@Column(name = "Status")
	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Column(name = "Signature")
	public String getSignature() {
		return this.signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	@Column(name = "Security")
	public String getSecurity() {
		return this.security;
	}

	public void setSecurity(String security) {
		this.security = security;
	}

	@Column(name = "Created", length = 23)
	public Timestamp getCreated() {
		return this.created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}

	@Column(name = "RankId")
	public Long getRankId() {
		return this.rankId;
	}

	public void setRankId(Long rankId) {
		this.rankId = rankId;
	}

	@Column(name = "IsEmailConfirmed")
	public Integer getIsEmailConfirmed() {
		return this.isEmailConfirmed;
	}

	public void setIsEmailConfirmed(Integer isEmailConfirmed) {
		this.isEmailConfirmed = isEmailConfirmed;
	}

	@Column(name = "IsBind")
	public Integer getIsBind() {
		return this.isBind;
	}

	public void setIsBind(Integer isBind) {
		this.isBind = isBind;
	}

	@Column(name = "LoginType")
	public Long getLoginType() {
		return this.loginType;
	}

	public void setLoginType(Long loginType) {
		this.loginType = loginType;
	}

	@Column(name = "Balance", precision = 53, scale = 0)
	public Double getBalance() {
		return this.balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	@Column(name = "GoldBeans", precision = 53, scale = 0)
	public Double getGoldBeans() {
		return this.goldBeans;
	}

	public void setGoldBeans(Double goldBeans) {
		this.goldBeans = goldBeans;
	}

	@Column(name = "AllowDevices")
	public Integer getAllowDevices() {
		return this.allowDevices;
	}

	public void setAllowDevices(Integer allowDevices) {
		this.allowDevices = allowDevices;
	}

	@Column(name = "ModifyPwdTimesDay")
	public Integer getModifyPwdTimesDay() {
		return this.modifyPwdTimesDay;
	}

	public void setModifyPwdTimesDay(Integer modifyPwdTimesDay) {
		this.modifyPwdTimesDay = modifyPwdTimesDay;
	}

	@Column(name = "FindPwdTimesDay")
	public Integer getFindPwdTimesDay() {
		return this.findPwdTimesDay;
	}

	public void setFindPwdTimesDay(Integer findPwdTimesDay) {
		this.findPwdTimesDay = findPwdTimesDay;
	}

	@Column(name = "ModifyPwdTimesMonth")
	public Integer getModifyPwdTimesMonth() {
		return this.modifyPwdTimesMonth;
	}

	public void setModifyPwdTimesMonth(Integer modifyPwdTimesMonth) {
		this.modifyPwdTimesMonth = modifyPwdTimesMonth;
	}

	@Column(name = "FindPwdTimesMonth")
	public Integer getFindPwdTimesMonth() {
		return this.findPwdTimesMonth;
	}

	public void setFindPwdTimesMonth(Integer findPwdTimesMonth) {
		this.findPwdTimesMonth = findPwdTimesMonth;
	}

	@Column(name = "RemainTryTimes")
	public Integer getRemainTryTimes() {
		return this.remainTryTimes;
	}

	public void setRemainTryTimes(Integer remainTryTimes) {
		this.remainTryTimes = remainTryTimes;
	}

	@Column(name = "NextAvailableTimeSpan", length = 23)
	public Timestamp getNextAvailableTimeSpan() {
		return this.nextAvailableTimeSpan;
	}

	public void setNextAvailableTimeSpan(Timestamp nextAvailableTimeSpan) {
		this.nextAvailableTimeSpan = nextAvailableTimeSpan;
	}

	@Column(name = "Pic")
	public String getPic() {
		return this.pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	@Column(name = "IsPicError")
	public Integer getIsPicError() {
		return this.isPicError;
	}

	public void setIsPicError(Integer isPicError) {
		this.isPicError = isPicError;
	}

	@Column(name = "RoleId")
	public Long getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	@Column(name = "DgProfileId")
	public Long getDgProfileId() {
		return this.dgProfileId;
	}

	public void setDgProfileId(Long dgProfileId) {
		this.dgProfileId = dgProfileId;
	}

	@Column(name = "RongToken")
	public String getRongToken() {
		return this.rongToken;
	}

	public void setRongToken(String rongToken) {
		this.rongToken = rongToken;
	}

	@Column(name = "RongTokenExpired", length = 23)
	public Timestamp getRongTokenExpired() {
		return this.rongTokenExpired;
	}

	public void setRongTokenExpired(Timestamp rongTokenExpired) {
		this.rongTokenExpired = rongTokenExpired;
	}

	@Column(name = "IDType")
	public Integer getIdtype() {
		return this.idtype;
	}

	public void setIdtype(Integer idtype) {
		this.idtype = idtype;
	}

	@Column(name = "IDNumber")
	public String getIdnumber() {
		return this.idnumber;
	}

	public void setIdnumber(String idnumber) {
		this.idnumber = idnumber;
	}

	@Column(name = "SfmUid")
	public String getSfmUid() {
		return this.sfmUid;
	}

	public void setSfmUid(String sfmUid) {
		this.sfmUid = sfmUid;
	}

	@Column(name = "DeviceToken")
	public String getDeviceToken() {
		return this.deviceToken;
	}

	public void setDeviceToken(String deviceToken) {
		this.deviceToken = deviceToken;
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

	@Column(name = "oauth_username", length = 250)
	public String getOauthUsername() {
		return this.oauthUsername;
	}

	public void setOauthUsername(String oauthUsername) {
		this.oauthUsername = oauthUsername;
	}

	@Column(name = "access_token", length = 250)
	public String getAccessToken() {
		return this.accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	@Column(name = "authorities_id")
	public Integer getAuthoritiesId() {
		return this.authoritiesId;
	}

	public void setAuthoritiesId(Integer authoritiesId) {
		this.authoritiesId = authoritiesId;
	}

	@Column(name = "Name", length = 250)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "phone", length = 50)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	
	
	

}