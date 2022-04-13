/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import dto.Estudiante;
import dto.Nota;

/**
 *
 * @author jdcob
 */
public class Generador  {
public String ultimaOperacion;
    public double ultimoResultado;
   
    
    public Nota generarNota (double num1,double num2,double num3,double num4){
       if ( num1==1 ){
           return null;
       }else{
       Nota c = new Nota(num1,num2,num3,num4);
     return c;
        }
}
    private Estudiante crearEstudiante(String nombre, String codigo){
        Estudiante p = new Estudiante();
        p.modificaCodigo(codigo);
        p.modificaNombre(nombre);
        return p;
    }
    
}