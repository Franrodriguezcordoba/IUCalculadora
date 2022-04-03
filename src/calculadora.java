import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.NoSuchElementException;
import java.awt.event.ActionEvent;

public class calculadora {

	private JFrame frame;
	private JTextField txt;
	private JTextField txt1;

	double first;
	double second;
	String operation;
	double result;
	String answer;
	private calc calculadora;
	boolean Primo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculadora window = new calculadora();
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
	public calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 279, 383);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		txt = new JTextField();
		txt.setBounds(41, 29, 182, 19);
		frame.getContentPane().add(txt);
		txt.setColumns(10);

		JButton buttonB = new JButton("B");
		buttonB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				if (txt.getText().length() > 0) {
					StringBuilder str = new StringBuilder(txt.getText());
					str.deleteCharAt(txt.getText().length() - 1);
					backSpace = str.toString();
					txt.setText(backSpace);
				}
				if (txt1.getText().length() > 0) {
					StringBuilder str = new StringBuilder(txt1.getText());
					str.deleteCharAt(txt1.getText().length() - 1);
					backSpace = str.toString();
					txt1.setText(backSpace);
				}
			}
		});
		buttonB.setBounds(10, 58, 50, 40);
		frame.getContentPane().add(buttonB);

		JButton buttonC = new JButton("C");
		buttonC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt.setText("");
				txt1.setText("");

			}
		});
		buttonC.setBounds(67, 58, 50, 40);
		frame.getContentPane().add(buttonC);

		JButton button00 = new JButton("00");
		button00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txt.getText() + button00.getText();
				String oper = txt1.getText() + button00.getText();
				txt.setText(number);
				txt1.setText(oper);
			}
		});
		button00.setBounds(133, 58, 50, 40);
		frame.getContentPane().add(button00);

		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txt.getText() + button7.getText();
				String oper = txt1.getText() + button7.getText();
				txt.setText(number);
				txt1.setText(oper);
			}
		});
		button7.setBounds(10, 108, 50, 40);
		frame.getContentPane().add(button7);

		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txt.getText() + button4.getText();
				String oper = txt1.getText() + button4.getText();
				txt.setText(number);
				txt1.setText(oper);
			}
		});
		button4.setBounds(10, 153, 50, 40);
		frame.getContentPane().add(button4);

		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txt.getText() + button1.getText();
				String oper = txt1.getText() + button1.getText();
				txt.setText(number);
				txt1.setText(oper);
			}
		});
		button1.setBounds(10, 203, 50, 40);
		frame.getContentPane().add(button1);

		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txt.getText() + button0.getText();
				String oper = txt1.getText() + button0.getText();
				txt.setText(number);
				txt1.setText(oper);
			}
		});
		button0.setBounds(10, 255, 50, 40);
		frame.getContentPane().add(button0);

		JButton buttonSuma = new JButton("+");
		buttonSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String oper = txt1.getText() + buttonSuma.getText();
				txt1.setText(oper);
				first = Double.parseDouble(txt.getText());
				txt.setText("");
				operation = "+";
			}
		});
		buttonSuma.setBounds(203, 58, 50, 40);
		frame.getContentPane().add(buttonSuma);

		JButton buttonResta = new JButton("-");
		buttonResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txt.getText().length() == 0) {

					String oper = txt1.getText() + buttonResta.getText();
					txt1.setText(oper);
					txt.setText("-");
				} else {
					String oper = txt1.getText() + buttonResta.getText();
					txt1.setText(oper);
					first = Double.parseDouble(txt.getText());
					txt.setText("");
					operation = "-";

				}
			}
		});
		buttonResta.setBounds(203, 108, 50, 40);
		frame.getContentPane().add(buttonResta);

		JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txt.getText() + button9.getText();
				String oper = txt1.getText() + button9.getText();
				txt.setText(number);
				txt1.setText(oper);
			}
		});
		button9.setBounds(133, 108, 50, 40);
		frame.getContentPane().add(button9);

		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txt.getText() + button8.getText();
				String oper = txt1.getText() + button8.getText();
				txt.setText(number);
				txt1.setText(oper);
			}
		});
		button8.setBounds(67, 108, 50, 40);
		frame.getContentPane().add(button8);

		JButton buttonMult = new JButton("*");
		buttonMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String oper = txt1.getText() + buttonMult.getText();
				txt1.setText(oper);
				first = Double.parseDouble(txt.getText());
				txt.setText("");
				operation = "*";
			}
		});
		buttonMult.setBounds(203, 153, 50, 40);
		frame.getContentPane().add(buttonMult);

		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txt.getText() + button6.getText();
				String oper = txt1.getText() + button6.getText();
				txt.setText(number);
				txt1.setText(oper);
			}
		});
		button6.setBounds(133, 153, 50, 40);
		frame.getContentPane().add(button6);

		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txt.getText() + button5.getText();
				String oper = txt1.getText() + button5.getText();
				txt.setText(number);
				txt1.setText(oper);
			}
		});
		button5.setBounds(67, 153, 50, 40);
		frame.getContentPane().add(button5);

		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txt.getText() + button2.getText();
				String oper = txt1.getText() + button2.getText();
				txt.setText(number);
				txt1.setText(oper);
			}
		});
		button2.setBounds(67, 203, 50, 40);
		frame.getContentPane().add(button2);

		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = txt.getText() + button3.getText();
				String oper = txt1.getText() + button3.getText();
				txt.setText(number);
				txt1.setText(oper);
			}
		});
		button3.setBounds(133, 203, 50, 40);
		frame.getContentPane().add(button3);

		JButton buttonDiv = new JButton("/");
		buttonDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String oper = txt1.getText() + buttonDiv.getText();
				txt1.setText(oper);
				first = Double.parseDouble(txt.getText());
				txt.setText("");
				operation = "/";
			}
		});
		buttonDiv.setBounds(203, 203, 50, 40);
		frame.getContentPane().add(buttonDiv);

		JButton buttonFact = new JButton("n!");
		buttonFact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					calculadora = new calc();
					String oper = txt1.getText() + buttonFact.getText();
					txt1.setText(oper);
					first = Double.parseDouble(txt.getText());

					result = calculadora.fact((int) first);
					answer = String.valueOf(result);
					txt.setText(answer);

				} catch (NumberFormatException ex) {
					txt.setText("Inserte un nº");
				} catch (IllegalArgumentException ex) {
					txt.setText("Nº negativos no válidos ni mayores de 14");
				}

			}
		});
		buttonFact.setBounds(203, 255, 50, 40);
		frame.getContentPane().add(buttonFact);

		JButton buttonPrimo = new JButton("Primo");
		buttonPrimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (!txt.getText().contains(".")) {
						calculadora = new calc();
						first = Double.parseDouble(txt.getText());
						Primo = calculadora.esPrimo((int) first);

						if (Primo == false) {
							answer = "No es un nº primo";
						} else {
							answer = "Es un nº primo";
						}

					} else {
						answer = "Solo numeros enteros";
					}

					txt.setText(answer);

					
				} 
				catch (NumberFormatException nfe) {
					txt.setText("Introduce un nº");
				}
				
			}
		});
		buttonPrimo.setBounds(133, 255, 60, 40);
		frame.getContentPane().add(buttonPrimo);

		JButton buttonPot = new JButton(".");
		buttonPot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!txt.getText().contains(".")) {
					String number = txt.getText() + buttonPot.getText();
					String oper = txt1.getText() + buttonPot.getText();
					txt.setText(number);
					txt1.setText(oper);

				}

			}
		});
		buttonPot.setBounds(67, 255, 50, 40);
		frame.getContentPane().add(buttonPot);

		JButton buttonEqual = new JButton("=");
		buttonEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				calculadora = new calc();
				String oper = txt1.getText() + buttonEqual.getText();
				txt1.setText(oper);
				second = Double.parseDouble(txt.getText());
				if (operation == "+") {
					result = calculadora.suma(first, second);
					answer = String.valueOf(result);
					txt.setText(answer);

				} else if (operation == "-") {
					result = calculadora.resta(first, second);
					answer = String.valueOf(result);
					txt.setText(answer);

				} else if (operation == "*") {
					result = calculadora.mult(first, second);
					answer = String.valueOf(result);
					txt.setText(answer);

				} else if (operation == "/") {
					try {
						result = calculadora.divide(first, second);
						answer = String.valueOf(result);
						txt.setText(answer);
					} catch (ArithmeticException ae) {

						txt.setText("No se puede dividir entre 0");
					}
				}
				txt1.setText("");
			}
		});
		buttonEqual.setBounds(10, 305, 236, 30);
		frame.getContentPane().add(buttonEqual);

		txt1 = new JTextField();
		txt1.setBounds(127, 0, 96, 19);
		frame.getContentPane().add(txt1);
		txt1.setColumns(10);
	}
}
