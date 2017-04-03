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
public class Multimedia {
    private String titulo;
    private String autor;
    private String[] formatos = {"wav","mp3","midi", "avi","mov","mpg","cdAudio","dvd"};
    private String formato;
//    private Formato formato; 
    private double duracion;
//Esto es una enumeración y así solo me permite coger formatos de aquí.
//    public enum Formato{ 
//        wav,mp3,midi, avi,mov,mpg,cdAudio,dvd;
//    }
    public Multimedia(String titulo, String autor, String formato,double duracion){
        this.titulo = titulo;
        this.autor = autor;
//        this.formato = formato;
        if(compruebaFormato(formato)) this.formato = formato;
        else this.formato = "";
        this.duracion = duracion;
        
    }
    public boolean compruebaFormato(String formato){
        boolean comprobacion=false;
        for (int i = 0; i < formatos.length; i++) {
            if(formato.equals(this.formatos[i])) comprobacion = true; 
        }
        if(!comprobacion) System.out.println("Formato no reconocido");
        return comprobacion;
    }
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
    
//    public Formato getFormato(){
//        return formato;
//    }

    public String getFormato() {
        return formato;
    }

    public double getDuracion() {
        return duracion;
    }
    
    public boolean equals(Multimedia m){
        boolean comMulti = false;
        if(this.autor.equals(m.autor) && this.titulo.equals(m.titulo)) comMulti = true;
        return comMulti;
    }
    
    public String toString(){
        return "Título: " + this.titulo + ", autor: " + this.autor + ", duración: " 
                + this.duracion+", formato: "+this.formato;
    }
}
