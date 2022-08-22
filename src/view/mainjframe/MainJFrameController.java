package view.mainjframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.MessageDialog;
import view.ReviewsJFrame;
import view.Utils;
import view.reviewsjframe.ReviewAttractionJFrame;
import view.reviewsjframe.ReviewAttractionJFrameController;
import model.domain.*;


public class MainJFrameController 
implements ActionListener 
{

private MainJFrame reviewAttractionJFrame;


public MainJFrameController() {
}


public MainJFrameController (MainJFrame reviewAttractionJFrame) 
{
this.reviewAttractionJFrame = reviewAttractionJFrame;


reviewAttractionJFrame.getFileMenuItem().addActionListener(this);
reviewAttractionJFrame.getDatabaseMenuItem().addActionListener(this);
reviewAttractionJFrame.getReadReviewsButton().addActionListener(this);
reviewAttractionJFrame.getLeaveReviewButton().addActionListener(this);


Utils.centerWindow(reviewAttractionJFrame);reviewAttractionJFrame.setVisible(true);
}


public void actionPerformed(ActionEvent event) 
{

System.out.println ("Inside ReviewAttractionJFrameController::actionPerformed");

if (event.getSource().equals(reviewAttractionJFrame.getFileMenuItem()))
menuFileOpen_actionPerformed(event);
else if (event.getSource().equals(reviewAttractionJFrame.getDatabaseMenuItem()))
menuReadDB_actionPerformed(event);
else if (event.getSource().equals(reviewAttractionJFrame.getLeaveReviewButton()))
getLeaveReview_actionPerformed(event);
else if (event.getSource().equals(reviewAttractionJFrame.getReadReviewsButton()))
getReadReviews_actionPerformed(event);
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



void getReadReviews_actionPerformed(ActionEvent actionEvent) 
{
System.out.println("Inside ReviewAttractionJFrameController");
MessageDialog dlg = new MessageDialog( "Attraction Reviews Functionality", "Not Implemented Yet!");    
Utils.centerWindow(dlg);
dlg.setModal(true);
dlg.show();

return;  
} 

private void getLeaveReview_actionPerformed(ActionEvent event) {

ReviewAttractionJFrame reviewAttractionJFrame = new ReviewAttractionJFrame();
reviewAttractionJFrame.show();
	}


} 

