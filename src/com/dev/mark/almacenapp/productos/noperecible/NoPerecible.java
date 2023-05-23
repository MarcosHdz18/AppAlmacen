package com.dev.mark.almacenapp.productos.noperecible;

import com.dev.mark.almacenapp.productos.producto.Producto;

public class NoPerecible extends Producto {

    private int cantidad;

    private String forma;

    public NoPerecible(String nombre, double precio, int cantidad, String forma) {
        super(nombre, precio);
        this.cantidad = cantidad;
        this.forma = forma;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getForma() {
        return forma;
    }
}
