/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dependency.injection;

/**
 *
 * @author lemanfoetra
 */
public class DependencyInjection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
 
        Premium premium = new Premium();
        Pertamax pertamax = new Pertamax();
        
        Car car = new Car();
        Motorcycle motor = new Motorcycle();
        
        System.out.println(car.fillUp(premium));
        System.out.println();
        System.out.println(motor.fillUp(pertamax));
        
        
    }
    
}
