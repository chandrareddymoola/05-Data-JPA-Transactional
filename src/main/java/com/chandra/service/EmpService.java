package com.chandra.service;

import com.chandra.entities.Address;
import com.chandra.entities.Emp;
import com.chandra.repository.AddresRepo;
import com.chandra.repository.EmpRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {
    @Autowired
    private EmpRepo empRepo;
    @Autowired
    private AddresRepo addresRepo;
    @Transactional(rollbackOn = Exception.class)
    public void saveData(){
        Emp emp=new Emp("Mohan",15120.00);
        empRepo.save(emp);
       // int i=10/0;
        Address address=new Address("MG","INDIA2","HYD2",emp.getEmpId());
        addresRepo.save(address);
    }
}

