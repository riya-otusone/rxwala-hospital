package com.medico.hospital.entity;

import jakarta.persistence.Column;
import org.springframework.data.relational.core.mapping.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Table(name="nurse")
@Entity
public class Store {
	
    public Store() {
		
	}
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String storeCategory;
    private String storeId;
    private String pincode;
    private String district;
    private String town;
    private String storeOwner;
    private String ownerAddress;
    private String ownerContact;
    private String emailId;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStoreCategory() {
		return storeCategory;
	}
	public void setStoreCategory(String storeCategory) {
		this.storeCategory = storeCategory;
	}
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getStoreOwner() {
		return storeOwner;
	}
	public void setStoreOwner(String storeOwner) {
		this.storeOwner = storeOwner;
	}
	public String getOwnerAddress() {
		return ownerAddress;
	}
	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}
	public String getOwnerContact() {
		return ownerContact;
	}
	public void setOwnerContact(String ownerContact) {
		this.ownerContact = ownerContact;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Store(Long id, String storeCategory, String storeId, String pincode, String district, String town,
			String storeOwner, String ownerAddress, String ownerContact, String emailId) {
		super();
		this.id = id;
		this.storeCategory = storeCategory;
		this.storeId = storeId;
		this.pincode = pincode;
		this.district = district;
		this.town = town;
		this.storeOwner = storeOwner;
		this.ownerAddress = ownerAddress;
		this.ownerContact = ownerContact;
		this.emailId = emailId;
	}
	

    // Constructors, getters, and setters
}
