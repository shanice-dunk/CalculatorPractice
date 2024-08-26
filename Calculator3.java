import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// YouTube tutorial 
public class Calculator3 implements ActionListener{
    
    // Frame for the calculator
    JFrame frame;
    // Text field that holds numbers typed in and result
    JTextField textField;
    // Number buttons
    JButton[] numerberedButtons = new JButton[10];
    // Operation buttons
    JButton[] functionButtons = new JButton[8];
    // Operations
    JButton addButton,subButton,mulButton,divButton;
    JButton decimalButton,equButton,delButton,clrButton;
    JPanel panel;

    // Font for the calculator
    Font myFont = new Font("Ink Free", Font.BOLD, 30);

    // Numbers selected 
    double num1=0,num2=0,result=0;
    // Operator selected 
    char operator;

    Calculator3() {
        // Methods for frame of calculator
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 500);
        frame.setLayout(null);

        // Methods for the text field
        textField = new JTextField();
        textField.setBounds(50, 25, 300, 50);
        textField.setFont(myFont);
        textField.setEditable(false);

        // Methods for the buttons
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decimalButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("Delete");
        clrButton = new JButton("Clear");

        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = decimalButton;
        functionButtons[5] = equButton;
        functionButtons[6] = delButton;
        functionButtons[7] = clrButton;

        // for loop for functionButtons
        for(int i = 0; i < 8; i++) {
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(myFont);
            functionButtons[i].setFocusable(false);
        }

        // for loop for number buttons
        for(int i = 0; i < 10; i++) {
            numerberedButtons[i] = new JButton(String.valueOf(i));
            numerberedButtons[i].addActionListener(this);
            numerberedButtons[i].setFont(myFont);
            numerberedButtons[i].setFocusable(false);

        }

        // Delete and clear buttons sizes within calculator
        delButton.setBounds(50, 430, 145, 50);
        clrButton.setBounds(205, 430, 145, 50);

        // Panel within calculator that stores the numbers and functions
        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        panel.setBackground(Color.GRAY);

        // Creating the buttons
        panel.add(numerberedButtons[1]);
        panel.add(numerberedButtons[2]);
        panel.add(numerberedButtons[3]);
        panel.add(addButton);
        panel.add(numerberedButtons[4]);
        panel.add(numerberedButtons[5]);
        panel.add(numerberedButtons[6]);
        panel.add(subButton);
        panel.add(numerberedButtons[7]);
        panel.add(numerberedButtons[8]);
        panel.add(numerberedButtons[9]);
        panel.add(mulButton);
        panel.add(decimalButton);
        panel.add(numerberedButtons[0]);
        panel.add(equButton);
        panel.add(divButton);

        // Adding to the frame
        frame.add(panel);
        frame.add(delButton);
        frame.add(clrButton);
        frame.add(textField);
        frame.setVisible(true);
        
    }
    public static void main(String[] args) {
        Calculator3 cacl = new Calculator3();
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        // for loop for clicking buttons
        for(int i = 0; i < 10; i++) {
            // Number buttons
            if(e.getSource() == numerberedButtons[i]) {
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        // Decimal button
        if(e.getSource() == decimalButton) {
            textField.setText(textField.getText().concat("."));
        }
        // Add button
        if(e.getSource() == addButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '+';
            textField.setText("");
        }
        // Subtraction button
        if(e.getSource() == subButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
        }
        // Multiply button
        if(e.getSource() == mulButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");
        }
        // Divide button
        if(e.getSource() == divButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText("");
        }
        // Equals button
        if(e.getSource() == equButton) {
            num2 = Double.parseDouble(textField.getText());
        // Switch statement for what mathmatical will be performed 
        switch(operator) {
            // add two numbers
            case '+':
                result = num1 + num2;
                break;
            // subtract two numbers
            case '-':
                result = num1 - num2;
                break;
            // multiply two numbers
            case '*':
                result = num1 * num2;
                break;
            // divide two numbers
            case '/':
                result = num1 / num2;
                break;
        } 
            // To use the result from the calculation 
            textField.setText(String.valueOf(result));
            num1 = result;
        }

        // Clear button
        if(e.getSource() == clrButton) {
            textField.setText("");
        }
        // Delete button
        if(e.getSource() == delButton) {
            String string = textField.getText();
            textField.setText("");
            for(int j = 0; j < string.length() - 1; j++) {
                textField.setText(textField.getText() + string.charAt(j));
            }
        }
    }
}

}
