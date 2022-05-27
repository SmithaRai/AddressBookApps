package com.bridgelabz.addressbookapps.Service;


import com.bridgelabz.addressbookapps.DTO.AddressBookDTO;
import com.bridgelabz.addressbookapps.Model.AddressBookData;

import java.util.List;

public interface IAddressBookService {

    public List<AddressBookData> getAddressBookData();

    public AddressBookData getAddressBookDatabyID(int Id);

    public AddressBookData addAddressBookData(AddressBookDTO addressBookDTO);

    public AddressBookData updateAddressBookData(int Id,AddressBookDTO addressBookDTO);

    public void deleteAddressBookData(int Id);
}
