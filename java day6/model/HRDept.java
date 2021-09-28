package com.day6.model;

import com.day6.exception.CLLimitExceededException;
import com.day6.exception.InvalidCLException;

public class HRDept {
    public void requestCL(Employee employee,int noOfDays) throws InvalidCLException, CLLimitExceededException {
        if (noOfDays > 3)
        {
            throw new InvalidCLException(employee.getEmpName()+" CL requiest is canceled due to more than 3 no of days");
        }
        if (employee.getBalanceCL()<noOfDays)
        {
            throw new CLLimitExceededException(employee.getEmpName()+" CL requiest is canceled due to insufficient CL balance");
        }
        else
        {
            employee.setBalanceCL(employee.getBalanceCL()-noOfDays);
            System.out.println(employee.getEmpName()+" CL is approved \n"+"balance CL: "+employee.getBalanceCL());
        }
    }
}

