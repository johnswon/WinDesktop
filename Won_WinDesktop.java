/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Won_WinDesktop;

/**
 *
 * @author Minhawn
 */
public class Won_WinDesktop {
    
    
    public static void main(String[] args)
    {
    Won_WinDesktopModel model = new Won_WinDesktopModel();
    Won_WinDesktopView view = new Won_WinDesktopView();
    Won_WinDesktopController controller = new Won_WinDesktopController(model, view);
    
    try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows Classic".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Won_WinDesktopView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Won_WinDesktopView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Won_WinDesktopView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Won_WinDesktopView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    
    view.setVisible(true);
    }
}
