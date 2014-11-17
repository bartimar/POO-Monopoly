/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author Marek
 */
public class Locations extends ArrayList<Point> {

    private static Locations instance;
    private Locations() {
        step = 0;
        add(START);        
        for (int i = 10; i >= 1; i--) add(new Point(i * 82, FOURTH_LINE_Y));
        for (int i = 10; i >= 2; i--) add(new Point(THIRD_LINE_X, i * 82));
        for (int i = 10; i >= 1; i--) add(new Point(START.x - 52 - i * 82, SECOND_LINE_Y));
        for (int i = 10; i >= 1; i--) add(new Point(FIRST_LINE_X, START.y - i * 82));
    }
    public static Locations getInstance() {
        if (instance == null) instance = new Locations();
        return instance;
    }

    public Point getNext() {
        if(step==STEPS_COUNT) step=0;
        return get(step++);
    }
    private int step;
    static final int STEPS_COUNT = 40;
    
    static final Point START = new Point(950, 900);
    private static final int FIRST_LINE_X = START.x;
    private static final int BOTTOM = 32;
    private static final int SECOND_LINE_Y = BOTTOM;
    private static final int THIRD_LINE_X = BOTTOM;
    private static final int FOURTH_LINE_Y = START.x;
}
