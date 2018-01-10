/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;

/**
 *
 * @author Mohammed Maaz S
 */
public class Loader {
    public static void main(String args[]){
        Properties myProp=new Properties();
        
        
        try
        {
            FileInputStream fis=new FileInputStream("C:\\Users\\Mohammed Maaz S\\Documents\\NetBeansProjects\\basic\\src\\basic\\ServerInfo.properties");
        myProp.load(fis);
        
    }
        catch(Exception e){
            e.getMessage();
        }
        System.out.println("Host name : "+myProp.getProperty("HostName"));
        System.out.println("Username : "+myProp.getProperty("Username"));
        System.out.println("Password : "+myProp.getProperty("Password"));
    }
}
