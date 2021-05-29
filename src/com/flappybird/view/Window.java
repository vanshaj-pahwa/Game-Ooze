/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flappybird.view;
/**
 *
 * @author vanshaj
 */
public class Window{
    public static int WIDTH = 800;
    public static int HEIGHT = 600;
    public Window() {
         PlayHub P = new PlayHub();
        P.setVisible(true);
    }
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            
            Window window = new Window();
            
        });
    }
}
