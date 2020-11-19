/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

public class protonSaga extends proton {
    
    String fuel;
    
    protonSaga(){
        this.fuel = "Diesel"; //this refer to object detail
    }
    
    public void fuel(){
        System.out.println("This car use fuel " +fuel);

    }
    
    void run(){
       System.out.println("Proton Saga is running safely");
    }
      
}
    

