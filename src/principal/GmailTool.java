package principal;

import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;

import config.Configuracion;

import java.io.File;
import java.util.ArrayList;
import javax.mail.internet.MimeMessage;

public class GmailTool {
	
	public static void sendText(String to, String subject, String body) {
		try {

			GmailService gmailService = new GmailServiceImpl(GoogleNetHttpTransport.newTrustedTransport());
			gmailService.setGmailCredentials(new GmailCredentials());
			gmailService.sendMessage(to, subject, body);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void sendHtml(String to, String from, String subject, String body) {
		try {

			GmailService gmailService = new GmailServiceImpl(GoogleNetHttpTransport.newTrustedTransport());
			gmailService.setGmailCredentials(new GmailCredentials());

			MimeMessage mm = gmailService.createEmailWithAttachment(to, Configuracion.getConfiguracion().getMailFrom(), subject, body, null);

			gmailService.sendMessage(to, mm);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void sendHtmlWithAttachment(String to, String from, String subject, String body, ArrayList<File> files) {
		try {
	
			GmailService gmailService = new GmailServiceImpl(GoogleNetHttpTransport.newTrustedTransport());
			gmailService.setGmailCredentials(new GmailCredentials());

			MimeMessage mm = gmailService.createEmailWithAttachment(to, Configuracion.getConfiguracion().getMailFrom(), subject, body, files);

			gmailService.sendMessage(to, mm);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void sendHtmlWithAttachment(String to, String from, String subject, String body, File folder) {
		try {
			ArrayList<File> files = new ArrayList<File>();
			File[] filesToAttach = folder.listFiles();
			
			for(File file : filesToAttach){
				files.add(file);
			}
			

			GmailService gmailService = new GmailServiceImpl(GoogleNetHttpTransport.newTrustedTransport());
			gmailService.setGmailCredentials(new GmailCredentials());

			MimeMessage mm = gmailService.createEmailWithAttachment(to, Configuracion.getConfiguracion().getMailFrom(), subject, body, files);

			gmailService.sendMessage(to, mm);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
