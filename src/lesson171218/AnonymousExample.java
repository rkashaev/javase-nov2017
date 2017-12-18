package lesson171218;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class AnonymousExample {

    public static void main(String[] args){
        SwingListenerDemo swingListenerDemo = new SwingListenerDemo();

    }
}


class SwingListenerDemo {
    private JFrame mainFrame;

    public SwingListenerDemo(){
        prepareGUI();
    }

    private void prepareGUI(){
        mainFrame = new JFrame("Java SWING Examples");
        mainFrame.setSize(400,400);
        mainFrame.setLayout(new FlowLayout());
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton okButton = new JButton("OK");

        okButton.addMouseListener(new MyTrickyMouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Hehey!");
            }
        });
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1Click(e);
            }
        });

        mainFrame.add(okButton);
        mainFrame.setVisible(true);
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