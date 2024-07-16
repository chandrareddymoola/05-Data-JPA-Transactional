package com.chandra.repository;

import com.chandra.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddresRepo extends JpaRepository<Address,Integer> {

}
