/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.io.Serializable;



/**
 *
 * @author jdcob
 */
public class Nota implements Serializable {

    private  double larta;
    private  double lanum1;
    private  double lanum2;
    private  double lanum3;
    private  double lanum4;

 
     public Nota(double num1, double num2, double num3, double num4){
        this.lanum1 = num1;
        this.lanum2 = num2;
        this.lanum3 = num3;
        this.lanum4 = num3;
        this.larta = ((num1*0.25)+(num2*0.35)+(num3*0.15)+(num4*0.25));
                
   
}
     @Override
    public String toString() {
        return ""+larta;
    }
}

 
      


  
