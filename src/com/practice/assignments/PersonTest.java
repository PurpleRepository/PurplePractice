package com.practice.assignments;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PersonTest extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1671148288124342702L;
	protected JTextField textField;
	protected JLabel textLabel, personLabel, personName, personAge, message;
	protected JButton addButton, subButton;

	Person person = new Person("Ram", "V", 56);

	Integer i = 5;

	public void testVarArgs(String str, int... x) {
		System.out.println(x[0]);// TODO:Array index out of boundary exception
		System.out.println(x[1]);
	}

	public PersonTest() {
		super("Person Age Test");
		testVarArgs("1");

		Person one = new Person();
		Person two = new Person("Test1", "Test", 12);
		Person[] persons = { one };

		// i++;

		Container contentPane = getContentPane();
		setSize(550, 150);
		personLabel = new JLabel("Person Details:");
		personName = new JLabel("Person Name: " + person.getFirstName());
		personAge = new JLabel(", Person Age: " + person.getAge());
		textLabel = new JLabel("Enter Age:");
		message = new JLabel();
		textField = new JTextField(10);
		addButton = new JButton("Add Age");
		subButton = new JButton("Substract Age");

		textField.addActionListener(this);
		addButton.addActionListener(this);
		subButton.addActionListener(this);

		JPanel panel1 = new JPanel();
		panel1.setLayout(new FlowLayout());
		panel1.add(personLabel);
		panel1.setLayout(new FlowLayout());
		panel1.add(personName);
		panel1.add(personAge);

		JPanel panel2 = new JPanel();
		panel2.setLayout(new FlowLayout());
		panel2.add(textLabel);
		panel2.add(textField);
		panel2.add(addButton);
		panel2.add(subButton);
		panel2.add(message);
		// Get the content pane and set it up.

		contentPane.add(panel1, BorderLayout.NORTH);
		contentPane.add(panel2, BorderLayout.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();

		if (obj == addButton || obj == subButton) {
			message.setText("");
			try {
				if (obj == addButton) {
					int addAge = Integer.valueOf(textField.getText());
					person.addPersonAge(addAge);
				} else if (obj == subButton) {
					int subAge = Integer.valueOf(textField.getText());
					person.substractPersonAge(subAge);
				}
				personAge.setText(", Person New Age: " + String.valueOf(person.getAge()));
			} catch (Exception ex) {
				if (ex instanceof NumberFormatException) {
					if (textField.getText().isEmpty()) {
						if (obj == addButton) {
							message.setText("Please enter age to add to person's age.");
						} else {
							message.setText("Please enter age to substract from person's age.");
						}
					} else {
						message.setText(textField.getText() + " is not valid age, Please enter the valid age");
					}

				} else {
					personAge.setText(", Person New Age: " + String.valueOf(person.getAge()));
					message.setText(ex.toString());

				}
			}
		}

	}

	public static void main(String[] args) throws MyException {

		PersonTest frame = new PersonTest();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
