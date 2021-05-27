package _run;

import org.openxava.util.*;

/**
 * Ejecuta esta clase para arrancar la aplicación.
 *
 * Con Eclipse: Botón derecho del ratón > Run As > Java Application
 */

public class _Run_Ventas {

	public static void main(String[] args) throws Exception {
		DBServer.start("VentasDB"); // Para usar tu propia base de datos comenta esta línea y configura web/META-INF/context.xml
		AppServer.run("Ventas"); // Usa AppServer.run("") para funcionar en el contexto raíz
	}

}
