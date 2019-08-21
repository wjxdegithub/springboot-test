package com.example.demo.mybatis.bean;

import java.util.Date;

public class Users {
    /**
     * 
     */
    private Long userId;

    /**
     * 
     */
    private String password;

    /**
     * 
     */
    private String userName;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private Integer age;

    /**
     * 
     */
    private String gender;

    /**
     * 
     */
    private Date birthday;

    /**
     * 
     */
    private String mobile;

    /**
     * 
     */
    private String createdBy;

    /**
     * 
     */
    private Date createTime;

    /**
     * 
     */
    private String lastModifyBy;

    /**
     * 
     */
    private Date lastModifyTime;

    /**
     * 
     */
    private String idCard;

    /**
     * 
     */
    private String email;

    /**
     * 
     */
    private String wechat;

    /**
     * 
     */
    private String employeeId;

    /**
     * 
     */
    private Integer superUser;

    /**
     * 数据是否有效：1有效，0删除
     */
    private Byte enable;

    /**
     * 
     * @return user_id 
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 
     * @param userId 
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 
     * @return password 
     */
    public String getPassword() {
        return password;
    }

    /**
     * 
     * @param password 
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 
     * @return user_name 
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 
     * @param userName 
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 
     * @return name 
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name 
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 
     * @return age 
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 
     * @param age 
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 
     * @return gender 
     */
    public String getGender() {
        return gender;
    }

    /**
     * 
     * @param gender 
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * 
     * @return birthday 
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 
     * @param birthday 
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 
     * @return mobile 
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 
     * @param mobile 
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * 
     * @return created_by 
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 
     * @param createdBy 
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    /**
     * 
     * @return create_time 
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 
     * @param createTime 
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 
     * @return last_modify_by 
     */
    public String getLastModifyBy() {
        return lastModifyBy;
    }

    /**
     * 
     * @param lastModifyBy 
     */
    public void setLastModifyBy(String lastModifyBy) {
        this.lastModifyBy = lastModifyBy == null ? null : lastModifyBy.trim();
    }

    /**
     * 
     * @return last_modify_time 
     */
    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    /**
     * 
     * @param lastModifyTime 
     */
    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    /**
     * 
     * @return id_card 
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * 
     * @param idCard 
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    /**
     * 
     * @return email 
     */
    public String getEmail() {
        return email;
    }

    /**
     * 
     * @param email 
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 
     * @return wechat 
     */
    public String getWechat() {
        return wechat;
    }

    /**
     * 
     * @param wechat 
     */
    public void setWechat(String wechat) {
        this.wechat = wechat == null ? null : wechat.trim();
    }

    /**
     * 
     * @return employee_id 
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * 
     * @param employeeId 
     */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId == null ? null : employeeId.trim();
    }

    /**
     * 
     * @return super_user 
     */
    public Integer getSuperUser() {
        return superUser;
    }

    /**
     * 
     * @param superUser 
     */
    public void setSuperUser(Integer superUser) {
        this.superUser = superUser;
    }

    /**
     * 数据是否有效：1有效，0删除
     * @return enable 数据是否有效：1有效，0删除
     */
    public Byte getEnable() {
        return enable;
    }

    /**
     * 数据是否有效：1有效，0删除
     * @param enable 数据是否有效：1有效，0删除
     */
    public void setEnable(Byte enable) {
        this.enable = enable;
    }
}