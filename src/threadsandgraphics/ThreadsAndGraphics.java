/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package threadsandgraphics;

import visual.LandFrame;
import threads.RepaintLandThread;
import threads.SquareThread;
import domain.Point;
import domain.Square;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author root
 */
public class ThreadsAndGraphics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create the domain squares
        Square square1 = new Square("Thread-1", new Point(100, 100), 5,100);
        Square square2 = new Square("Thread-2", new Point(100, 300), 5,100);
        Square square3 = new Square("Thread-3", new Point(100, 500), 5,100);
        Square square4 = new Square("Thread-4", new Point(100, 700), 5,100);
        
        //create the array list for the frame to paint
        ArrayList<Square> squareList = new ArrayList<>();
        squareList.add(square1);
        squareList.add(square2);
        squareList.add(square3);
        squareList.add(square4);
        
        //create the new frame and send the square list
        LandFrame myLand = new LandFrame(squareList);
        myLand.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //thread for repainting
        RepaintLandThread repaintThread = new RepaintLandThread(myLand, 100);
        repaintThread.start();
        
        //thread for controlling the movement of the squares
        SquareThread squareThread1 = new SquareThread(square1, 150);
        SquareThread squareThread2 = new SquareThread(square2, 300);
        SquareThread squareThread3 = new SquareThread(square3, 500);
        SquareThread squareThread4 = new SquareThread(square4, 500);
        
        
        
        squareThread1.start();
        squareThread2.start();
        squareThread3.start(); 
        squareThread4.start();
    }//end main
}
