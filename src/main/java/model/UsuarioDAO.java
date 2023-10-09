/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author santi
 */
public class UsuarioDAO {
    
    public Usuario autenticar(String nombre , String pass){
        Usuario x = null;
        if(pass.equals("123") && nombre.equals("santiago")){
            x = new Usuario(nombre, pass);
        }
        
        return x;
    }
    
}
