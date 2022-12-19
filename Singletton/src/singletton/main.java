/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singletton;

/**
 *
 * @author lucas
 */
public class main {

    public static void main(String[] args) {
        // Creo una instancia de la clase Base:
        Base base = new Base();
        base.setNombreDeUsuario("Damian");
        base.setTokenDeAutenticación("654CD");

        // Obtener una instancia de la clase Base
        Base base2 = Base.obtenerNuevoUsuario();

        // Imprimo usuario y token:
        System.out.println(base.getNombreDeUsuario());
        System.out.println(base.getTokenDeAutenticación());
    }
}
