package com.orangeandbronze.springmvcdemo.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
public class Employee {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long employeeId;

	@Column(name = "FULL_NAME")
	private String fullName;

	@Column(name = "POSITION")
	private String position;

	@Column(name = "SALARY")
	private BigDecimal salary;

	@Column(name = "SUPERVISOR")
	private String immediateSupervisor;

	@NotNull(message = "Please provide your desired Employee ID.")
	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	@NotNull(message = "Please provide your full name.")
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	@NotNull(message = "Please provide your position.")
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@NotNull(message = "Price is required")
	@Min(value = 0, message = "Price should be greater than equal to 0")
	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	@NotNull(message = "Please provide your Supervisor.")
	public String getImmediateSupervisor() {
		return immediateSupervisor;
	}

	public void setImmediateSupervisor(String immediateSupervisor) {
		this.immediateSupervisor = immediateSupervisor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((employeeId == null) ? 0 : employeeId.hashCode());
		result = prime * result + ((fullName == null) ? 0 : fullName.hashCode());
		result = prime * result + ((immediateSupervisor == null) ? 0 : immediateSupervisor.hashCode());
		result = prime * result + ((position == null) ? 0 : position.hashCode());
		result = prime * result + ((salary == null) ? 0 : salary.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Employee other = (Employee) obj;
		if (employeeId == null) {
			if (other.employeeId != null) {
				return false;
			}
		} else if (!employeeId.equals(other.employeeId)) {
			return false;
		}
		if (fullName == null) {
			if (other.fullName != null) {
				return false;
			}
		} else if (!fullName.equals(other.fullName)) {
			return false;
		}
		if (immediateSupervisor == null) {
			if (other.immediateSupervisor != null) {
				return false;
			}
		} else if (!immediateSupervisor.equals(other.immediateSupervisor)) {
			return false;
		}
		if (position == null) {
			if (other.position != null) {
				return false;
			}
		} else if (!position.equals(other.position)) {
			return false;
		}
		if (salary == null) {
			if (other.salary != null) {
				return false;
			}
		} else if (!salary.equals(other.salary)) {
			return false;
		}
		return true;
	}

}
