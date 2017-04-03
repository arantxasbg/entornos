/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entornosgit;

/**
 *
 * @author alumno
 */
public class Libros extends Publicaciones implements Prestable{
    private boolean prestado;
    
    public Libros(String codigo, String titulo, int año){
        super(codigo, titulo, año);
        this.prestado = false;
    }
    
    public String toString(){
        String cadena=this.prestado?"\nPrestado":"\nNo prestado";
        cadena+=super.toString();
        return cadena+"\n";
    }

    public void prestar() {
        this.prestado = true;
    }

    public void devolver() {
        this.prestado = false;
    }

    public boolean prestado() {
        return this.prestado;
    }
    
}
