/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singletton;

/**
 *
 * @author lucas
 */
public class Base {

    private String nombreDeUsuario = "";
    private String tokenDeAutenticación = "";

    //constructores
    public Base(String nombreDeUsuario, String tokenDeAutenticación) {
        this.nombreDeUsuario = nombreDeUsuario;
        this.tokenDeAutenticación = tokenDeAutenticación;
    }

    public Base() {
    }

    public String getNombreDeUsuario() {
        return nombreDeUsuario;
    }

    public void setNombreDeUsuario(String nombreDeUsuario) {
        this.nombreDeUsuario = nombreDeUsuario;
    }

    public String getTokenDeAutenticación() {
        return tokenDeAutenticación;
    }

    public void setTokenDeAutenticación(String tokenDeAutenticación) {
        this.tokenDeAutenticación = tokenDeAutenticación;
    }

    
    private static Base usuario1 = new Base("Damian", "654CD");

    private static Base usuario2 = null;

    public static Base obtenerNuevoUsuario() {
        if (usuario2 == null) {
            usuario2 = new Base();
        }
        return usuario2;
    }

    public static Base getUsuario1() {
        return usuario1;
    }
}
