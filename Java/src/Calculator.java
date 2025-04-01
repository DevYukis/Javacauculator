import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return a / b;
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public double squareRoot(double value) {
        if (value < 0) {
            throw new IllegalArgumentException("Cannot take the square root of a negative number.");
        }
        return Math.sqrt(value);
    }

    public double sine(double angle) {
        return Math.sin(Math.toRadians(angle));
    }

    public double cosine(double angle) {
        return Math.cos(Math.toRadians(angle));
    }

    public double tangent(double angle) {
        return Math.tan(Math.toRadians(angle));
    }

    public double logarithm(double value) {
        if (value <= 0) {
            throw new IllegalArgumentException("Cannot take the logarithm of a non-positive number.");
        }
        return Math.log(value);
    }

    public double evaluate(String expression) {
        // Use o Exp4j para avaliar a expressão
        Expression exp = new ExpressionBuilder(expression).build();
        return exp.evaluate();
    }
}