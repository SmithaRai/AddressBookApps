package com.bridgelabz.addressbookapps.Model;


import com.bridgelabz.addressbookapps.DTO.AddressBookDTO;
import lombok.Data;

public @Data class AddressBookData {
    private int Id ;
    private String name ;
    private long phonenumber;


    public AddressBookData(int Id, AddressBookDTO addressBookDTO)
    {
        this.Id = Id;

        this.name = addressBookDTO.getName() ;

        this.phonenumber=addressBookDTO.getPhonenumber();

    }


}
