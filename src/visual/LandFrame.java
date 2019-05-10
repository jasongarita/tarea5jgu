/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package visual;

import domain.Square;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author Fabian
 */
public class LandFrame extends JFrame{
    
    //variables
    public ArrayList<Square> mySquares;

    //constructor
    public LandFrame(ArrayList<Square> mySquares) {
        super("Shape");
        
        this.mySquares = mySquares;
        this.setSize(900, 900);
        this.setVisible(true);
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        
        //iterate over all squares
        for (Square mySquare : mySquares) {
            g.fillRect(mySquare.getPointPosition().getX(), mySquare.getPointPosition().getY(), 
                    mySquare.getLength(), mySquare.getWidth());
        } //end for
        g.drawRect(100, 100, 720, 100);
        g.drawRect(100, 300, 720, 100);
        g.drawRect(100, 500, 720, 100);
        g.drawRect(100, 700, 720, 100);
    }

    public void paintAgain(){
        repaint();
    }

}
