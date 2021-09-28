package com.day6.driver;

import com.day6.exception.CLLimitExceededException;
import com.day6.exception.InvalidCLException;
import com.day6.model.Employee;
import com.day6.model.HRDept;

public class Company {

    public static void main(String[] args) {
        Employee e1 = new Employee(0001, "RAM", "HR", 30000);
        HRDept hr = new HRDept();

        try
        {
        hr.requestCL(e1,3);
        hr.requestCL(e1,3);
        hr.requestCL(e1,3);
        hr.requestCL(e1,2);
        hr.requestCL(e1,2);
        } catch (InvalidCLException ex) {
            System.out.println(ex);
        } catch (CLLimitExceededException ex) {
            System.out.println(ex);
        }
    }
}
