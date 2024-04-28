/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array1D;

/**
 *
 * @author wilda
 */
public class ldimensi {
    public static void main(String[] args) {
        int[] angka = {8, 2, 9, 4, 5, 6, 3};

        int tinggi = angka[0];
        int rendah = angka[0];
        int sum = 0;

        for (int i = 0; i < angka.length; i++) {
            if (angka[i] > tinggi) {
                tinggi = angka[i];
            }
            if (angka[i] < rendah) {
                rendah = angka[i];
            }
            sum += angka[i];
        }

        double average = (double) sum / angka.length;

        System.out.println("Nilai tertinggi: " + tinggi);
        System.out.println("Nilai terendah: " + rendah);
        System.out.println("Rata-rata: " + average);
    }
}

