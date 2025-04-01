using System;

namespace CalculatorApp.Utils
{
    public static class MathFormulas
    {
        public static double Add(double a, double b)
        {
            return a + b;
        }

        public static double Subtract(double a, double b)
        {
            return a - b;
        }

        public static double Multiply(double a, double b)
        {
            return a * b;
        }

        public static double Divide(double a, double b)
        {
            if (b == 0)
                throw new DivideByZeroException("Cannot divide by zero.");
            return a / b;
        }

        public static double Power(double baseValue, double exponent)
        {
            return Math.Pow(baseValue, exponent);
        }

        public static double SquareRoot(double value)
        {
            if (value < 0)
                throw new ArgumentOutOfRangeException("Cannot take the square root of a negative number.");
            return Math.Sqrt(value);
        }

        public static double Factorial(int number)
        {
            if (number < 0)
                throw new ArgumentOutOfRangeException("Cannot calculate factorial of a negative number.");
            if (number == 0) return 1;
            double result = 1;
            for (int i = 1; i <= number; i++)
            {
                result *= i;
            }
            return result;
        }

        public static double Sin(double angle)
        {
            return Math.Sin(angle);
        }

        public static double Cos(double angle)
        {
            return Math.Cos(angle);
        }

        public static double Tan(double angle)
        {
            return Math.Tan(angle);
        }
    }
}