using System;

namespace CalculatorApp
{
    public class Calculator
    {
        public double Add(double a, double b)
        {
            return a + b;
        }

        public double Subtract(double a, double b)
        {
            return a - b;
        }

        public double Multiply(double a, double b)
        {
            return a * b;
        }

        public double Divide(double a, double b)
        {
            if (b == 0)
            {
                throw new DivideByZeroException("Cannot divide by zero.");
            }
            return a / b;
        }

        public double Power(double baseNum, double exponent)
        {
            return Math.Pow(baseNum, exponent);
        }

        public double SquareRoot(double number)
        {
            if (number < 0)
            {
                throw new ArgumentOutOfRangeException("Cannot take the square root of a negative number.");
            }
            return Math.Sqrt(number);
        }

        public double Sin(double angle)
        {
            return Math.Sin(DegreeToRadian(angle));
        }

        public double Cos(double angle)
        {
            return Math.Cos(DegreeToRadian(angle));
        }

        public double Tan(double angle)
        {
            return Math.Tan(DegreeToRadian(angle));
        }

        private double DegreeToRadian(double angle)
        {
            return angle * (Math.PI / 180);
        }
    }
}