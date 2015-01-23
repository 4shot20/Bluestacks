package bluestacks;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Blue {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

		String prefix = "065-1";

		PrintWriter writer = new PrintWriter("new 10000.vcf", "UTF-8");
		
		// prefix: 062-4 = 0 -> 120; 
		// 12_000 contacts
		
		for (int i = 0; i < 100; i++) {

			for (int j = 3900; j < 4000; j++) { // j = 0; j < 1xxxx

				writer.println("BEGIN:VCARD");
				writer.println("VERSION:2.1");
				writer.println("N:;Contact "+i+";;;");
				writer.println("FN:scintiller "+j+"");
				writer.printf("TEL;CELL:%s%02d-%04d\n", prefix, i, j);
				writer.println("END:VCARD");

			}
		}

		writer.close();
		System.out.println("Fichier créé avec succés");
	}

}