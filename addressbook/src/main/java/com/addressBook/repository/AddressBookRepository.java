package com.addressBook.repository;
import com.addressBook.model.AddressBookEntry;
import org.springframework.data.jpa.repository.JpaRepository;

//UC_02
//Uc_01 (Section -2)
public interface AddressBookRepository extends JpaRepository<AddressBookEntry, Long> {
}
