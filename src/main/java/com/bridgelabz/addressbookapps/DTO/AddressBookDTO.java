package com.bridgelabz.addressbookapps.DTO;

import lombok.Data;

public @Data class AddressBookDTO {
    private String name ;
    private long phonenumber;

    public AddressBookDTO(String name , long phonenumber)
    {
        this.name = name;
        this.phonenumber = phonenumber;
    }



    @Override
    public String toString() {
        return "AddressBookDTO{" +
                "fname='" + name + '\'' +
                ", phonenumber=" + phonenumber +
                '}';
    }
}
