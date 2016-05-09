/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Won_WinDesktop;

import java.awt.Dimension;
import java.util.*;

/**
 *
 * @author Minhawn
 */
public class Won_WinDesktopModel {
    
    Won_WinDesktopView wview;
    Won_WinDesktopController wcontroller;
    int placeon_desktop;
    int location;
    
    public int randowidth()
    {
     Random rand = new Random();
    int n = rand.nextInt(1000) + 100;
    return n;
    }
    
    public int randoheight()
    {
    Random rand = new Random();
    int n = rand.nextInt(650) + 0;
    return n;
    }

}
