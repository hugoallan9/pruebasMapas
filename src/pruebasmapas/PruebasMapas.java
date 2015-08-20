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
        Mapa mapa = new Mapa("/home/hugo/Documents/CSV", "/home/hugo/Documents");
        mapa.descarga();
        mapa.mapasIPC();
    }
    
}
