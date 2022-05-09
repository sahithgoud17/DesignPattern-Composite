package com.sahith.classes;

public class CompositeMain
{
    public static void main(String[] args)
    {
        Employee ceo = new Employee("John" , "Ceo" , 5000);

        Employee headOfSales = new Employee("Adam" , "Head of Sales" , 4000);

        Employee headOfMarketing = new Employee("Dan" , "Head of Marketing" , 3000);

        Employee salesAgent = new Employee("mary" , "Sales Agent" , 2500);

        Employee marketingAgent = new Employee("Richard" , "Marketing Agent" , 2500);

        ceo.addEmployee(headOfSales);
        ceo.addEmployee(headOfMarketing);

        headOfSales.addEmployee(salesAgent);

        headOfMarketing.addEmployee(marketingAgent);

        System.out.println(ceo);

        for (Employee HeadEmployee : ceo.getEmployee())
        {
            System.out.println(HeadEmployee);
            for (Employee employee : HeadEmployee.getEmployee())
            {
                System.out.println(employee);
            }
        }
    }
}
