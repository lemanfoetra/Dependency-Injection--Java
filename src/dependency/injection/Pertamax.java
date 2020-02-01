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
public class Pertamax implements Fuel {
    
    private String  name     = "Pertamax";
    private int     octane  = 99;
    private int     price   = 10000;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public int getOctane() {
        return this.octane;
    }
    
}
