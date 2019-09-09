public class Operations{
	
	static double result;
	static String finalResult = "";
	public final static double PI = 3.1416; // Pi Number
	
	/**This method gets the result of the addition between two numbers.
	*<b>Pre:</b>
	*The numbers are rational numbers in String type.
	*<b>Post:</b>
	*The result was gotten.
	*@param numberOne. A number. Cannot be empty or null.
	*@param numberTwo. A number. Cannot be empty or null.
	*@return A string with the addition between numberOne and numberTwo.
	*/
	
	public static String addition(String numberOne, String numberTwo)
	{
		double addOne = Double.parseDouble(numberOne);
		double addTwo = Double.parseDouble(numberTwo);
		
		result = addOne + addTwo;
		
		finalResult = Double.toString(result); 
		
		return finalResult ;
	}
	
	/**This method gets the result of the substraction between two numbers.
	*<b>Pre:</b>
	*The numbers are rational numbers in String type.
	*<b>Post:</b>
	*The result was gotten.
	*@param numberOne. A number. Cannot be empty or null.
	*@param numberTwo. A number. Cannot be empty or null.
	*@return A string with the substraction between numberOne and numberTwo.
	*/

	public static String substraction(String numberOne, String numberTwo)
	{
		double substractOne = Double.parseDouble(numberOne);
		double substractTwo = Double.parseDouble(numberTwo);
		
		result = substractOne - substractTwo;
		
		finalResult = Double.toString(result);
		
		return finalResult ;
	}
	
	/**This method gets the result of the multiplication between two numbers.
	*<b>Pre:</b>
	*The numbers are rational numbers in String type.
	*<b>Post:</b>
	*The result was gotten.
	*@param numberOne. A number. Cannot be empty or null.
	*@param numberTwo. A number. Cannot be empty or null.
	*@return A String with the multiplication between numberOne and numberTwo.
	*/

	public static String multiplication(String numberOne, String numberTwo)
	{
	
		double multiplicand = Double.parseDouble(numberOne);
		double multiplier = Double.parseDouble(numberTwo);
	
		result = multiplicand * multiplier;
	
		finalResult = Double.toString(result);
	
		return finalResult;
	}
	
	/**This method divides two numbers.
	*<b>Pre:</b>
	*The numbers are rational numbers in String type.
	*<b>Post:</b>
	*The result was gotten.
	*@param numberOne. A number. Cannot be empty or null.
	*@param numberTwo. A number. Cannot be empty or null.
	*@return A String with the division between numberOne and numberTwo.
	*/

	public static String division(String numberOne, String numberTwo)
	{
		double dividend = Double.parseDouble(numberOne);
		double divisor = Double.parseDouble(numberTwo);
		
		result = dividend / divisor;
		
		finalResult = Double.toString(result);
	
		return finalResult;
	}
	
	/**This method gets the remainder of the division between two numbers.
	*<b>Pre:</b>
	*The numbers are rational numbers in String type.
	*<b>Post:</b>
	*The module was gotten.
	*@param numberOne. A number. Cannot be empty or null.
	*@param numberTwo. A number. Cannot be empty or null.
	*@return A String with the module between the division of numberOne and numberTwo.
	*/

	public static String remainder(String numberOne, String numberTwo)
	{
		double dividend = Double.parseDouble(numberOne);
		double divisor = Double.parseDouble(numberTwo);
	
		result = dividend % divisor;
	
		finalResult = Double.toString(result);
	
		return finalResult;
	}
	
	/**This method gets the result of the square root of a number.
	*<b>Pre:</b>
	*The number is a rational number.
	*<b>Post:</b>
	*The result was gotten.
	*@param numberOne. A number. Cannot be empty or null.
	*@return A String with the square root of numberOne.
	*/

	public static String squareRoot (String numberOne)
	{
		
		double radicand = Double.parseDouble(numberOne);
		
		double accumulation = 30;
		
		for (int c = 1; c<10; c++)
		{
			result  = (accumulation / 2) + (radicand / (2 * accumulation));
			accumulation = result; 
		}
			
			finalResult = Double.toString (result);
			
			return finalResult;
	}
	
	/**This method gets the result of the square Xth of a number.
	*<b>Pre:</b>
	*The radicand is a rational number.
	*The degree of the root is an integer number.
	*<b>Post:</b>
	*The result was gotten.
	*@param numberOne. The radicand. Cannot be empty or null.
	*@param numberTwo. The degree of the root. Cannot be empty or null. Cannot be negative.
	*@return A String with the Xth root of numberOne.
	*/
	public static String root (String numberOne, String numberTwo)
	{
		int rootDegree = Integer.parseInt(numberOne);
		double radicand = Double.parseDouble(numberTwo);
		double accumulation = 30;
	
		for (int c = 0; c < 10; c++)
		{	
			result = ( (1 / rootDegree) * ( ( ( rootDegree - 1) * accumulation ) + (radicand / exponentiationForOps(accumulation, (rootDegree - 1) ) ) ) );
			accumulation = result;
		}
		
		finalResult = Double.toString(result);
		
		return finalResult;
		
	}
	
	/**This method gets the result of the exponentiation of a number.
	*<b>Pre:</b>
	*The base is a rational number.
	*The exponent is an integer number.
	*<b>Post:</b>
	*The result was gotten.
	*@param numberOne. The base. Cannot be empty or null.
	*@param numberTwo. The exponent. Cannot be empty or null. Cannot be negative.
	*@return A String with the exponentiation of numberOne by the exponent of numberTwo.
	*/
	public static String exponentiation (String numberOne, String numberTwo)
	{
		int counter = Integer.parseInt(numberTwo);
		double base = Double.parseDouble(numberOne);
		result = base;

		if (counter == 0)
		{
			result = 1;
		}
		
		else
		{
			for (int c = 1; c < counter; c++)
			{
				result *= base;
			}
		}
		finalResult = Double.toString(result);
		
		return finalResult;
	}
	
	/**This method gets the result of the factorial of a number.
	*<b>Pre:</b>
	*The number is an integer number.
	*<b>Post:</b>
	*The result was gotten.
	*@param numberOne. A number. Cannot be empty or null. Cannot be negative. 
	*@return A String with the factorial of numberOne.
	*/
	public static String factorial (String numberOne)
	{
		int base = Integer.parseInt(numberOne);
		
		if (numberOne.charAt(0) == '-')
		{
			base *= (-1);
		}

		result = 1;
		
		for (int c = 2; c <= base; c++)
		{
			result *= c;
		}

		if (numberOne.charAt(0) == '-')
		{
			result *= (-1);
		}

		finalResult = Double.toString(result);
		
		return finalResult;
	}
	
	/**This method gets the sine of an angle.
	*<b>Pre:</b>
	*The angle is in degrees or radians.
	*<b>Post:</b>
	*The result was gotten.
	*@param numberOne. A number. Cannot be empty or null. Cannot be gradian.
	*@param angleType. A number which determines if the angle is in degrees or radians.
	*@return A String with the sine of numberOne.
	*/
	public static String sin (String numberOne, int angleType)
	{
		double base = Double.parseDouble(numberOne);

		if (angleType == 1)
		{
		base /= 180;
		base *= PI;
		}

		result = Math.sin(base);

		finalResult= Double.toString(result);

		return finalResult;
	}
	
	/**This method gets the cosine of an angle.
	*<b>Pre:</b>
	*The angle is in degrees or radians.
	*<b>Post:</b>
	*The result was gotten.
	*@param numberOne. A number. Cannot be empty or null. Cannot be gradian.
	*@param angleType. A number which determines if the angle is in degrees or radians.
	*@return A String with the cosine of numberOne.
	*/

	public static String cos (String numberOne, int angleType)
	{
		double base = Double.parseDouble(numberOne);
		
		if (angleType == 1)
		{
			base /= 180;
			base *= PI;		
		}

		result = Math.cos(base);

		finalResult= Double.toString(result);

		return finalResult;
	}
	
	/**This method gets the tangent of an angle.
	*<b>Pre:</b>
	*The angle is in degrees or radians.
	*<b>Post:</b>
	*The result was gotten.
	*@param numberOne. A number. Cannot be empty or null. Cannot be gradian.
	*@param angleType. A number which determines if the angle is in degrees or radians.
	*@return A String with the tangent of numberOne.
	*/

	public static String tan (String numberOne, int angleType)
	{
		double base = Double.parseDouble(numberOne);
		
		if (angleType == 1)
		{
		base /= 180;
		base *= PI;
		}

		result = Math.tan(base);

		finalResult= Double.toString(result);

		return finalResult;
	}
	
	/**This method gets the base 10 logarithm of a number.
	*<b>Pre:</b>
	*The number is a rational number.
	*<b>Post:</b>
	*The result was gotten.
	*@param numberOne. A number. Cannot be empty or null. Cannot be negative.
	*@return A String with the base 10 logarithm of numberOne.
	*/
	public static String logTen (String numberOne)
	{
		double base = Double.parseDouble(numberOne);

		result = Math.log10(base);

		finalResult = Double.toString(result);

		return finalResult;
	}

	/**This method gets the conversion of a decimal number to scientific notation.
	*<b>Pre:</b>
	*The number is a rational number.
	*<b>Post:</b>
	*The conversion was gotten.
	*@param numberOne. A number. Cannot be empty or null. Cannot be negative.
	*@return A String with the scientific notation of numberOne.
	*/
	public static String scientificNotation (String numberOne)
	{
		finalResult = "";
		double decimal = Double.parseDouble(numberOne);
		int counter = 0;

		if (decimal < 1)
		{
			while (decimal < 1)
			{
				decimal *= 10;
				--counter;
			}
		}

		else
		{
			while (decimal > 9)
			{	
				decimal /= 10;
				++counter;
				System.out.println(decimal);
			}
		}

		finalResult += Double.toString(decimal) + "*10E" + Integer.toString(counter);

		return finalResult;
	}
	
	/**This method gets the conversion of a decimal or hexadecimal number to binary base.
	*<b>Pre:</b>
	*The number is an Integer or a hexadecimal number.
	*<b>Post:</b>
	*The conversion was gotten.
	*@param numberOne. A number. Cannot be empty or null. Cannot be negative.
	*@param baseType. A number which determines the base of the number.
	*@return A String with the binary conversion of numberOne.
	*/

	public static String binary (String numberOne, int baseType)
	{
		int decimal = 0;
		String decimalString = "";
		String binary = "";
		StringBuilder reverse = new StringBuilder();
		boolean alreadyConverted = false;

		// baseType = 1 is decimal, other is hexadecimal. 

		if (baseType != 1) 
		{
			decimalString = decimal(numberOne, 1);
			decimal = (int) Double.parseDouble(decimalString);
			baseType = 1;
			alreadyConverted = true;
		}


		if (baseType == 1)
		{
			if (alreadyConverted == false)
			{
			decimal = Integer.parseInt(numberOne);
			}

			if (decimal == 0)
			{
				binary = "0";
			}

			else if (decimal == 1)
			{
				binary = "1";
			}

			else 
			{
				while (decimal / 2 != 0)
				{
					binary += decimal % 2;
					decimal /= 2; 
				}
				
				binary += 1;
				
				reverse.append(binary);
				
				reverse.reverse();		
			}
		}
		return reverse.toString();
	}
	
	/**This method gets the conversion of a binary or hexadecimal number to decimal base.
	*<b>Pre:</b>
	*The number is a binary or a hexadecimal number.
	*<b>Post:</b>
	*The conversion was gotten.
	*@param unconverted. A number. Cannot be empty or null. Cannot be negative.
	*@param baseType. A number which determines the base of the number.
	*@return A String with the decimal conversion of numberOne.
	*/
	public static String decimal (String unconverted, int baseType)
	{
		int resultInt = 0;
		int[] decimalValues = new int[unconverted.length()];

		//baseType = 1 is hexadecimal, other is binary.

		if (baseType == 1)
		{
			for (int c = 0; c < unconverted.length(); c++)
			{
				if (unconverted.charAt(c) == 'A' || unconverted.charAt(c) == 'a')
				{
					decimalValues[c] = 10;
				}

				else if (unconverted.charAt(c) == 'B' || unconverted.charAt(c) == 'b')
				{
					decimalValues[c] = 11;
				}

				else if (unconverted.charAt(c) == 'C' || unconverted.charAt(c) == 'c')
				{
					decimalValues[c] = 12;
				}

				else if (unconverted.charAt(c) == 'D' || unconverted.charAt(c) == 'd')
				{
					decimalValues[c] = 13;
				}

				else if (unconverted.charAt(c) == 'E' || unconverted.charAt(c) == 'e')
				{
					decimalValues[c] = 14;
				}

				else if (unconverted.charAt(c) == 'F' || unconverted.charAt(c) == 'f')
				{
					decimalValues[c] = 15;
				}

				else
				{
					decimalValues[c] = Character.getNumericValue( unconverted.charAt(c) );
				}
			}

			for (int c = 1; c <= unconverted.length(); c++)
			{
				resultInt += decimalValues[unconverted.length() - c] * exponentiationForOps( 16, (c - 1) );
			}

			finalResult = Integer.toString(resultInt);
		}

		else
		{
			for (int c = 1; c <= unconverted.length(); c++)
			{
				decimalValues[c-1] = (int) exponentiationForOps( 2, (unconverted.length() - c) );
			}

			for (int c = 0; c < unconverted.length(); c++)
			{
				int binary = Integer.parseInt("" + unconverted.charAt(c) );
				resultInt += decimalValues[c] * binary;
			}

			finalResult = Integer.toString(resultInt);
		}
		
		return finalResult;
	}
	
	/**This method gets the conversion of a decimal or binary number to hexadecimal base.
	*<b>Pre:</b>
	*The number is an Integer or a binary number.
	*<b>Post:</b>
	*The conversion was gotten.
	*@param unconverted. A number. Cannot be empty or null. Cannot be negative.
	*@param baseType. A number which determines the base of the number.
	*@return A String with the hexadecimal conversion of numberOne.
	*/

	public static String hexadecimal (String unconverted, int baseType)
	{
		finalResult = "";
		StringBuilder reverse = new StringBuilder();
		String decimalString = "";
		boolean alreadyConverted = false; 
		int decimalUnconverted = 0;

		//baseType = 1 is decimal, other is binary.
		
		if (baseType != 1)
		{
			decimalString = decimal(unconverted, 2);
			decimalUnconverted = Integer.parseInt(decimalString);
			baseType = 1;
			alreadyConverted = true;
		}

		if (baseType == 1)
		{
			if (alreadyConverted == false)
			{
				decimalUnconverted = Integer.parseInt(unconverted);
			}

			else
			{
				finalResult = "";
			}

			int accumulation = 0;

			if (decimalUnconverted < 16)
			{
				finalResult = hexValues(decimalUnconverted);
			}

			else
			{
				while (decimalUnconverted > 15)
				{
					accumulation = decimalUnconverted % 16;
					finalResult += hexValues(accumulation);
					decimalUnconverted /= 16;
				}
				finalResult += 1;
			}
			reverse.append(finalResult);
				
			reverse.reverse(); 
		}
		return reverse.toString();
	}
	
	/**This method assigns the hexadecimal equivalent of a decimal number.
	*<b>Pre:</b>
	*The decimal is a number between 0 and 15.
	*<b>Post:</b>
	*The equivalent of the decimal number was assigned.
	*@param decimal. A decimal number. Cannot be empty. 
	*@return A String with the value of decimal in hexadecimal base.
	*/
	public static String hexValues (int decimal)
	{
		String hexadecimal = "";

		if (decimal == 10)
		{
			hexadecimal = "A";
		}

		else if (decimal == 11)
		{
			hexadecimal = "B";
		}

		else if (decimal == 12)
		{
			hexadecimal = "C";
		}

		else if (decimal == 13)
		{
			hexadecimal = "D";
		}

		else if (decimal == 14)
		{
			hexadecimal = "E";
		}		

		else if (decimal == 15)
		{
			hexadecimal = "F";
		}

		else
		{
			hexadecimal = Integer.toString(decimal);
		}	

		return hexadecimal;			
	}
		
	/**This method gets the conversion of an angle in radians to degrees.
	*<b>Pre:</b>
	*The angle is in radians.
	*<b>Post:</b>
	*The conversion was gotten.
	*@param numberOne. The denominator. Cannot be empty or null. 
	*@param numberTwo. The numerator. Cannot be empty or null.
	*@param piValidator. A number which validates the addition of pi to the number.
	*@return A String with the conversion in degrees of the angle.
	*/
	public static String radToDeg (String numberOne, String numberTwo, int piValidator)
	{
		double denominator = Double.parseDouble(numberOne);
		double numerator = Double.parseDouble(numberTwo);

		if (piValidator == 1)
		{
			result = ( (denominator * PI / numerator) * (180 / PI) );
		}

		else 
		{
			result = ( (denominator / numerator) * (180 / PI) );
		}

		finalResult = Double.toString(result);

		return finalResult;
	}
	
	/**This method gets the conversion of an angle in degrees to radians.
	*<b>Pre:</b>
	*The angle is in degrees.
	*<b>Post:</b>
	*The conversion was gotten.
	*@param numberOne. The angle. Cannot be empty or null. 
	*@return An String with the conversion in radians of numberOne.
	*/
	public static String degToRad (String numberOne)
	{
		double degree = Double.parseDouble(numberOne);

		result = degree / 180;
		result *= PI;

		finalResult = Double.toString(result);

		return finalResult;
	}
	
	/**This method gets the Natural logarithm of a number.
	*<b>Pre:</b>
	*The number is a rational number.
	*<b>Post:</b>
	*The result was gotten.
	*@param numberOne. A number. Cannot be empty or null. Cannot be negative.
	*@return A String with the Natural logarithm of numberOne.
	*/
	public static String logN (String numberOne)
	{
		double base = Double.parseDouble(numberOne);
		
		result = Math.log(base);

		finalResult = Double.toString(result);

		return finalResult;
	}

	/**This method gets the result of the exponentiation of a number.
	*<b>Pre:</b>
	*The base is a rational number.
	*The exponent is an integer number.
	*<b>Post:</b>
	*The result was gotten.
	*@param accumulation. The base. Cannot be empty or null.
	*@param rootDegree. The exponent. Cannot be empty or null. Cannot be negative.
	*@return A double with the exponentiation of accumulation by the exponent of rootDegree.
	*/
	public static double exponentiationForOps (double accumulation, int rootDegree) //This bad boy is used when operations have exponentiations in them
	{	
		int counter = rootDegree;
		result = accumulation;

		if (counter == 0)
		{
			result = 1;
		}

		else 
		{
			for (int c = 1; c < counter; c++)
			{
				result *= accumulation;
			}
		}	

		return result;
	}
}