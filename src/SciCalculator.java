import java.util.Scanner;

public class SciCalculator
{

	public final static String PI = "3.1416"; // Pi Number


	//Main 
	
	public static void main(String[] args)
	{
		
		int state = 1; //1 = ON, 0 = OFF
		int mode = 1; //1 = Individual, 2 = Sequence.
		int desicionMaker = 0;
		String numberOne = "";
		String numberTwo = "";
		String result = "";
		char symbol;
		Scanner s = new Scanner(System.in);
		boolean end = false;
		boolean dontSave = false;
		boolean print = true; 
		String[] savedResults = new String[10]; //Results located in memory.
		
		//Start instructions 
		
		System.out.println("\n||SciCalculator v1|| \n");
		System.out.println("For access to the command and help menu, enter <?> in the first field.");
	
		//The whole calculator procedure
		
		
		while(state == 1)
		{ 
			//Prevents the code from abruptly finishing.
			end = false; 
			dontSave = false;
			print = true;
			
			// Mode report.
		
			if(mode == 1)
			{
				System.out.println("\n~The current mode is: Individual~\n"); 
			}
		
			else if(mode == 2)
			{
				System.out.println("\n~The current mode is: Sequence~\n");
				
				if (numberOne.isEmpty() == false)
				{
				System.out.println(numberOne);
				}
			}		

			//For individual mode.
		
			if (mode == 1) 
			{
				numberOne = "";
				numberOne = s.next(); 
			
			
				if( numberOne.equals("?") )
				{ 
					helpChart();
					end = true;
				}
			
				else if( numberOne.equals("@") )
				{
					numberOne = PI;
				}
				
				else if( numberOne.equals(";") ) 
				{ 
					mode = 2;
					end = true;
					numberOne = "";
				}
					
				else if( numberOne.charAt(0) == '$')
				{	
					if ( numberOne.length()>1 )
					{
						numberOne = getResult(numberOne, savedResults);

						if (numberOne.equals("empty"))
						{
							System.out.println("Result requested is empty. Check the results stored entering <_> in first field.\n");
							end = true;
							numberOne = "";
							print = false;
						}
					}

					else
					{
						System.out.println("Please insert the space number next to the <$>");
						end = true;
					}
				}
				
				else if ( numberOne.equals("_") )
				{
					printResults(savedResults);
					numberOne = "";
					end = true; 
				}
			}

			//For sequence mode.
			else
			{
				while (numberOne.isEmpty() == true)
				{
					numberOne = s.next(); 
			
			
					if( numberOne.equals("?") )
					{	 
						helpChart();
						end = true;
					}
			
					else if( numberOne.equals("@") )
					{
						numberOne = PI;
					}
				
					else if( numberOne.equals(";") ) 
					{ 
						mode = 1;
						end = true;
					}
					
					else if( numberOne.charAt(0) == '$')
					{	
						if ( numberOne.length()>1 )
						{
							numberOne = getResult(numberOne, savedResults);
						}

						else if (numberOne.equals("empty"))
						{
							System.out.println("Result requested is empty. Check the results stored entering <_> in first field.\n");
							end = true;
							numberOne = "";
							print = false;
						}

						else
						{
							System.out.println("Please insert the space number next to the <$>");
							end = true;
						}
					}
				
					else if ( numberOne.equals("_") )
					{
					printResults(savedResults);
					end = true; 
					print = false;
					}
				}
			}
			//If mode has changed or results have been printed or the help chart has been opened, procedure restarts.
				
			if (end == false)
			{
				
				//Symbol input.
				symbol = s.next().charAt(0); 
					
					
					//Operations with 1 number.
					
				if (symbol=='{')
				{	
					result = Operations.squareRoot(numberOne);
					end = true;
				}
					
				else if (symbol=='!')
				{
					result = Operations.factorial(numberOne);
					end = true;
				}
					
				else if (symbol=='E'||symbol=='e')
				{
					if (mode == 1)
					{
					result = Operations.scientificNotation(numberOne);
					end = true;
					dontSave = true;
					}

					else
					{
						System.out.println("Scientific notation cannot be done is Sequence Mode. Previous result will be used as first number.\n");
						end = true;
						dontSave = true;
						print = false; 
					}
				}
					
				else if (symbol=='s'||symbol=='S')
				{
					System.out.println("\nEnter <1> if the number is in degrees, any other number if it's in gradians.\n");
							
					desicionMaker = s.nextInt();
				
					result = Operations.sin(numberOne, desicionMaker);
					end = true;
						
					desicionMaker = 0;
				}
					
				else if (symbol=='t'||symbol=='T')
				{
					System.out.println("\nEnter <1> if the number is in degrees, any other number if it's in gradians.\n");
						
					desicionMaker = s.nextInt();				
					result = Operations.tan(numberOne, desicionMaker);
					end = true;
						
					desicionMaker = 0;
				}

				else if (symbol=='c'||symbol=='C')
				{

					System.out.println("\nEnter <1> if the number is in degrees, any other number if it's in gradians.\n");

					desicionMaker = s.nextInt();
							
					result = Operations.cos(numberOne, desicionMaker);
					end = true;
							
					desicionMaker = 0;
				}
					
				else if (symbol=='[')
				{
					result = Operations.logTen(numberOne);
					end = true;
				}

				else if (symbol==']')
				{
					result = Operations.logN(numberOne);
					end = true;
				}
					
				else if (symbol=='b'||symbol=='B')
				{
					System.out.println("\nWhat's your number base? enter <1> for decimal, any other number for hexadecimal.\n");
					desicionMaker = s.nextInt();
						
					result = Operations.binary(numberOne, desicionMaker);

					desicionMaker = 0;

					end = true;
					dontSave = true;
				}
					
				else if (symbol=='d'||symbol=='D')
				{
					System.out.println("\nWhat's your number base? enter <1> for hexadecimal, any other number for binary.\n");
					desicionMaker = s.nextInt();

					result = Operations.decimal(numberOne, desicionMaker);

					desicionMaker = 0;

					end = true;
				}

				else if (symbol=='h'||symbol=='H')
				{
					System.out.println("\nWhat's your number base? enter <1> for decimal, any other number for binary.\n");
					desicionMaker = s.nextInt();

					result = Operations.hexadecimal(numberOne, desicionMaker);
						
					desicionMaker = 0;

					end = true;
					dontSave = true; 
				}
					
				else if (symbol=='r'||symbol=='R')
				{
					result = Operations.degToRad(numberOne);
					end = true;
				}

				//Sequence exclusive.
				else if (mode == 2)
				{
					if( symbol == '?' )
					{	 
						helpChart();
						end = true;
						print = false;
						dontSave = true;
					}
					
					else if( symbol == ';' ) 
					{ 
						mode = 1;
						end = true;
						print = false;
						dontSave = true;
					}

					else if (symbol == '_')
					{
						printResults(savedResults);
						end = true;
						print = false;
						dontSave = true; 
					}

					else if (symbol == 'q' || symbol == 'Q')
					{
						state = 0;
						end = true;
						print = false; 
					}
				}





				//If an operation was made, procedure closes.
				
				if (end == false)
				{	
					//No operation with 1 number was made, procedure continues.

					//Second number.
					
					numberTwo = s.next(); 					

					if ( numberTwo.equals("@") )
					{
						numberTwo = PI;
					}
						
				else if( numberTwo.charAt(0) == '$')
				{	
					if ( numberTwo.length()>1 )
					{
						numberTwo = getResult(numberTwo, savedResults);

						if (numberTwo.equals("empty"))
						{
							System.out.println("Result requested is empty. 1 stablished as second number.\n");
							end = true;
							numberTwo = "1";
						}
					}

					else
					{
						System.out.println("Please insert the space number next to the <$>");
						end = true;
					}
				}
						
					//Operations with 2 numbers.
					
					if (symbol=='+')
					{
						result = Operations.addition(numberOne,numberTwo);
					}
					
					else if (symbol=='-')
					{
						result = Operations.substraction(numberOne, numberTwo);
					}
					
					else if (symbol=='/')
					{
						result = Operations.division(numberOne,numberTwo);
					}
					
					else if (symbol=='*')
					{
						result = Operations.multiplication(numberOne, numberTwo);
					}
					
					else if (symbol=='%')
					{
						result = Operations.remainder(numberOne, numberTwo);
					}
					
					else if (symbol=='}')
					{
						result = Operations.root(numberOne,numberTwo);
					}
					
					else if (symbol=='#')
					{
						result = Operations.exponentiation(numberOne,numberTwo);
					}

					else if (symbol == 'g' || symbol == 'G')
					{
						System.out.println("\nAdd Pi? <1> for yes, any other number for no.\n");
						
						desicionMaker = s.nextInt();

						result = Operations.radToDeg (numberOne, numberTwo, desicionMaker);

						desicionMaker = 0;
					}

					else if ( numberOne.equals("empty") || numberTwo.equals("empty") )
					{
						System.out.println("One of the numbers is empty, cannot operate.\n");
					}

					else 
					{
						System.out.println("\nThe operator you entered doesn't exist. Check the operators with the help menu entering <?>.\n");
						dontSave = true;
						print = false;
					}
				//Fin de la evaluacion de simbolos.
				}

				if (print == true)
				{
				System.out.println("=\n" + result + "\n");
				}
					
				if (dontSave == false)
				{
				saveResult(result, savedResults);
				}

				if (mode == 1)
				{
					System.out.println("Do you wish to make another operation? enter <1> for yes, any other number for no.\n");
				
					state = s.nextInt();
				}
					
				else if (mode == 2)
				{
					numberOne = result;	
				}			
			}
		}	
	}		
	
	/**This method prints a help and command menu.
	*<b>Post:</b> 
	*The help and command menu has been printed on screen.
	*/	
	public static void helpChart()
	{
		System.out.println("SciCalculator follows these steps:\n");
		System.out.println("1. On the first field it reads the first number.");
		System.out.println("2. On the second field it reads the 'operator', choosing which operation to make.");
		System.out.println("3. If the operation needs 2 numbers, a third field will read the second number.");
		System.out.println("4. The result will appear on screen, and it will be saved for future use (up to 10 results will be stored).\n");
		
		System.out.println("example");
		System.out.println("4");
		System.out.println("+");
		System.out.println("4");
		System.out.println("=");
		System.out.println("8\n");
		
		System.out.println("Operators' list:\n");

		System.out.println("1 number operators (operation, type of number):\n");
		
		System.out.println("<{> = Square root (rational).");
		System.out.println("<!> = Factorial (integer).");
		System.out.println("<e> = Scientific notation (rational).");
		System.out.println("<s> = Sine (rational).");
		System.out.println("<c> = Cosine (rational).");
		System.out.println("<t> = Tangent (rational).");
		System.out.println("<[> = Common logarithm 'base 10' (integer).");
		System.out.println("<]> = Natural logarithm (integer).");
		System.out.println("<b> = Conversion to binary (hexadecimal or integer)");
		System.out.println("<d> = Conversion to decimal (binary or hexadecimal)");
		System.out.println("<h> = Conversion to hexadecimal (binary or decimal)");
		System.out.println("<r> = Conversion from degrees to radians (degree)\n");

		System.out.println("2 numbers operators (operation, type of number (1st, 2nd), value of the numbers):\n");
		
		System.out.println("<+> = Addition (rational).");
		System.out.println("<-> = Substraction (rational).");
		System.out.println("<*> = Multiplication (rational).");
		System.out.println("</> = Division (rational).");
		System.out.println("<%> = Remainder (rational).");
		System.out.println("<}> = Xth root (integer, rational). First number = Root degree. Second number = Radicand.");
		System.out.println("<#> = Exponentiation (rational, integer). First number = Base. Second number = Exponent.");
		System.out.println("<g> = Conversion from radians to degrees (radian). First number = Denominator. Second number = Numerator.");
		
		System.out.println("Other commands (function, destined field):\n");
		
		System.out.println("<_> = Shows the results in memory. (First field, second field on Sequence mode).");
		System.out.println("<;> = Changes the mode of the procedure. (First field, second field on Sequence mode).");
		System.out.println("<@> = The number gets the value of Pi (First field, third field.)");
		System.out.println("<$X> = Loads a previous result, stored in <X> space. Up to 10 previous results. Ex: $4 (First field, third field)");
		System.out.println("<q> = Only available on Sequence mode. Turns SciCalculator off. (Second field)");
		System.out.println("<?> = Shows this menu again. (First field, second field on Sequence mode)\n");
		
		System.out.println("Modes:\n");
		
		System.out.println("Individual: Ask for permission to operate again. If answer is no, SciCalculator will turn off");
		System.out.println("Sequence: Automatic use of previous result as First number.\n");
	}
	
	/**This method saves specific operation results on the first space of an array, and moves the other space's result one space forwards.
	*<b>Pre:</b>
	*The result is in String type.
	*The array is a String array.
	*The array is instantiated.
	*<b>Post:</b>
	*The result is saved on the first space and the other results are one space forwards.
	*@param result. Result to save. Cannot be a result of hexadecimal conversion, binary conversion and scientific notation conversion.
	*Cannot be empty.
	*@param savedResults. Array that will store to result. Defined to hold 10 spaces. 
	*/
	public static void saveResult(String result, String[] savedResults)
	{
		for (int c = 8; c > -1; c--)
		{
			savedResults[c+1] = savedResults[c];		
		}

		savedResults[0] = result;
	}
	
	/**This method loads a result stored in an array.
	*<b>Pre:</b>
	*The result requested isn't null.
	*The array is instantiated.
	*The result requested is in range of the array.
	*<b>Post:</b>
	*The result is loaded from the array.
	*An "empty" result is loaded, promping an error.
	*@param numberOne. Requested space result. Cannot be empty or null.  Must have numbers next to a '$'.
	*Those numbers cannot be greater than 10.
	*@param savedResults. Array with stored results. Cannot have empty spaces. 
	*@return The result in the space position requested by the user.
	*/
	public static String getResult(String numberOne, String[] savedResults) 
	{
		String result = "";
		int length = numberOne.length();
		int location = 1;
		

		if (length == 2)
		{
			location = Integer.parseInt("" + numberOne.charAt(1) );
		}
		
		else if (length == 3 && numberOne.charAt(2) == '0')
		{
			location = 10;
		}

		else if (length == 3 && numberOne.charAt(2) != '0')
		{
			location = 10;
			System.out.println("Space number exceds the accepted values; 10th result will be charged.\n");
		}

		else
		{
			result = "empty";
		}

		if (!result.equals("empty"))
		{
			if (savedResults[location - 1] != null)
			{
				result = savedResults[location - 1];
			}
				
			else if (savedResults[location - 1] == null)
			{
				result = "empty";
			}
		}
		
		return result;
	}

	/**This method prints the results saved in an array.
	*<b>Pre:</b>
	*The array is instantiated.
	*<b>Post:</b>
	*The results are printed on screen.
	*@param savedResults. Array with results saved.
	*/
	public static void printResults(String[] savedResults)
	{
		System.out.println("Results in memory:\n");

		for (int c = 0; c!=10; c++)
		{
			System.out.println("Result #" + (c + 1) + " = " + savedResults[c]); 
		}
	}
}