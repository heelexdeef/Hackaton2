package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class View {
    private JFrame frame;
    private JButton exitButton;
    private Controller controller;
    private JScrollPane scrollPane;

    public void create() {
        controller = new Controller();
        frame = new JFrame("VIEW");
        frame.setUndecorated(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(1280,960);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        exitButton = new JButton();
        exitButton.setBounds(1230,5,45,45);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exitEvent();
            }
        });
        JList<String> gameSaveJList = new JList<>();
        JScrollPane scrollPane = new JScrollPane(gameSaveJList);
        gameSaveJList.setListData(controller.rowToCarData(controller.getRows()[0]));

        scrollPane.setBounds(5, 5, 278, 350);

        frame.add(scrollPane);

        frame.add(exitButton);

        frame.repaint();
    }

    private void exitEvent() {
        frame.dispose();
    }
}
