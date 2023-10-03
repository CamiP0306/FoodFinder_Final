package Paginas;

public class Sesion {
	private static boolean usuRegis = false;
	
	public static boolean estadousuRegis() {
        return usuRegis;
    }

    public static void setusuRegis(boolean registrado) {
    	usuRegis = registrado;
    }
}
