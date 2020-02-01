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
public class Motorcycle {
    
    private Premium fuel = new Premium();
        
    public String fillUp(){
        String text = "Motor ini harus diisi bahan bakar :"+this.fuel.getName();
                text += " - Yang ber oktan : "+this.fuel.getOctane();
                text += " - Dengan harga perliter serbesar : "+this.fuel.getPrice();
        return text;
    }
}
