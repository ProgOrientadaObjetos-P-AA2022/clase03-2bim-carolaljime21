/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

/**
 *
 * @author reroes
 */
public class Reporte {

    protected String codigo;

    public Reporte(String x) {
        codigo = x;
    }

    public void setCodigo(String x) {
        codigo = x;
    }

    public String getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {

        return codigo;
    }

}
