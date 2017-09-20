package middleTaller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.jetty.client.HttpClient;
import org.eclipse.jetty.client.api.ContentResponse;
import org.eclipse.jetty.client.util.StringContentProvider;
import org.eclipse.jetty.http.HttpHeader;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.AbstractHandler;
import org.eclipse.jetty.util.ssl.SslContextFactory;


public class AppMainJetty extends AbstractHandler
{
    @Override
    public void handle( String target,
                        Request baseRequest,
                        HttpServletRequest request,
                        HttpServletResponse response ) throws IOException,
                                                      ServletException
    {

        // Declare response status code
        response.setStatus(HttpServletResponse.SC_OK);
        // Inform jetty that this request has now been handled
        baseRequest.setHandled(true);


        if( request.getMethod() == "POST") {

        	BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));
            StringBuilder jsonString = new StringBuilder();
            if(br != null){
				String line;
				// Obtiene todas las lineas del POST
				while( (line = br.readLine()) != null) {
				   jsonString.append(line);
				}
            }
			
			//  REENVIAR AL BACK !!!
			SslContextFactory sslContextFactory = new SslContextFactory();
	        HttpClient httpClient = new HttpClient(sslContextFactory);
	        httpClient.setFollowRedirects(false);
	        try {
				httpClient.start();
				org.eclipse.jetty.client.api.Request requestBack = httpClient.POST("http://130.211.138.52/app.php/cuentas");
				requestBack.header(HttpHeader.CONTENT_TYPE, "application/json");
				requestBack.content(new StringContentProvider(jsonString.toString(),"utf-8"));
				
				ContentResponse responseBack = requestBack.send();
			    String res = new String(responseBack.getContent());
			    System.out.println(res);
			    httpClient.stop();
			        
			} catch (Exception e) {
				e.printStackTrace();
			}
	        
            
	        // Declare response encoding and types
	     	response.setContentType("application/javascript; charset=utf-8");
	     	// Responder a Postman
	     	response.getWriter().println("Revisar http://130.211.138.52");
			

        }else {

        // Declare response encoding and types
        response.setContentType("text/html; charset=utf-8");
		//  Respuesta por el metodo Get 
		response.getWriter().println("<h1>Middle Prototype !!</h1> : " +  request.getMethod());


        }
        	
    }

    
    public static void main( String[] args ) throws Exception
    {
        Server server = new Server(8001);
        server.setHandler(new AppMainJetty());
        server.start();
        server.join();
    }
}