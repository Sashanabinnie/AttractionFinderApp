package view.reviewsjframe;

import model.domain.Reviews;
import view.reviewsjframe.*;
import model.domain.Attractions;


import model.domain.*;

	public class ReviewAttractionJFrame extends javax.swing.JFrame {

		private static final long serialVersionUID = -685641941903021280L;
		
		private ReviewAttractionJFrameController reviewAttractionJFrameController;

	 
	    public ReviewAttractionJFrame() {
	        initComponents();
	        reviewAttractionJFrameController = new ReviewAttractionJFrameController(this);

	        this.setSize(350,300);                
	        this.setVisible(true); 
	    }
	    
	   
	 @SuppressWarnings("deprecation")
	private void initComponents() {

	  jMenuBar = new javax.swing.JMenuBar();
	  setJMenuBar(jMenuBar);
	  jFileMenu = new javax.swing.JMenu();
	  jDataMenu = new javax.swing.JMenu();
	  jFileMenuItem = new javax.swing.JMenuItem();
	  jDatabaseMenuItem = new javax.swing.JMenuItem();
	  jPanel1 = new javax.swing.JPanel(); 
	  jLabelReviews = new javax.swing.JLabel();
	  jLabelA1Review = new javax.swing.JLabel();
	  jTextFieldA1Review = new javax.swing.JTextField();
	  jLabelA1ReviewDescription = new javax.swing.JLabel();
	  jTextFieldA1ReviewDescription = new javax.swing.JTextField();
	  jLabelReviewStars = new javax.swing.JLabel();
	  jTextFieldReviewStars = new javax.swing.JTextField();
	  jLabelReviewer = new javax.swing.JLabel();
	  jTextFieldReviewer = new javax.swing.JTextField();
	  jLabelReviewDate = new javax.swing.JLabel();
	  jTextFieldReviewDate = new javax.swing.JTextField();
	  jLabelReviewTime = new javax.swing.JLabel();
	  jTextFieldReviewTime = new javax.swing.JTextField();
	  jButtonSubmit = new javax.swing.JButton();
	  jButtonCancel = new javax.swing.JButton();

	  jMenuBar.setNextFocusableComponent(jFileMenu);
	  jMenuBar.setOpaque(false);

	  jFileMenu.setText("Outsidee Attraction Finder");
	  jFileMenu.setFont(new java.awt.Font("Comic Sans MS", 1, 11));

	  jDataMenu.setText("Data");
	  jDataMenu.setFont(new java.awt.Font("Comic Sans MS", 1, 11));

	  jFileMenuItem.setFont(new java.awt.Font("Comic Sans MS", 1, 11));
	  jFileMenuItem.setText("Open From File...");
	  jDataMenu.add(jFileMenuItem);

	  jDatabaseMenuItem.setFont(new java.awt.Font("Comic Sans MS", 1, 11));
	  jDatabaseMenuItem.setText("Open from database...");
	  jDatabaseMenuItem.setActionCommand("Open from Database...");
	  jDataMenu.add(jDatabaseMenuItem);

	  jFileMenu.add(jDataMenu);

	  jMenuBar.add(jFileMenu);

	  setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	  setTitle("Attractions Review");
	  setFont(new java.awt.Font("Comic Sans MS", 0, 10)); 
	  getContentPane().setLayout(null);

	  jPanel1.setBackground(new java.awt.Color(102-255-102));
	  jPanel1.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); 
	  jPanel1.setLayout(null);

	  jLabelReviews.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); 
	  jLabelReviews.setText("REVIEWS");
	  jPanel1.add(jLabelReviews);
	  jLabelReviews.setBounds(120, 20, 100, 17); 

	  jLabelA1Review.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); 
	  jLabelA1Review.setText("Attraction Review: ");
	  jPanel1.add(jLabelA1Review);
	  jLabelA1Review.setBounds(40, 60, 110, 17);
	  
	  jTextFieldA1Review.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); 
	  jTextFieldA1Review.setText("Talcott Mountain");
	  jPanel1.add(jTextFieldA1Review);
	  jTextFieldA1Review.setBounds(150, 60, 120, 22);
	  
	  jLabelA1ReviewDescription.setFont(new java.awt.Font("Comic Sans MS", 1, 11));
	  jLabelA1ReviewDescription.setText("Review Description:");
	  jPanel1.add(jLabelA1ReviewDescription);
	  jLabelA1ReviewDescription.setBounds(40, 90, 110, 17);

	  jTextFieldA1ReviewDescription.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); 
	  jTextFieldA1ReviewDescription.setText("Best Park Ever!!!");
	  jPanel1.add(jTextFieldA1ReviewDescription);
	  jTextFieldA1ReviewDescription.setBounds(150, 90, 120, 22);
	  
	  jLabelReviewer.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); 
	  jLabelReviewer.setText("Reviewer: ");
	  jPanel1.add(jLabelReviewer);
	  jLabelReviewer.setBounds(40, 120, 100, 17);

	  jTextFieldReviewer.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); 
	  jTextFieldReviewer.setText("Sashana Binnie");
	  jPanel1.add(jTextFieldReviewer);
	  jTextFieldReviewer.setBounds(150, 120, 120, 20);

	  jLabelReviewStars.setFont(new java.awt.Font("Comic Sans MS", 1, 11));
	  jLabelReviewStars.setText("Star Rating: ");
	  jPanel1.add(jLabelReviewStars);
	  jLabelReviewStars.setBounds(40, 150, 100, 17);

	  jTextFieldReviewStars.setFont(new java.awt.Font("Comic Sans MS", 0, 11));
	  jTextFieldReviewStars.setText("5 Stars");
	  jPanel1.add(jTextFieldReviewStars);
	  jTextFieldReviewStars.setBounds(150, 150, 120, 22);
	  
	  jLabelReviewDate.setFont(new java.awt.Font("Comic Sans MS", 1, 11));
	  jLabelReviewDate.setText("Review Date: ");
	  jPanel1.add(jLabelReviewDate);
	  jLabelReviewDate.setBounds(40, 180, 100, 17);

	  jTextFieldReviewDate.setFont(new java.awt.Font("Comic Sans MS", 0, 11));
	  jTextFieldReviewDate.setText("July 12, 2022");
	  jPanel1.add(jTextFieldReviewDate);
	  jTextFieldReviewDate.setBounds(150, 180, 120, 22);

	  jLabelReviewTime.setFont(new java.awt.Font("Comic Sans MS", 1, 11));
	  jLabelReviewTime.setText("Review Time: ");
	  jPanel1.add(jLabelReviewTime);
	  jLabelReviewTime.setBounds(40, 210, 100, 17);

	  jTextFieldReviewTime.setFont(new java.awt.Font("Comic Sans MS", 0, 11));
	  jTextFieldReviewTime.setText("07:30 AM EST");
	  jPanel1.add(jTextFieldReviewTime);
	  jTextFieldReviewTime.setBounds(150, 210, 120, 20);


	  jButtonSubmit.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); 
	  jButtonSubmit.setText("Submit");
	  jPanel1.add(jButtonSubmit);
	  jButtonSubmit.setBounds(60, 270, 80, 25);
	  
	  jButtonCancel.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); 
	  jButtonCancel.setText("Cancel");
	  jPanel1.add(jButtonCancel);
	  jButtonCancel.setBounds(180, 270, 80, 25);

	  getContentPane().add(jPanel1);
	  jPanel1.setBounds(0, 0, 370, 300);

	  pack();
	 	}

	    
	    public javax.swing.JMenuItem getFileMenuItem()
	    {
	        return jFileMenuItem;
	    }
	    
	   /* public Reviews getSelectedData()
	    {

	   Reviews reviews = new Reviews (jTextFieldA1Review.getText(),
                jTextFieldA1ReviewDescription.getText(),
                jTextFieldReviewStars.getText(),
                jTextFieldReviewer.getText(),
                jTextFieldReviewDate.getText(),
                jTextFieldReviewTime.getText());
	    
	    return reviews;} 
	    */
	   

	 public javax.swing.JButton getSubmitButton()
	 	{
	     return jButtonSubmit;
	 	}

	  public javax.swing.JButton getCancelButton()
	  	{
	     return jButtonCancel;
	  	}
	    
	    public static void main(String args[]) {
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                ReviewAttractionJFrame reviewattractionJFrame = new ReviewAttractionJFrame();
	                
	                
	            }
	        });
	    }
	    
	
	 private javax.swing.JButton jButtonCancel;
	 private javax.swing.JButton jButtonSubmit;
	 private javax.swing.JMenu jDataMenu;
	 private javax.swing.JMenuItem jDatabaseMenuItem;
	 private javax.swing.JMenu jFileMenu;
	 private javax.swing.JMenuItem jFileMenuItem;
	 private javax.swing.JMenuBar jMenuBar;
	 private javax.swing.JPanel jPanel1;
	 private javax.swing.JLabel jLabelReviews;
	 private javax.swing.JLabel jLabelA1Review;
	 private javax.swing.JLabel jLabelA1ReviewDescription;
	 private javax.swing.JLabel jLabelReviewStars;
	 private javax.swing.JLabel jLabelReviewer;
	 private javax.swing.JLabel jLabelReviewDate;
	 private javax.swing.JLabel jLabelReviewTime;
	 private javax.swing.JTextField jTextFieldA1Review;
	 private javax.swing.JTextField jTextFieldA1ReviewDescription;
	 private javax.swing.JTextField jTextFieldReviewStars;
	 private javax.swing.JTextField jTextFieldReviewer;
	 private javax.swing.JTextField jTextFieldReviewDate;
	 private javax.swing.JTextField jTextFieldReviewTime;


	public Reviews getSelectedData() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
