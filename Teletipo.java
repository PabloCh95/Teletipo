package ejer1colecciones;
/*1)En una terminal de teletipo existe un carácter de retroceso 
 * que permite cancelar el último carácter. Por ejemplo: si 
 * el carácter de retroceso es /, entonces la línea abc/d//e 
 * será interpretada como ae. Existe también un carácter anulador
 * que elimina todos los caracteres ingresados hasta el momento,
 * suponga que ese carácteres  &. Realice un método que dada una
 * tira de caracteres terminadas con * (leída del archivo “Fuente.txt”)
 * ejecute las operaciones indicadas si se encuentra con el carácter 
 * / o el &. Debe por ultimo imprimir la tira resultante.
 * 
 * */
//APRENDER MANEJO DE ARCHIVOS//

//PARA HACER LA COMPARACION TENGO QUE UTILIZAR EL METODO EQUALS
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Teletipo {
	//CONSTANTES
	private final static String canccarac="/";
	private final static String anulador="&";
//----------------------Atributos----------------------------
	private ArrayList<String> caracteres=new ArrayList();
//----------------------Constructores-------------------------	
	Teletipo(ArrayList<String> caracteres)
	{
		this.setCaracteres(caracteres);
	}
	Teletipo()
	{
		
	}
//----------------------METODOS--------------------------------
//---------------------Getters y Setters---------------------------
	public ArrayList<String> getCaracteres() {
		return caracteres;
	}
	public void setCaracteres(ArrayList<String> caracteres) {
		this.caracteres = caracteres;
	}
//------------------------Metodo Resolutivo------------------------
/*IDEA IMPLEMENTAR EL METODO EQUALS PARA LA COMPARACION Y EN EL METODO ESCRITURA INGRESAR UN STRING 
 * PREVIAMENTE ESTABLECER CONSTANTES DE STRING PARA ESTABLECER CUALES SON LOS CARACTERES
 * QUE CUMPLEN CON TAL FUNCION DE BORRADO TOTAL Y DE RETROCESO...
 * */
	public void escritura() 
	{	try{int x=0;
		for(String es: getCaracteres()) 
		{
			x=es.indexOf("/");
			if(es.equals("/"))
			{
				getCaracteres().remove(x);
				getCaracteres().remove(x-1);
			}else {
				if(es.equals("&")) 
				{
					getCaracteres().removeAll(getCaracteres());
				}
			}
		}
		}catch (NullPointerException miException){
			System.out.println("No funciono");
		}finally 
		{
			System.out.println("Se termino");
		}
	}
//Archivar
	public void archivar() throws IOException 
	{
		String mipath="C:\\Users\\54113\\Desktop";
		BufferedWriter c=new BufferedWriter(new FileWriter(mipath +"\\Mi Lista2.txt"));
		for(String a:getCaracteres()) {
		c.write("Caracteres: " + a);
		c.newLine();
		}
		c.close();
	}
//------------------------toString---------------------------------
	public String toString() 
	{
		return "los caracteres son: " + getCaracteres();
	}
	
//------------------------EQUALS------------------------------------
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((caracteres == null) ? 0 : caracteres.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teletipo other = (Teletipo) obj;
		if (caracteres == null) {
			if (other.caracteres != null)
				return false;
		} else if (!caracteres.equals(other.caracteres))
			return false;
		return true;
	}
}
