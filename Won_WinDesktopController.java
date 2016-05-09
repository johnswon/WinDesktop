/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Won_WinDesktop;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.LayoutManager2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Minhawn
 */
public class Won_WinDesktopController {
    
    Won_WinDesktopModel wmodel;
    Won_WinDesktopView wview;
    GridLayout lay2;
    LayoutManager2 lm;
    BorderLayout lay1;
    
    Won_WinDesktopController(Won_WinDesktopModel model, Won_WinDesktopView view)
    {
        wmodel = model;
        wview = view;
        

        view.addMyCompAct(new myCompAction());
        view.addMyDriveAct(new myDriveAction());
        view.addMyTextpadAct(new myTextpadAction());
        view.addMyHydraAct(new myHydraAction());    

    }
    
    public void init()
    {
      
      


        
      
    }
    
        class myCompAction implements ActionListener
        {
        @Override
        public void actionPerformed(ActionEvent e)
        {
        try{
        int_rgbframe my_comp = new int_rgbframe();
        wview.desktop_d.add(my_comp);
        my_comp.setVisible(true);
        my_comp.setLocation(100,0);
        my_comp.show();
            }
        catch(Exception ex)
        {
            System.out.println("ERROR!");
        }
        }
        }
        
        class myDriveAction implements ActionListener
        {
        @Override
        public void actionPerformed(ActionEvent e)
        {
        try{
        int_driveframe my_drive = new int_driveframe();
        wview.desktop_d.add(my_drive);
        my_drive.setVisible(true);
        my_drive.setLocation(100,0);
        my_drive.setSelected(true);
        my_drive.show();
            }
        catch(Exception ex)
        {
            System.out.println("ERROR!");
        }
        }
        }
        

        
        class myTextpadAction implements ActionListener
        {
        @Override
        public void actionPerformed(ActionEvent e)
        {
        try{
        int_textpadframe my_txtpad = new int_textpadframe();
        wview.desktop_d.add(my_txtpad);
        my_txtpad.setVisible(true);
        my_txtpad.setLocation(100,0);
        my_txtpad.setSelected(true);
        my_txtpad.show();
            }
        catch(Exception ex)
        {
            System.out.println("ERROR!");
        }
        }
        }

        class myHydraAction implements ActionListener
        {
        @Override
        public void actionPerformed(ActionEvent e)
        {
        try{
        for(int i = 0; i<2; i++)
        {
        int_hydraframe my_hydra = new int_hydraframe();
        wview.desktop_d.add(my_hydra);
        my_hydra.setVisible(true);
        my_hydra.setLocation(wmodel.randowidth(),wmodel.randoheight());
        my_hydra.setSelected(true);
        my_hydra.show();
        }   }
        catch(Exception ex)
        {
            System.out.println("ERROR!");
        }
        }
        }
    

    

}
