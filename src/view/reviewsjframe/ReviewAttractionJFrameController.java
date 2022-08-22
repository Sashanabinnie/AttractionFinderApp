package view.reviewsjframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.business.manager.AttractionsManager;
import model.domain.*;
import view.MessageDialog;
import view.Utils;

public class ReviewAttractionJFrameController implements ActionListener {
private ReviewAttractionJFrame reviewAttractionJFrame;
	

    public ReviewAttractionJFrameController() {
    }
     

 
    
  public ReviewAttractionJFrameController (ReviewAttractionJFrame reviewAttractionJFrame)
  {
    this.reviewAttractionJFrame = reviewAttractionJFrame;

   
    reviewAttractionJFrame.getSubmitButton().addActionListener(this);
    reviewAttractionJFrame.getCancelButton().addActionListener(this);
       
   
    Utils.centerWindow(reviewAttractionJFrame);
    reviewAttractionJFrame.setVisible(true);
  }

 
  public void actionPerformed(ActionEvent event) 
  {

    System.out.println ("Inside ReviewAttractionJFrameController::actionPerformed");
    
    if (event.getSource().equals(reviewAttractionJFrame.getSubmitButton()))
     submit_actionPerformed(event);
    else if (event.getSource().equals(reviewAttractionJFrame.getCancelButton()))
      cancel_actionPerformed(event);
  }


  void menuFileOpen_actionPerformed(ActionEvent actionEvent) 
  {
   
	
    MessageDialog dlg = new MessageDialog( "File Open", " Read comments in callback code");    
    Utils.centerWindow(dlg);
    dlg.setModal(true);
    dlg.show();

      return;  
  } 


 
  void menuReadDB_actionPerformed (ActionEvent actionEvent) 
  {
   
	 
    MessageDialog dlg = new MessageDialog( "File Open", " Read comments in callback code");    
    Utils.centerWindow(dlg);
    dlg.setModal(true);
    dlg.show();

      return;  
  } 
  
  

 private void cancel_actionPerformed(ActionEvent event) {
  reviewAttractionJFrame.setVisible(false);
  reviewAttractionJFrame.dispose();
 }


 private void submit_actionPerformed(ActionEvent event) {
  Reviews reviews = reviewAttractionJFrame.getSelectedData();
    
     Attractions reviews = new Reviews();
     Reviews.setReviews(reviews);
     
 	 AttractionsManager attractionsManager = AttractionsManager.getInstance();
 	 if (attractionsManager != null)
 	 {	 
	 	 boolean action =  attractionsManager.performAction("ReviewAttraction", reviews);
	     
	
	     if (action)
	     {	 
	       MessageDialog dlg = new MessageDialog( "Registration Confirmation" , "You are successfully registered!");    
	       Utils.centerWindow(dlg);
	       dlg.setModal(true);
	       dlg.show();
	       
	       
	       reviewAttractionJFrame.setVisible(false);
	       reviewAttractionJFrame.dispose();
	
	     } 
	     else
	     {
	         MessageDialog dlg = new MessageDialog( "Validate Confirmation" , "Validation Failed. Please try back later!");    
	         Utils.centerWindow(dlg);
	         dlg.setModal(true);
	         dlg.show();
	    	 
	     }
 	 }
     else
     {
         MessageDialog dlg = new MessageDialog( "Internal Error" , "Validation Failed. Please try back later!");    
         Utils.centerWindow(dlg);
         dlg.setModal(true);
         dlg.show();
    	 
     	}
	 	 
	 }
}
