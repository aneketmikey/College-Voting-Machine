/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypack;

/**
 *
 * @author Jarvis
 */
public class Screen {
    public static void main(String[] args) {
        Splash s=new Splash();
        s.setVisible(true);
        Welcome w=new Welcome();
        try{
            for(int i=0;i<=100;i++)
            {
                Thread.sleep(40);
                s.loadingnum.setText(Integer.toString(i)+"%");
                s.jProgressBar1.setValue(i);
                if(i==100)
                {
                    s.setVisible(false);
                    w.setVisible(true);
                }
            }
        }
        catch(Exception e)
        {
            
        }
    }
}
