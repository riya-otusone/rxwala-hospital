package com.medico.hospital.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table(name="vendor")
	@Entity
	public class Vendor {
		public Vendor() {
		    // Default constructor 
		}

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    
	    private String serviceName;
	    private String vehicleBrand;
	    private String vin;
	    private String registrationNumber;
	    private String ownerName;
	    private boolean oxygenCylinder;
	    private boolean primaryCarer;
	    private String contactNumber;
	    private String rtoRegistrationWith;
	    private String state;
	    private boolean validLicenseForAmbulance;
	    private String baseLocation;
	    private String additionalFeatures;
	    private String vehicleRc; // Store file path or reference to the RC file
	    private String ambulanceLicenseCertificate; // Store file path or reference to the license certificate file
	    private String photo; // Store file path or reference to the photo
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
		public String getContactNumber() {
			return contactNumber;
		}
		public void setContactNumber(String contactNumber) {
			this.contactNumber = contactNumber;
		}
		public String getRtoRegistrationWith() {
			return rtoRegistrationWith;
		}
		public void setRtoRegistrationWith(String rtoRegistrationWith) {
			this.rtoRegistrationWith = rtoRegistrationWith;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public boolean isValidLicenseForAmbulance() {
			return validLicenseForAmbulance;
		}
		public void setValidLicenseForAmbulance(boolean validLicenseForAmbulance) {
			this.validLicenseForAmbulance = validLicenseForAmbulance;
		}
		public String getBaseLocation() {
			return baseLocation;
		}
		public void setBaseLocation(String baseLocation) {
			this.baseLocation = baseLocation;
		}
		public String getAdditionalFeatures() {
			return additionalFeatures;
		}
		public void setAdditionalFeatures(String additionalFeatures) {
			this.additionalFeatures = additionalFeatures;
		}
		public String getVehicleRc() {
			return vehicleRc;
		}
		public void setVehicleRc(String vehicleRc) {
			this.vehicleRc = vehicleRc;
		}
		public String getAmbulanceLicenseCertificate() {
			return ambulanceLicenseCertificate;
		}
		public void setAmbulanceLicenseCertificate(String ambulanceLicenseCertificate) {
			this.ambulanceLicenseCertificate = ambulanceLicenseCertificate;
		}
		public String getPhoto() {
			return photo;
		}
		public void setPhoto(String photo) {
			this.photo = photo;
		}
		public Vendor(Long id, String serviceName, String vehicleBrand, String vin, String registrationNumber,
				String ownerName, boolean oxygenCylinder, boolean primaryCarer, String contactNumber,
				String rtoRegistrationWith, String state, boolean validLicenseForAmbulance, String baseLocation,
				String additionalFeatures, String vehicleRc, String ambulanceLicenseCertificate, String photo) {
			super();
			this.id = id;
			this.serviceName = serviceName;
			this.vehicleBrand = vehicleBrand;
			this.vin = vin;
			this.registrationNumber = registrationNumber;
			this.ownerName = ownerName;
			this.oxygenCylinder = oxygenCylinder;
			this.primaryCarer = primaryCarer;
			this.contactNumber = contactNumber;
			this.rtoRegistrationWith = rtoRegistrationWith;
			this.state = state;
			this.validLicenseForAmbulance = validLicenseForAmbulance;
			this.baseLocation = baseLocation;
			this.additionalFeatures = additionalFeatures;
			this.vehicleRc = vehicleRc;
			this.ambulanceLicenseCertificate = ambulanceLicenseCertificate;
			this.photo = photo;
		}
}
		
	    
	    // Constructors, getters, and setters
	    



