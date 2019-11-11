import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class NumerosRomanos{
	Scanner getValue = new Scanner(System.in);
	String[][] romanos = {
			{"I", "Uno"},
			{"V", "Cinco"},
			{"X", "Diez"},
			{"L", "Cincuenta"},
			{"C", "Cien"},
			{"D", "Quinientos"},
			{"M", "Mil"}
			};
	public String convert(){
		String result = "";
		System.out.println("Escribe el numero romano");
		String numero = this.getValue.nextLine();
		String [] numeros = numero.split("");
		List listRomanos = Arrays.asList(this.romanos);
		for (int i=0; i<numeros.length; i++) {
			if(listRomanos.contains(numeros[i])) {
				for(int j = 0; j < this.romanos.length; j++) {
					if(numeros[i].equals(this.romanos[j][0])) {
						result = result + (this.romanos[j][1] + ' ');
					}
				}
			} else {
				return "No es un numero romano";
			}
		}
	return result;
}

    public static void main(String[]args){
    	NumerosRomanos romansToletter = new NumerosRomanos();
    	System.out.println(romansToletter.convert());
    }

}
