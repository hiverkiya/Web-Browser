package com.mycompany.webbrowser;
import javax.swing.*;
/**
 *
 * @author hiverkiya
 */
public class WebBrowser extends JFrame {
    
    WebBrowser(){
        setTitle("Web Browser");
        setBounds(0,0,1920,1080);
        setVisible(true);
    }
    public static void main(String[] args)
    {
        new WebBrowser();
    }
}
