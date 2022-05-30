package com.bridgelabz.addressbookapps.DTO;


import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public @Data class AddressBookDTO {
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$" , message = "FirstName Invalid")
    @NotEmpty(message = "First name cannot be null")
    private String fname ;
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$" , message = "LastName Invalid")
    @NotEmpty(message = "Last name cannot be null")
    private String lname;
    @Pattern(regexp = "^[9][1]{1}[0-9]{10}$", message = "Phonenumber Invalid")
    private String phonenumber;
    @Pattern(regexp = "^[a-zA-Z\\s0-9]+$" , message = "address Invalid")
    private String address;
    @Pattern(regexp = "^[0-9]{5}$" ,message = "zipcode Invalid")
    private String zipcode;
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]+$" , message = "state Invalid")
    private String state;
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]+$" , message = "city Invalid")
    private String city;
    @Pattern(regexp = "^[a-zA-Z0-9_-]+([.a-zA-Z0-9_-]+)*@[a-zA-Z0-9_-]+[.a-zA-Z0-9_-]+([.a-zA-Z0-9_-]+)*$", message = "Email Invalid")
    private String email;
    public AddressBookDTO(String fname ,String lname, String phonenumber ,String address ,String zipcode , String state , String city , String email)
    {
        this.fname = fname;
        this.lname = lname;
        this.phonenumber = phonenumber;
        this.address = address;
        this.zipcode = zipcode;
        this.state = state;
        this.city = city;
        this.email = email;
    }


}
