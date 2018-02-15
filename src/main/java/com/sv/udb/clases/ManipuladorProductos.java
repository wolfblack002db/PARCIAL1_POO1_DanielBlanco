 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Estudiante
 */
public class ManipuladorProductos {
    List<Productos> listaPro;

    public ManipuladorProductos() {
        this.listaPro = new ArrayList<>();
    }
    
    public void agregarProducto(String nomb,double precio, int stock, int mini,String fecha){
        Productos objPro = new Productos(nomb, precio, stock, mini,fecha);
        this.listaPro.add(objPro);
    }
    
    public void top3(){
        double precio=0;
        double top1=0;
        double top2=0;
        double top3=0;
        int cont=0;
        String nomb1="No Hay";
        String nomb2="No Hay";
        String nomb3="No Hay";
        try {
            for (Productos productos : listaPro) {
                
                precio= productos.getPrec();
                if (precio> top1) {
                    top1=precio;
                    nomb1=productos.getNomb();
                }
                if (precio > top2 && precio < top1) {
                    top2=precio;
                    nomb2=productos.getNomb();
                }
                if (precio > top3 && precio < top2) {
                    top3=precio;
                    nomb3=productos.getNomb();
                }
            }
            JOptionPane.showMessageDialog(null,"Top 1: " + nomb1 + " con precio de: $" + top1);
            JOptionPane.showMessageDialog(null,"Top 2: " + nomb2 + " con precio de: $" + top2);
            JOptionPane.showMessageDialog(null,"Top 3: " + nomb3 + " con precio de: $" + top3);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR INESPERADO" + e);
        }
    }
}
