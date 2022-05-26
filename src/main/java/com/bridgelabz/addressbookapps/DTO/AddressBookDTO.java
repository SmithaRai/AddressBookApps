package com.bridgelabz.addressbookapps.DTO;


import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public  class AddressBookDTO {
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s] {2,} $" , message = "Name Invalid")
    @NotEmpty(message = "Employee name cannot be null")
    private String name ;
    @NotEmpty(message = "number cannot be empty")
    private long phonenumber;

    public AddressBookDTO(String name , long phonenumber)
    {
        this.name = name;
        this.phonenumber = phonenumber;
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

    @Override
    public String toString() {
        return "AddressBookDTO{" +
                "fname='" + name + '\'' +
                ", phonenumber=" + phonenumber +
                '}';
    }
}
