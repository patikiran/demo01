package com.neo.creddemo.service;

import com.neo.creddemo.model.Customer;
import com.neo.creddemo.model.OTP;

import java.util.Date;

public class AccountService {
  public OTP registrationService(Customer customer){
      OTP otp = new OTP(); // Object reference only knows the location of object from RAM
      otp.customerId=143;
      otp.expiryTime=new Date(13/05/1999);
      otp.phoneNumber="8790018627";
      return otp;

  }
}
