package gameClasses;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


public class QuizGame {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new GameIntegration();
			}
				
			});	
		
	}
	
	
}


class GameIntegration{
	
	
	//GAME FRAME INSTANCE
	GameFrame Mframe = new GameFrame();
	//TO GET DIMENSION OF SCREEN
	Dimension Dim = Toolkit.getDefaultToolkit().getScreenSize();
		
	//CARD LAYOUT INSTANCE
	CardLayout CLay = new CardLayout();
		
	//CONTAINER PANEL INSTANCE
	JPanel Container = new JPanel ();
		
	//START PANEL
	Cathegories StartP = new Cathegories();
	//START BUTTON
	JButton StartB = new JButton("START");
	
	//FINAL PANEL
	Cathegories Final = new Cathegories();
	//FINAL PANEL BUTTONS
	JButton Again = new JButton("PLAY AGAIN");
	JButton Quit = new JButton("QUIT");
	//SCORE FINAL
	JLabel ScoreMessage = new JLabel();

	//MOVIES PANEL
	Cathegories Movies = new Cathegories();
	//MOVIES OK BUTTON
	ConfirmButton ConfirmMov = new ConfirmButton();
	//MOVIES CHECKBOXES
	Options AgeUltron = new Options("Age of Ultron", 100, 40, 100, 100);
	Options Avengers = new Options("The Avengers", 100, 100, 120, 100);
	Options Infinity = new Options("Infinity war", 300, 40, 100, 100);
	Options EndGame = new Options("Endgame", 300, 100, 100, 100);
	ButtonGroup MovGroup = new ButtonGroup();
	//MOVIES QUESTION
	Question MovQuestion = new Question("What Avengers movie didn't have Hawk Eye?",80, 5, 400, 50 );
	
	
	//HISTORY PANEL
	Cathegories History = new Cathegories();
	//HISTORY OK BUTTON
	ConfirmButton ConfirmHis = new ConfirmButton();
	//HISTORY CHECKBOXES
	Options Roman = new Options("Roman Empire", 100, 40, 120, 100);
	Options Ottoman = new Options("Ottoman Empire", 100, 100, 120, 100);
	Options Mongol = new Options("Mongol Empire", 300, 40, 120, 100);
	Options Chinese = new Options("Chinese Empire", 300, 100, 120, 100);
	ButtonGroup HisGroup = new ButtonGroup();
	//MOVIES QUESTION
	Question HisQuestion = new Question("What empire contained Turkey in the XV century?",80, 5, 400, 50 );
	
		
	//SCIENCE PANEL
	Cathegories Science = new Cathegories();
	//SCIENCE OK BUTTON
	ConfirmButton ConfirmSci = new ConfirmButton();
	//SCIENCE CHECKBOXES
	Options Quartz = new Options("Quartz", 100, 40, 120, 100);
	Options Lithium = new Options("Lithium", 100, 100, 120, 100);
	Options Diamond = new Options("Diamond", 300, 40, 120, 100);
	Options Amber = new Options("Amber", 300, 100, 120, 100);
	ButtonGroup SciGroup = new ButtonGroup();
	//SCIENCE QUESTION
	Question SciQuestion = new Question("What of the below options is not a mineral?",80, 5, 400, 50 );
		
	
	//GEOGRAPHY PANEL
	Cathegories Geography = new Cathegories();
	//GEOGRAPHY OK BUTTON
	ConfirmButton ConfirmGeo = new ConfirmButton();
	//GEOGRAPHY CHECKBOXES
	Options Finland = new Options("Finland", 100, 40, 120, 100);
	Options Denmark = new Options("Denmark", 100, 100, 120, 100);
	Options Norway = new Options("Norway", 300, 40, 120, 100);
	Options Sweeden = new Options("Sweeden", 300, 100, 120, 100);
	ButtonGroup GeoGroup = new ButtonGroup();
	//GEOGRAPHY QUESTION
	Question GeoQuestion = new Question("Which country is not a member of the EU?",80, 5, 400, 50 );
			
	
	//MUSIC PANEL
	Cathegories Music = new Cathegories();
	//MUSIC OK BUTTON
	ConfirmButton ConfirmMus = new ConfirmButton();
	//MUSIC CHECKBOXES
	Options Madonna = new Options("Madonna", 300, 40, 120, 100);
	Options Gaga = new Options("Lady Gaga", 100, 100, 120, 100);
	Options Spears = new Options("Britney Spears", 100, 40, 120, 100);
	Options Perry = new Options("Katy Perry", 300, 100, 120, 100);
	ButtonGroup MusGroup = new ButtonGroup();
	//MUSIC QUESTION
	Question MusQuestion = new Question("Which female popstar shaved her head in 2007?",50, 5, 400, 50 );
	
	
	//ART PANEL
	Cathegories Art = new Cathegories();
	//ART OK BUTTON
	ConfirmButton ConfirmArt = new ConfirmButton();
	//ART CHECKBOXES
	Options Kandinsky = new Options("Kandinsky", 100, 40, 120, 100);
	Options VanGogh = new Options("Van Gogh", 100, 100, 120, 100);
	Options Munch = new Options("Munch", 300, 100, 120, 100);
	Options Meuller = new Options("Meuller", 300, 40, 120, 100);
	ButtonGroup ArtGroup = new ButtonGroup();
	//ART QUESTION
	Question ArtQuestion = new Question("Who painted \"The Scream\"?", 120 , 5, 400, 50 );
	
	//TV PANEL
	Cathegories Television = new Cathegories();
	//TV OK BUTTON
	ConfirmButton ConfirmTv = new ConfirmButton();
	//TV CHECKBOXES
	Options Logan = new Options("Logan", 100, 40, 120, 100);
	Options Roger = new Options("Roger", 100, 100, 120, 100);
	Options Negan = new Options("Negan", 300, 40, 120, 100);
	Options Priest = new Options("Priest", 300, 100, 120, 100);
	ButtonGroup TvGroup = new ButtonGroup();
	//TV QUESTION
	Question TvQuestion = new Question("Who is the main villain of 'The walking dead'?", 80 , 5, 400, 50 );
	
	
	//SPORTS PANEL
	Cathegories Sports = new Cathegories();
	//SPORTS OK BUTTON
	ConfirmButton ConfirmSports = new ConfirmButton();
	//SPORTS CHECKBOXES
	Options Bolt = new Options("Usain Bolt", 100, 40, 120, 100);
	Options Powell = new Options("Asafa Powell", 300, 100, 120, 100);
	Options Gay = new Options("Tyson Gay", 300, 40, 120, 100);
	Options Phelps = new Options("Michael Phelps", 100, 100, 120, 100);
	ButtonGroup SpGroup = new ButtonGroup();
	//SPORTS QUESTION
	Question SpQuestion = new Question("Who is not a sprinter?", 160 , 5, 400, 50 );
	
	
	//PHILOSOPY PANEL
	Cathegories Philo = new Cathegories();
	//PHILOSOPHY OK BUTTON
	ConfirmButton ConfirmPhilo = new ConfirmButton();
	//SPORTS CHECKBOXES
	Options Poetics = new Options("Poetics", 300, 40, 120, 100);
	Options Cosmology = new Options("Cosmology", 100, 100, 120, 100);
	Options Knowledge = new Options("Knowledge", 100, 40, 120, 100);
	Options Methaphysics = new Options("Methaphysics", 300, 100, 120, 100);
	ButtonGroup PhGroup = new ButtonGroup();
	//SPORTS QUESTION
	Question PhQuestion = new Question("Epistemology is the theory of…", 160 , 5, 400, 50 );
	
	
	//LITERATURE PANEL
	Cathegories Literature = new Cathegories();
	//LITERATURE OK BUTTON
	ConfirmButton ConfirmLite = new ConfirmButton();
	//LITERATURE CHECKBOXES
	Options Two = new Options("2", 120, 40, 120, 100);
	Options Six = new Options("6", 120, 100, 120, 100);
	Options Twelve = new Options("12", 300, 40, 120, 100);
	Options Three = new Options("3", 300, 100, 120, 100);
	ButtonGroup LtGroup = new ButtonGroup();
	//LITERATURE QUESTION
	Question LtQuestion = new Question("How many Lord of the Rings books are there?", 80 , 5, 400, 50 );
		
	
	static int Score = 0; //GAME SCORE
	static int CorrectOnes = 0; //TOTAL OF RIGHT ANSWERS
	
	
	public GameIntegration() {
			
			//CONTAINER CONFIG
			Container.setBounds(500,300,500,300);
			Container.setLayout(CLay);
			
			//GAME FRAME CONFIG
			Mframe.add(Container);
			Mframe.setTitle("Quiz game");
			//FRAME SCREEN POSITION
			Mframe.setLocation(Dim.width/2-Mframe.getSize().width/2, Dim.height/2-Mframe.getSize().height/2);
			
			//ADDING PANELS TO CONTAINER (START)
			Container.add(StartP, "ST");
			
			//START PANEL AND BUTTON CONGIF AND ADD
			StartP.setLayout(null);
			StartP.setBounds(500,300,500,300);
			StartP.setVisible(true);
			StartB.setBounds(200, 100, 80, 40);
			StartB.setVisible(true);
			StartP.add(StartB);
			
			//SHOWING (START PANEL)
			CLay.show(Container, "ST");
			
			//ADDING REST OF PANELS
			
			//ADDING MOVIES PANEL
			Container.add(Movies, "MV");
			//MOVIES ADDING QUESTION
			Movies.add(MovQuestion);
			//MOVIES CHECKBOXES
			AddBoxes(Movies, MovGroup, AgeUltron, Avengers, Infinity, EndGame);
			
			//ADDING HISTORY PANEL
			Container.add(History, "HS");
			//HISTORY ADDING QUESTION
			History.add(HisQuestion);
			//HISTORY CHECKBOXES
			AddBoxes(History,HisGroup,Roman, Ottoman, Mongol, Chinese);
			
			
			//ADDING SCIENCE PANEL
			Container.add(Science, "SCI");
			//SCIENCE ADDING QUESTION
			Science.add(SciQuestion);
			//SCIENCE CHECKBOXES
			AddBoxes(Science, SciGroup, Quartz, Lithium, Diamond, Amber);
		
			
			//ADDING GEOGRAPHY PANEL
			Container.add(Geography, "GEO");
			//GEOGRAPHY ADDING QUESTION
			Geography.add(GeoQuestion);
			//GEOGRAPHY CHECKBOXES
			AddBoxes(Geography, GeoGroup, Finland, Denmark, Sweeden, Norway);
		
			
			//ADDING MUSIC PANEL
			Container.add(Music, "MUS");
			//MUSIC ADDING QUESTION
			Music.add(MusQuestion);
			//MUSIC CHECKBOXES
			AddBoxes(Music,MusGroup, Madonna ,Gaga, Perry, Spears);
			
			
			//ADDING ART PANEL
			Container.add(Art, "ART");
			//ART ADDING QUESTION
			Art.add(ArtQuestion);
			//ART CHECKBOXES
			AddBoxes(Art,ArtGroup, Kandinsky,VanGogh, Munch,Meuller);
			
			
			//ADDING TV PANEL
			Container.add(Television, "TV");
			//TV ADDING QUESTION
			Television.add(TvQuestion);
			//TV CHECKBOXES
			AddBoxes(Television,TvGroup, Logan,Roger, Negan,Priest);
			
			
			//ADDING SPORTS PANEL
			Container.add(Sports, "SP");
			//SPORTS ADDING QUESTION
			Sports.add(SpQuestion);
			//TV CHECKBOXES
			AddBoxes(Sports,SpGroup, Powell, Bolt, Phelps, Gay);
			
			
			//ADDING PHILOSOPHY PANEL
			Container.add(Philo, "PH");
			//PHILOSOPHY ADDING QUESTION
			Philo.add(PhQuestion);
			//PHILOSOPHY CHECKBOXES
			AddBoxes(Philo, PhGroup, Poetics, Knowledge, Methaphysics, Cosmology);
		
			
			//ADDING LITERATURE PANEL
			Container.add(Literature, "LT");
			//LITERATURE ADDING QUESTION
			Literature.add(LtQuestion);
			//LITERATURE CHECKBOXES
			AddBoxes(Literature, LtGroup, Two, Twelve, Three, Six);
			
			
			//ADDING FINAL PANEL
			Container.add(Final, "FN");
			//FINAL BUTTON (QUIT) VALUES
			Quit.setBounds(100, 100, 80, 40);
			//FINAL BUTTON (AGAIN) VALUES
			Again.setBounds(300, 100, 120, 40);
			//SCORE LABEL VALUES
			ScoreMessage.setBounds(100, 30, 300, 50);
			ScoreMessage.setFont(new Font("Verdana",5,15));
			//MERGE
			Final.add(ScoreMessage);
			Final.add(Quit);
			Final.add(Again);
			
		
			//ADDING ACTION LISTENER TO 'START' BUTTON
			StartB.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					CLay.show(Container, "MV");
				}		
			});	
			
				
			//ADDING ACTION LISTENER TO 'ConfirmMov' BUTTON, & OK AFTER CHOICE
			BoxSelected(ConfirmMov, Movies, Avengers, Infinity, EndGame, AgeUltron );
			ActionOnPanel(ConfirmMov, Mframe, Infinity, CLay, Container, "HS");
			
	
			//ADDING ACTION LISTENER TO 'ConfirmHis' BUTTON, & OK AFTER CHOICE
			BoxSelected(ConfirmHis, History, Ottoman, Roman, Chinese, Mongol);
			ActionOnPanel(ConfirmHis, Mframe, Ottoman, CLay, Container, "SCI");
			
			
			//ADDING ACTION LISTENER TO 'ConfirmSci' BUTTON, & OK AFTER CHOICE
			BoxSelected(ConfirmSci, Science, Amber, Lithium, Quartz, Diamond);
			ActionOnPanel(ConfirmSci, Mframe, Amber, CLay, Container, "GEO");
		
			
			//ADDING ACTION LISTENER TO 'ConfirmGeo' BUTTON, & OK AFTER CHOICE
			BoxSelected(ConfirmGeo, Geography, Norway, Sweeden, Denmark, Finland);
			ActionOnPanel(ConfirmGeo, Mframe, Norway, CLay, Container, "MUS");
	
			
			//ADDING ACTION LISTENER TO 'ConfirmMus' BUTTON, & OK AFTER CHOICE
			BoxSelected(ConfirmMus, Music, Spears, Gaga, Perry, Madonna);
			ActionOnPanel(ConfirmMus, Mframe, Spears, CLay, Container, "ART");
			
			
			//ADDING ACTION LISTENER TO 'ConfirmArt' BUTTON, & OK AFTER CHOICE
			BoxSelected(ConfirmArt, Art, VanGogh, Munch, Kandinsky, Meuller);
			ActionOnPanel(ConfirmArt, Mframe, Munch, CLay, Container, "TV");
			
			
			//ADDING ACTION LISTENER TO 'ConfirmTv' BUTTON, & OK AFTER CHOICE
			BoxSelected(ConfirmTv, Television, Roger, Priest, Negan, Logan);
			ActionOnPanel(ConfirmTv, Mframe, Negan, CLay, Container, "SP");
			
			
			//ADDING ACTION LISTENER TO 'ConfirmSports' BUTTON, & OK AFTER CHOICE
			BoxSelected(ConfirmSports, Sports, Gay, Powell, Phelps, Bolt);
			ActionOnPanel(ConfirmSports, Mframe, Phelps, CLay, Container, "PH");
			
			
			//ADDING ACTION LISTENER TO 'ConfirmPhilo' BUTTON, & OK AFTER CHOICE
			BoxSelected(ConfirmPhilo, Philo, Knowledge, Poetics, Cosmology, Methaphysics);
			ActionOnPanel(ConfirmPhilo, Mframe, Knowledge, CLay, Container, "LT");
			
			
			//ADDING ACTION LISTENER TO 'ConfirmLite' BUTTON, & OK AFTER CHOICE
			BoxSelected(ConfirmLite, Literature, Two, Three, Six, Twelve);
			ConfirmLite.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
						if(Three.isSelected()) {
							JOptionPane.showMessageDialog(Mframe, "That is correct!");
							Score = Score + 10;
							CorrectOnes = CorrectOnes + 1;			
						}
						else {
							JOptionPane.showMessageDialog(Mframe, "Sorry, wrong answer!");
						}
						CLay.show(Container, "FN");
						ScoreMessage.setText("<html>Score: "+ Score+"<br>Correct answers: "
								+ CorrectOnes + "</html");
				}
			});
			
			
			//ADDING ACTION LISTENER TO 'Quit' BUTTON
			Quit.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
						Mframe.dispose();
				}
			});
			
			
			//ADDING ACTION LISTENER TO 'Again' BUTTON
			Again.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
										
					MovGroup.clearSelection();
					HisGroup.clearSelection();
					GeoGroup.clearSelection();
					SciGroup.clearSelection();
					MusGroup.clearSelection();
					ArtGroup.clearSelection();
					TvGroup.clearSelection();
					SpGroup.clearSelection();
					PhGroup.clearSelection();
					LtGroup.clearSelection();
					
					Score = 0;
					CorrectOnes = 0;
					CLay.show(Container, "ST");
								
				}
			});
			
			
		}
			
			
		//THIS METHOD WORKS. MAKE AN EQUIVALENT BUT FOR BUTTON GROUP
		public static void AddBoxes(JPanel pan, ButtonGroup group, JCheckBox box1, JCheckBox box2, JCheckBox box3, JCheckBox box4) {
			pan.add(box1);
			pan.add(box2);
			pan.add(box3);
			pan.add(box4);
			group.add(box1);
			group.add(box2);
			group.add(box3);
			group.add(box4);
		}
		
		
		public static void BoxSelected(JButton ok, JPanel pan,JCheckBox box1, JCheckBox box2, JCheckBox box3, JCheckBox box4) {
			JCheckBox[] Boxes =  new JCheckBox[4];
			Boxes [0] = box1;
			Boxes [1] = box2;
			Boxes [2] = box3;
			Boxes [3] = box4;
			
			for (int i = 0; i<4; i++) {
					Boxes[i].addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent arg0) {
								pan.add(ok);
								pan.repaint();
						}	
					});
				}
	
		}
		
		
		public static void ActionOnPanel(JButton ok, JFrame f, JCheckBox b, CardLayout cl, JPanel con, String r) {
			
			ok.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
						if(b.isSelected()) {
							JOptionPane.showMessageDialog(f, "That is correct!");
							Score = Score + 10;
							CorrectOnes = CorrectOnes + 1;			
						}
						else {
							JOptionPane.showMessageDialog(f, "Sorry, wrong answer!");
						}
						cl.show(con, r);
				}
			});
			

		}
		
}


class GameFrame extends JFrame {

	public GameFrame() {
		setBounds(500,300,500,300);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}


class Cathegories extends JPanel{
	
	
	public Cathegories() {
		setLayout(null);
		setBounds(500,300,500,300);
		setVisible(true);
	}
}


class ConfirmButton extends JButton {
	
	public ConfirmButton() {
		
		setText("OK");
		setBounds(200, 200, 80, 40);
		setVisible(true);
	}
}


class Question extends JLabel{

	public Question(String q, int x, int y, int w, int h) {
		
		setBounds(x, y, w, h);
		setFont(new Font("Verdana",5,15));
		setText(q);
	}
}


class Options extends JCheckBox{
	
	public Options (String option, int x, int y, int w, int h) {
		setBounds(x, y, w, h);
		setText(option);
	}	
}
