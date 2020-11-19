/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

    public class protonPersona extends proton {
    
    String bigBoot;
    String fuel;
    
    protonPersona(){
        this.bigBoot = "Spaces"; //this refer to object detail
        this.fuel = "Diesel";
    }
    
    public void boot(){
        System.out.println("This car got big boot " + bigBoot);
    }
     
    public void fuels(){    
        System.out.println("This car use fueld " + fuel);

    }
    
    void run(){
       System.out.println("Proton Persona is running safely");
    }

    
    
    }

    

