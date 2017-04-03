/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entornosgit;

import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class Biblioteca {
    
    public static int cuentaPestrados(ArrayList publicaciones){
        int contador = 0;
        for(Object o: publicaciones){
            if(o instanceof Prestable){
                Prestable l = (Prestable) o;
                if(l.prestado()) contador++;
            }
        }
        return contador;
    }
    
    public static int publicacionesAnteriores(ArrayList<Publicaciones> publicaciones, int año){
        int contador = 0;
        for(Publicaciones p:publicaciones){
            if(p.getAño()<año){
                contador++;
            }
        }
        return contador;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libros libro = new Libros("1234", "Alicia, en el país de las maravillas.", 1987);
        Libros libro2 = new Libros("1235", "Pulgarcito", 1887);
        Revistas revista = new Revistas("1236", "Hola",1967,2);
        Revistas revista2 = new Revistas("1237", "Pronto",1997,6);
        
        ArrayList<Publicaciones> publicacion = new ArrayList<Publicaciones>();
        
        publicacion.add(libro);
        publicacion.add(libro2);
        publicacion.add(revista);
        publicacion.add(revista2);
        
        libro.prestar();
        
        System.out.println(publicacion);
        
        System.out.println("Número de publicaciones prestadas: " + cuentaPestrados(publicacion));
        
        int año = 1980;
        System.out.println("Número de publicaciones anterior a " +año+": " + publicacionesAnteriores(publicacion, año));
        
        ArrayList<Disco> discos = new ArrayList<Disco>();
        discos.ensureCapacity(3);
        DiscoPrestable d1 = new DiscoPrestable("Soy", "Lali Espósito","vinilo", 2016, "PopDance");
        DiscoPrestable d2 = new DiscoPrestable("A bailar", "Lali Espósito","vinilo", 2012, "PopDance");
        DiscoPrestable d3 = new DiscoPrestable("Cuestión de gustos", "Pignoise","CD", 2006, "Pop");
        
        discos.add(d1);
        discos.add(d2);
        discos.add(d3);
        
        d1.prestar();
        d2.prestar();
        
        System.out.println("Número de discos prestados: " + cuentaPestrados(discos));
        
        
        System.out.println("Hasta luego Marikarmen");   
        System.out.println("QUE TU HIJO ESTÁ EN EL AFTERAUER");
        System.out.println("AUREEEEEEELIO");
    }
    
}
