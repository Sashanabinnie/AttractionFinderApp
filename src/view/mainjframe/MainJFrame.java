package view.mainjframe;

import model.domain.*;
import model.domain.Reviews;
import model.domain.Attractions;
import view.reviewsjframe.*;
import view.mainjframe.*;

public class MainJFrame extends javax.swing.JFrame {
	
	private static final long serialVersionUID = 3320197207777135961L;
	
	 public MainJFrame() {
	        initComponents();
	        
	        this.setSize(350,300);                
	        this.setVisible(true); 
	    }

	 private void initComponents() {

		  jMenuBar = new javax.swing.JMenuBar();
		  setJMenuBar(jMenuBar);
		  jFileMenu = new javax.swing.JMenu();
		  jDataMenu = new javax.swing.JMenu();
		  jFileMenuItem = new javax.swing.JMenuItem();
		  jDatabaseMenuItem = new javax.swing.JMenuItem();
		  jPanel1 = new javax.swing.JPanel();
		  jLabelAttractions = new javax.swing.JLabel();
		  jLabelAttraction1 = new javax.swing.JLabel(); 
		  jButtonLeaveReview = new javax.swing.JButton();
		  jButtonReadReviews = new javax.swing.JButton();
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
		  setTitle("Outside Attraction Finder");
		  setFont(new java.awt.Font("Comic Sans MS", 0, 10));
		  getContentPane().setLayout(null);

		  jPanel1.setBackground(new java.awt.Color(102-255-102));
		  jPanel1.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); 
		  jPanel1.setLayout(null);

		  jLabelAttractions.setFont(new java.awt.Font("Comic Sans MS", 1, 15));
		  jLabelAttractions.setText("ATTRACTIONS");
		  jPanel1.add(jLabelAttractions);
		  jLabelAttractions.setBounds(100, 20, 150, 17);


		  jLabelAttraction1.setFont(new java.awt.Font("Comic Sans MS", 1, 12 ));
		  jLabelAttraction1.setText("Attraction 1 - ");
		  jPanel1.add(jLabelAttraction1);
		  jLabelAttraction1.setBounds(60, 103, 110, 17);

		  jButtonLeaveReview.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); 
		  jButtonLeaveReview.setText("Leave Review");
		  jPanel1.add(jButtonLeaveReview);
		  jButtonLeaveReview.setBounds(150, 100, 120, 22);
		  
		  
		  jButtonReadReviews.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); 
		  jButtonReadReviews.setLabel("Read Reviews");
		  jButtonReadReviews.addActionListener(new java.awt.event.ActionListener() {
		   public void actionPerformed(java.awt.event.ActionEvent evt) {
		    jButtonReadReviewsActionPerformed(evt);
		   }
		  });
		  jPanel1.add(jButtonReadReviews);
		  jButtonReadReviews.setBounds(40, 200, 100, 25);
		  
		  
		  
		  jButtonCancel.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); 
		  jButtonCancel.setText("Cancel");
		  jPanel1.add(jButtonCancel);
		  jButtonCancel.setBounds(170, 200, 100, 25);

		  getContentPane().add(jPanel1);
		  jPanel1.setBounds(0, 0, 450, 300);
		  pack();
		 	}

	 		private void jButtonReadReviewsActionPerformed(java.awt.event.ActionEvent evt) 
	 		{
		 
	 		}
	 		

		    
		    public javax.swing.JMenuItem getFileMenuItem()
		    {
		        return jFileMenuItem;
		    }


		    public javax.swing.JMenuItem getDatabaseMenuItem()
		    {
		        return jDatabaseMenuItem;
		    }    

		        
		    public javax.swing.JButton getLeaveReviewButton()
		    {
		        return jButtonLeaveReview;
		    }    
		    
		    public javax.swing.JButton getReadReviewsButton()
		    {
		        return jButtonReadReviews;
		    }  

		   
		    public javax.swing.JButton getCancelButton()
		    {
		        return jButtonCancel;
		    }



		    public static void main(String args[]) {
			     java.awt.EventQueue.invokeLater(new Runnable() {
			          public void run() {
			                MainJFrame reviewAttractionJFrame = new MainJFrame();
			              
			            }
			        });
			    }
			    
		     
			 private javax.swing.JButton jButtonLeaveReview;
			 private javax.swing.JButton jButtonReadReviews;
			 private javax.swing.JMenu jDataMenu;
			 private javax.swing.JMenuItem jDatabaseMenuItem;
			 private javax.swing.JMenu jFileMenu;
			 private javax.swing.JMenuItem jFileMenuItem;
			 private javax.swing.JLabel jLabelAttractions;
			 private javax.swing.JLabel jLabelAttraction1;
			 private javax.swing.JMenuBar jMenuBar;
			 private javax.swing.JPanel jPanel1;
			 private javax.swing.JButton jButtonCancel;		
	


}
