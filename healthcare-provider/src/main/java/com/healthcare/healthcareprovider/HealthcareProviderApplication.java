package com.healthcare.healthcareprovider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@SpringBootApplication
@EnableEurekaClient
public class HealthcareProviderApplication {
	public static void main(String[] args) {
		SpringApplication.run(HealthcareProviderApplication.class, args);
	}
}
/*
Healthcare providers list
name
address
phone num
email

CREATE TABLE HealthcareProviders(
    Id int NOT NULL AUTO_INCREMENT,
    Name varchar(255) NOT NULL,
    Address varchar(255),
    Phone bigint,
    Email varchar(255),
    PRIMARY KEY (Id)
);

INSERT INTO HealthcareProviders(Name,Address,Phone,Email) VALUES ('Apollo','No.91,Greams Road',9000000000,'apollo@apollo.com');
INSERT INTO HealthcareProviders(Name,Address,Phone,Email) VALUES ('Fortis','No.1,TTK Road',9080908090,'fortis@fortis.com');
INSERT INTO HealthcareProviders(Name,Address,Phone,Email) VALUES ('Chettinad','No.10,Navalur',9889889889,'chettinad@chettinad.com');

****************************************************************************************************************************
doctors list in specific hospitals
to_date('2022-12-12','yyyy-mm-dd'));

CREATE TABLE DoctorsAndAvailability(
    Id int NOT NULL AUTO_INCREMENT,
    Name varchar(255) NOT NULL,
    Address varchar(255),
    Phone bigint,
    Email varchar(255),
    Date date,
    Availability char(1),
    Healthcareproviderid int,
    PRIMARY KEY (Id)  
);

INSERT INTO DoctorsAndAvailability(Name,Address,Phone,Email,Date,Availability,Healthcareproviderid) VALUES ('Amit','TTK Road',1234567890,'amit@apollo.com',now(),'Y',1);
INSERT INTO DoctorsAndAvailability(Name,Address,Phone,Email,Date,Availability,Healthcareproviderid) VALUES ('Bala','OMR Road',9009009009,'bala@apollo.com',now(),'Y',1);
INSERT INTO DoctorsAndAvailability(Name,Address,Phone,Email,Date,Availability,Healthcareproviderid) VALUES ('Ravi','ECR Road',0987654321,'ravi@apollo.com',now(),'Y',1);

INSERT INTO DoctorsAndAvailability(Name,Address,Phone,Email,Date,Availability,Healthcareproviderid) VALUES ('Raju','Navalur',1234567890,'raju@fortis.com',now(),'Y',2);
INSERT INTO DoctorsAndAvailability(Name,Address,Phone,Email,Date,Availability,Healthcareproviderid) VALUES ('Sushil','Adyar',9009009009,'sushil@fortis.com',now(),'Y',2);
INSERT INTO DoctorsAndAvailability(Name,Address,Phone,Email,Date,Availability,Healthcareproviderid) VALUES ('Ram','Velachery',0987654321,'ram@fortis.com',now(),'Y',2);

INSERT INTO DoctorsAndAvailability(Name,Address,Phone,Email,Date,Availability,Healthcareproviderid) VALUES ('Kavita','Broadway',1234567890,'kavita@chettinad.com',now(),'Y',3);
INSERT INTO DoctorsAndAvailability(Name,Address,Phone,Email,Date,Availability,Healthcareproviderid) VALUES ('Naveetha','Thiruvanmiyur',9009009009,'naveetha@chettinad.com',now(),'Y',3);
INSERT INTO DoctorsAndAvailability(Name,Address,Phone,Email,Date,Availability,Healthcareproviderid) VALUES ('Bhadra','Sholinganallur',0987654321,'bhadra@chettinad.com',now(),'Y',3);
*/