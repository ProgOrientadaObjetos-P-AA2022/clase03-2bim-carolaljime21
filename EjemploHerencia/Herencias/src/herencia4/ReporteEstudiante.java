/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import java.util.ArrayList;
import herencia2.Estudiante;
/**
 *
 * @author reroes
 */
public class ReporteEstudiante extends Reporte {
    double promedioMatriculas;
    ArrayList<Estudiante> lista;
    
    public ReporteEstudiante(String c){ super(c);
        
    }
    
    public void establecerListaDocentes(ArrayList<Estudiante> x){
        lista = x;
    }
    
    public void calcularPromedioSueldos(){
        for (int i = 0; i < lista.size(); i++) {
            promedioSueldos = promedioSueldos + lista.get(i).getSueldo();
        }
    }
    
    public ArrayList<Docente> obtenerListaDocentes(){
        return lista;
    }
    
    public double obtenerPromedioSueldos(){
        return promedioSueldos;
    }
    
    @Override
    
    public String toString(){
        
        String cadena = String.format("DATOS DOCENTE");
        for (int i = 0; i < obtenerListaDocentes().size(); i++) {
            cadena = String.format("%s\n%s\n",
                    cadena, lista.get(i));
        }
        cadena = String.format("%s\nPromedio total sueldos: %.2f\n", cadena,
                obtenerPromedioSueldos());
        return cadena;
    }
}
