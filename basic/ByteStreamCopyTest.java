/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

import java.io.*;

/**
 *
 * @author Mohammed Maaz S
 */
public class ByteStreamCopyTest {
 public static void main(String args[]){
     byte[] b=new byte[128];
     int bLen=b.length;
     try(FileInputStream fis=new FileInputStream(args[0]);
             FileOutputStream fos=new FileOutputStream(args[1])){
         System.out.println("Bytes available : "+fis.available());
         int count=0, read=0;
         while((read=fis.read(b))!=-1){
             if(read<bLen){
                 fos.write(b, 0, read);
                 
             }
             else{
                 fos.write(b);
                 count+=read;
             }
             System.out.println("Wrote: "+count);
         }
     }
     catch(FileNotFoundException e){
         System.out.println("File not found "+e);
     }
     catch(IOException e){
         System.out.println("IOException "+e);
     }
  }   
}
