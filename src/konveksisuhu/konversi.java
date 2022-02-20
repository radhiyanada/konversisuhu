/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konveksisuhu;
import java.util.Scanner;
/**
 *
 * @author Nada
 */
public class konversi {
    public void lihat(int C, double R, double F, double K){
        R = (double) ((4*C)/5);
        F = (double) ((9*C)/5 + 32);
        K = (double) (C + 273.15);
        System.out.println("Suhu Dalam Celcius \t= " + C + "°C");
        System.out.println("Dalam Farenheit \t\t= " + F + "°F");
        System.out.println("Dalam Reamur \t\t= " + R + "°R");
        System.out.println("Dalam Kelvin \t\t= " + K + "°K");
    }
}
