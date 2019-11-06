
package clases;


public class Datos {
    public boolean validarUsuario(String usuario, String clave){
        if (usuario.equals("net")&&clave.equals("1089")) {
            return true;
        } else {
            return false;
        }
    }
            
}
