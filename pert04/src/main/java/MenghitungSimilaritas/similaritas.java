/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MenghitungSimilaritas;

/**
 *
 * @author wilda
 */
public class similaritas {
    public static void main(String[] args) {
        String string1 = " ada kasur";
        String string2 = "rusak ada";

        double similarity = calculateJaccardSimilarity(string1, string2);
        System.out.println("Similarity: " + similarity);
    }
    
        public static double calculateJaccardSimilarity(String string1, String string2) {
        int sameCharCount = 0;

        for (char c : string1.toCharArray()) {
            if (string2.indexOf(c) != -1) {
                sameCharCount++;
            }
        }
        return (double) sameCharCount / Math.max(string1.length(), string2.length()) * 100;
    }
}
