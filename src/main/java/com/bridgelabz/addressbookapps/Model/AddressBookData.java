package com.bridgelabz.addressbookapps.Model;


import com.bridgelabz.addressbookapps.DTO.AddressBookDTO;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Table(name = "contacts")
public @Data @NoArgsConstructor class AddressBookData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "contact_id")
    private int Id ;
    private String fname ;
    private String lname;

    private String phonenumber;
    private String address;
    private String zipcode;
    private String state;
    private String city;
    private String email;


    public AddressBookData( AddressBookDTO addressBookDTO)
    {
       this.updateAddressBookData(addressBookDTO);

    }

    public void updateAddressBookData(AddressBookDTO addressBookDTO) {
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
