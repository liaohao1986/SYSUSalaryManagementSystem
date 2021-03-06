package com.sms.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "salary")
public class Salary {
		private Integer sid; //主键
		private Integer eid; //职工号
		private Integer positionSalary;//岗位工资
		private Integer levelSalary;//薪级工资
		private Integer areaDifference;//地区差
		private Integer positionAllowance;//岗位津贴
		private Integer educationAllowance;///教护补贴
		private Integer specialAllowance;//特殊津贴
		private Integer onlyChildAllowance;//独生子女
		private Integer otherAllowance;//其它补贴
		private Integer phoneAllowance;//电话补贴
		private Integer monthAddAllowance;//月增资额
		private Integer supplementSalary;//补发工资
		private Integer totleSalary; //本月总工资
		private Date time; //发放工资时间(月份)
		private String remarks; // 备注
		
		public Salary(){
			monthAddAllowance=0;
			supplementSalary=0;
			time=new Date();
		}
		
		public Salary(Integer eid,Integer positionSalary,Integer levelSalary){
			this.eid=eid;
			this.positionSalary=positionSalary;
			this.levelSalary=levelSalary;
			monthAddAllowance=0;
			supplementSalary=0;
			time=new Date();
		}
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="sid")
		public Integer getSid() {
			return sid;
		}
		public void setSid(Integer sid) {
			this.sid = sid;
		}
		
		@Column(name="eid")
		public Integer getEid() {
			return eid;
		}
		public void setEid(Integer eid) {
			this.eid = eid;
		}
		
		@Column(name="position_salary", nullable=false)
		public Integer getPositionSalary() {
			return positionSalary;
		}
		public void setPositionSalary(Integer positionSalary) {
			this.positionSalary = positionSalary;
		}
		
		@Column(name="level_salary")
		public Integer getLevelSalary() {
			return levelSalary;
		}
		public void setLevelSalary(Integer levelSalary) {
			this.levelSalary = levelSalary;
		}
		
		
		@Column(name="area_difference")
		public Integer getAreaDifference() {
			return areaDifference;
		}
		public void setAreaDifference(Integer areaDifference) {
			this.areaDifference = areaDifference;
		}
		
		@Column(name="position_allowance")
		public Integer getPositionAllowance() {
			return positionAllowance;
		}
		public void setPositionAllowance(Integer positionAllowance) {
			this.positionAllowance = positionAllowance;
		}
		
		@Column(name="education_allowance")
		public Integer getEducationAllowance() {
			return educationAllowance;
		}
		public void setEducationAllowance(Integer educationAllowance) {
			this.educationAllowance = educationAllowance;
		}
		
		@Column(name="special_allowance")
		public Integer getSpecialAllowance() {
			return specialAllowance;
		}
		public void setSpecialAllowance(Integer specialAllowance) {
			this.specialAllowance = specialAllowance;
		}
		
		@Column(name="only_child_allowance")
		public Integer getOnlyChildAllowance() {
			return onlyChildAllowance;
		}
		public void setOnlyChildAllowance(Integer onlyChildAllowance) {
			this.onlyChildAllowance = onlyChildAllowance;
		}
		
		@Column(name="other_allowance")
		public Integer getOtherAllowance() {
			return otherAllowance;
		}
		public void setOtherAllowance(Integer otherAllowance) {
			this.otherAllowance = otherAllowance;
		}
		
		@Column(name="phone_allowance")
		public Integer getPhoneAllowance() {
			return phoneAllowance;
		}
		public void setPhoneAllowance(Integer phoneAllowance) {
			this.phoneAllowance = phoneAllowance;
		}
		
		@Column(name="month_add_allowance")
		public Integer getMonthAddAllowance() {
			return monthAddAllowance;
		}
		public void setMonthAddAllowance(Integer monthAddAllowance) {
			this.monthAddAllowance = monthAddAllowance;
		}
		
		@Column(name="supplement_salary")
		public Integer getSupplementSalary() {
			return supplementSalary;
		}
		public void setSupplementSalary(Integer supplementSalary) {
			this.supplementSalary = supplementSalary;
		}
		
		@Column(name="totle_salary")
		public Integer getTotleSalary() {
			return totleSalary;
		}
		public void setTotleSalary(Integer totleSalary) {
			this.totleSalary = totleSalary;
		}
		
		@Column(name="Time")
		public Date getTime() {
			return time;
		}
		public void setTime(Date time) {
			this.time = time;
		}
		
		@Column(name="remarks")
		public String getRemarks() {
			return remarks;
		}
		public void setRemarks(String remarks) {
			this.remarks = remarks;
		}

		//自动生成总工资
		public void setTotleSalary(){
			this.totleSalary=positionSalary+levelSalary+areaDifference+positionAllowance+educationAllowance
					+specialAllowance+onlyChildAllowance+otherAllowance+phoneAllowance;
		}
}
