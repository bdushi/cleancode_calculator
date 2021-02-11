package observer;

import javax.swing.*;
import java.awt.*;

public class GuiOutput extends JFrame implements Observer<Double> {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    JLabel label = new JLabel();

    public GUIOutput(){
        setTitle("Test");
        setSize(300, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);
        add(label, BorderLayout.CENTER);

    }

    @Override
    public void update(final Double aDouble) {
        label.setText(aDouble.toString());
    }

    @Override
    public void setSize(final Dimension d) {
        super.setSize(d);
    }
}
