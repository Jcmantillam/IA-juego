/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import com.sun.imageio.plugins.jpeg.JPEG;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Johan
 */
public class mainFrame{
    
    private JFrame mainWindows;
    private JPanel broad; //Tablero de juego
    private final int w = 1280, h = 720;//tamaño de la pantalla
    
    
    public mainFrame(String title){
        init(title);
    }
    
    private void init(String title){
        
        mainWindows = new JFrame(title);
        Toolkit tool = Toolkit.getDefaultToolkit();
        Dimension dim = tool.getScreenSize();//guarda el tamaño de pantalla
        ImageIcon logo = new ImageIcon("src/UI/RTSlogo.png");//Carga el logo de la ventana
        
        //Se asigna cada una de las partes
        mainWindows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Cierra el programa
        mainWindows.setIconImage(logo.getImage());
        mainWindows.setResizable(false);
        mainWindows.setLocation((int) (dim.getWidth()/2) - (w/2), (int) (dim.getHeight()/2)-(h/2));//Centra la pantalla
        mainWindows.setSize(w, h);
                
        //Cración del panel (tablero del juego)
        initPanel();
        
        mainWindows.setVisible(true);
        
    }
    
    private void initPanel(){
        broad = new JPanel();
        broad.setBackground(new Color(0, 153, 0));
        broad.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.blue), BorderFactory.createEmptyBorder(10, 15, 5, 15)));
        broad.setVisible(true);
        
        
        //Extrae la imagen que queremos colocar y la guarda en el JLabel
        JLabel WA = new JLabel("");
        ImageIcon warriorB = new ImageIcon("src/UI/blueWarrior.png");
        WA.setIcon(warriorB);
        WA.setVisible(true);
        WA.setLocation(-1,-1);
        broad.add(WA);
        
        mainWindows.add(broad);
    }
    
//    public void draw(){//Dibuja elementos en el tablero
//        JPanel table = new JPanel();
//        
//        
//    }
    
}
