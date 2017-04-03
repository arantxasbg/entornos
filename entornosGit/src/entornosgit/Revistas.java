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
public class Revistas extends Publicaciones {
    private int numero;
    
    public Revistas(String codigo, String titulo, int año,int num){
        super(codigo, titulo, año);
        this.numero = num;
    }
    
    public String toString(){
        return super.toString()+ "\nNúmero: " + this.numero +"\n";
    }
}
