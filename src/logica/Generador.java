/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import dto.Nota;

/**
 *
 * @author jdcob
 */
public class Generador {
public String ultimaOperacion;
    public double ultimoResultado;
    public double promediar (double num1,double num2,double num3,double num4){
       
       double rta = ((num1*0.25) + (num2*0.35)+ (num3 * 0.15)+ (num4 * 0.25));
       return rta; 
        }

}

