//Example case 1
//"SELECT * FROM users WHERE userid ='"+ username + "'" + " AND password='" + Base64.getEncoder().encodeToString(passwordString.getBytes()) + "'";
//Base64.getEncoder().encodeToString(passwordString.getBytes())
String sql_query = "SELECT * FROM users WHERE userid =? AND password=?";   // zero trust
Statement stmt = connection.createStatement();
ResultSet rs = stmt.executeQuery(query);
//End of example

//Example case 2
public void postToMessageBoard(MessageBoard mb){
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String s = br.readLine(); //VIOLATION, Need to sanitize userinput  zero trust
	mb.post(s)
}
//End of Example

//Example case 3
String url = request.getParameter("hidden_url"); // not so hidden...
URL url = new URL(url); // VIOLATION , url is user_input, perform zero trust
InputStream is = url.openConnection().getContent();
//End of Example
