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
public class Disco extends Multimedia{
    private String genero;
    
    public Disco(String titulo, String autor, String formato,double duracion, String genero){
        super(titulo,autor,formato,duracion);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }
    
    public String toString(){
        return super.toString()+", género: " + this.genero;
    }
}
