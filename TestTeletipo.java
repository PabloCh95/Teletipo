package ejer1colecciones;
import java.util.Scanner;
import java.io.IOException;
public class TestTeletipo {

	public static void main(String[] args) throws IOException{
		System.out.println("Ingresar Solo un caracter: ");
		Scanner sc=new Scanner(System.in);
		String caracter=sc.nextLine();
		Teletipo p= new Teletipo();
		p.escritura();

		System.out.println(p.toString());
	}
//corregir el metodo para modificar la escritura
//realizar en teletipo un array del tipo char o string... (volver a hacer)
}
