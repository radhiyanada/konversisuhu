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
public class Main {
    public static void main(String[] args) {
        int C = 0;
        double R = 0, F = 0, K = 0;
        int pilih;
        boolean kondisi = false;
        
        Scanner input = new Scanner(System.in);
        konversi suhu = new konversi();
        System.out.println("+---------------------------+");
        System.out.println("| PROGRAM KONVERSI SUHU AIR |");
        System.out.println("+---------------------------+");
        System.out.println("Input Data");
        System.out.println("-----------------------------");
        System.out.print("Suhu dalam Celcius : ");
        C = input.nextInt();
        do{    
            System.out.println("Opsi");
            System.out.println("-----------------------------");
            System.out.println("1. Lihat Data Konversi \n2. Edit Data Konversi \n3. Exit");
            System.out.print("Pilihan = ");
            pilih = input.nextInt();
            if (pilih == 1){
                suhu.lihat(C, R, F, K);
                if (C <= 0){
                    System.out.println("Kondisi Air Dingin");
                } else if (C >= 100){
                    System.out.println("Kondisi Air Panas");
                } else {
                    System.out.println("Kondisi Air Normal");
                }
                System.out.println("\n");
            } else if (pilih == 2){
                System.out.println("\n");
                System.out.println("Input Data");
                System.out.println("-----------------------------");
                System.out.print("Suhu dalam Celcius : ");
                C = input.nextInt();
                System.out.println("\n");
            } else if (pilih == 3){
                break;
            } else {
                System.out.println("Pilihan Tidak Tersedia");
                System.out.println("\n");
            }
        } while (kondisi != true);
    }
}
