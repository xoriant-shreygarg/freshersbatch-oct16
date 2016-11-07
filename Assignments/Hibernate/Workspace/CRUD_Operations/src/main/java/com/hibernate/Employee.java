package com.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries({ @NamedQuery(name = "totalSalary", query = "select sum(e.salary) as totalSal from Employee e"),
		@NamedQuery(name = "sortedBySalary", query = "select e.name as name,e.salary as salary from Employee e order by e.salary"),
		@NamedQuery(name = "avgSal", query = "select avg(salary) as avg_salary from Employee e order by e.salary"),
		@NamedQuery(name = "salaryGreaterThen10000", query = "select e.name as name,e.salary as salary" + " from Employee e where e.salary > 10000")		
})
@Entity
@Table(name = "EMP")
public class Employee {

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private int id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "SALARY")
	private int salary;
	@Column(name = "COMMISSION")
	private int commission;
	@Column(name = "ROLE")
	private String role;
	@Column(name = "DEPT_NO")
	private int deptNo;
	@Column(name = "HIRED_DATE")
	private String hiredDate;
	@Column(name = "MANAGER_ID")
	private int managerId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getCommission() {
		return commission;
	}

	public void setCommission(int commission) {
		this.commission = commission;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public String getHiredDate() {
		return hiredDate;
	}

	public void setHiredDate(String hiredDate) {
		this.hiredDate = hiredDate;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", commission=" + commission + ", role="
				+ role + ", deptNo=" + deptNo + ", hiredDate=" + hiredDate + ", managerId=" + managerId + "]";
	}

	public Employee(int id, String name, int salary, int commission, String role, int deptNo, String hiredDate,
			int managerId) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.commission = commission;
		this.role = role;
		this.deptNo = deptNo;
		this.hiredDate = hiredDate;
		this.managerId = managerId;
	}

	public Employee() {
		super();
	}
	
	

}