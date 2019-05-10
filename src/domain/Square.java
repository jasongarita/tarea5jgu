/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

/**
 *
 * @author Fabian
 */
public class Square {
    public String identification;
    private Point pointPosition;
    private int length;
    private int width;

    public Square(String identification, int x, int y, int length, int width) {
        this.identification = identification;
        pointPosition = new Point(x, y);
        this.length = length;
        this.width = width;
    }

    public Square(String identification, Point pointPosition, int length, int width) {
        this.identification = identification;
        this.pointPosition = pointPosition;
        this.length = length;
        this.width = width;    
    }


    /**
     * @return the pointPosition
     */
    public Point getPointPosition() {
        return pointPosition;
    }

    /**
     * @param pointPosition the pointPosition to set
     */
    public void setPointPosition(Point pointPosition) {
        this.pointPosition = pointPosition;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * @return the side
     */

}
