/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;

/**
 *
 * @author Estudiante
 */
public class Productos {
    String nomb;
    double prec;
    int stock;
    int mini;
    String fecha;

    public Productos() {
    }

    public Productos(String nomb, double prec, int stock, int mini,String fecha) {
        this.nomb = nomb;
        this.prec = prec;
        this.stock = stock;
        this.mini = mini;
        this.fecha = fecha;
    }

    public String getNomb() {
        return nomb;
    }

    public void setNomb(String nomb) {
        this.nomb = nomb;
    }

    public double getPrec() {
        return prec;
    }

    public void setPrec(double prec) {
        this.prec = prec;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getMini() {
        return mini;
    }

    public void setMini(int mini) {
        this.mini = mini;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

//    @Override
//    public String toString() {
//        return nomb;  //To change body of generated methods, choose Tools | Templates.
//    }
    
    
}
