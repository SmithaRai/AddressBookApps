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
@Override
    public AddressBookData getAddressBookDatabyID(int Id){

        return addressBookDataList.get(Id-1);
    }

    public AddressBookData addAddressBookData( AddressBookDTO addressBookDTO){
        AddressBookData addressBookData = null;
       addressBookData = new AddressBookData(addressBookDataList.size()+1 ,addressBookDTO);
        addressBookDataList.add(addressBookData);
        return addressBookData;

    }

    public AddressBookData updateAddressBookData(int Id, AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = this.getAddressBookDatabyID(Id);
        addressBookData.setFname(addressBookDTO.getFname());
        addressBookData.setLname(addressBookDTO.getLname());
        addressBookData.setPhonenumber(addressBookDTO.getPhonenumber());
        addressBookData.setAddress(addressBookDTO.getAddress());
        addressBookData.setZipcode(addressBookDTO.getZipcode());
        addressBookData.setState(addressBookDTO.getState());
        addressBookData.setCity(addressBookDTO.getCity());
        addressBookData.setEmail(addressBookDTO.getEmail());
        addressBookDataList.set(Id-1,addressBookData);
        return addressBookData;

    }

@Override
    public void deleteAddressBookData(int Id) {
        addressBookDataList.remove(Id-1);
    }
}
