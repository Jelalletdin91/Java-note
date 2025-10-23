package com.stashchuk.main;

import com.stashchuk.classes.Address;
import com.stashchuk.classes.Company;
import com.stashchuk.classes.Department;
import com.stashchuk.classes.Employee;
import java.time.LocalDate;

public class Composition_Main {
    public static void main(String[] args) {

        Company acmeInc = new Company("Acme Inc.", "www.acme-inc.com", 5);

        // set company address
        // 1. Create an instance of "Address" class
        Address companyAddress = new Address();
        companyAddress.setStreet("337 Russell St");
        companyAddress.setCity("Omaha");
        companyAddress.setState("Nebraska");
        companyAddress.setCountry("USA");
        companyAddress.setZipCode(68007);

        // 2. Set the address in the "acmeInc" instance using
        //    the setter method
        acmeInc.setAddress(companyAddress);

        // set company's established-in data
        // 1. Create an instance of pre-defined "LocalDate" class
        LocalDate establishedIn = LocalDate.of(1980, 12, 20);

        // 2. Set the date in the "acmeInc" instance using the
        //    setter method
        acmeInc.setEstablishedIn(establishedIn);

        // add security department
        // 1. Create a "Department" class instance
        Department securityDept = new Department(
            "Security",
            "Responsible for the security of the Acme Inc.",
            20
        );

        // 2. Add employees in the department
        Employee mike = new Employee(1, "Mike", 35);

        // 2a. Create "Address" instance for Mike
        Address mikeAddress = new Address();
        mikeAddress.setStreet("1426 Quilly Lane");
        mikeAddress.setCity("Columbus");
        mikeAddress.setState("Ohio");
        mikeAddress.setCountry("USA");
        mikeAddress.setZipCode(43215);

        // 2b. set address for mike
        mike.setAddress(mikeAddress);

        // 3. add employee in the security department
        securityDept.addEmployee(mike);

        // 4. set security department in the "acmeInc" instance
        acmeInc.addDepartment(securityDept);

        // print the "acmeInc" object
        System.out.println(acmeInc);
    }
}
