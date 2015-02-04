import java.util.Hashtable;
import java.util.Set;

/**
 * @author Jesse Dahir-Kanehl
 * created - Feb 4th, 2015
 * 
 * Only has one method which is called by the web server
 */

public class HttpRequestHandler implements HttpResponse{
	
	String version, statusCode, description, body;
	Hashtable<String, String> headers = new Hashtable<>();
	
	@Override
	public String getVersion() {
		return version;
	}

	@Override
	public String getStatusCode() {
		return statusCode;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public String getHeader(String key) {
		return headers.get(key);
	}

	@Override
	public Set<String> getHeaderNames() {
		return headers.keySet();
	}

	@Override
	public String getBody() {
		return body;
	}

	@Override
	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	@Override
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public void setHeader(String key, String value) {
		headers.put(key, value);
	}
	
	/**
	 * 
	 * @param request
	 * @return
	 */
    public HttpResponse handleRequest(HttpRequest request) {	
    	
    
    
    
    }

	
}
