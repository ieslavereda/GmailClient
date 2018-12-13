![](http://www.redpostmedia.co.uk/wp-content/uploads/2015/11/gmail-logo-1-01.png)
# GmailClient 
Software para el envio de mails a traves de la API de Google.

Para poder enviar mensajes mediante este proyecto, deberemos obtener el **ClientID**, **ClientSecret**, **AccesToken** y **RefreshToken**. Estos valores los deberemos introducir en el fichero config.properties para ser cargados por la aplicacion:

```bash
# Configuracion para el envio de email
# mail de respuesta
mail.smtp.reply=noreply@ieslavereda.es
# mail que realiza los envios
mail.from=joaalsai@ieslavereda.es
# nombre de quien realiza los envios
nameFrom=Joaquin Vicente Alonso Saiz
# valores para las credenciales de envio
mailClientId=
mailClientSecret=
mailAccessToken=
mailRefreshToken=
# Nombre de la aplicacion
applicationName=LDAP-GAP
```

La explicacion de como generar los valores necesarios para el envio de mails se explica en  [Google API - Wiki Vereda](http://wiki.ieslavereda.es/index.php?title=Google_API#Envio_de_Mails)

Software realizado por:
- Joaquin Vicente Alonso Saiz (joaalsai@gmail.com - joaalsai@ieslavereda.es)
