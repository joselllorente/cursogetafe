package es.curso.java.ficheros.ejercicios;

import java.io.File;
import java.time.LocalDateTime;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GestionFicheros {
	private static final Logger logger = LogManager.getLogger(GestionFicheros.class);
	private int contadorJPGs;
	
	public static void main(String[] args) {
		GestionFicheros gestionFicheros = new GestionFicheros();
		gestionFicheros.empiezaEjercicio();

	}
	
	public void empiezaEjercicio() {
		File dir = new File("./enunciados/ficheros/directorios2");
//		contarJPGs(dir);
//		logger.info("Hay un total de " + this.contadorJPGs + " fichero .jpg");
		LocalDateTime datetime = LocalDateTime.now();
		logger.info(datetime);
		//mostrarNombreFicheroAnioActual(dir, String.valueOf(datetime.getYear()));
		
		renombrarFichero(dir,
				String.valueOf(datetime.getYear()+1),
				String.valueOf(datetime.getMonthValue()));
		
	}
	
	public void contarJPGs (File directorio) {
		logger.debug("Buscando jpgs en directorio "+ directorio.getAbsolutePath());
		File[] files = directorio.listFiles();
		for (File file : files) {
			if (file.isDirectory()) {
				contarJPGs(file);
			}else {
				logger.debug("Encontrado un fichero");
				if(file.getName().endsWith(".jpg")) {
					logger.debug("es un jpg");
					contadorJPGs++;
				}
			}
		}
	}
	
	public void mostrarNombreFicheroAnioActual (File directorio, String anioActual) {
		logger.debug("Buscando ficheros con el año actual "+ anioActual +
				" en el nombre dentro del directorio "+directorio.getAbsolutePath() );
		
		File[] files = directorio.listFiles();
		for (File file : files) {
			if (file.isDirectory()) {
				mostrarNombreFicheroAnioActual(file,anioActual);
			}else {
				logger.debug("Encontrado un fichero");
				if(file.getName().contains(anioActual)) {
					logger.info("Encontrado un fichero con el año actual");
					printInfoFile(file);
				}
			}
		}
	}
	
	
	public void renombrarFichero (File directorio, String anioActualMasUno, String mesActual) {
		logger.debug("Buscando ficheros con el año actual +1"+ anioActualMasUno +
				" en el nombre dentro del directorio "+directorio.getAbsolutePath() );
		
		File[] files = directorio.listFiles();
		for (File file : files) {
			if (file.isDirectory()) {
				renombrarFichero(file,anioActualMasUno,mesActual);
			}else {
				logger.debug("Encontrado un fichero");
				if(file.getName().contains(anioActualMasUno) && 
						file.getName().contains(mesActual)) {
					logger.info("Encontrado un fichero con el año actual+1 y el mes actual");
					//Crear el directorio
					String sNewDir = file.getParent()+"\\carpetanueva";
					
					File newDir = new File(sNewDir);
					logger.debug("Creando directorio " + sNewDir);
					boolean directorioCreado = newDir.mkdir();
					
					if(directorioCreado) {
						logger.info("Renombrado a extension .done");
						File renamedFile = new File(newDir,file.getName()+".done");
						file.renameTo(renamedFile);
					}else {
						logger.warn("El directorio no se ha creado correctamente");
					}

				}
			}
		}
	}
	
	
	private void printInfoFile(File fichero) {
		logger.info("Ruta: "+fichero.getAbsolutePath());
		logger.info("Tamaño: "+fichero.length());
		logger.info("Oculto: "+fichero.isHidden());
		logger.info("Se puede ejecutar: "+fichero.canExecute());
		logger.info("Se puede leer: "+fichero.canRead());
		logger.info("Se puede escribir: "+fichero.canWrite());
		
	}
	


}

