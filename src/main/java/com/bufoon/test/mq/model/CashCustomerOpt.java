package com.bufoon.test.mq.model;

import java.io.Serializable;
import java.util.Date;

public class CashCustomerOpt implements Serializable {
    private static final long serialVersionUID = 4341561451552508026L;

	private Date createTime;

    private String idPerson;

    private String personName;

    private String personSex;

    private String certid;

    private String city;

    private String currentAddress;

    private String workAddress;

    private String maxCreditamount;

    private String maxPayablity;

    private String isStudent;

    private String dataSource;

    private String personMobile;

    private String province;

    private String ifSpecify;

    private String offerStages;

    private String type;

    private String part;

    private String risklevel;

    private String orgcode;

    private String cyclecreditlimit;

    private String isPreproduct;

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