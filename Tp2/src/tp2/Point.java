/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;

/**
 *
 * 
 */
public class Point {
    private double x;
    private double y;
    
    //Constructeurs
    public Point() {
        this.x = 0.0;
        this.y = 0.0;
    }
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    //Accesseurs
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
    
    // Mutateurs
    public void setX(double x) {
        this.x = x;
    }
    
    public void setY(double y) {
        this.y = y;
    }
    
    //Fonctions
    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            if (this.getX() == ((Point)obj).getX() & this.getY() == ((Point)obj).getY()) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
}
