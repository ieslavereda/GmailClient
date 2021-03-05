package config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Configuracion {

	private final String defaultConfigFile = "default.properties";
	private final String appConfigFile = "app.properties";
	private Properties appProperties;

	private static Configuracion myConfiguracion;

	private Configuracion() {

		Properties defaultProperties = new Properties();
		OutputStream output = null;

		try (FileInputStream fis = new FileInputStream(new File(defaultConfigFile))) {

			defaultProperties.load(fis);

		} catch (Exception e) {
			e.printStackTrace();
		}

		appProperties = new Properties(defaultProperties);

		try (FileInputStream fis = new FileInputStream(appConfigFile)) {

			appProperties.load(fis);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Configuracion getConfiguracion() {
		if (myConfiguracion == null)
			myConfiguracion = new Configuracion();

		return myConfiguracion;
	}

	public String getMailSmtpReply() {
		return appProperties.getProperty("mail.smtp.reply");
	}

	public String getMailFrom() {
		return appProperties.getProperty("mail.from");
	}

	public String getMailClientId() {
		return appProperties.getProperty("mailClientId");
	}

	public String getMailClientSecret() {
		return appProperties.getProperty("mailClientSecret");
	}

	public String getMailAccessToken() {
		return appProperties.getProperty("mailAccessToken");
	}

	public String getMailRefreshToken() {
		return appProperties.getProperty("mailRefreshToken");
	}

	public String getApplicationName() {
		return appProperties.getProperty("applicationName");
	}

	public String getNameFrom() {
		return appProperties.getProperty("nameFrom");
	}

}
