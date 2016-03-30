package com.vector.jinterface.view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import sun.applet.Main;

/**
 * Author: vector.huang
 * Email: 642378415@qq.com
 * Date: 2016/2/29
 * Description:<p>{TODO: 用一句话描述}
 */
public class MainFrame extends JFrame {

    public MainFrame() {
        Container contentPane = getContentPane();
        Icon icon = new ImageIcon("swing.gif", "An advanced GIF of Duke on a swing");
        JLabel label = new JLabel("Hello Swing!!", icon, SwingConstants.CENTER);
        contentPane.add(label, BorderLayout.CENTER);
        setBounds(100, 100, 300, 250);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        addWindowListener(new WindowAdapter() {
                              public void windowClosed(WindowEvent e) {
                                  System.exit(0);
                              }
                          }
        );
    }

}
