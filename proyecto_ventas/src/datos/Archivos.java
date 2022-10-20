/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aniba
 */
public class Archivos {
    public static void crearArchivo(String name){
        File archivo=new File(name);
        try{
            PrintWriter salida=new PrintWriter(archivo);
            salida.close();
        }catch(FileNotFoundException ex){
            ex.printStackTrace(System.out);
        }
    }
    
    public static void escribirArchivo(String nombre, String contenido){
        PrintWriter salida = null;
        File archivo = new File(nombre);
        try {//se que el fichero existe
            salida = new PrintWriter(archivo);
            salida.print(contenido);
            System.out.println("se ha cargado el archivo !!!");
        } catch (FileNotFoundException ex) {//el fichero no existe =>Excep.
            ex.printStackTrace(System.out);
        } finally {//siempre se ejecuta
            salida.close();
        }
    }
    
    //este metodo agrega texto en el archivo, no sobreescribe
    public static void agregarArchivo(String nombre,String contenido){
        PrintWriter salida = null;
        File archivo = new File(nombre);
        try {
            salida = new PrintWriter(new FileWriter(nombre,true));
            salida.print(contenido);
            System.out.println("Se ha agregado con exito");
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        } finally {
            salida.close();
        }
    }
    
    public static void leerArchivo(String nombre){
        
        //1.Declaramos el file
        File archivo = new File(nombre);
        try {
            //2. creamos el descriptor de lectura del fichero
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura = entrada.readLine();
            //3. AHORA RECORREMOS LECTURA HASTA FIN DE FICHERO
            while(lectura!=null){
                System.out.println("Lectura= " +lectura);
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch(IOException ex){
            ex.printStackTrace(System.out);
        }
    }
    public static void leerArchivoPorPalabra(String nombre){
        File archivo=new File(nombre);

        try {
            Scanner entrada = new Scanner(archivo);
            int cont =0;
            //recorro el fichero hasta fin
            while(entrada.hasNext()){
                String palabra = entrada.next();
                System.out.println(palabra);
                cont = cont + 1 ;
            }
            System.out.println("Numero de palabras de mi fichero = " +cont);
                    
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
