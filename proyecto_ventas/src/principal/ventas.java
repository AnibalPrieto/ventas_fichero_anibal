/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import datos.Archivos;
import dominio.Orden;
import dominio.Producto;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author aniba
 */
public class ventas {
    public static void main(String[] args) {
        Scanner ent=new Scanner(System.in);
        ArrayList<Producto> catalogo = new ArrayList<>(); 
        ArrayList<Orden> ordenes = new ArrayList<>();
        System.out.println("Programa de ventas");
        System.out.println("====================================");
        /*System.out.println("Añada el nombre del producto: ");
        String nombre = ent.nextLine();
        ent.nextLine();
        System.out.println("Añada el precio del producto: ");
        Double Precio = ent.nextDouble();
        ent.nextLine();
        System.out.println("Añada el nombre de otro producto: ");
        String nombre2 = ent.nextLine();
        ent.nextLine();
        System.out.println("Añada el precio del producto: ");
        Double Precio2 = ent.nextDouble();
        ent.nextLine();*/
        Producto p1 = new Producto("patata",3.89);
        Producto p2 = new Producto("tomate",1.89);
        Producto p3 = new Producto("Lechuga",0.89);
        Producto p6 = new Producto("Pizza",2.89);
        Producto p7 = new Producto("Bacon",1.99);
        Producto p8 = new Producto("Mortadela",1);
        /*Producto p5 = new Producto(nombre2,Precio2);
        Producto p = new Producto(nombre,Precio);*/
        Archivos.crearArchivo("programa.txt");
        Archivos.agregarArchivo("programa.txt",p1.getIdProducto()+"|"+p1.getNombre()+"|"+p1.getPrecio()+"\n");
        Archivos.agregarArchivo("programa.txt",p2.getIdProducto()+"|"+p2.getNombre()+"|"+p2.getPrecio()+"\n");
        Archivos.agregarArchivo("programa.txt",p3.getIdProducto()+"|"+p3.getNombre()+"|"+p3.getPrecio()+"\n");
        //Archivos.agregarArchivo("programa.txt",p5.getIdProducto()+"|"+p5.getNombre()+"|"+p5.getPrecio()+"\n");
        Archivos.agregarArchivo("programa.txt",p6.getIdProducto()+"|"+p6.getNombre()+"|"+p6.getPrecio()+"\n");
        Archivos.agregarArchivo("programa.txt",p7.getIdProducto()+"|"+p7.getNombre()+"|"+p7.getPrecio()+"\n");
        Archivos.agregarArchivo("programa.txt",p8.getIdProducto()+"|"+p8.getNombre()+"|"+p8.getPrecio()+"\n");
        Orden o1 = new Orden();
        Orden o2 = new Orden();
        catalogo.add(p1);
        catalogo.add(p2);
        catalogo.add(p3);
        catalogo.add(p6);
        catalogo.add(p7);
        catalogo.add(p8);    
        for (int i = 0; i < catalogo.size(); i++) {
            
        }
        o1.AgregProduct(p3);
        o1.AgregProduct(p1);
        o1.AgregProduct(p2);
        /*o1.AgregProduct(p5);
        o1.AgregProduct(p);*/
        o2.AgregProduct(p6);
        o2.AgregProduct(p7);
        o2.AgregProduct(p8);
        o1.orden();
        o1.total();
        o2.orden();
        o2.total();
        ordenes.add(o1);
        ordenes.add(o2);
        System.out.println("");
        System.out.println("Gracias por usar la aplicación");
        System.out.println("");
        System.out.println("");
        String Orden="ordenes.txt";
        Archivos.crearArchivo(Orden);
        Archivos.agregarArchivo("ordenes.txt",p1.toString+"\n");
        Archivos.agregarArchivo("ordenes.txt",p2.toString()+"\n");
        /*Archivos.agregarArchivo("ordenes.txt",p5.toString()+"\n");
        Archivos.agregarArchivo("ordenes.txt",p.toString());*/
        
        
    
        
    }
    
}
