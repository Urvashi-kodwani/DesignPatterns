/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototypedesignpattern;

/**
 *
 * @author Urvashi
 */

 class Addresss{
    String streetAddress,city,country;

    public Addresss(String streetAddress, String city, String country) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.country = country;
    }
    public Addresss(Addresss other){
        this(other.streetAddress,other.city,other.country);
    }
    @Override
    public String toString() {
        return "Addresss{" + "streetAddress=" + streetAddress + ", city=" + city + ", country=" + country + '}';
    }
    
}

class Employee{
    public String name;
    public Addresss addresss; 
    
    public Employee(String name, Addresss addresss) {
        this.name = name;
        this.addresss = addresss;
    }
    
    public Employee(Employee emp){
        this(emp.name,new Addresss(emp.addresss));
    }
    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", addresss=" + addresss + '}';
    }
   
}
public class PrototypeUsingCopyConstructors {
    public static void main(String[] args) {
        Employee e1=new Employee("e1",new Addresss("121","Pune","India"));
        Employee e2=new Employee(e1);
        e2.name="e2";
        System.out.println(e1);
        System.out.println(e2);
    }
 
}
