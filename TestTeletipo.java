package ejer1colecciones;
import java.util.Scanner;
import java.io.IOException;
public class TestTeletipo {

	public static void main(String[] args) throws IOException{
		System.out.println("Ingresar Solo un caracter: ");
		Scanner sc=new Scanner(System.in);
		String caracter=sc.nextLine();
		System.out.println("Ingresar Solo un caracter: ");
		Scanner sc1=new Scanner(System.in);
		String caracter1=sc1.nextLine();
		System.out.println("Ingresar Solo un caracter: ");
		Scanner sc2=new Scanner(System.in);
		String caracter2=sc2.nextLine();
		Teletipo p= new Teletipo();
		
		p.getCaracteres().add(caracter);
		p.getCaracteres().add(caracter1);
		p.getCaracteres().add(caracter2);
		p.escritura();
		p.archivar();
		System.out.println(p.toString());
	}
//corregir el metodo para modificar la escritura
//realizar en teletipo un array del tipo char o string... (volver a hacer)
}
