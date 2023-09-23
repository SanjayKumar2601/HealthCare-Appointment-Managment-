package com.healthcare.healthcareprovider.model;
import java.math.BigInteger;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Table(name = "doctorsandavailability")
public class DoctorsAndAvailability {

	@Id
	@Column(name = "Id")
	private int id;
	@Column(name = "Name")
	private String name;
	@Column(name = "Address")
	private String address;
	@Column(name = "Phone")
	private BigInteger phone;
	@Column(name = "Email")
	private String email;
	@Column(name = "Date")
	private Date date;
	@Column(name = "Availability")
	private String availability;
	@Column(name = "Healthcareproviderid")
	private int healthCareProviderId;

	public DoctorsAndAvailability() {
		super();
	}

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public BigInteger getPhone() {
		return phone;
	}

	public void setPhone(BigInteger phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	public int getHealthCareProviderId() {
		return healthCareProviderId;
	}

	public void setHealthCareProviderId(int healthCareProviderId) {
		this.healthCareProviderId = healthCareProviderId;
	}

	@Override
	public String toString() {
		return "DoctorsAndAvailability [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone
				+ ", email=" + email + ", date=" + date + ", availability=" + availability + ", healthCareProviderId="
				+ healthCareProviderId + "]";
	}
}
