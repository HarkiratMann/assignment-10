import java.io.*;
import java.util.*;
class filehandling
{
	public static void main(String args[])throws IOException
	{
		File f=new File("H:\java class\Assignment10-master\abc.txt");
		Scanner input = new Scanner(f);
		System.out.println("Contents:");
		while (input.hasNextLine())
		{
			System.out.println(input.nextLine());
		}
		System.out.println("Path:"+f.getAbsolutePath());
		
	}
}
		