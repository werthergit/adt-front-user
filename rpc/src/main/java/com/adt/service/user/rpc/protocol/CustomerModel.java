package com.adt.service.user.rpc.protocol;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by my on 2017/11/13.
 */
public class CustomerModel implements Serializable {


    private Integer id;
    /**
     * 客户姓名
     */
    private String customerName;

    /**
     * 客户账号
     */
    private String customerCode;

    private Byte realNameStatus;

    /**
     * 性别;0男；1女
     */
    private Byte sex;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 驾驶证号
     */
    private String driverLicenseCode;

    /**
     * 驾驶证是否验证 0是1否
     */
    private Byte isCheck;

    private String driverLicenseImg;

    /**
     * 意向车辆
     */
    private String intentCarCode;

    /**
     * 意向颜色
     */
    private String intentCarColor;

    /**
     * 创建人id（顾问账号）
     */
    private String createUser;

    /**
     * 创建人姓名
     */
    private String createUsername;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改人id（顾问账号）
     */
    private String updateUser;

    /**
     * 修改人姓名
     */
    private String updateUsername;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 是否删除0:未删除，1:删除
     */
    private Byte isDelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public Byte getRealNameStatus() {
        return realNameStatus;
    }

    public void setRealNameStatus(Byte realNameStatus) {
        this.realNameStatus = realNameStatus;
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDriverLicenseCode() {
        return driverLicenseCode;
    }

    public void setDriverLicenseCode(String driverLicenseCode) {
        this.driverLicenseCode = driverLicenseCode;
    }

    public Byte getIsCheck() {
        return isCheck;
    }

    public void setIsCheck(Byte isCheck) {
        this.isCheck = isCheck;
    }

    public String getDriverLicenseImg() {
        return driverLicenseImg;
    }

    public void setDriverLicenseImg(String driverLicenseImg) {
        this.driverLicenseImg = driverLicenseImg;
    }

    public String getIntentCarCode() {
        return intentCarCode;
    }

    public void setIntentCarCode(String intentCarCode) {
        this.intentCarCode = intentCarCode;
    }

    public String getIntentCarColor() {
        return intentCarColor;
    }

    public void setIntentCarColor(String intentCarColor) {
        this.intentCarColor = intentCarColor;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getCreateUsername() {
        return createUsername;
    }

    public void setCreateUsername(String createUsername) {
        this.createUsername = createUsername;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public String getUpdateUsername() {
        return updateUsername;
    }

    public void setUpdateUsername(String updateUsername) {
        this.updateUsername = updateUsername;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "CustomerModel{" + "customerName='" + customerName + '\'' + ", customerCode='" + customerCode + '\'' + ", realNameStatus=" + realNameStatus + ", sex=" + sex + ", phone='" + phone + '\'' + ", driverLicenseCode='" + driverLicenseCode + '\'' + ", isCheck=" + isCheck + ", driverLicenseImg='" + driverLicenseImg + '\'' + ", intentCarCode='" + intentCarCode + '\'' + ", intentCarColor='" + intentCarColor + '\'' + ", createUser='" + createUser + '\'' + ", createUsername='" + createUsername + '\'' + ", createTime=" + createTime + ", updateUser='" + updateUser + '\'' + ", updateUsername='" + updateUsername + '\'' + ", updateTime=" + updateTime + ", isDelete=" + isDelete + '}';
    }
}
