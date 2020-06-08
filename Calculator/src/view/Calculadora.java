package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class Calculadora extends JFrame {
	
	private double result = 0;
	private String number = "0";
	private boolean decimal = false;
	private int positive = 1;
	private int op = 0;
	
	private JPanel contentPane;
	private JTextField display;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	// This method does all the operations
	private double doOperation(double result, String number, int op) {
		if(op == 1) {
			// Op 1 == Sum
			result = result + Float.valueOf(number);
			
		}else if(op == 2) {
			// Op 2 == Sub
			result = result - Float.valueOf(number);
			
		}else if(op == 3) {
			// Op 3 == Multiplication
			result = result * Float.valueOf(number);
			
		}else {
			// Op 4 == Division
			result = result / Float.valueOf(number);
			
		}
		
		return result;
	}

	/**
	 * Create the frame.
	 */
	public Calculadora() {
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 403, 565);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Segoe UI", Font.BOLD, 12));
		setJMenuBar(menuBar);
		
		JMenu mnOptions = new JMenu("Options");
		menuBar.add(mnOptions);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("About");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		mnOptions.add(mntmNewMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		display = new JTextField();
		display.setBackground(Color.WHITE);
		display.setEditable(false);
		display.setHorizontalAlignment(SwingConstants.CENTER);
		display.setFont(new Font("Arial", Font.PLAIN, 30));
		display.setBounds(10, 10, 370, 86);
		contentPane.add(display);
		display.setColumns(10);
		display.setText(number);
		
		JButton btnClear = new JButton("AC");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				op = 0;
				positive = 1;
				decimal = false;
				
				number = "0";
				display.setText(number);
			}
		});
		btnClear.setFont(new Font("Arial", Font.PLAIN, 18));
		btnClear.setBounds(10, 106, 85, 70);
		contentPane.add(btnClear);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!number.equals("0") && number.length() <= 10) {
					number = number + "0";
					display.setText(number);
				}
			}
		});
		btn0.setFont(new Font("Arial", Font.PLAIN, 18));
		btn0.setBounds(10, 426, 180, 70);
		contentPane.add(btn0);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(number.equals("0")) {
					number = "1";
				
				}else if(number.length() <= 10) {
					number = number + "1";
				}
				
				display.setText(number);
			}
		});
		btn1.setFont(new Font("Arial", Font.PLAIN, 18));
		btn1.setBounds(10, 346, 85, 70);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(number.equals("0")) {
					number = "2";
				
				}else if(number.length() <= 10) {
					number = number + "2";
				}
				
				display.setText(number);
			}
		});
		btn2.setFont(new Font("Arial", Font.PLAIN, 18));
		btn2.setBounds(105, 346, 85, 70);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(number.equals("0")) {
					number = "3";
				
				}else if(number.length() <= 10) {
					number = number + "3";
				}
				
				display.setText(number);
			}
		});
		btn3.setFont(new Font("Arial", Font.PLAIN, 18));
		btn3.setBounds(200, 346, 85, 70);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(number.equals("0")) {
					number = "4";
				
				}else if(number.length() <= 10) {
					number = number + "4";
				}
				
				display.setText(number);
			}
		});
		btn4.setFont(new Font("Arial", Font.PLAIN, 18));
		btn4.setBounds(10, 266, 85, 70);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(number.equals("0")) {
					number = "5";
				
				}else if(number.length() <= 10) {
					number = number + "5";
				}
				
				display.setText(number);
			}
		});
		btn5.setFont(new Font("Arial", Font.PLAIN, 18));
		btn5.setBounds(105, 266, 85, 70);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(number.equals("0")) {
					number = "6";
				
				}else if(number.length() <= 10) {
					number = number + "6";
				}
				
				display.setText(number);
			}
		});
		btn6.setFont(new Font("Arial", Font.PLAIN, 18));
		btn6.setBounds(200, 266, 85, 70);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(number.equals("0")) {
					number = "7";
				
				}else if(number.length() <= 10) {
					number = number + "7";
				}
				
				display.setText(number);
			}
		});
		btn7.setFont(new Font("Arial", Font.PLAIN, 18));
		btn7.setBounds(10, 186, 85, 70);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(number.equals("0")) {
					number = "8";
				
				}else if(number.length() <= 10) {
					number = number + "8";
				}
				
				display.setText(number);
			}
		});
		btn8.setFont(new Font("Arial", Font.PLAIN, 18));
		btn8.setBounds(105, 186, 85, 70);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(number.equals("0")) {
					number = "9";
				
				}else if(number.length() <= 10) {
					number = number + "9";
				}
				
				display.setText(number);
			}
		});
		btn9.setFont(new Font("Arial", Font.PLAIN, 18));
		btn9.setBounds(200, 186, 85, 70);
		contentPane.add(btn9);		
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!number.equals("0")) {
					// Caso já tenha sido feita uma operação antes
					if(op != 0) {
						result = doOperation(result, number, op);
						
					}else {
						// Fazendo o Cast de String para Float
						result = Float.valueOf(display.getText());
					}
					
					number = "0";
					positive = 1;
					decimal = false;
					op = 1;
					
					display.setText(number);
				}
			}
		});
		btnPlus.setFont(new Font("Arial", Font.PLAIN, 18));
		btnPlus.setBounds(295, 346, 85, 70);
		contentPane.add(btnPlus);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!number.equals("0")) {
					// Caso já tenha sido feita uma operação antes
					if(op != 0) {
						result = doOperation(result, number, op);
						
					}else {
						// Fazendo o Cast de String para Float
						result = Float.valueOf(display.getText());
					}
					
					number = "0";
					positive = 1;
					decimal = false;
					op = 2;
					
					display.setText(number);
				}
			}
		});
		btnSub.setFont(new Font("Arial", Font.PLAIN, 18));
		btnSub.setBounds(295, 266, 85, 70);
		contentPane.add(btnSub);
		
		JButton btnMultiply = new JButton("*");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!number.equals("0")) {
					// Caso já tenha sido feita uma operação antes
					if(op != 0) {
						result = doOperation(result, number, op);
						
					}else {
						// Fazendo o Cast de String para Float
						result = Float.valueOf(display.getText());
					}
					
					number = "0";
					positive = 1;
					decimal = false;
					op = 3;
					
					display.setText(number);
				}
			}
		});
		btnMultiply.setFont(new Font("Arial", Font.PLAIN, 18));
		btnMultiply.setBounds(295, 186, 85, 70);
		contentPane.add(btnMultiply);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!number.equals("0")) {
					// Caso já tenha sido feita uma operação antes
					if(op != 0) {
						result = doOperation(result, number, op);
						
					}else {
						// Fazendo o Cast de String para Float
						result = Float.valueOf(display.getText());
					}
					
					number = "0";
					positive = 1;
					decimal = false;
					op = 4;
					
					display.setText(number);
				}
			}
		});
		btnDivide.setFont(new Font("Arial", Font.PLAIN, 18));
		btnDivide.setBounds(295, 106, 85, 70);
		contentPane.add(btnDivide);
		
		JButton btnPoint = new JButton(".");
		btnPoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!decimal && number.length() <= 9) {
					number = number + ".";
					display.setText(number);
					
					decimal = true;
				}
			}
		});
		btnPoint.setFont(new Font("Arial", Font.PLAIN, 18));
		btnPoint.setBounds(200, 426, 85, 70);
		contentPane.add(btnPoint);
		
		JButton btnSignal = new JButton("+/-");
		btnSignal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!number.equals("0")) {
					if(positive == 1) {
						number = "-" + number;
					
					}else {
						number = number.substring(1, number.length());
					}
					
					positive = positive * -1;
					display.setText(number);
				}
			}
		});
		btnSignal.setFont(new Font("Arial", Font.PLAIN, 18));
		btnSignal.setBounds(105, 106, 85, 70);
		contentPane.add(btnSignal);
		
		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPercent.setFont(new Font("Arial", Font.PLAIN, 18));
		btnPercent.setBounds(200, 106, 85, 70);
		contentPane.add(btnPercent);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(op != 0) {
					number = "" + doOperation(result, number, op);
					
					if(number.length() >= 3) {
						if(number.charAt(number.length() - 2) == '.' && number.charAt(number.length() - 1) == '0') {
							number = number.substring(0, number.length() - 2);
						}
					}
					
					display.setText(number);
					
					// Resetting the operation variable
					op = 0;
				}
			}
		});
		btnEqual.setFont(new Font("Arial", Font.PLAIN, 18));
		btnEqual.setBounds(295, 426, 85, 70);
		contentPane.add(btnEqual);
	}
}
