package com.bridgelabz.addressbookapps.Service;


import com.bridgelabz.addressbookapps.DTO.AddressBookDTO;
import com.bridgelabz.addressbookapps.Exceptions.AddressBookException;
import com.bridgelabz.addressbookapps.Model.AddressBookData;
import com.bridgelabz.addressbookapps.Repository.AddressBookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@Slf4j
public class AddressBookService implements IAddressBookService {

    @Autowired
    AddressBookRepository addressBookRepository;

    public List<AddressBookData> sortAddressBookByState() {
        return addressBookRepository.sortByState();
    }

    public List<AddressBookData> sortAddressBookByCity() {
        return addressBookRepository.sortBycity();
    }
    public List<AddressBookData> getAddressBookData(){

         return addressBookRepository.findAll();
    }

    public AddressBookData getAddressBookDatabyID(int Id){

        return addressBookRepository
                .findById(Id)
                .orElseThrow(()-> new AddressBookException("Contacts with contactid "+Id+"does not exists....!!"));
    }

    public AddressBookData addAddressBookData( AddressBookDTO addressBookDTO){
        AddressBookData addressBookData = null;
       addressBookData = new AddressBookData(addressBookDTO);
        return addressBookRepository.save(addressBookData);

    }

    public AddressBookData updateAddressBookData(int Id, AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = this.getAddressBookDatabyID(Id);
        addressBookData.updateAddressBookData(addressBookDTO);
        return addressBookRepository.save(addressBookData);
    }

    @Override
    public void deleteAddressBookData(int Id) {
        AddressBookData addressBookData = this.getAddressBookDatabyID(Id);
        addressBookRepository.delete(addressBookData);
    }
}

