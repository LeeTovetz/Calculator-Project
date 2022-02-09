# JavaMentor-Calculator-Test

Create a console application "Calculator" in the java language.

 **Description:**<br>
 
Create a "Calculator" console application. The application must read arithmetic operations entered by the user from the console and output the result to the console.

**Requirements:**<br>

The calculator can perform addition, subtraction, multiplication and division operations with two numbers: a + b, a - b, a * b, a / b. Data is transmitted in one line (see example)! Solutions in which each number and arithmetic operation is passed on a new line are considered incorrect.
The calculator can handle both Arabic (1,2,3,4,5...) and Roman (I,II,III,IV,V...) numbers.
The calculator must accept numbers from 1 to 10, inclusive. The output numbers are not limited in size and may be any.
The calculator can only work with integers.
The calculator can only work with Arabic or Roman numbers at the same time, if the user enters a string like 3 + II, the calculator must throw an exception and stop its work.<br>
When entering Roman numbers, the answer must be printed in Roman numerals, respectively, when entering Arabic numerals, the answer is expected in Arabic numerals.
If the user enters unsuitable numbers, the application throws an exception and terminates.
If the user enters a string that does not match one of the arithmetic operations described above, the application throws an exception and exits.
The result of the division operation is an integer, the remainder is discarded. 
The result of the calculator with arabic numbers can be negative numbers and zero. The result of the calculator with Roman numbers can only be positive numbers, if the result is less than one, an exception is thrown.<br>

**An example of how a program works:**<br>

Input:
1 + 2<br>
Output:
3<br>

Input:
VI / III<br>
Output:
II<br>

Input:
I - II<br>
Output:
throws Exception //because there are no negative numbers in the Roman system<br>

Input:
I + 1<br>
Output:
throws Exception //because different number systems are used simultaneously<br>

Input:
1<br>
Output:
throws Exception //because the string is not a mathematical operation<br>

Input:
1 + 2 + 3<br>
Output:
throws Exception //because the format of the mathematical operation does not satisfy the task - two operands and one operator (+, -, /, *)<br>
