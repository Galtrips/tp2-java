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
public class Polygone {
    
    private Point tab[] = null;
    
    public void addPoint(Point p1) {
        
       if(tab == null) {
           
           tab = new Point[2];
           tab[0] = new Point(p1.getX(), p1.getY());
           tab[1] = tab[0];
           
       }
       else {
       
           Point tab2[] = new Point[tab.length]; 
          
           for (int i = 0; i < tab.length; i++) {
               
               tab2[i] = new Point(tab[i].getX(), tab[i].getY());
           }
           
           tab = new Point[tab.length +1];
           
           for (int i = 0; i < tab2.length; i++) {
               
               tab[i] = new Point(tab2[i].getX(), tab2[i].getY());
           }
           
           tab[tab.length - 1] = tab[0];
           
           tab[tab.length - 2] = p1;
       }
    }
    
    public void print() {
        
        if (tab == null) {
            
            return;
        }
        
        for (int i = 0; i < tab.length; i++) {
            
            System.out.println(tab[i]);
        }
    }
}
