import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class MetricConversion {


	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetricConversion window = new MetricConversion();
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
	public MetricConversion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 483, 324);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel(" Select a conversion type:");
		lblNewLabel.setBounds(24, 57, 184, 24);
		frame.getContentPane().add(lblNewLabel);
		JLabel dis = new JLabel("");
		dis.setBounds(24, 183, 256, 30);
		frame.getContentPane().add(dis);
		JComboBox conversion = new JComboBox();
		conversion.setModel(new DefaultComboBoxModel(
				new String[] { "feet to meters", "inches to centimeters", "gallon to liters", "pound to kilograms" }));
		conversion.setEditable(true);
		conversion.setToolTipText("");
		conversion.setBounds(24, 107, 152, 22);
		frame.getContentPane().add(conversion);
		conversion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String con = (String) conversion.getSelectedItem();
				if (con == "feet to meters") {
					dis.setText("1 foot = 0.3048 meters");
				}else if(con == "inches to centimeters")
				{
					dis.setText("1 inche = 2.54 centimeters");
				}else if(con == "gallon to liters")
				{
					dis.setText("1 gallon = 4.5461 liters");
				}else 
				{
					dis.setText("1 pound = 0.4536 kilograms");
				}

			}
		});

	}
}
