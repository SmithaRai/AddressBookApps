package com.bridgelabz.addressbookapps.Model;


import com.bridgelabz.addressbookapps.DTO.AddressBookDTO;


public  class AddressBookData {
    private int Id ;
    private String name ;
    private long phonenumber;


    public AddressBookData(int Id, AddressBookDTO addressBookDTO)
    {
        this.Id = Id;

        this.name = addressBookDTO.getName() ;

        this.phonenumber=addressBookDTO.getPhonenumber();

    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(long phonenumber) {
        this.phonenumber = phonenumber;
    }
}
