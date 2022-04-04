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
public class Tp2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Point p1 = new Point();
        Point p2 = new Point(1.0, 1.0);
        Point p3 = new Point(2.0,2.0);
        Point p4 = new Point(3.0,3.0);
        
        System.out.println(p2);
        System.out.println(p3);
        
        System.out.println(p3.equals(p2));
        
        Polygone poly1 = new Polygone();
        
        poly1.print();
        
        poly1.addPoint(p1);
        poly1.addPoint(p2);
        poly1.addPoint(p3);
        poly1.addPoint(p4);
        
        //poly1.print();
        
        p4.setX(25);
        
        poly1.print();
    }
}
