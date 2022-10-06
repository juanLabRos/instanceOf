/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkginstanceof;
import dominio.alumno;
import dominio.fruta;
import dominio.galleta;
import dominio.manzana;
import dominio.naranja;
import dominio.persona;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Juan Labandeira
 */
public class InstanceOf {
    private List cesta = new ArrayList();
    
    private void verificar(Object objeto){
	if(objeto instanceof fruta){
	    cesta.add(objeto);
	    System.out.println("Fruta agregada a la cesta: "+((fruta)objeto).getNombre());
	}else{
	    System.out.println("Elemento no permitido. Ha introducido "+((galleta)objeto).getNombre()+" en lugar de frutas");
	}
    }
    
	
   
    public static void main(String[] args) {
	
	System.out.println("Aplicación para entender el uso del instanceOf");
	System.out.println("Instanceof nos permite comprobar si un objeto es de una clase concreta");
	
	/*alumno al1 = new alumno();
	if(al1 instanceof persona){
	System.out.println("Es una persona");*/
	
	
	//Ejercicio de internet
	/* Se tiene una cesta de compra donde se debe solo permitir
	ingresar frutas.
	*/
	
	System.out.println("Por favor, ingrese sólo frutas");
	
	List cesta = new ArrayList();
	manzana m1 = new manzana ("Manzana roja");
	manzana m2 = new manzana ("Manzana verde");
	naranja n1 = new naranja ("Naranja valencia");
	naranja n2 =new naranja ("Naranja sin pepitas");
	galleta g1 = new galleta("Galleta María");
	galleta g2 = new galleta ("Galleta Príncipe");
	
	cesta.add(m1);
	cesta.add(m2);
	cesta.add(n1);
	cesta.add(n2);
	cesta.add(g1);
	cesta.add(g2);
	
	InstanceOf io = new InstanceOf();
	io.verificar(m1);
	io.verificar(m2);
	io.verificar(n1);
	io.verificar(n2);
	io.verificar(g1);
	io.verificar(g2);
	
    }
}
    
    
   
    

