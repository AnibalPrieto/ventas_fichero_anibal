/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author aniba
 */
public class Producto {
    private int idProducto;
    private String Nombre;
    private double Precio;
    static int contadorProductos;

    public int getIdProducto() {
        return idProducto;
    }


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public Producto() {
        contadorProductos++;
        this.idProducto = contadorProductos;

    }
    
    
    public Producto( String Nombre, double Precio) {
        this();
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.idProducto = contadorProductos;

    }

    @Override
    public String toString() {
        return   + idProducto + "|"+ Nombre + "|" + Precio + "|"+contadorProductos;
    }
    

  
    
    
    
    
}
