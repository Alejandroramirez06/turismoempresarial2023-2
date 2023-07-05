package org.example;

import org.example.modelos.Usuario;

public class Main {
    public static void main(String[] args) {
        Integer edad=19;
        Universidad objetoUniversidad=new Universidad("Alejandro");
        Usuario objetoUsuario=new Usuario(25,"Alejandro","123",4,"alejo@gmail.com");
        System.out.println(objetoUniversidad);
        System.out.println(objetoUsuario);
    }
}
