package lesson171218;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class AnonymousExample {

    public static void main(String[] args) {
        SwingListenerDemo swingListenerDemo = new SwingListenerDemo();

    }
}


class SwingListenerDemo {
    private JFrame mainFrame;

    public SwingListenerDemo() {
        prepareGUI();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Java SWING Examples");
        mainFrame.setSize(400, 400);
        mainFrame.setLayout(new FlowLayout());
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton okButton = new JButton("OK");

        okButton.addMouseListener(new MyTrickyMouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Hehey!");
            }
        });

        int effectivelyFinalCount = 0;

        okButton.addActionListener(e -> okButtonClick(e, effectivelyFinalCount));

        mainFrame.add(okButton);
        mainFrame.setVisible(true);
    }

    public void okButtonClick(ActionEvent e, int effectivelyFinalCount) {
        System.out.println(effectivelyFinalCount);
        button1Click(e);
    }

    private void button1Click(ActionEvent e) {
        System.out.println("The button has been clicked!!!");
        mainFrame.setTitle("The button has been clicked!!!");
    }
}

class MyTrickyMouseListener implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}