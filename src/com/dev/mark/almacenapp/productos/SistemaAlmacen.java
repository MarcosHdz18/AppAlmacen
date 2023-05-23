package com.dev.mark.almacenapp.productos;

import com.dev.mark.almacenapp.productos.Lacteo.Lacteo;
import com.dev.mark.almacenapp.productos.fruta.Fruta;
import com.dev.mark.almacenapp.productos.limpieza.Limpieza;
import com.dev.mark.almacenapp.productos.noperecible.NoPerecible;
import com.dev.mark.almacenapp.productos.producto.Producto;

public class SistemaAlmacen {
    public static void main(String[] args) {

        Producto[] productos = new Producto[7];

        Producto productoLacteo1 = new Lacteo("Leche Lala", 35.5d, "Animal", 4);
        Producto productoLacteo2 = new Lacteo("Yogurth Danone", 15.5d, "Natural", 5);

        Producto productoFruta1 = new Fruta("Pera", 27.60d, 1, "Verde");
        Producto productoFruta2 = new Fruta("Fresa", 30.5d, 3, "Rojo");

        Producto productoLimpieza1 = new Limpieza("Jabón", 50.5d, "Paquete", "Paquete");
        Producto productoLimpieza2 = new Limpieza("Trapeador", 30.0d, "Pieza", "Grande");

        Producto productoNoPerecible1 = new NoPerecible("Botella", 15.0, 5, "Cilindrica");
        Producto productoNoPerecible2 = new NoPerecible("Tapa", 30.5, 7, "Redonda");

        productos[0] = productoLacteo1;
        productos[1] = productoLacteo2;
        productos[2] = productoFruta1;
        productos[3] = productoFruta2;
        productos[4] = productoLimpieza1;
        productos[5] = productoLimpieza2;
        productos[6] = productoNoPerecible1;

        for (Producto producto: productos) {

            System.out.println(" =========================== " + producto.getClass().getSimpleName() + " =========================== ");
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Precio: " + producto.getPrecio());

            if(producto instanceof Lacteo) {
                System.out.println("Tipo Lacteo: " + ((Lacteo) producto).getTipoLacteo());
                System.out.println("Peso: " + ((Lacteo) producto).getPeso());

            }
            if(producto instanceof Fruta) {
                System.out.println("Color: " + ((Fruta) producto).getColor());
                System.out.println("Peso: " + ((Fruta) producto).getPeso());

            }
            if(producto instanceof Limpieza) {
                System.out.println("Tipo Envase: " + ((Limpieza) producto).getTipoEnvase());
                System.out.println("Medida: " + ((Limpieza) producto).getMedida());

            }
            if(producto instanceof NoPerecible) {
                System.out.println("Cantidad: " + ((NoPerecible) producto).getCantidad());
                System.out.println("Forma: " + ((NoPerecible) producto).getForma());
            }

        }



    }
}
