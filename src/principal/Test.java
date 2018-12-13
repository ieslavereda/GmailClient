package principal;

import java.io.File;
import java.util.ArrayList;
import config.Configuracion;

public class Test {

	public static void main(String[] args){
		
		// Cambiar el destinatario
		String to = "to@ieslavereda.es";
		
		String from = (new Configuracion()).getMailFrom();
		String subject = "Mail de prueba";
		String body = "Esto es una prueba";
		
		ArrayList<File> files = new ArrayList<File>();
		files.add(new File("prueba.txt"));
		
		// Envios de mensajes de prueba
		GmailTool.sendHtml(to, from, subject, body);
		GmailTool.sendHtmlWithAttachment(to, from, subject, body, files);
		
	}
}