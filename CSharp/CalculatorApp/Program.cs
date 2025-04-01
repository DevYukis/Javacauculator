using System;

namespace CalculatorApp
{
    class Program
    {
        static void Main(string[] args)
        {
            Calculator calculator = new Calculator();
            string input;
            Console.WriteLine("Welcome to the Scientific Calculator!");
            Console.WriteLine("Enter 'exit' to close the application.");

            while (true)
            {
                Console.Write("Enter a calculation: ");
                input = Console.ReadLine();

                if (input.ToLower() == "exit")
                {
                    break;
                }

                try
                {
                    double result = calculator.Evaluate(input);
                    Console.WriteLine($"Result: {result}");
                }
                catch (Exception ex)
                {
                    Console.WriteLine($"Error: {ex.Message}");
                }
            }
        }
    }
}