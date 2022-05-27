package com.bridgelabz.addressbookapps.Model;


import com.bridgelabz.addressbookapps.DTO.AddressBookDTO;
import lombok.Data;



public @Data class AddressBookData {
    @javax.persistence.Id
    private int Id ;
    private String fname ;
    private String lname;

    private long phonenumber;
    private String address;
    private long zipcode;
    private String state;
    private String city;
    private String email;
    private Long id;


    public AddressBookData(int Id, AddressBookDTO addressBookDTO)
    {
        this.Id = Id;

        this.fname = addressBookDTO.getFname() ;
        this.lname = addressBookDTO.getLname();
        this.phonenumber = addressBookDTO.getPhonenumber();
        this.address =  addressBookDTO.getAddress();
        this.zipcode = addressBookDTO.getZipcode();
        this.state = addressBookDTO.getState();
        this.city = addressBookDTO.getCity();
        this.email = addressBookDTO.getEmail();


    }





}
