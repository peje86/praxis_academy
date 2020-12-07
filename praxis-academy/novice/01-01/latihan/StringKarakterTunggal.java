// public class StringKarakterTunggal
// {
//  	public static void main(String[] args) {

// String s = "Hello ICT.social";
// System.out.println (s.charAt(2));

// 	}
// }

public class Program
{
 	public static void main(String[] args) {

char c; // character
int i; // ordinal (ASCII) value of the character
// conversion from text to ASCII value
c = 'a';
i = (int)c;
System.out.printf("The character '%c' was converted to its ASCII value of %d\n", c, i);
// conversion from an ASCII value to text
i = 98;
c = (char)i;
System.out.printf("The ASCII value of %d was converted to its textual value of '%c'\n", i, c);
	}
}