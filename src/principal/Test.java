package principal;

import java.io.File;
import java.util.ArrayList;
import config.Configuracion;

public class Test {

	public static void main(String[] args) {

		// Cambiar el destinatario
		String to = "joaalsai@gmail.com";

		String from = Configuracion.getConfiguracion().getMailFrom();
		String subject = "😁 Mail de prueba 😁";
		String body = "Esto es una prueba de texto plano";
		
		String subjectHtml = "👾 Mail de prueba de texto hmtl 👾";
		String bodyHtml = "";
		bodyHtml += "<h1>Esto es una prueba de texto html</h1>";
		bodyHtml += "<h2>Esto es una prueba de texto html</h2>";
		bodyHtml += "<h3>Esto es una prueba de texto html</h3>";
		bodyHtml += "<h4>Esto es una prueba de texto html</h4>";

		ArrayList<File> files = new ArrayList<File>();
		files.add(new File("prueba.txt"));

		// Envios de mensajes de prueba		
		GmailTool.sendHtml(to, from, subject, body);
		GmailTool.sendHtmlWithAttachment(to, from, subjectHtml, bodyHtml, files);

	}
}
