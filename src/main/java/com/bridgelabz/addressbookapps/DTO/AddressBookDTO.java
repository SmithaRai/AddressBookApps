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
    @Pattern(regexp = "^[9][1]{0,1}\\s[0-9]{10}", message = "Phonenumber Invalid")
    @NotEmpty(message = "phonenumber cannot be empty")
    private long phonenumber;
    private String address;
    @Pattern(regexp = "^[0-9]{5}(?:-[0-9]{4})?$" ,message = "zipcode Invalid")
    @NotEmpty(message = "zipcode field cannot be empty")
    private long zipcode;
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]+$" , message = " Invalid")
    private String state;
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]+$" , message = " Invalid")
    private String city;
    @Pattern(regexp = "^[a-zA-Z0-9_-]+([.a-zA-Z0-9_-]+)*@[a-zA-Z0-9_-]+[.a-zA-Z0-9_-]+([.a-zA-Z0-9_-]+)*$", message = "Email Invalid")
    private String email;
    public AddressBookDTO(String fname ,String lname, long phonenumber ,String address ,long zipcode , String state , String city , String email)
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





    @Override
    public String toString() {
        return "AddressBookDTO{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", phonenumber=" + phonenumber +
                ", address='" + address + '\'' +
                ", zipcode=" + zipcode +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
