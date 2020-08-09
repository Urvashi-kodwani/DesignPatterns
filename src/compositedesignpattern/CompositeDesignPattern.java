/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositedesignpattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
interface Employee{
    public void showEmployeeDetails();
}

class Developer implements Employee{
    private int id;
    private String name;
    private String poistion;

    public Developer(int id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }
   private String position;
    @Override
    public void showEmployeeDetails() {
        System.out.println(id+" "+name);  
    }
    
}

class Manager implements Employee{
    private int id;
    private String name;
    private String poistion;

    public Manager(int id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }
   private String position;
    @Override
    public void showEmployeeDetails() {
        System.out.println(id+" "+name);  
    }
}

class CompanyDirectory implements Employee{

    private List<Employee> employeeList = new ArrayList<Employee>(); 
       
    @Override
    public void showEmployeeDetails()  
    { 
        for(Employee emp:employeeList) 
        { 
            emp.showEmployeeDetails(); 
        } 
    } 
       
    public void addEmployee(Employee emp) 
    { 
        employeeList.add(emp); 
    }
    
       
    public void removeEmployee(Employee emp) 
    { 
        employeeList.remove(emp); 
    }
}
public class CompositeDesignPattern {
    public static void main(String[] args) {
        Developer dev1 = new Developer(100, "Ayipa Swami", "Backend Developer"); 
        Developer dev2 = new Developer(101, "Robin Sharma", "Frontend Developer"); 
        CompanyDirectory engDirectory = new CompanyDirectory(); 
        engDirectory.addEmployee(dev1); 
        engDirectory.addEmployee(dev2); 
          
        Manager man1 = new Manager(200, "Meenal Jain", "SEO Manager"); 
        Manager man2 = new Manager(201, "Sonali Takle ", "Kushagra's Manager"); 
          
        CompanyDirectory accDirectory = new CompanyDirectory(); 
        accDirectory.addEmployee(man1); 
        accDirectory.addEmployee(man2); 
      
        CompanyDirectory directory = new CompanyDirectory(); 
        directory.addEmployee(engDirectory); 
        directory.addEmployee(accDirectory); 
        directory.showEmployeeDetails(); 
    }
}
