package com.wool.acl.model;

import java.util.List;

/**
 * Created by wanglin on 17-1-20.
 */
public class UserResp {

    private int totalNum;
    private List<WoolUserResp> list;

    public int getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(int totalNum) {
        this.totalNum = totalNum;
    }

    public List<WoolUserResp> getList() {
        return list;
    }

    public void setList(List<WoolUserResp> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "UserResp{" +
                "totalNum=" + totalNum +
                ", list=" + list +
                '}';
    }

    public static class WoolUserResp {

        private Integer id;
        private String loginName;
        private String userName;
        private String mail;
        private String phone;
        private Integer pwDeadTime;
        private Integer ctime;
        private Boolean isValid;
        private Integer failureTimes;
        private Integer failureTime;
        private Integer lastLoginTime;

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

        @Override
        public String toString() {
            return "UserResp{" +
                    "id=" + id +
                    ", loginName='" + loginName + '\'' +
                    ", userName='" + userName + '\'' +
                    ", mail='" + mail + '\'' +
                    ", phone='" + phone + '\'' +
                    ", pwDeadTime=" + pwDeadTime +
                    ", ctime=" + ctime +
                    ", isValid=" + isValid +
                    ", failureTimes=" + failureTimes +
                    ", failureTime=" + failureTime +
                    ", lastLoginTime=" + lastLoginTime +
                    '}';
        }
    }


}
