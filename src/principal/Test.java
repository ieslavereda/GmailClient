package principal;

import java.io.File;
import java.util.ArrayList;
import config.Configuracion;

public class Test {

	public static void main(String[] args){
		
		// Cambiar el destinatario
		String to = "joaalsai@gmail.com";
		
		String from = Configuracion.getConfiguracion().getMailFrom();
		String subject = "Mail de prueba";
		String body = "Esto es una prueba";
		
		ArrayList<File> files = new ArrayList<File>();
		files.add(new File("prueba.txt"));
		
		// Envios de mensajes de prueba
		GmailTool.sendHtml(to, from, subject, body);
		GmailTool.sendHtmlWithAttachment(to, from, subject, body, files);
		
	}
}
