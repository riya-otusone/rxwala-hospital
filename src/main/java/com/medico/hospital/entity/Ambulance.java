package com.medico.hospital.entity;

import org.springframework.data.relational.core.mapping.Table;


import jakarta.persistence.CollectionTable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;
@Table("ambulance")
@Entity
public class Ambulance {
	public Ambulance() {
	    // Default constructor
	}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "service_name")
    private String serviceName;

    @Column(name = "vehicle_brand")
    private String vehicleBrand;

    @Column(name = "vin")
    private String vin;

    @Column(name = "registration_number")
    private String registrationNumber;

    @Column(name = "owner_name")
    private String ownerName;

    @Column(name = "oxygen_cylinder")
    private boolean oxygenCylinder;

    @Column(name = "primary_carer")
    private boolean primaryCarer;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "rto_registration")
    private String rtoRegistration;

    @Column(name = "state")
    private String state;

    @Column(name = "valid_license")
    private boolean validLicense;

    @Column(name = "base_location")
    private String baseLocation;

    @ElementCollection
    @CollectionTable(name = "ambulance_features", joinColumns = @JoinColumn(name = "ambulance_id"))
    @Column(name = "feature")
    private List<String> additionalFeatures;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getVehicleBrand() {
		return vehicleBrand;
	}

	public void setVehicleBrand(String vehicleBrand) {
		this.vehicleBrand = vehicleBrand;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public boolean isOxygenCylinder() {
		return oxygenCylinder;
	}

	public void setOxygenCylinder(boolean oxygenCylinder) {
		this.oxygenCylinder = oxygenCylinder;
	}

	public boolean isPrimaryCarer() {
		return primaryCarer;
	}

	public void setPrimaryCarer(boolean primaryCarer) {
		this.primaryCarer = primaryCarer;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getRtoRegistration() {
		return rtoRegistration;
	}

	public void setRtoRegistration(String rtoRegistration) {
		this.rtoRegistration = rtoRegistration;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public boolean isValidLicense() {
		return validLicense;
	}

	public void setValidLicense(boolean validLicense) {
		this.validLicense = validLicense;
	}

	public String getBaseLocation() {
		return baseLocation;
	}

	public void setBaseLocation(String baseLocation) {
		this.baseLocation = baseLocation;
	}

	public List<String> getAdditionalFeatures() {
		return additionalFeatures;
	}

	public void setAdditionalFeatures(List<String> additionalFeatures) {
		this.additionalFeatures = additionalFeatures;
	}

	public Ambulance(Long id, String serviceName, String vehicleBrand, String vin, String registrationNumber,
			String ownerName, boolean oxygenCylinder, boolean primaryCarer, String phoneNumber,
			String rtoRegistration, String state, boolean validLicense, String baseLocation,
			List<String> additionalFeatures) {
		super();
		this.id = id;
		this.serviceName = serviceName;
		this.vehicleBrand = vehicleBrand;
		this.vin = vin;
		this.registrationNumber = registrationNumber;
		this.ownerName = ownerName;
		this.oxygenCylinder = oxygenCylinder;
		this.primaryCarer = primaryCarer;
		this.phoneNumber = phoneNumber;
		this.rtoRegistration = rtoRegistration;
		this.state = state;
		this.validLicense = validLicense;
		this.baseLocation = baseLocation;
		this.additionalFeatures = additionalFeatures;
	}

	public Object getDateOfRegistration() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setDateOfRegistration(Object dateOfRegistration) {
		// TODO Auto-generated method stub
		
	}

	public void setLocation(Object location) {
		// TODO Auto-generated method stub
		
	}

	public Object isAvailability() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setAvailability(Object availability) {
		// TODO Auto-generated method stub
		
	}

	public Object getPrice() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getWaitingCharge() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setPrice(Object price) {
		// TODO Auto-generated method stub
		
	}

	public void setWaitingCharge(Object waitingCharge) {
		// TODO Auto-generated method stub
		
	}

   
}

