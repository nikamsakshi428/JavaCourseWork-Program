import javax.swing.*;

public class Prog79 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Checkbox Example");
        JCheckBox checkBox = new JCheckBox("Accept Terms");
        frame.add(checkBox);
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}