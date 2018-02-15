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
        String[] nomb = new String[3];
        try {
            for (Productos productos : listaPro) {
                
                precio= productos.getPrec();
                if (precio> top1) {
                    top1=precio;
                }
            }
            JOptionPane.showMessageDialog(null,"");
        } catch (Exception e) {
            
        }
    }
}
