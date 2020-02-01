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
public class Premium {
    
    private String name     = "Premium";
    private int     price   = 9000;
    private int     octane  = 90;
    
    
    public String getName(){
        return this.name;
    }
    
    public int getPrice(){
        return this.price;
    }
    
    public int getOctane(){
        return this.octane;
    }
}
