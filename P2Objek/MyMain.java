public class MyMain
{
	public static void main (String args [])
	{
		Human ando = new Human ("Ando", "Malang", 27);
		System.out.println ("My name is " + ando.getName ());
		
		Human satria = new Human ("Satria", "Malang", "Black");
		System.out.println ("My name is " + satria.getName());
	}
}