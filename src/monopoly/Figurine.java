/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package monopoly;

import java.awt.Label;
import javax.swing.JFrame;

/**
 *
 * @author Marek
 */
public class Figurine {
    
    private final Label fig;
    private final JFrame parent;
    private static final Locations locations = Locations.getInstance();
    
    Figurine(JFrame parent, Label fig) {
        this.parent = parent;
        this.fig = fig;
        fig.setLocation(Locations.START);
    }
       private void nextLoc() {
           fig.setLocation(locations.getNext());
       } 
    public void nextStep() {
        nextLoc();
        parent.add(fig);
    }
}
