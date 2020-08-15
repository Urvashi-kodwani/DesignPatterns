/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxydesignpattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Urvashi
 */

//Code to allow access only to specific sites

interface Internet{
    public void connectTo(String serverhost) throws Exception;
}

class RealInternet implements Internet{

    @Override
    public void connectTo(String serverhost) throws Exception {
        System.out.println("Connecting to "+serverhost);
    }
    
}

class ProxyInternet implements Internet{
    private Internet internet=new RealInternet();
    private static List<String> bannedSites;
    
    static{
        bannedSites = new ArrayList<>();
        bannedSites.add("abc.com");
        bannedSites.add("xyz.com");
        bannedSites.add("pqr.com");
    }

    @Override
    public void connectTo(String serverhost) throws Exception {
        if(bannedSites.contains(serverhost.toLowerCase())){
            throw new Exception("Error Connecting site "+serverhost+" : Access Denied");
        }
        internet.connectTo(serverhost);
    }
}
public class ProxyDesignPattern {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet(); 
        try
        { 
            internet.connectTo("geeksforgeeks.org"); 
            internet.connectTo("abc.com"); 
        } 
        catch (Exception e) 
        { 
            System.out.println(e.getMessage()); 
        } 
    }
}
