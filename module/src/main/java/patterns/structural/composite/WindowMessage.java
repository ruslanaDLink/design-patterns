package patterns.structural.composite;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

//leaf
public class WindowMessage implements Message {
    @Override
    public void showMessage(String text) {
        JOptionPane.showMessageDialog(new JFrame(), text);
    }
}
