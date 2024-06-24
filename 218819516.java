import java.util.Map;
import java.util.HashMap;

public class 218819516 {
	public static class HTTPRequestMsg {
		public String method;
		public String url;
		public String version;
		public Map<String, String> headerFieldNames = new HashMap<>();
		public String entityBody;
	}
	
	public static class HTTPResponseMsg {
		public String version;
		public int statusCode;
		public String phrase;
		public Map<String, String> headerFieldNames = new HashMap<>();
		public String entityBody;
	}
	
	public static class DNSMsg {
		public int id;
		public int flags;
		public int numOfQuestions;
		public int numOfAnswerRRs;
		public int numOfAuthorityRRs;
		public int numOfAdditionalRRs;
		
		public String queryNameField;
		public int queryTypeField;
		
		public Map<String, String> answerRecords = new HashMap<>();
		public Map<String, String> authorityRecords = new HashMap<>();
		public Map<String, String> additionalRecords = new HashMap<>();
	}

}
