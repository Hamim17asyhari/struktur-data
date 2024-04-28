/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MenghitungSimilaritas;

/**
 *
 * @author wilda
 */
    public class katapalindrom {
    public static void main(String[] args) {
        String word = "ada"; // Kata yang ingin dicek apakah palindrom
        
        // Memanggil metode untuk mendeteksi palindrom
        if (isPalindrome(word)) {
            System.out.println(word + " adalah palindrom.");
        } else {
            System.out.println(word + " bukan palindrom.");
        }
    }
    
    // Metode untuk mendeteksi palindrom
    public static boolean isPalindrome(String word) {
        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}

