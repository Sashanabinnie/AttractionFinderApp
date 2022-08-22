package view;


import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.UIManager;


public class ReviewsJFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private static final String PREFERRED_LOOK_AND_FEEL = null;

	public ReviewsJFrame() {
		initComponents();
	}

	private void initComponents() {
		setLayout(new GroupLayout(null));																						
		setSize(320, 240);
	}

	@SuppressWarnings("unused")
	private static void installLnF() {
		try {
			String lnfClassname = PREFERRED_LOOK_AND_FEEL;
			if (lnfClassname == null)
				lnfClassname = UIManager.getCrossPlatformLookAndFeelClassName();
			UIManager.setLookAndFeel(lnfClassname);
		} catch (Exception e) {
			System.err.println("Cannot install " + PREFERRED_LOOK_AND_FEEL
					+ " on this platform:" + e.getMessage());
		}
	}

}
