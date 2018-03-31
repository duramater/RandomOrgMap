
import com.marsG.simplerandomorglib.RandomIntegerClient;
import java.awt.Color;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import javax.swing.*;
import static jdk.nashorn.internal.runtime.arrays.ArrayData.initialArray;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahmedabdelsalam
 */
public class RBGMap extends JFrame{
    final int COMPONENT = 3;
    final int WIDTH = 18;
    final int HEIGHT = 18;
    public RBGMap() throws IOException {
        super("Map");
        Random rand = new Random();
        JPanel mainPanel = new JPanel();
        
        
        RandomIntegerClient cl = new RandomIntegerClient("ama218@pitt.edu");
        
        JPanel[][] colorPanels = new JPanel[WIDTH][HEIGHT];
        for(int i = 0; i < HEIGHT; i++) {
            List <String> myRandomIntegers = cl.getRandomIntDecimal(0, 255, COMPONENT * WIDTH);
            for(int j = 0; j < WIDTH; j++) {
                colorPanels[i][j] = new JPanel();
                colorPanels[i][j].setSize(1, 1);
                colorPanels[i][j].setBackground(new Color(
                        Integer.parseInt(myRandomIntegers.get(j + 0)),
                        Integer.parseInt(myRandomIntegers.get(j + 1)),
                        Integer.parseInt(myRandomIntegers.get(j + 2))));
                mainPanel.add(colorPanels[i][j]);
            }
        }
        add(mainPanel);
        setVisible(true);
        setSize(145, 145);
        setLocation(100, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) throws IOException {
        new RBGMap();
    }
}
