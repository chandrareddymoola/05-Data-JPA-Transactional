package com.chandra.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addrId;
    private String state;
    private String country;
    private String city;
    private Integer empId;

    public Address(){

    }

    public Address( String state, String country, String city, Integer empId) {
        this.addrId = addrId;
        this.state = state;
        this.country = country;
        this.city = city;
        this.empId = empId;
    }

    public Integer getAddrId() {
        return addrId;
    }

    public void setAddrId(Integer addrId) {
        this.addrId = addrId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addrId=" + addrId +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", empId=" + empId +
                '}';
    }
}
