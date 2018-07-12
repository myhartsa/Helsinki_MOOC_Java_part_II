/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

import java.util.ArrayList;
import java.util.List;

public class BlackHoleBox extends Box {
    
    private List<Thing> things;
    
    public BlackHoleBox() {
        this.things = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.things.add(thing);
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return false;
    }
    
}
