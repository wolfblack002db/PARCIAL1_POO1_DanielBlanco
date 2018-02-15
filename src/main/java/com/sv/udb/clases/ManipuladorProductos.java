 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
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
        JOptionPane.showMessageDialog(null,"Producto agregado");
    }
    
    public List<Productos> top3(){
        List<Productos> listtops = new ArrayList<>();
        
        try {
            listaPro.sort(Comparator.comparing(Productos::getPrec).reversed());
            for (int i = 0; i < listaPro.size(); i++) {
                if (i<3) {
                    listtops.add(listaPro.get(i));
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR INESPERADO" + e);
        }
        return listtops;
    }
    
    public List<Productos> caducacion(){
        List<Productos> listcadu = new ArrayList<>();
        try {   
            listcadu.add(listaPro.get(0));
            SimpleDateFormat caduca = new SimpleDateFormat("dd/MM/yyyy");
            for (Productos productos : listaPro) {
                 Date fecha1 = caduca.parse(listcadu.get(0).getFecha());
                 Date fecha2 = caduca.parse(productos.getFecha());
                 if (fecha2.before(fecha1)) {
                    listcadu.clear();
                    listcadu.add(productos);
                }
            }   
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR INESPERADO" + e);
        }
        return listcadu;
    }
    
    public List<Productos> minimo(){
        List<Productos> listmin = new ArrayList<>();
        try {
            for (Productos productos : listaPro) {
                if (productos.getStock() == productos.getMini()) {
                    listmin.add(productos);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR INESPERADO" + e);
        }
        return listmin;
    }
}
