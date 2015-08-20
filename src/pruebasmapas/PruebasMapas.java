/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasmapas;
import reportestrimestrales.Mapa;
import java.io.File;

/**
 *
 * @author hugo
 */
public class PruebasMapas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mapa mapa = new Mapa("/home/hugo/Descargas/csv/preprimaria", "/home/hugo/Descargas/csv/preprimaria");
        //Mapa.descargaDepartamental();
        mapa.preprimaria();
        
        mapa = new Mapa("/home/hugo/Descargas/csv/basicos", "/home/hugo/Descargas/csv/basicos");
        //Mapa.descargaDepartamental();
        mapa.basicos();
        
        mapa = new Mapa("/home/hugo/Descargas/csv/diversificado", "/home/hugo/Descargas/csv/diversificado");
        //Mapa.descargaDepartamental();
        mapa.diversificado();
        
        mapa = new Mapa("/home/hugo/Descargas/csv/primaria", "/home/hugo/Descargas/csv/primaria");
        //Mapa.descargaDepartamental();
        mapa.primaria();

    }
    
}
