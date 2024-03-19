import java.util.*;
import java.io.*;

public class Generator {
	public static void main(String[] args) {
		Random rand = new Random();
		for (int i=0; i<95; i++) {
			System.out.println("Generating case: " + i);
			String infilename = "cases/test" + i + ".in";
			String outfilename = "cases/test" + i + ".out";
			String input = "";
			String output = "";
			int size = (int)(Math.random()*10000)+1000;
			input += size + "\n";
			output += size + "\n";
			int[] a = new int[size];
			for (int y=0; y<size; y++) {
				a[y] = rand.nextInt();
				input += a[y] + "\n";
			}
			Arrays.sort(a);
			for (int y=0; y<size; y++) {
				output += a[y] + "\n";
			}
			try {
				FileWriter writer = new FileWriter(infilename);
				PrintWriter printWriter = new PrintWriter(writer);
				printWriter.print(input);
				printWriter.close();
				writer = new FileWriter(outfilename);
				printWriter = new PrintWriter(writer);
				printWriter.print(output);
				printWriter.close();
			}
			catch (IOException ex) {
			}

		}
	}
}
