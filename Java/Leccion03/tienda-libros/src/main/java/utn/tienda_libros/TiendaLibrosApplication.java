package utn.tienda_libros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import utn.tienda_libros.vista.LibroForm;

@SpringBootApplication
public class TiendaLibrosApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext contextoSpring =
				new SpringApplicationBuilder(TiendaLibrosApplication.class)
						.headless(false).web(WebApplicationType.NONE)
						.run(args);
		//Ejecutamos el codigo para cargar el formulario
		//Metodo lambda
		java.awt.EventQueue.invokeLater(() -> {
			//Obtenemos el objeto form a traves de spring
			LibroForm libroForm = contextoSpring.getBean(LibroForm.class);
			libroForm.setVisible(true);
		});
	}

} //Fin clase Tienda libros application