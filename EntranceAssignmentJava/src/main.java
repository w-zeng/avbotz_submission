import java.io.*;
import java.math.*;
import java.util.*;
import java.lang.*;

public class main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader in = null;
		FileWriter out = null;
		try{
			in = new FileReader("src/testin.txt");
			out = new FileWriter("src/textout.txt");
		}finally{
		int s = 0;
		Scanner sc = new Scanner(in);
		while(sc.hasNext()){	
			int x = sc.nextInt();
			System.out.println(x);
			double y = sc.nextInt();
			double z = sc.nextInt();
			double d = Math.sqrt(x*x + y*y + z*z);
			if (d>200)
				s++;
			out.write(Double.toString(d) + "\n");
		}
		out.write("Distances over 200: " + s);
		in.close();
		out.close();
		}
	}
}
