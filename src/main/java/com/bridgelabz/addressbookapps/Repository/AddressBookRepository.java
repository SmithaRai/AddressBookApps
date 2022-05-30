package com.bridgelabz.addressbookapps.Repository;

import com.bridgelabz.addressbookapps.DTO.AddressBookDTO;
import com.bridgelabz.addressbookapps.Model.AddressBookData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressBookRepository extends JpaRepository<AddressBookData , Integer> {


    @Query(value = "select * from contacts order by city",nativeQuery = true)
    List<AddressBookData> sortBycity();

    @Query(value = "select * from contacts order by state",nativeQuery = true)
    List<AddressBookData> sortByState();

}
