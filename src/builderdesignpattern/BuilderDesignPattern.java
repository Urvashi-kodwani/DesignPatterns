/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderdesignpattern;

import builderdesignpattern.User.UserBuilder;

/**
 *
 * @author Urvashi
 */

class User{
    private String fistName;
    private String lastName;
    private int age;
    private String address;
    private String phone;
    
    private User(UserBuilder userbuilder){
        this.fistName=userbuilder.fistName;
        this.lastName=userbuilder.lastName;
        this.age=userbuilder.age;
        this.address=userbuilder.address;
        this.phone=userbuilder.phone;
    }

    public String getFirst_name() {
        return fistName;
    }

    public String getLast_name() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "User{" + "fistName=" + fistName + ", lastName=" + lastName + ", age=" + age + ", address=" + address + ", phone=" + phone + '}';
    }
    
    static class UserBuilder{
        private String fistName;
        private String lastName;
        private int age;
        private String address;
        private String phone;

        public UserBuilder(String fistName, String lastName) {
            this.fistName = fistName;
            this.lastName = lastName;
        }

        public UserBuilder setFirst_name(String fistName) {
            this.fistName = fistName;
            return this;
        }

        public UserBuilder setLast_name(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public UserBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        
        public User build(){
            User user=new User(this);
            return user;
        }
        
        private void validateUserObject(User user) {
            //Do some basic validations to check 
            //if user object does not break any assumption of system
        }
    }
}
public class BuilderDesignPattern {

    public static void main(String[] args) {
       User user1=new UserBuilder("Urvashi","Kodwani")
                  .setAge(22)
                  .setPhone("123456789")
                  .setAddress("India").build();
        System.out.println(user1);
        
        User user2=new UserBuilder("Alsion","Andrew")
                  .setAge(40)
                  .setPhone("442200400")
                  .setAddress("America").build();
        System.out.println(user2);
    }
    
}
