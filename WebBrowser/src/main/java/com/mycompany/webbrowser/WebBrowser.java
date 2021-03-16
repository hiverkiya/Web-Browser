package com.mycompany.webbrowser;
import javax.swing.*;
import javafx.embed.swing.JFXPanel;
/**
 *
 * @author hiverkiya
 *
 */
public class WebBrowser extends JFrame {
    private JFXPanel panel;
    WebBrowser(){
        setTitle("Web Browser");
        setBounds(0,0,1920,1080);
        setVisible(true);
        panel = new JFXPanel();
        add(panel);
    }
    public static void main(String[] args)
    {
        new WebBrowser();
    }
}
