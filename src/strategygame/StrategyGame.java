/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategygame;

import UI.mainFrame;
import java.awt.Frame;
import javax.swing.JPanel;

/**
 *
 * @author Johan
 */
public class StrategyGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mainFrame mframe = new mainFrame();
        mframe.setDefaultCloseOperation(mframe.EXIT_ON_CLOSE);
        mframe.setLocationRelativeTo(mframe);
        mframe.setVisible(true);
    }
    
}
