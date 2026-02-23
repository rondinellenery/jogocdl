package com.cdl.jogo;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

public class Janela extends JFrame {
    private JPanel tela;

    public Janela() {

        tela = new JPanel(){
            public void paintComponent(Graphics g){
                g.setColor(Color.BLUE);
                g.drawLine(0, 240, 640, 240);
                g.drawRect(10, 25, 20, 20);
                g.drawOval(30, 20, 40, 30);
            }

        };

        super.getContentPane().add(tela);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(640, 480);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Janela();
    }
}