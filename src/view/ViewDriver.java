package view;

import javax.swing.UIManager;

import view.mainjframe.MainJFrame;
import view.mainjframe.MainJFrameController;

public class ViewDriver {

    public ViewDriver() 
    {
    
       try {
         UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
       }
       catch (Exception e) {
         e.printStackTrace();
       }
   

      
        MainJFrame mainJFrame = new MainJFrame();
       
        MainJFrameController mainJFrameController = 
                new MainJFrameController(mainJFrame);
        
    }

    public static void main(String[] args) {
    	   new ViewDriver();
    	 }
    	    
}
