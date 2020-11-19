/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

public class protonX70 extends protonX50 {
    
    String autoDriverOn, autoDriverOff;
    
    
    protonX70(){
        this.autoDriverOn = "On";//this refer to object detail
        this.autoDriverOff = "Off";
    }
    
    public void drive(){
        System.out.println("This car got big boot " +autoDriverOn);
        System.out.println("This car got big boot " +autoDriverOff);


    }
    
    void run(){
       System.out.println("Proton X70 is running safely");
 }
}
