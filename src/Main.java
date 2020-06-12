import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class Main {

	private static BufferedReader lector;
	private static BufferedWriter escritor;

	public static void main(String[] args) throws IOException {
String columna[];

			lector = new BufferedReader(new FileReader("D:\\hoja.csv"));
			String linea= lector.readLine();
			linea= lector.readLine();
    while (linea!=null) {
   
    	System.out.println(linea);
	columna= linea.toString().split(";");
	System.out.println(columna.length);
	if(Integer.parseInt(columna[0]) %2 ==0) {
		String bases[]=new  String[columna.length];
		for(int i=0;i<columna.length;i++) {
			System.out.println(columna[i]);
		bases[i]=columna[i];
		}
	}
	else {
		escritor = new BufferedWriter(new FileWriter("D:\\hoja1.csv",true));
		
		escritor.newLine();
		for(int i=0;i<columna.length;i++) {
			escritor.append(columna[i]+"\t");
			//escritor.write ((new StringBuilder().append(columna[i]).append("\t")).toString()); 	
			
		}
		escritor.write(LocalDateTime.now().toString()); 
		escritor.close();
	     }
	linea= lector.readLine();
	

	
}
	
	}

}
