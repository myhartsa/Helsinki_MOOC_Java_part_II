package movingfigure;

import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        // test your program here
        /*UserInterface ui = new UserInterface(new Circle(50, 50, 250));
        SwingUtilities.invokeLater(ui); */
        
        /*UserInterface ui2 = new UserInterface(new Square(50, 50, 250));
        SwingUtilities.invokeLater(ui2); */
        
        CompoundFigure truck = new CompoundFigure();
        
        truck.add(new Box(220, 110, 75, 100));
        truck.add(new Box(80, 120, 200, 100));
        truck.add(new Circle(100, 200, 50));
        truck.add(new Circle(220, 200, 50));
        
        UserInterface ui3 = new UserInterface(truck);
        SwingUtilities.invokeLater(ui3);
    }
}
