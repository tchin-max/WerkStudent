package inter6;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingUtilities;

public class GUIS {
	private static int  count = 0;
	public static void main(String[] args) {
		JFrame fenster = new JFrame();
		fenster.setVisible(false);
		fenster.setSize(300,300);
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton button = new JButton("click");
		JLabel label = new JLabel("count:0");
		
		button.setPreferredSize(new Dimension(50,50));
		button.addActionListener(e ->label.setText("count " + count++));
		
		JPanel panel = new JPanel();
		//BorderLayout bl = new BorderLayout();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		//panel.setLayout(new GridLayout(8,8));

		
		panel.add(button);
		panel.add(label);
		
		fenster.add(panel);
		panel.setBackground(Color.cyan);
		
		SwingUtilities.invokeLater(() -> new GUIS().createAndShowGUI());

		
		
	}
	private void createAndShowGUI() {
		

		JFrame frame = new JFrame("BenutzerOberfläche");
		frame.setVisible(true);
		frame.setSize(300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JTextField name = new JTextField();
		panel.add(new JLabel("Name:"));
		panel.add(name);
		//panel.setBackground(Color.GREEN);
		
		JSpinner age = new JSpinner(new SpinnerNumberModel(18,0,120,1 ));
		panel.add(new JLabel("age"));
		panel.add(age);
		
		// Eine Auswahl
	
		JRadioButton male = new JRadioButton("male");
		JRadioButton female = new JRadioButton("female");
		ButtonGroup sexe = new ButtonGroup();
		sexe.add(female);
		sexe.add(male);
		
		panel.add(new JLabel("Geschlecht"));
		panel.add(female);
		panel.add(male);
		
		// AuswahlListe
		String [] g = {"World of Tank", "Uncharted", "Resident Evil", "Farcry", "God of War"};
		JComboBox<String> game = new JComboBox(g);
		panel.add(new JLabel("Favorite Game"));
		panel.add(game);
		
		//Mehrfachauswahl
		JCheckBox hobby1 = new JCheckBox("Music");
		JCheckBox hobby2 = new JCheckBox("Learning");
		JCheckBox hobby3 = new JCheckBox("travel");
		JCheckBox hobby4 = new JCheckBox("Sport");
		panel.add(new JLabel("Hobbys"));

		panel.add(hobby1);
		panel.add(hobby2);
		panel.add(hobby3);
		panel.add(hobby4);


		
		
		JButton send = new  JButton("send");
		
		//Textbereich
		JTextArea result = new JTextArea();
		result.setEditable(false);
		send.addActionListener(e -> {result.setText("result: \n\n"); 
		result.append("Name : " + name.getText().toLowerCase().trim() + "\n");
		result.append("Age: " + age.getValue() + "\n");
		String sexes = male.isSelected() ? "male" :
					female.isSelected() ? "female" : 
					"Nicht eingegeben" ;
		
		result.append("Sexe: " + sexes + "\n");
		result.append("Favorite Game: " + game.getSelectedItem() + "\n");
		
StringBuilder hobby = new StringBuilder();
if (hobby1.isSelected()) hobby.append("Music, ");
if (hobby2.isSelected()) hobby.append("Learning, ");
if (hobby3.isSelected()) hobby.append("travel, ");
if (hobby4.isSelected()) hobby.append("Sport, ");
if (hobby.length()>0) {
	hobby.setLength(hobby.length()-2);
	
}

result.append("Hobbie: " +hobby+ "\n");



		});
		
		frame.add(panel, BorderLayout.NORTH);
		frame.add(send, BorderLayout.CENTER);

		frame.add(result, BorderLayout.SOUTH);
		frame.setVisible(true);
		
	}
	

}
