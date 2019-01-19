/**   
 * @Title: UsersEntity.java 
 * @Package com.sample.sys.entity 
 * @Description: TODO(��һ�仰�������ļ���ʲô) 
 * @author �����ߣ�  
 * @date May 25, 2018 3:00:46 PM 
 * @version V1.0   
 */
package com.sample.sys.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * @Description:
 * 
 * @date May 25, 2018 3:00:46 PM
 */
@Entity
@Table(name = "users")
public class UsersEntity   extends UserInfo {

    private static final long serialVersionUID = 1L;
    
    @Column(name = "phone")
    private String phone;
    
    @Column(name="image")
    private String headImgUrl;
    
    @Column(name="wx_openid")
    private String wxOpenId; 
    
    @Column(name="qq_openid")
    private String qqOpenId;
    
    @Column(name="wb_openid")
    private String wbOpenId;
    
    @Column(name="address")
    private String address;
    
    @Column(name="province")
    private String province;
    
    @Column(name="city")
    private String city;
    
    @Column(name="dept_id")
    private Integer deptId;
    
    @Column(name="type")
    private Integer type;
    
    @Column(name="equipment_source")
    private String equipmentSource;
    
    @Column(name="state")
    private Integer state;
  
    
    @Column(name="delete_flag")
    private Integer deleteFlag;
    
    @Column(name="nick_name")
    private String nickName;
    
    @Column(name="virtual_point")
    private Integer virtualPoint;
    
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Column(name = "sex")
	private String sex;

    
    
    
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getHeadImgUrl() {
		return headImgUrl;
	}

	public void setHeadImgUrl(String headImgUrl) {
		this.headImgUrl = headImgUrl;
	}
	public String getWxOpenId() {
		return wxOpenId;
	}

	public void setWxOpenId(String wxOpenId) {
		this.wxOpenId = wxOpenId;
	}

	public String getQqOpenId() {
		return qqOpenId;
	}

	public void setQqOpenId(String qqOpenId) {
		this.qqOpenId = qqOpenId;
	}

	public String getWbOpenId() {
		return wbOpenId;
	}

	public void setWbOpenId(String wbOpenId) {
		this.wbOpenId = wbOpenId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getEquipmentSource() {
		return equipmentSource;
	}

	public void setEquipmentSource(String equipmentSource) {
		this.equipmentSource = equipmentSource;
	}



	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}


	public Integer getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(Integer deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Integer getVirtualPoint() {
		return virtualPoint;
	}

	public void setVirtualPoint(Integer virtualPoint) {
		this.virtualPoint = virtualPoint;
	}

	@Override
	public String toString() {
		return "UsersEntity [phone=" + phone + ", headImgUrl=" + headImgUrl + ", wxOpenId=" + wxOpenId + ", qqOpenId="
				+ qqOpenId + ", wbOpenId=" + wbOpenId + ", address=" + address + ", province=" + province + ", city="
				+ city + ", deptId=" + deptId + ", type=" + type + ", equipmentSource=" + equipmentSource + ", state="
				+ state + ", deleteFlag=" + deleteFlag + ", nickName=" + nickName + ", virtualPoint=" + virtualPoint
				+ ", sex=" + sex + "]";
	}
	
	
	

}
