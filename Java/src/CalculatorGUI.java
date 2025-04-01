import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI {
    private Calculator calculator;

    public CalculatorGUI() {
        calculator = new Calculator();
        createAndShowGUI();
    }

    private void createAndShowGUI() {
        JFrame frame = new JFrame("Scientific Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 600);

        // Create a text field for input and output
        JTextField inputField = new JTextField();
        inputField.setFont(new Font("Arial", Font.PLAIN, 20));
        inputField.setHorizontalAlignment(JTextField.RIGHT);

        // Create a panel for buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4, 5, 5));

        // Button labels
        String[] buttons = {
            "7", "8", "9", "/", "sqrt",
            "4", "5", "6", "*", "log",
            "1", "2", "3", "-", "sin",
            "0", ".", "=", "+", "cos",
            "(", ")", "C", "tan", "^"
        };

        // Add buttons to the panel
        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 18));
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String command = e.getActionCommand();
                    try {
                        if (command.equals("=")) {
                            String expression = inputField.getText();
                            double result = calculator.evaluate(expression);
                            inputField.setText(String.valueOf(result));
                        } else if (command.equals("C")) {
                            inputField.setText("");
                        } else if (command.equals("sqrt")) {
                            double value = Double.parseDouble(inputField.getText());
                            inputField.setText(String.valueOf(calculator.squareRoot(value)));
                        } else if (command.equals("log")) {
                            double value = Double.parseDouble(inputField.getText());
                            inputField.setText(String.valueOf(calculator.logarithm(value)));
                        } else if (command.equals("sin")) {
                            double value = Double.parseDouble(inputField.getText());
                            inputField.setText(String.valueOf(calculator.sine(value)));
                        } else if (command.equals("cos")) {
                            double value = Double.parseDouble(inputField.getText());
                            inputField.setText(String.valueOf(calculator.cosine(value)));
                        } else if (command.equals("tan")) {
                            double value = Double.parseDouble(inputField.getText());
                            inputField.setText(String.valueOf(calculator.tangent(value)));
                        } else {
                            inputField.setText(inputField.getText() + command);
                        }
                    } catch (NumberFormatException ex) {
                        inputField.setText("Invalid Input");
                    } catch (Exception ex) {
                        inputField.setText("Error");
                    }
                }
            });
            buttonPanel.add(button);
        }

        // Add components to the frame
        frame.setLayout(new BorderLayout());
        frame.add(inputField, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.CENTER);

        // Show the frame
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CalculatorGUI());
    }
}