package com.dojo.account.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDetails {

	private String username;
	private String password;
	private String name;
	private String address;
	private String state;
	private String country;
	private String email;
	private String PAN;
	private long contactNumber;
	private LocalDate DOB;
	private String accountType;

}
