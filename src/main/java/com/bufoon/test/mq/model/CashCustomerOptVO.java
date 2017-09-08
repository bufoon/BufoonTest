package com.bufoon.test.mq.model;

import java.io.Serializable;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class CashCustomerOptVO implements Serializable  {
	
	private static final long serialVersionUID = 6093977724131956862L;

	@JSONField(name="create_time", format="yyyy-MM-dd HH:mm:ss")
    private Date create_time; //创建时间

	@JSONField(name="id_person")
    private String id_person; //客户ID

	@JSONField(name="person_name")
    private String person_name; //客户姓名

	@JSONField(name="person_sex")
    private String person_sex; // 客户性别

    private String certid; //客户身份证

    private String city; //城市

	@JSONField(name="current_address")
    private String current_address; //现居地址

	@JSONField(name="work_address")
    private String work_address; //工作地址

	@JSONField(name="max_creditamount")
    private String max_creditamount; //最大贷款额度

	@JSONField(name="max_payablity")
    private String max_payablity; //最大贷款能力

	@JSONField(name="is_student")
    private String is_student; //是否学生

	@JSONField(name="data_source")
    private String data_source; //数据来源

	@JSONField(name="person_mobile")
    private String person_mobile; //手机号

    private String province; //省份

	@JSONField(name="if_specify")
    private String if_specify; //城市办单模式

	@JSONField(name="offer_stages")
    private String offer_stages; //offer阶段

    private String type; //offer阶段标识

    private String part; //offer阶段标识

    private String risklevel; //客户风险等级

    private String orgcode; //合同来源

    private String cyclecreditlimit; //循环现金贷标识

	@JSONField(name="is_preproduct")
    private String is_preproduct; //是否前置产品，1：是；其他：否

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public String getId_person() {
		return id_person;
	}

	public void setId_person(String id_person) {
		this.id_person = id_person;
	}

	public String getPerson_name() {
		return person_name;
	}

	public void setPerson_name(String person_name) {
		this.person_name = person_name;
	}

	public String getPerson_sex() {
		return person_sex;
	}

	public void setPerson_sex(String person_sex) {
		this.person_sex = person_sex;
	}

	public String getCertid() {
		return certid;
	}

	public void setCertid(String certid) {
		this.certid = certid;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCurrent_address() {
		return current_address;
	}

	public void setCurrent_address(String current_address) {
		this.current_address = current_address;
	}

	public String getWork_address() {
		return work_address;
	}

	public void setWork_address(String work_address) {
		this.work_address = work_address;
	}

	public String getMax_creditamount() {
		return max_creditamount;
	}

	public void setMax_creditamount(String max_creditamount) {
		this.max_creditamount = max_creditamount;
	}

	public String getMax_payablity() {
		return max_payablity;
	}

	public void setMax_payablity(String max_payablity) {
		this.max_payablity = max_payablity;
	}

	public String getIs_student() {
		return is_student;
	}

	public void setIs_student(String is_student) {
		this.is_student = is_student;
	}

	public String getData_source() {
		return data_source;
	}

	public void setData_source(String data_source) {
		this.data_source = data_source;
	}

	public String getPerson_mobile() {
		return person_mobile;
	}

	public void setPerson_mobile(String person_mobile) {
		this.person_mobile = person_mobile;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getIf_specify() {
		return if_specify;
	}

	public void setIf_specify(String if_specify) {
		this.if_specify = if_specify;
	}

	public String getOffer_stages() {
		return offer_stages;
	}

	public void setOffer_stages(String offer_stages) {
		this.offer_stages = offer_stages;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}

	public String getRisklevel() {
		return risklevel;
	}

	public void setRisklevel(String risklevel) {
		this.risklevel = risklevel;
	}

	public String getOrgcode() {
		return orgcode;
	}

	public void setOrgcode(String orgcode) {
		this.orgcode = orgcode;
	}

	public String getCyclecreditlimit() {
		return cyclecreditlimit;
	}

	public void setCyclecreditlimit(String cyclecreditlimit) {
		this.cyclecreditlimit = cyclecreditlimit;
	}

	public String getIs_preproduct() {
		return is_preproduct;
	}

	public void setIs_preproduct(String is_preproduct) {
		this.is_preproduct = is_preproduct;
	}

}