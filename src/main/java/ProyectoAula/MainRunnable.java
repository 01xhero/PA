/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoAula;

/**
 *
 * @author HP
 */
import java.awt.EventQueue;

public class MainRunnable {

    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {

            public void run() {

                try {

                    new MenuPrincipal().setVisible(true);

                } catch (Exception e) {

                    e.printStackTrace();

                }

            }

        });

    }

}
