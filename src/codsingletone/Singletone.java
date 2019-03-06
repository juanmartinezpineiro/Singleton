/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codsingletone;

import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Martínez
 */
public class Singletone {
    private int numCajasM;
    private String nomConjunCaja;
    private int codTrabajador;
    private static Singletone Singletone;
    
    private Singletone(int numCajasM, String nomCaja, int codTrabajador) {
        this.numCajasM = numCajasM;
        this.nomConjunCaja = nomCaja;
        this.codTrabajador = codTrabajador;
    }
    
    static void instancia(){
    int a=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca número de cajas"));
    int c=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca número de trabajadores"));
    String b=JOptionPane.showInputDialog(null,"Introduzca nombre de conjunto de cajas");
    Singletone obx=new Singletone(a, b, c);
    JOptionPane.showMessageDialog(null,obx);
    }

    @Override
    public String toString() {
        return "numCajasM=" + numCajasM + ", nomConjunCaja=" + nomConjunCaja + ", codTrabajador=" + codTrabajador;
    }

    
    
    public int getNumCajasM() {
        return numCajasM;
    }

    public void setNumCajasM(int numCajasM) {
        this.numCajasM = numCajasM;
    }

    public String getNomConjunCaja() {
        return nomConjunCaja;
    }

    public void setNomConjunCaja(String nomConjunCaja) {
        this.nomConjunCaja = nomConjunCaja;
    }

    public int getCodTrabajador() {
        return codTrabajador;
    }

    public void setCodTrabajador(int codTrabajador) {
        this.codTrabajador = codTrabajador;
    }
    
    public static Singletone getSingletonInstance(int numCajasM,String nomCaja,int codTrabajador) {
        if (Singletone == null){
            Singletone = new Singletone(numCajasM,nomCaja,codTrabajador);
        return Singletone;
        }
        
        return Singletone;
    }
}
