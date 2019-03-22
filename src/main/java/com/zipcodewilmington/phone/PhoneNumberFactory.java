package com.zipcodewilmington.phone;

import com.zipcodewilmington.exceptions.InvalidPhoneNumberFormatException;

import java.util.Random;
import java.util.logging.Logger;

/**
 * Created by leon on 5/1/17.
 */
public final class PhoneNumberFactory {

    private static final Logger logger = Logger.getGlobal();



    private PhoneNumberFactory() {

    }

    
    /**
     * @param phoneNumberCount - number of PhoneNumber objects to instantiate
     * @return array of randomly generated PhoneNumber objects
     */ //TODO - Implement logic

    public static PhoneNumber[] createRandomPhoneNumberArray(int phoneNumberCount) {

        return null;
    }

    /**
     * @return an instance of PhoneNumber with randomly generated phone number value
     */ //TODO - Implement logic
    public static PhoneNumber createRandomPhoneNumber() throws Exception {
        int num1, num2, num3;

        Random generator = new Random();
        num1 = generator.nextInt(999) + 1;
        num2 = generator.nextInt(1000);
        num3 = generator.nextInt(10000);

        String phoneNumber = String.format("(%03d)-%03d-%04d",num1,num2,num3);

        PhoneNumber phoneNumber1=  new PhoneNumber(phoneNumber);
        System.out.println(phoneNumber1);

        return (PhoneNumber) createPhoneNumberSafely(num1,num2, num3);

    }


    /**
     * @param areaCode          - 3 digit code
     * @param centralOfficeCode - 3 digit code
     * @param phoneLineCode     - 4 digit code
     * @return a new phone number object
     */ //TODO - if input is valid, return respective PhoneNumber object, else return null
    public static PhoneNumber createPhoneNumberSafely(int areaCode, int centralOfficeCode, int phoneLineCode) throws Exception {
        if(areaCode!=0||centralOfficeCode!=0||phoneLineCode!=0) {

            String pnum=String.format("(%03d)-%03d-%04d",areaCode,centralOfficeCode,phoneLineCode);
            return createPhoneNumber(pnum);
        }


        return null;
    }

    /**
     * @param phoneNumberString - some String corresponding to a phone number whose format is `(###)-###-####`
     * @return a new phone number object
     * @throws InvalidPhoneNumberFormatException - thrown if phoneNumberString does not match acceptable format
     */ // TODO - Add throws statement to method signature
    public static PhoneNumber createPhoneNumber(String phoneNumberString) throws InvalidPhoneNumberFormatException {
        PhoneNumber pn =new PhoneNumber(phoneNumberString);
        return pn;
    }



}
