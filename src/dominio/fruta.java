/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author Jon
 */
public class fruta {
    private String nombre;

    public fruta(String nombre) {
	this.nombre = nombre;
    }

    public String getNombre() {
	return nombre;
    }

    public void setNombre(String nombre) {
	this.nombre = nombre;
    }

    @Override
    public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append("fruta{");
	sb.append("nombre=").append(nombre);
	sb.append('}');
	return sb.toString();
    }
    
    
}
