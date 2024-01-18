package test.epam.java8.helperClasses;

public class Response {

	public String responseBody;
	public int responseCode;
	public String responseType;

	public Response(String responseBody, int responseCode, String responseType) {

		this.responseBody = responseBody;
		this.responseCode = responseCode;
		this.responseType = responseType;
	}

}
