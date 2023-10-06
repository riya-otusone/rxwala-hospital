CREATE TABLE ambulance (
    id INT AUTO_INCREMENT PRIMARY KEY,
    service_name VARCHAR(255),
    vehicle_brand VARCHAR(255),
    vin VARCHAR(17),
    registration_number VARCHAR(20),
    owner_name VARCHAR(255),
    is_oxygen_cylinder_fitted BOOLEAN,
    has_primary_carer BOOLEAN,
    contact_number VARCHAR(20),
    rto_registration_with VARCHAR(255),
    state VARCHAR(255),
    has_valid_license BOOLEAN,
    base_location VARCHAR(255),
    additional_features VARCHAR(1000),
    vehicle_rc VARCHAR(255),
    ambulance_license_certificate VARCHAR(255),
    photo VARCHAR(255)
);


INSERT INTO ambulance (
    service_name,
    vehicle_brand,
    vin,
    registration_number,
    owner_name,
    is_oxygen_cylinder_fitted,
    has_primary_carer,
    contact_number,
    rto_registration_with,
    state,
    has_valid_license,
    base_location,
    additional_features,
    vehicle_rc,
    ambulance_license_certificate,
    photo
) VALUES
(
    'Ambulance Service 1',
    'Toyota',
    '12345678901234567',
    'ABC123',
    'John Doe',
    true,
    false,
    '123-456-7890',
    'RTO-XYZ',
    'California',
    true,
    'Location A',
    'Additional features 1',
    'vehicle_rc_file_path_1',
    'license_certificate_file_path_1',
    'photo_file_path_1'
),
(
    'Ambulance Service 2',
    'Ford',
    '98765432109876543',
    'XYZ789',
    'Jane Smith',
    false,
    true,
    '987-654-3210',
    'RTO-ABC',
    'New York',
    true,
    'Location B',
    'Additional features 2',
    'vehicle_rc_file_path_2',
    'license_certificate_file_path_2',
    'photo_file_path_2'
);

    -- Create the nurse table
CREATE TABLE nurse (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    center_name VARCHAR(255) NOT NULL,
    service_name VARCHAR(255) NOT NULL,
    name VARCHAR(255),
    vehicle_brand VARCHAR(255),
    address VARCHAR(255),
    vin VARCHAR(17),
    location VARCHAR(255) NOT NULL,
    registration_number VARCHAR(20),
    phone_number VARCHAR(15),
    owner_name VARCHAR(255),
    email VARCHAR(255),
    license_document VARCHAR(255)
);
INSERT INTO nurse (center_name, service_name, name, vehicle_brand, address, vin, location, registration_number, phone_number, owner_name, email, license_document)
VALUES
    ('Service Center 1', 'Auto Repair', 'John Smith', 'Toyota', '123 Main St', 'ABC123456789DEF01', 'Location 1', '12345', '555-555-5555', 'Jane Doe', 'jane@example.com', '/path/to/license1.pdf'),
    ('Service Center 2', 'Oil Change', 'Alice Johnson', 'Honda', '456 Elm St', 'XYZ987654321UVW02', 'Location 2', '54321', '444-444-4444', 'Bob Wilson', 'bob@example.com', '/path/to/license2.pdf'),
    ('Service Center 3', 'Tire Replacement', 'David Brown', 'Ford', '789 Oak St', 'MNO123789456PQR03', 'Location 3', '67890', '333-333-3333', 'Emily Green', 'emily@example.com', '/path/to/license3.pdf');


    
    -- Create a table for the Vendor entity
CREATE TABLE vendor (
    id INT AUTO_INCREMENT PRIMARY KEY,
    service_name VARCHAR(255),
    vehicle_brand VARCHAR(255),
    vin VARCHAR(17),
    registration_number VARCHAR(20),
    owner_name VARCHAR(255),
    is_oxygen_cylinder_fitted BOOLEAN,
    has_primary_carer BOOLEAN,
    contact_number VARCHAR(20),
    rto_registration_with VARCHAR(255),
    state VARCHAR(255),
    has_valid_license BOOLEAN,
    base_location VARCHAR(255),
    additional_features VARCHAR(1000),
    vehicle_rc VARCHAR(255),
    ambulance_license_certificate VARCHAR(255),
    photo VARCHAR(255)
);


INSERT INTO vendor (
    service_name,
    vehicle_brand,
    vin,
    registration_number,
    owner_name,
    is_oxygen_cylinder_fitted,
    has_primary_carer,
    contact_number,
    rto_registration_with,
    state,
    has_valid_license,
    base_location,
    additional_features,
    vehicle_rc,
    ambulance_license_certificate,
    photo
) VALUES
(
    'Ambulance Service 1',
    'Toyota',
    '12345678901234567',
    'ABC123',
    'John Doe',
    true,
    false,
    '123-456-7890',
    'RTO-XYZ',
    'California',
    true,
    'Location A',
    'Additional features 1',
    'vehicle_rc_file_path_1',
    'license_certificate_file_path_1',
    'photo_file_path_1'
),
(
    'Ambulance Service 2',
    'Ford',
    '98765432109876543',
    'XYZ789',
    'Jane Smith',
    false,
    true,
    '987-654-3210',
    'RTO-ABC',
    'New York',
    true,
    'Location B',
    'Additional features 2',
    'vehicle_rc_file_path_2',
    'license_certificate_file_path_2',
    'photo_file_path_2'
);

-- Create the Store table
CREATE TABLE store (
    id INT AUTO_INCREMENT PRIMARY KEY,
    store_category VARCHAR(255),
    store_id VARCHAR(255),
    pincode VARCHAR(255),
    district VARCHAR(255),
    town VARCHAR(255),
    store_owner VARCHAR(255),
    owner_address VARCHAR(255),
    owner_contact VARCHAR(255),
    email_id VARCHAR(255)
);


INSERT INTO store (store_category, store_id, pincode, district, town, store_owner, owner_address, owner_contact, email_id)
VALUES
    ('Pharmacy', 'Store1', '12345', 'District1', 'Town1', 'Owner1', 'Address1', '+1-123-456-7890', 'owner1@example.com'),
    ('Pharmacy', 'Store2', '54321', 'District2', 'Town2', 'Owner2', 'Address2', '+1-987-654-3210', 'owner2@example.com'),
    ('Pharmacy', 'Store3', '67890', 'District3', 'Town3', 'Owner3', 'Address3', '+1-111-222-3333', 'owner3@example.com');

CREATE TABLE store_manager (
    id INT AUTO_INCREMENT PRIMARY KEY,
    store_owner VARCHAR(255) NOT NULL,
    owner_address VARCHAR(255) NOT NULL,
    owner_contact VARCHAR(20) NOT NULL,
    email_id VARCHAR(255) NOT NULL,
    type VARCHAR(255) NOT NULL
);

INSERT INTO store_manager (store_owner, owner_address, owner_contact, email_id, type)
VALUES
    ('StoreOwner1', 'Address1', '+1-123-456-7890', 'owner1@example.com', 'Pharmacy'),
    ('StoreOwner2', 'Address2', '+1-987-654-3210', 'owner2@example.com', 'Pharmacy'),
    ('StoreOwner3', 'Address3', '+1-111-222-3333', 'owner3@example.com', 'Pharmacy');

