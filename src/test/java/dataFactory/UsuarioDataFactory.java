package dataFactory;

import pojo.UsuarioPojo;

public class UsuarioDataFactory {

    static UsuarioPojo usuario = new UsuarioPojo();
    public static UsuarioPojo setLogin(){
        usuario.setUsuarioLogin("admin");
        usuario.setUsuarioSenha("admin");
        return usuario;
    }



}
