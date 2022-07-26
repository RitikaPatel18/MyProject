package com.jpa.LoginApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

package com.weather.jpa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_details")
public class LoginApi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String username;
	@Column(name = "fname")
	private String first_name;
	@Column(name = "lname")
	private String Last_name;
	@Column(name = "password")
	private String password;
	
	

	
	
}

