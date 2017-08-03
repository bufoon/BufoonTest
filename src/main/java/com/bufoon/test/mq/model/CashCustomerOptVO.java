package com.bufoon.test.mq.model;

import java.io.Serializable;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class CashCustomerOptVO implements Serializable  {
	
	private static final long serialVersionUID = 6093977724131956862L;

	@JSONField(name="create_time", format="yyyy-MM-dd HH:mm:ss")
    private Date createTime; //创建时间

	@JSONField(name="id_person")
    private String idPerson; //客户ID

	@JSONField(name="person_name")
    private String personName; //客户姓名

	@JSONField(name="person_sex")
    private String personSex; // 客户性别

    private String certid; //客户身份证

    private String city; //城市

	@JSONField(name="current_address")
    private String currentAddress; //现居地址

	@JSONField(name="work_address")
    private String workAddress; //工作地址

	@JSONField(name="max_creditamount")
    private String maxCreditamount; //最大贷款额度

	@JSONField(name="max_payablity")
    private String maxPayablity; //最大贷款能力

	@JSONField(name="is_student")
    private String isStudent; //是否学生

	@JSONField(name="data_source")
    private String dataSource; //数据来源

	@JSONField(name="person_mobile")
    private String personMobile; //手机号

    private String province; //省份

	@JSONField(name="if_specify")
    private String ifSpecify; //城市办单模式

	@JSONField(name="offer_stages")
    private String offerStages; //offer阶段

    private String type; //offer阶段标识

    private String part; //offer阶段标识

    private String risklevel; //客户风险等级

    private String orgcode; //合同来源

    private String cyclecreditlimit; //循环现金贷标识

	@JSONField(name="is_preproduct")
    private String isPreproduct; //是否前置产品，1：是；其他：否

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(String idPerson) {
        this.idPerson = idPerson == null ? null : idPerson.trim();
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName == null ? null : personName.trim();
    }

    public String getPersonSex() {
        return personSex;
    }

    public void setPersonSex(String personSex) {
        this.personSex = personSex == null ? null : personSex.trim();
    }

    public String getCertid() {
        return certid;
    }

    public void setCertid(String certid) {
        this.certid = certid == null ? null : certid.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress == null ? null : currentAddress.trim();
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress == null ? null : workAddress.trim();
    }

    public String getMaxCreditamount() {
        return maxCreditamount;
    }

    public void setMaxCreditamount(String maxCreditamount) {
        this.maxCreditamount = maxCreditamount == null ? null : maxCreditamount.trim();
    }

    public String getMaxPayablity() {
        return maxPayablity;
    }

    public void setMaxPayablity(String maxPayablity) {
        this.maxPayablity = maxPayablity == null ? null : maxPayablity.trim();
    }

    public String getIsStudent() {
        return isStudent;
    }

    public void setIsStudent(String isStudent) {
        this.isStudent = isStudent == null ? null : isStudent.trim();
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource == null ? null : dataSource.trim();
    }

    public String getPersonMobile() {
        return personMobile;
    }

    public void setPersonMobile(String personMobile) {
        this.personMobile = personMobile == null ? null : personMobile.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getIfSpecify() {
        return ifSpecify;
    }

    public void setIfSpecify(String ifSpecify) {
        this.ifSpecify = ifSpecify == null ? null : ifSpecify.trim();
    }

    public String getOfferStages() {
        return offerStages;
    }

    public void setOfferStages(String offerStages) {
        this.offerStages = offerStages == null ? null : offerStages.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part == null ? null : part.trim();
    }

    public String getRisklevel() {
        return risklevel;
    }

    public void setRisklevel(String risklevel) {
        this.risklevel = risklevel == null ? null : risklevel.trim();
    }

    public String getOrgcode() {
        return orgcode;
    }

    public void setOrgcode(String orgcode) {
        this.orgcode = orgcode == null ? null : orgcode.trim();
    }

    public String getCyclecreditlimit() {
        return cyclecreditlimit;
    }

    public void setCyclecreditlimit(String cyclecreditlimit) {
        this.cyclecreditlimit = cyclecreditlimit == null ? null : cyclecreditlimit.trim();
    }

    public String getIsPreproduct() {
        return isPreproduct;
    }

    public void setIsPreproduct(String isPreproduct) {
        this.isPreproduct = isPreproduct == null ? null : isPreproduct.trim();
    }
}