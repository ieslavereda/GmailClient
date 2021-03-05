package principal;

import config.Configuracion;

public class GmailCredentials {
	

	
    private final String userEmail=Configuracion.getConfiguracion().getMailFrom();
    private final String clientId=Configuracion.getConfiguracion().getMailClientId();
    private final String clientSecret=Configuracion.getConfiguracion().getMailClientSecret();
    private final String accessToken = Configuracion.getConfiguracion().getMailAccessToken();
    private final String refreshToken = Configuracion.getConfiguracion().getMailRefreshToken();
	  
    public String getUserEmail() {
		return userEmail;
	}
	public String getClientId() {
		return clientId;
	}
	public String getClientSecret() {
		return clientSecret;
	}
	public String getAccessToken() {
		return accessToken;
	}
	public String getRefreshToken() {
		return refreshToken;
	}
    
}
