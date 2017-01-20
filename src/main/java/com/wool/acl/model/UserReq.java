package com.wool.acl.model;

/**
 * Created by wanglin on 17-1-20.
 */
public class UserReq {

    private Integer id;
    private String loginName;
    private String userName;
    private String mail;
    private String phone;
    private String salt;
    private String password;
    private Integer pwDeadTime;
    private Integer ctime;
    private Boolean isValid;
    private Integer failureTimes;
    private Integer failureTime;
    private Integer lastLoginTime;
    private int offset;
    private int limit;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getPwDeadTime() {
        return pwDeadTime;
    }

    public void setPwDeadTime(Integer pwDeadTime) {
        this.pwDeadTime = pwDeadTime;
    }

    public Integer getCtime() {
        return ctime;
    }

    public void setCtime(Integer ctime) {
        this.ctime = ctime;
    }

    public Boolean getValid() {
        return isValid;
    }

    public void setValid(Boolean valid) {
        isValid = valid;
    }

    public Integer getFailureTimes() {
        return failureTimes;
    }

    public void setFailureTimes(Integer failureTimes) {
        this.failureTimes = failureTimes;
    }

    public Integer getFailureTime() {
        return failureTime;
    }

    public void setFailureTime(Integer failureTime) {
        this.failureTime = failureTime;
    }

    public Integer getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Integer lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "UserReq{" +
                "id=" + id +
                ", loginName='" + loginName + '\'' +
                ", userName='" + userName + '\'' +
                ", mail='" + mail + '\'' +
                ", phone='" + phone + '\'' +
                ", salt='" + salt + '\'' +
                ", password='" + password + '\'' +
                ", pwDeadTime=" + pwDeadTime +
                ", ctime=" + ctime +
                ", isValid=" + isValid +
                ", failureTimes=" + failureTimes +
                ", failureTime=" + failureTime +
                ", lastLoginTime=" + lastLoginTime +
                ", offset=" + offset +
                ", limit=" + limit +
                '}';
    }
}
