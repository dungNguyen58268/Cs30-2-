import java.awt.EventQueue;

import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class BreakAPlate {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				BreakAPlate window = new BreakAPlate();
				window.frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		});
	
	}

	/**
	 * Create the application.
	 */
	public BreakAPlate() {
		Gamebooth breakAPlate = new Gamebooth("tiger plush", "Sticker");
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		ImageIcon plates = new ImageIcon("C:\\Users\\1100021407\\git\\Cs30\\chap10\\src\\plates.gif");
		ImageIcon twobroken = new ImageIcon("C:\\Users\\1100021407\\git\\Cs30\\chap10\\src\\plates_two_broken.gif");
		ImageIcon threebroken = new ImageIcon("C:\\Users\\1100021407\\git\\Cs30\\chap10\\src\\plates_all_broken.gif");
		
		frame = new JFrame();
		frame.setBounds(100, 100, 544, 385);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel plate = new JLabel("");
		plate.setBounds(98, 68, 279, 126);
		frame.getContentPane().add(plate);
		plate.setIcon(plates);

		JLabel prizeWon = new JLabel("");
		prizeWon.setBounds(162, 229, 208, 106);
		frame.getContentPane().add(prizeWon);
		
		JButton play = new JButton("play");
		
		play.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String eventName = e.getActionCommand();
				String prize;
				
				if(eventName == "play")
				{
					prize = BreakAPlate.start();
					if(prize.equals("tiger plush"))
					{
						plate.setIcon(threebroken);
					}else if (prize.equals("Sticker"))
					{
						plate.setIcon(twobroken);
					}
					
					prizeWon.setText("You win: " + prize);
					play.setText("Play Again");
					play.setActionCommand("Play Again");
				}else if(eventName == "Play Again"){
					plate.setIcon(plates);
					play.setText("play");
					play.setActionCommand("play");
				}
			}
		});
		play.setBounds(206, 219, 89, 23);
		frame.getContentPane().add(play);
		
		

			
	}

	protected static String start() {
		// TODO Auto-generated method stub
		return null;
	}
}
