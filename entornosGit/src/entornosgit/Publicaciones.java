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
public class Publicaciones {
    protected String codigo;
    protected String titulo;
    protected int año;

    public Publicaciones(String codigo, String titulo, int año) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.año = año;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAño() {
        return año;
    }

    @Override
    public String toString() {
        return "\nCodigo: " + codigo + "\nTitulo: " + titulo + "\nAño: " + año ;
    }
    
    
    
}
