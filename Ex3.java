import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ex3 {

 public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Introduceti numele fisierului: ");
			String fileName = scanner.nextLine();
			System.out.println("Introduceti linia dorita: ");
			String text = scanner.nextLine();
			
            
			int nrranduri= 0; int contor=0;
			FileReader file = new FileReader(fileName);
			BufferedReader readFile = new BufferedReader(file);
			
			String line = readFile.readLine();
			while(line != null) {
				nrranduri++;
				if(line.equals(text))
					contor=nrranduri;
				line = readFile.readLine();
			}if (contor>0) System.out.println("Linia introdusa apara in a " + contor +"-a rand al fisierului");
			else System.out.println("Linia citita nu apare in fisier");
			
			readFile.close();
			
			 scanner.close();
			;
		}
		catch(IOException e){
			System.out.println(e);
		} } 
}
	
	 

	
