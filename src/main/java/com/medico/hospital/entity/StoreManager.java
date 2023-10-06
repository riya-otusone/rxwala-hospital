package com.medico.hospital.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StoreManager {
	
    public StoreManager() {
		
	}
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String storeOwner;
    private String ownerAddress;
    private String ownerContact;
    private String emailId;
    private String type;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public StoreManager(Long id, String storeOwner, String ownerAddress, String ownerContact, String emailId,
			String type) {
		super();
		this.id = id;
		this.storeOwner = storeOwner;
		this.ownerAddress = ownerAddress;
		this.ownerContact = ownerContact;
		this.emailId = emailId;
		this.type = type;
	} 
    
    
    
    
    
}

