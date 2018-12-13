package principal;

import config.Configuracion;

public class GmailCredentials {
	
	Configuracion conf = new Configuracion();
	
    private final String userEmail=conf.getMailFrom();
    private final String clientId=conf.getMailClientId();
    private final String clientSecret=conf.getMailClientSecret();
    private final String accessToken = conf.getMailAccessToken();
    private final String refreshToken = conf.getMailRefreshToken();
	  
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
