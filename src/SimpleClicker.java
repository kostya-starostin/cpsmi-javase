import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SimpleClicker extends JFrame {

    private JLabel countLabel;
    private JButton addClick;
    private int clicks;

    private SimpleClicker() {
        super("Simple Counter");
        JFrame.setDefaultLookAndFeelDecorated(true);
        countLabel = new JLabel("You clicked: " + clicks);
        addClick = new JButton("Click me");
        JPanel buttonsPanel = new JPanel(new FlowLayout());
        add(countLabel, BorderLayout.NORTH);
        buttonsPanel.add(addClick);
        add(buttonsPanel, BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initListeners();
    }

    private void initListeners() {
        addClick.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clicks = clicks + 1;
                updateCounter();
            }
        });
    }


    private void updateCounter() {
        countLabel.setText("You clicked: " + clicks);
    }

    public static void main(String[] args) {
        SimpleClicker app = new SimpleClicker();
        app.setVisible(true);
        app.pack();
    }
}



