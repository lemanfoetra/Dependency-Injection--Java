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
    
    
    public String fillUp(Fuel fuel){
        String text = "Motor ini harus diisi bahan bakar :"+fuel.getName();
                text += " - Yang ber oktan : "+fuel.getOctane();
                text += " - Dengan harga perliter serbesar : "+fuel.getPrice();
        return text;
    }
}
