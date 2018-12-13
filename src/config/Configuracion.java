package config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Configuracion {

	private final String FICHERO = "config.properties";

	private Properties prop;
	
	private String mailSmtpReply;
	private String mailFrom;
	private String mailClientId;
	private String mailClientSecret;
	private String mailAccessToken;
	private String mailRefreshToken;
	private String applicationName;
	private String nameFrom;
	
	public Configuracion() {

		prop = new Properties();
		OutputStream output = null;

		File fc = new File(FICHERO);

		if (!fc.isFile()) {
			try {

				output = new FileOutputStream(FICHERO);

				// Propiedades para el envio de mail
				prop.setProperty("mail.smtp.reply", "noreply@gva.es");
				prop.setProperty("mail.from", "mail@tudominio.es");
				prop.setProperty("mailClientId","tu_Cliente_ID");
				prop.setProperty("mailClientSecret", "Secret_del_ClientID");
				prop.setProperty("mailAccessToken","Access_Token");
				prop.setProperty("mailRefreshToken", "Refresh_Token");	
				prop.setProperty("applicationName", "Nombre_de_la_aplicacion");		
				prop.setProperty("nameFrom", "Nombre_del_usario");		
				
				// save properties to project root folder
				prop.store(output, null);

			} catch (IOException io) {
				io.printStackTrace();
			} finally {
				if (output != null) {
					try {
						output.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}

			}
		}
		// Cargamos las propiedades
		cargar();
	}

	private void cargar() {

		prop = new Properties();
		InputStream input = null;

		try {

			input = new FileInputStream(FICHERO);

			// load a properties file
			prop.load(input);

			// get the property value and print it out

			
			this.mailSmtpReply = prop.getProperty("mail.smtp.reply");
			this.mailFrom = prop.getProperty("mail.from");
			this.mailClientId = prop.getProperty("mailClientId");
			this.mailClientSecret = prop.getProperty("mailClientSecret");
			this.mailAccessToken = prop.getProperty("mailAccessToken");
			this.mailRefreshToken = prop.getProperty("mailRefreshToken");
			this.applicationName = prop.getProperty("applicationName");
			this.nameFrom = prop.getProperty("nameFrom");
			
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public String getFichero() {
		return FICHERO;
	}


	public String getFICHERO() {
		return FICHERO;
	}

	public Properties getProp() {
		return prop;
	}

	public String getMailSmtpReply() {
		return mailSmtpReply;
	}

	public String getMailFrom() {
		return mailFrom;
	}
	

	public String getMailClientId() {
		return mailClientId;
	}

	public String getMailClientSecret() {
		return mailClientSecret;
	}

	public String getMailAccessToken() {
		return mailAccessToken;
	}

	public String getMailRefreshToken() {
		return mailRefreshToken;
	}

	public String getApplicationName() {
		return applicationName;
	}

	public String getNameFrom() {
		return nameFrom;
	}
	

}
