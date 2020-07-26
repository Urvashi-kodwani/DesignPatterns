/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototypedesignpattern;

import java.io.Serializable;
import org.apache.commons.lang3.*;
/**
 *
 * @author Lenovo
 */

class Emp implements Serializable{
    int companyId;
    String designation;

    public Emp(int companyId, String designation) {
        this.companyId = companyId;
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Emp{" + "Company Id=" + companyId + ", designation=" + designation + '}';
    }
    
}
public class PrototypeUsingSerializable {
    public static void main(String[] args) {
        Emp e1=new Emp(1,"CEO");
        Emp e2=SerializationUtils.clone(e1);
        e2.designation="Co-CEO";
        System.out.println(e1);
        System.out.println(e2);
        
    }
}
