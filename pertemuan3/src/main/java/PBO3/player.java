/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO3;

/**
 *
 * @author wilda
 */
public class player {
    String name;
    int speed;
    int healthPoin;
    
    void run()
    {
        System.out.println(name + " sedang berlari.....");
        System.out.println("Speed : " + speed);
    }
    boolean isDead()
    {
        return healthPoin <= 0;
    }
    
}
