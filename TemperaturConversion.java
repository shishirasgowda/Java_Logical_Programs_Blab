package logicalprogram;
import java.util.Scanner;
public class TemperaturConversion {
		public static void main(String[] args) 
		{
			System.out.println("Welcome to Temperatur Conversion");
			Scanner scanner = new Scanner(System.in);
			System.out.println("1-Celsius to Fahrenheit\n2-Fahrenheit to Celsius\nChoose any one.");
			int userChoice = scanner.nextInt();
			switch(userChoice)
			{
				case 1:	
					System.out.println("Enter the value of Celsius : ");
					int userCelsius = scanner.nextInt();
					CelsiusToFahrenheit(userCelsius);
					break;
				case 2:	
					System.out.println("Enter the value of Fahrenheit : ");
					int userFahrenheit = scanner.nextInt();
					FahrenheitToCelsius(userFahrenheit);
					break;
			}
			
		}
			public static void CelsiusToFahrenheit(int userCelsius)
			{
				double fahrenheit =(double)(userCelsius*9/5)+32;
				System.out.println(userCelsius+" Celsius in Fahrenheit is "+fahrenheit);
				
			}
			public static void FahrenheitToCelsius(int userFahrenheit)
			{
				double celsius =(double)(userFahrenheit-32)*5/9;
				System.out.println(userFahrenheit+" Celsius in Fahrenheit is "+celsius);
				
			}
}
