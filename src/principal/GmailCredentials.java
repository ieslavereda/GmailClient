package principal;

import config.Configuracion;

public class GmailCredentials {

	// Singleton instance
	private static GmailCredentials credential = new GmailCredentials();

	private String userEmail;
	private String clientId;
	private String clientSecret;
	private String accessToken;
	private String refreshToken;

	private GmailCredentials() {

		Configuracion configuracion = Configuracion.getConfiguracion();
		
		userEmail = configuracion.getMailFrom();
		clientId = configuracion.getMailClientId();
		clientSecret = configuracion.getMailClientSecret();
		accessToken = configuracion.getMailAccessToken();
		refreshToken = configuracion.getMailRefreshToken();

	}
	
	public static GmailCredentials getCredential() {
		return credential;
	}

	public String getUserEmail() {
		return credential.userEmail;
	}

	public String getClientId() {
		return  credential.clientId;
	}

	public String getClientSecret() {
		return credential.clientSecret;
	}

	public String getAccessToken() {
		return credential.accessToken;
	}

	public String getRefreshToken() {
		return credential.refreshToken;
	}

}
