package com.bridgelabz.addressbookapps.Service;


import com.bridgelabz.addressbookapps.DTO.AddressBookDTO;
import com.bridgelabz.addressbookapps.Model.AddressBookData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService implements IAddressBookService {

    private List<AddressBookData> addressBookDataList = new ArrayList<>();

    public List<AddressBookData> getAddressBookData(){
        return addressBookDataList;
    }

    public AddressBookData getAddressBookDatabyID(int Id){
        return addressBookDataList.get(Id-1);
    }

    public AddressBookData addAddressBookData(AddressBookDTO addressBookDTO){
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(addressBookDataList.size()+1,addressBookDTO);
        addressBookDataList.add(addressBookData);
        return addressBookData;
    }

    public AddressBookData updateAddressBookData(int Id, AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = this.getAddressBookDatabyID(Id);
        addressBookData.setName(addressBookDTO.getName());
        addressBookData.setPhonenumber(addressBookDTO.getPhonenumber());
        addressBookDataList.set(Id-1,addressBookData);
        return addressBookData;
    }


    public void deleteAddressBookData(int empId) {
        addressBookDataList.remove(empId-1);
    }
}
