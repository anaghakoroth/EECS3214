package A01;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static class HTTPRequestMsg {
		public String method;
		public String url;
		public String version;
		public Map<String, String> headers = new HashMap<>();
		public String entityBody;
	}
	
	public static class HTTPResponseMsg {
		public String version;
		public int statusCode;
		public String statusMsg;
		public Map<String, String> headers = new HashMap<>();
		public String entityBody;
	}
	
	public static class DNSMsg {
		public int id;
		public int flags;
		public int numOfQues;
		public int numOfAnsRRs;
		public int numOfAuthorityRRs;
		public int numOfAdditionalRRs;
		
		public String queryName;
		public int queryType;
		
		public Map<String, String> ansRecords = new HashMap<>();
		public Map<String, String> authorityRecords = new HashMap<>();
		public Map<String, String> additionalRecords = new HashMap<>();
	}

}
