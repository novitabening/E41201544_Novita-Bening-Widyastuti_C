/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w03_latihan;

/**
 *
 * @author bening
 */
public class Latihan_02 {
    public static void main(String[] args) {
        // TODO code application logic here
        int[] angka = {5, 10, 17, 20, 1};
        String[] teks = {"saya", "sedang", "belajar", "OOP", "Java"};
        
        for(int i=0; i<angka.length; i++){
            System.out.println(angka[i]);
        }
        
        for(int j=0; j<teks.length; j++){
            System.out.print(teks [j]);
            System.out.print(" ");
        }
    }
}
