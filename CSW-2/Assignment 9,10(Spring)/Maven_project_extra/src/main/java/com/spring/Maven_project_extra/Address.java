package com.spring.Maven_project_extra;
public class Address {
    private int houseNo;
    private int pinCode;
    private String city;
    
    public int getHouseNo() {
        return houseNo;
    }
    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }
    public int getPinCode() {
        return pinCode;
    }
    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    @Override
    public String toString() {
        return "[houseNo: "+houseNo + ", pinCode: " + pinCode + ", city: " + city + "]";
    }
}

