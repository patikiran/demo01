package com.neo.creddemo.service;

import com.neo.creddemo.model.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;


public class AccountServiceTest {


    @Test
    public void registrationTest(){
        Customer customer = new Customer();
        customer.customerId=145;
        customer.customerName="kiran";
        customer.mobileNumber="8790012871";
        customer.passWord="123";
        customer.userName="kiran";

        AccountService accountService = new AccountService();

        OTP otp=accountService.registrationService(customer);
        accountService.registrationService(customer);
        Account account= new Account();
        account.accountNumber="143278965";
        account.address=new Address();
        account.balance=10000;
        account.currentBalance=400000;
        account.ifcCode=new IFCCode();
        account.rateOfInterest=new RateOfInterest();
        Address address= new Address();

        address.city="jpt";
        address.pinCode="521181";
        address.state="NTR";
        address.street="jpt";


        IFCCode ifcCode = new IFCCode();
        ifcCode.address=address;

        ifcCode.code="5674231";
        RateOfInterest rateOfInterest= new RateOfInterest();
        rateOfInterest.accountType="savingAccount";
        rateOfInterest.rateOfInterest=true;
        rateOfInterest.endDate=new Date(14/07/2024);
        rateOfInterest.startDate=new Date(13/07/2024);

        Assertions.assertNotNull(customer);
        Assertions.assertEquals(143,otp.customerId);

    }

}