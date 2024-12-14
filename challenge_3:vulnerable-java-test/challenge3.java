//Example case 1
//"SELECT * FROM users WHERE userid ='"+ username + "'" + " AND password='" + Base64.getEncoder().encodeToString(passwordString.getBytes()) + "'";
//Base64.getEncoder().encodeToString(passwordString.getBytes())
String sql_query = "SELECT * FROM users WHERE userid =? AND password=?";   // zero trust
PreparedStatement prepStmt = conn.prepareStatement(sql_query);
prepStmt.setString(1, username); 
prepStmt.setString(2, Base64.getEncoder().encodeToString(passwordString.getBytes()));
prepStmt.executeUpdate();
prepStmt.close();
//End of example

//Example case 2
public void postToMessageBoard(MessageBoard mb){
	try{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine(); //VIOLATION, Resource Exhaustion, Arbitrary Injection No (Assume we do preparedstatement in SQl query), DDOS Need to sanitize userinput  zero trust
		mb.post(s)
	}
	catch(Exception e){
		//Handle Throw Error	
	}
}
//End of Example

//Example case 3
String url = request.getParameter("hidden_url"); // not so hidden...
//Build an url validator 
//Class UrlValidator Default schemes: {https,http,ftp} 
UrlValidator urlValidator = new UrlValidator();
//perform zero trust
if (urlValidator.isValid(url) {
      URL url = new URL(url); 
      InputStream is = url.openConnection().getContent();
    } else {
      //Security Logging
    }

//End of Example
