/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memoria;

import dto.Estudiante;
import java.util.ArrayList;
import utilidades.GArchivos;



/**
 *
 * @author jdcob
 */
public class Memoria {
    public static void main (String[] args){
    ArrayList listaEstudiantes = new ArrayList();
    Estudiante p = new Estudiante ();
    p.setNombre("Juan David");
    p.setCodigo("1034396586");
    
    listaEstudiantes.add(p);
    
    listaEstudiantes.add(new Estudiante());
    
    boolean b = GArchivos.guardar("Estudiantes.ani", listaEstudiantes);
    System.out.println(" Se guardo "+b);
    System.out.println("- - -- - -- - - ");
    
    ArrayList lalista = (ArrayList) GArchivos.leer("Estudiantes.ani");
    System.out.println(lalista.get(0));
    System.out.println(lalista.get(1));
}
}
