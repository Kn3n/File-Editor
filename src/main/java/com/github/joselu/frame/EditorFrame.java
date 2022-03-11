package com.github.joselu.frame;

import javax.swing.*;
import java.awt.*;

public class EditorFrame {
    JFrame jFrame = new JFrame("Joseluu text editor");
    JMenuBar jMenu = new JMenuBar();
    JTextArea jTextArea = new JTextArea(25,80);
    JScrollPane jScrollPane = new JScrollPane();

    public void openFrame(){
        jFrame.getContentPane().add(jMenu, BorderLayout.NORTH);
        jFrame.getContentPane().add(jMenu, BorderLayout.CENTER);
        jFrame.setVisible(true);

        jScrollPane.setViewportView(jTextArea);

        jTextArea.setLineWrap(true);
        jTextArea.setWrapStyleWord(true);

        JScrollPane scroll = new JScrollPane(jTextArea);
        jFrame.getContentPane().add(scroll, BorderLayout.CENTER);
    }
}
