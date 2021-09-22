package com.torryharris.driver;

import com.torryharris.model.Clerk;
import com.torryharris.model.Employee;
import com.torryharris.model.Lead;
import com.torryharris.model.Manager;

public class EmployeeDemo {
    public static void main(String[] args) {
        Manager mgr = new Manager("Alex",1001,"Project Manager",40000.0f,"Torry Harris",5);
        Lead lead = new Lead("Karna",1002,"Lead",30000.0f,4);
        Clerk clerk = new Clerk("Ram",1003,"HR",25000.0f,"B.com");

       /*e1.display();
        e2.display();
        e3.display();*/
        System.out.println(mgr);
        mgr.callMeeting();
        System.out.println(lead);
        lead.standUpCall();
        System.out.println(clerk);
        clerk.generatePayRoll();
    }
}
