package com.bridgelabz.addressbookapps.Controller;


import com.bridgelabz.addressbookapps.DTO.AddressBookDTO;
import com.bridgelabz.addressbookapps.DTO.ResponseDTO;
import com.bridgelabz.addressbookapps.Model.AddressBookData;
import com.bridgelabz.addressbookapps.Service.IAddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping( "/addressbook")
public class AddressBookController {

    @Autowired
    IAddressBookService addressBookService;

    @GetMapping("/sortByState")
    public ResponseEntity<ResponseDTO> sortAddressBookByState(){
        List<AddressBookData> addressbookDataList = null;
        addressbookDataList = addressBookService.sortAddressBookByState();
        ResponseDTO responseDTO = new ResponseDTO("sort AddressBook By State Success",addressbookDataList);
        return new ResponseEntity<>(responseDTO,HttpStatus.OK);
    }

    @GetMapping("/sortByCity")
    public ResponseEntity<ResponseDTO> sortAddressBookByCity(){
        List<AddressBookData> addressbookDataList = null;
        addressbookDataList = addressBookService.sortAddressBookByCity();
        ResponseDTO responseDTO = new ResponseDTO("sort AddressBook By City Success",addressbookDataList);
        return new ResponseEntity<>(responseDTO,HttpStatus.OK);
    }

    @GetMapping("/get/")
    public ResponseEntity<ResponseDTO> getAddressBookData(){
       List<AddressBookData> addressBookDataList = null ;
        addressBookDataList = addressBookService.getAddressBookData();
        ResponseDTO respDTO = new ResponseDTO("Get Call Successful",addressBookDataList);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);

    }

    @GetMapping("getid/{id}")
    public ResponseEntity<ResponseDTO> getAddressBookDatabyID(@PathVariable int Id){
        AddressBookData addressBookData =null;
        addressBookData =  addressBookService.getAddressBookDatabyID(Id);
        ResponseDTO respDTO = new ResponseDTO("Get Call For ID Successful",addressBookData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

     @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addAddressBookData(@Valid @RequestBody AddressBookDTO addressBookDTO) {
         AddressBookData addressBookData = null;
         addressBookData = addressBookService.addAddressBookData(addressBookDTO);
         ResponseDTO respDTO = new ResponseDTO("Created Employee Payroll Data Successful",addressBookData);
         return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<ResponseDTO> updateAddressBookData(@PathVariable("id")int id ,@Valid @RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = null;
        addressBookData = addressBookService.updateAddressBookData(id ,addressBookDTO);
        ResponseDTO respDTO = new ResponseDTO("Updated Employee Payroll Data Successful",addressBookData);
        return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
    }


    @DeleteMapping("/delete/{Id}")
    public ResponseEntity<ResponseDTO> deleteAddressBookData(@PathVariable int Id) {
        addressBookService.deleteAddressBookData(Id);
        ResponseDTO respDTO = new ResponseDTO("Deleted Successfully ","Deleted id : " +Id);
        return new ResponseEntity<ResponseDTO>(respDTO ,HttpStatus.OK);

    }

}
