package com.adt.service.user.domain;

import com.adt.framework.common.mydao.domain.IntegerDomain;
import java.util.Date;
import javax.persistence.*;

@Table(name = "rb_customer")
public class RbCustomer extends IntegerDomain {
    /**
     * 客户姓名
     */
    @Column(name = "CUSTOMER_NAME")
    private String customerName;

    /**
     * 客户账号
     */
    @Column(name = "CUSTOMER_CODE")
    private String customerCode;

    /**
     * 实名制状态 0通过;1未通过;2未验证
     */
    @Column(name = "REAL_NAME_STATUS")
    private Byte realNameStatus;

    /**
     * 性别;0男；1女
     */
    @Column(name = "SEX")
    private Byte sex;

    /**
     * 手机号
     */
    @Column(name = "PHONE")
    private String phone;

    /**
     * 驾驶证号
     */
    @Column(name = "DRIVER_LICENSE_CODE")
    private String driverLicenseCode;

    /**
     * 驾驶证是否验证 0是1否
     */
    @Column(name = "IS_CHECK")
    private Byte isCheck;

    @Column(name = "DRIVER_LICENSE_IMG")
    private String driverLicenseImg;

    /**
     * 意向车辆
     */
    @Column(name = "INTENT_CAR_CODE")
    private String intentCarCode;

    /**
     * 意向颜色
     */
    @Column(name = "INTENT_CAR_COLOR")
    private String intentCarColor;

    /**
     * 创建人id（顾问账号）
     */
    @Column(name = "CREATE_USER")
    private String createUser;

    /**
     * 创建人姓名
     */
    @Column(name = "CREATE_USERNAME")
    private String createUsername;

    /**
     * 创建时间
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;

    /**
     * 修改人id（顾问账号）
     */
    @Column(name = "UPDATE_USER")
    private String updateUser;

    /**
     * 修改人姓名
     */
    @Column(name = "UPDATE_USERNAME")
    private String updateUsername;

    /**
     * 修改时间
     */
    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    /**
     * 是否删除0:未删除，1:删除
     */
    @Column(name = "IS_DELETE")
    private Byte isDelete;

    /**
     * 获取客户姓名
     *
     * @return CUSTOMER_NAME - 客户姓名
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * 设置客户姓名
     *
     * @param customerName 客户姓名
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * 获取客户账号
     *
     * @return CUSTOMER_CODE - 客户账号
     */
    public String getCustomerCode() {
        return customerCode;
    }

    /**
     * 设置客户账号
     *
     * @param customerCode 客户账号
     */
    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    /**
     * 获取实名制状态 0通过;1未通过;2未验证
     *
     * @return REAL_NAME_STATUS - 实名制状态 0通过;1未通过;2未验证
     */
    public Byte getRealNameStatus() {
        return realNameStatus;
    }

    /**
     * 设置实名制状态 0通过;1未通过;2未验证
     *
     * @param realNameStatus 实名制状态 0通过;1未通过;2未验证
     */
    public void setRealNameStatus(Byte realNameStatus) {
        this.realNameStatus = realNameStatus;
    }

    /**
     * 获取性别;0男；1女
     *
     * @return SEX - 性别;0男；1女
     */
    public Byte getSex() {
        return sex;
    }

    /**
     * 设置性别;0男；1女
     *
     * @param sex 性别;0男；1女
     */
    public void setSex(Byte sex) {
        this.sex = sex;
    }

    /**
     * 获取手机号
     *
     * @return PHONE - 手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置手机号
     *
     * @param phone 手机号
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取驾驶证号
     *
     * @return DRIVER_LICENSE_CODE - 驾驶证号
     */
    public String getDriverLicenseCode() {
        return driverLicenseCode;
    }

    /**
     * 设置驾驶证号
     *
     * @param driverLicenseCode 驾驶证号
     */
    public void setDriverLicenseCode(String driverLicenseCode) {
        this.driverLicenseCode = driverLicenseCode;
    }

    /**
     * 获取驾驶证是否验证 0是1否
     *
     * @return IS_CHECK - 驾驶证是否验证 0是1否
     */
    public Byte getIsCheck() {
        return isCheck;
    }

    /**
     * 设置驾驶证是否验证 0是1否
     *
     * @param isCheck 驾驶证是否验证 0是1否
     */
    public void setIsCheck(Byte isCheck) {
        this.isCheck = isCheck;
    }

    /**
     * @return DRIVER_LICENSE_IMG
     */
    public String getDriverLicenseImg() {
        return driverLicenseImg;
    }

    /**
     * @param driverLicenseImg
     */
    public void setDriverLicenseImg(String driverLicenseImg) {
        this.driverLicenseImg = driverLicenseImg;
    }

    /**
     * 获取意向车辆
     *
     * @return INTENT_CAR_CODE - 意向车辆
     */
    public String getIntentCarCode() {
        return intentCarCode;
    }

    /**
     * 设置意向车辆
     *
     * @param intentCarCode 意向车辆
     */
    public void setIntentCarCode(String intentCarCode) {
        this.intentCarCode = intentCarCode;
    }

    /**
     * 获取意向颜色
     *
     * @return INTENT_CAR_COLOR - 意向颜色
     */
    public String getIntentCarColor() {
        return intentCarColor;
    }

    /**
     * 设置意向颜色
     *
     * @param intentCarColor 意向颜色
     */
    public void setIntentCarColor(String intentCarColor) {
        this.intentCarColor = intentCarColor;
    }

    /**
     * 获取创建人id（顾问账号）
     *
     * @return CREATE_USER - 创建人id（顾问账号）
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * 设置创建人id（顾问账号）
     *
     * @param createUser 创建人id（顾问账号）
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    /**
     * 获取创建人姓名
     *
     * @return CREATE_USERNAME - 创建人姓名
     */
    public String getCreateUsername() {
        return createUsername;
    }

    /**
     * 设置创建人姓名
     *
     * @param createUsername 创建人姓名
     */
    public void setCreateUsername(String createUsername) {
        this.createUsername = createUsername;
    }

    /**
     * 获取创建时间
     *
     * @return CREATE_TIME - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取修改人id（顾问账号）
     *
     * @return UPDATE_USER - 修改人id（顾问账号）
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * 设置修改人id（顾问账号）
     *
     * @param updateUser 修改人id（顾问账号）
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * 获取修改人姓名
     *
     * @return UPDATE_USERNAME - 修改人姓名
     */
    public String getUpdateUsername() {
        return updateUsername;
    }

    /**
     * 设置修改人姓名
     *
     * @param updateUsername 修改人姓名
     */
    public void setUpdateUsername(String updateUsername) {
        this.updateUsername = updateUsername;
    }

    /**
     * 获取修改时间
     *
     * @return UPDATE_TIME - 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间
     *
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取是否删除0:未删除，1:删除
     *
     * @return IS_DELETE - 是否删除0:未删除，1:删除
     */
    public Byte getIsDelete() {
        return isDelete;
    }

    /**
     * 设置是否删除0:未删除，1:删除
     *
     * @param isDelete 是否删除0:未删除，1:删除
     */
    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "RbCustomer{" + "customerName='" + customerName + '\'' + ", customerCode='" + customerCode + '\'' + ", realNameStatus=" + realNameStatus + ", sex=" + sex + ", phone='" + phone + '\'' + ", driverLicenseCode='" + driverLicenseCode + '\'' + ", isCheck=" + isCheck + ", driverLicenseImg='" + driverLicenseImg + '\'' + ", intentCarCode='" + intentCarCode + '\'' + ", intentCarColor='" + intentCarColor + '\'' + ", createUser='" + createUser + '\'' + ", createUsername='" + createUsername + '\'' + ", createTime=" + createTime + ", updateUser='" + updateUser + '\'' + ", updateUsername='" + updateUsername + '\'' + ", updateTime=" + updateTime + ", isDelete=" + isDelete + '}';
    }
}