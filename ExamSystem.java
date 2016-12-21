import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 * 
 */

/**
 * @author Limo C.N
 *
 */
public class ExamSystem extends JFrame {
	private static JLabel subl = new JLabel("SUBJECT");
	private static JLabel catl = new JLabel("CATS");
	private static JLabel exal = new JLabel("EXAM");
	private static JLabel totl = new JLabel("TOTAL");
	private static JLabel gradl = new JLabel("GRADE");
	private static JLabel comml = new JLabel("COMMENT");
	// private static JLabel phyl;

	private JTextField catm = new JTextField(20);
	private JTextField cate = new JTextField(20);
	private JTextField cats = new JTextField(20);
	private JTextField catg = new JTextField(20);
	private JTextField catb = new JTextField(20);
	private JTextField catcm = new JTextField(20);
	private JTextField catp = new JTextField(20);

	private JTextField exm = new JTextField(20);
	private JTextField exe = new JTextField(20);
	private JTextField exs = new JTextField(20);
	private JTextField exg = new JTextField(20);
	private JTextField exb = new JTextField(20);
	private JTextField excm = new JTextField(20);
	private JTextField exp = new JTextField(20);

	// total
	private static JLabel mtl = new JLabel();
	private static JLabel etl = new JLabel();
	private static JLabel stl = new JLabel();
	private static JLabel gtl = new JLabel();
	private static JLabel btl = new JLabel();
	private static JLabel ctl = new JLabel();
	private static JLabel ptl = new JLabel();

	// Grade
	private static JLabel mgtl = new JLabel();
	private static JLabel egl = new JLabel();
	private static JLabel swgl = new JLabel();
	private static JLabel ggl = new JLabel();
	private static JLabel bigl = new JLabel();
	private static JLabel chegl = new JLabel();
	private static JLabel pgl = new JLabel();

	// Comment
	private static JLabel mcl = new JLabel();
	private static JLabel ecl = new JLabel();
	private static JLabel ksl = new JLabel();
	private static JLabel gcl = new JLabel();
	private static JLabel bcl = new JLabel();
	private static JLabel ccl = new JLabel();
	private static JLabel pcl = new JLabel();

	private static JLabel mathl = new JLabel("Mathematic");
	private static JLabel engl = new JLabel("Englis");
	private static JLabel swal = new JLabel("Kiswahili");
	private static JLabel geol = new JLabel("Geography");
	private static JLabel biol = new JLabel("Biology");
	private static JLabel cheml = new JLabel("Chemistry");
	private static JLabel phyl = new JLabel("Physics");

	private JButton compute = new JButton("Compute");
	private JButton clear = new JButton("clear");
	private JButton exit = new JButton("Exit");

	public ExamSystem() {
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(8, 6, 5, 5));
		p.setBorder(new TitledBorder("Enter The marks of the student, compute total, grade an autogenerate comment"));

		// title row
		p.add(subl);
		p.add(catl);
		p.add(exal);
		p.add(totl);
		p.add(gradl);
		p.add(comml);
		/*
		 * p.add(chem); p.add(phy);
		 */

		// Math row
		p.add(mathl);
		p.add(catm);
		p.add(exm);
		p.add(mtl);
		p.add(mgtl);
		p.add(mcl);

		// english row
		p.add(engl);
		p.add(cate);
		p.add(exe);
		p.add(etl);
		p.add(egl);
		p.add(ecl);

		// swahili row
		p.add(swal);
		p.add(cats);
		p.add(exs);
		p.add(stl);
		p.add(swgl);
		p.add(ksl);

		// geo row
		p.add(geol);
		p.add(catg);
		p.add(exg);
		p.add(gtl);
		p.add(ggl);
		p.add(gcl);

		// bio row
		p.add(biol);
		p.add(catb);
		p.add(exb);
		p.add(btl);
		p.add(bigl);
		p.add(bcl);

		// chem row
		p.add(cheml);
		p.add(catcm);
		p.add(excm);
		p.add(ctl);
		p.add(chegl);
		p.add(ccl);

		p.add(phyl);
		p.add(catp);
		p.add(exp);
		p.add(ptl);
		p.add(pgl);
		p.add(pcl);

		add(p, BorderLayout.CENTER);

		// repaint();

		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout());
		buttonPanel.add(compute);
		buttonPanel.add(clear);
		buttonPanel.add(exit);

		
		//coloring
		buttonPanel.setBackground(Color.decode("#CCFF33"));
		exit.setBackground(Color.red);
		compute.setBackground(Color.CYAN);
		clear.setBackground(Color.green);
		add(buttonPanel, BorderLayout.SOUTH);
		
		exit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				JOptionPane.showMessageDialog(null, "Exit the application?","Exit",JOptionPane.OK_OPTION);
			
				System.exit(0);
			}
		});
		
		clear.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				catm.setText(null);
				exm.setText(null);
				mtl.setText(null);
				mgtl.setText(null);
				mcl.setText(null);
				
				cate.setText(null);
				exe.setText(null);
				etl.setText(null);
				egl.setText(null);
				ecl.setText(null);
				
				cats.setText(null);
				exs.setText(null);
				stl.setText(null);
				swgl.setText(null);
				ksl.setText(null);
				
				catg.setText(null);
				exg.setText(null);
				gtl.setText(null);
				ggl.setText(null);
				gcl.setText(null);
				
				catb.setText(null);
				exb.setText(null);
				btl.setText(null);
				bigl.setText(null);
				bcl.setText(null);

				catcm.setText(null);
				excm.setText(null);
				ctl.setText(null);
				chegl.setText(null);
				ccl.setText(null);
				
			catp.setText(null);
			exp.setText(null);
			ptl.setText(null);
			pgl.setText(null);
			pcl.setText(null);

			}
		});

		// computing the results with buttons
		compute.addActionListener(new ButtonListener());
	}

	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
try {
			double mcat = Double.parseDouble(catm.getText());
			double mex = Double.parseDouble(exm.getText());
			if(mcat>40||mcat<0){
                JOptionPane.showMessageDialog(null,"Mathematics CAT mark should range between 1-40","Error",JOptionPane.CANCEL_OPTION);
            }
          else  if(mex>60||mex<0){
                    JOptionPane.showMessageDialog(null," Mathematics EXAM mark should be between 41-60","Error",JOptionPane.CANCEL_OPTION);
                }
          else{
			double mtot = mcat + mex;
			mtl.setText(Double.toString(mtot));
			
			
			String grade=Grade(mtot);
			mgtl.setText(grade);
			String comment=Comment(mtot);
			mcl.setText(comment);
			
			}
          
			
			//for english
			double engcat=Double.parseDouble(cate.getText());
			double engex=Double.parseDouble(exe.getText());
			
			if(engcat>40||engcat<0){
                JOptionPane.showMessageDialog(null,"English CAT mark should range between 1-40","Error",JOptionPane.CANCEL_OPTION);
            }
          else  if(engex>60||engex<0){
                    JOptionPane.showMessageDialog(null," English EXAM mark should be between 41-60","Error",JOptionPane.CANCEL_OPTION);
                }
          else{
			double engtot=engcat+engex;
			etl.setText(Double.toString(engtot));
			
			//grading,comments
			String grade=Grade(engtot);
			egl.setText(grade);
			String comment=Comment(engtot);
			ecl.setText(comment);
			
          }
			
			//for swahili
			double kiscat=Double.parseDouble(cats.getText());
			double kisexm=Double.parseDouble(exs.getText());
			if(kiscat>40||kiscat<0){
                JOptionPane.showMessageDialog(null,"Swahili CAT mark should range between 1-40","Error",JOptionPane.CANCEL_OPTION);
            }
          else  if(kisexm>60||kisexm<0){
                    JOptionPane.showMessageDialog(null,"Swahili EXAM mark should be between 41-60","Error",JOptionPane.CANCEL_OPTION);
                }
          else{
			double kistot=kiscat+kisexm;
			stl.setText(Double.toString(kistot));
			String grade=Grade(kistot);
			swgl.setText(grade);
			String comment=Comment(kistot);
			ksl.setText(comment);
          }
			
			//geo
			double gcat=Double.parseDouble(catg.getText());
			double gex=Double.parseDouble(exg.getText());
			if(gcat>40||gcat<0){
                JOptionPane.showMessageDialog(null," Geography CAT mark should range between 1-40","Error",JOptionPane.CANCEL_OPTION);
            }
          else  if(gex>60||gex<0){
                    JOptionPane.showMessageDialog(null," Geography EXAM mark should be between 41-60","Error",JOptionPane.CANCEL_OPTION);
                }
          else{
			double gtot=gcat+gex;
			gtl.setText(Double.toString(gtot));
			//grade , comment
			String grade=Grade(gtot);
			ggl.setText(grade);
			String comment=Comment(gtot);
			gcl.setText(comment);
			
          }

			//bio
			double bcat=Double.parseDouble(catb.getText());
			double bex=Double.parseDouble(exb.getText());
			if(bcat>40||bcat<0){
                JOptionPane.showMessageDialog(null," Biology CAT mark should range between 1-40","Error",JOptionPane.CANCEL_OPTION);
            }
          else  if(bex>60||bex<0){
                    JOptionPane.showMessageDialog(null,"Biology EXAM mark should be between 41-60","Error",JOptionPane.CANCEL_OPTION);
                }
          else{
			double btot=bcat+bex;
          
			btl.setText(Double.toString(btot));
			//grade and comment
			String grade=Grade(btot);
			bigl.setText(grade);
			String comment=Comment(btot);
			bcl.setText(comment);
          }
			
			//chem
			double ccat=Double.parseDouble(catcm.getText());
			double chex=Double.parseDouble(excm.getText());
			
			if(ccat>40||ccat<0){
                JOptionPane.showMessageDialog(null,"Chemistry CAT mark should range between 1-40","Error",JOptionPane.CANCEL_OPTION);
            }
          else  if(chex>60||chex<0){
                    JOptionPane.showMessageDialog(null," Chemistry EXAM mark should be between 41-60","Error",JOptionPane.CANCEL_OPTION);
                }
          else{
			double chtot=ccat+chex;
			ctl.setText(Double.toString(chtot));
			//grade and comment
			String grade=Grade(chtot);
			chegl.setText(grade);
			String comment=Comment(chtot);
			ccl.setText(comment);
          }
			
			//physics
			double pcat=Double.parseDouble(catp.getText());
			double pex=Double.parseDouble(exp.getText());
			
			if(pcat>40||pcat<0){
                JOptionPane.showMessageDialog(null," Physics CAT mark should range between 1-40","Error",JOptionPane.CANCEL_OPTION);
            }
          else  if(pex>60||pex<0){
                    JOptionPane.showMessageDialog(null," Physics EXAM mark should be between 0-60","Error",JOptionPane.CANCEL_OPTION);
                }
          else{
			double ptot=pcat+pex;
			ptl.setText(Double.toString(ptot));
			//grade and comment
			String grade=Grade(ptot);
			pgl.setText(grade);
			String comment=Comment(ptot);
			pcl.setText(comment);
			//end
			
			}
	}
catch(NumberFormatException error){
    JOptionPane.showMessageDialog(null," Empty fields or Wrong input data","Error",JOptionPane.ERROR_MESSAGE);

}
	}
		
	}
	
	
	private String Grade(double total){
		if(total>=80){return "A";}
		else if(total>=75 && total<80){return "A-";}
		else if(total>=70 &&total<75){return "B+";}
		else if(total>=65 && total<70){return "B";}
		else if(total>=60 && total<65){return "B-";}
		else if(total>=55 && total<60){return "C+";}
		else if(total>=50 &&total<55){return "C";}
		else if(total>=45 && total<50){return "C-";}
		else if(total>=40 && total<45){return "D+";}
		else if(total>=35 && total<40){return "D";}
		else if(total>=30 &&total<35){return "D-";}
		else if(total>=25 && total<30){return "E";}
		else {return "F";}
		
	}
	
	private String Comment(double total){
		if(total>=80){return "Excellent";}
		else if(total>70 && total<80){
			return "V.Good";
		}
		else if(total>=60 && total<70){
			return "Good";
		}
		else if(total>=50 && total<60){
			return "Fairly done";
		}
		else if(total>=40 && total<50){
			return "Better";
		}
		else if(total >=20&& total<40){
			return "Poor";
		}
		else {
			return "Very Poor";
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExamSystem exam = new ExamSystem();
		exam.setTitle("Exam System");
		exam.setSize(800, 500);
		exam.setResizable(false);
		exam.setLocationRelativeTo(null);
		exam.setVisible(true);
		//exam.pack();
		exam.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

