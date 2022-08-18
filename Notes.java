
public class Notes {

	public Notes() {
		// TODO Auto-generated constructor stub
	}

}
/*


					Java Technology
						|
			--------------------------
			|			|			|
			JSE			JEE			JME
			|			|
		core java	-----------------
					|			|
					WEB			EJB
					|			|Spring/Hibernate
			---------------		--------------------------------------
			|			|		|				|				|
			Servlets	JSP	  Session			Entity			Message
								|					|
							--------------		-------------
							|			|		|		|
						stateless	stateful	BMP		CMP		
												JDBC	JPA
			
			
			

Enterprise application

1 Remote capability  - Networking
		
		Machine1
		Socket s1 = new Socket(ipaddress,portnumber);
				|
		Machine2|
		Socket s2 = new Socket(ipaddress,portnumber);
		
				Database
				|
				Server
				| ServerSocket 
			-----------
			|
			| Socket
			Client
			| <-REQUEST
			withdraw <-- click on this button
			
		Application layer - 
		Presentation layer - Mobile/Website/App
		Session layer - sesssion id - unique id 24 digits
		Transport layer - TSL - https
		Network layer
		Data link layer
		Physical layer
		
2 High availability - 24 X 7
 		Clustering
 		
3 Multithreading
		Thread 

4 Pooling of resources
	anywhere/common
		
		
5 Caching of resources
	rack/token 6 
	
6 Transaction management
		Atomicity Consistency Isolation Durable
		
7 Secured


		RPC
		RMI - remote method invocation
		

		Machine1								Machine2
		|
		SavingsAccount
		sa = new SavingsAccount();
		
												sa.withdraw(5000);

java.net
-----------
interface Remote
{

}
class UnicastRemoteObject { 

}

class SavingsAccount
{
  float balance;
  
	void withdraw(float amt) {
		balance = balance - amt; //REAL LOGIC IS HERE
	}
}

class Server
{
	SavingsAccount savRef; // this object would get initialized by the ServerApp
	
		Server() {
			savRef = new SavinsAccount(500000);
		}
		void withdraw(float amt) {
			savRef.withdraw(amt);
		}

}
========================================================


class Client
{
	Server serverRef;
	
		Client() {
			serverRef = new Server();
		}
		withdraw(float amt) {
			serverRef.withdraw(amt);
		}
}

class SavingsAccountImpl <-- STUB CODE 
{
	Client clientRef;
		SavinsgAccountImpl()
		{
				clientRef = new Client();
		}
		void withdraw(float amt)
		{
			clientRef.withdraw(amt);
		}
}









Room [ india ]				Train				  Room [ London ]
Father					Daughter + Mother         Son
chessboard					chessboard				chessboard
  |						|				|			|
  +---------------------+				+-----------+
  WHITE													BLACK
  move left pawn
  

						Java Programs
								|
			-------------------------------------------
			|					|				|
			applications		applets			servlets
			|					|				|
			main()				life cycle methods
								|				|
								it runs			runs on the server
								inside a		and produces dynamic
								browser			web output
								
								
								Server
								| bank application
								|
				-------------------------------------
				|		|		|		|		|			
				PC		ATM		Visa	Phone	SmartPhone
				|		|		|		|		|
			Browser		cash	swipe	SMS/	bankApp<-client
								cc/dc	IVR
			
1. A servlet container
			tomcat 
2. A Web server - request and response
			apache
			
				apache + tomcat 
				|			  |
				Webserver  life cycle management of Servlets
				
				
				
3.	Browser 
		to send the request
		to receive the response
		
		
4. A Servlet Development KIT
				shipped with JEE version
				
				
			
			DEVELOPER structure
			
					MyServletProject
					|
			-------------------
			|
			src
			|
	--------------
	|
	main
	|
------------
|
webapp
|
---------
	|
	WEB-INF
	|
-----------
|
lib

		
	JAva Based Web Application
	
	has a particular DEPLOYMENT structure
			
				MyServletProject
					|
			-----------------
			|				|
			WEB-INF			index.html
			|
		-------------
		|			|
	classes			lib
	|				|
YourServlet.class	external jar files
					(jdbc jar files etc)
			
			
			
					web output
					|
			------------------
			|				|
			static		  dynamic
			|					|
	     payment.html			YourServlet.java
	     |								|
<h2> payment done of $200 </h2>     	code 
										|
			PrintWriter pw = new PrintWriter(????to browser);
			pw.println("hello");
			
			pw.println("<h2> payment done of "+amt+"</h2>");
				|     |                            |    |
			java code html                         html java code
			
			
			
			



http://localhost:8080/MyServletProject/
<-----apache--------><------tomcat---->


				Servlet <-- interface 
					| 5 methods
					|   init(), getServletConfig()
					|   getServletInfo()
					|   service(), destroy()
			------------------
			|
	GenericServlet <-- abstract
		| service(); left as abstract
	----------------------
	|					|
YourServlet1			HttpServlet <-- not an abstract
 |						| service is already defined here
 |						| doGet(), doPost()
mandate to				YourServlet
define the
service

index.html
<form action="/login" method=post>
	enter username
	enter password
	submit
</form>



1. import the concerned packages
2. declare package
3. make a servlet that extends from GenericServlet
4. override the service method
5. make the PrintWriter

   java code -> for loop {
6. pw.println("<h1> Hello </h1>  ");
   <-Java-----> HTML      HTML <-Java Code-->	
   }
---------------
DATABASE - MODEL - data - DAO design pattern
|
JAVA CODE - SERVLET AS A CONTROLLER
|
HTML - VIEW - in the custody of JAVA coding

			MVC
			
			
GreetingServlet.java

			@WebServlet("/greet");
			protected void service(req,resp)
			{
					pw..
					pw.println....
			}
-----------------------------
Greeting.jsp
------------
1		<% for(int i=1;i<=6;i++) { %>
2			<h1> hello </h1>
3		<% } %>
			
	|
	transpiled - JSP(java server pages) Engine
	|
Greeting_jsp.java	
	|
	init,service, destory - extends - import - package
	|
Greeting_jsp.class

1) <% %> -- scriptlet

2) <%=var %> -- fetch scriptlet - to fetch the value
			of a variable or method return value
			
			
3) <%@page contentType="text/html" %>

4) <%@page import="java.util.ArrayList, java.awt.Button"%>







			UserManagementProject
					|index.html
		----------------------------
		|					|
		LoginServlet	RegisterServlet
		|					|
	----------		-------------------
	|				|
Authenticate	Register the user
The user		against the
against			insert query
the [login.html]	[ register.html ] [ regsiter.css ] [ register.js ]
Select Query					|
|							Use AJAX if the
UserNotFoundException		user email
must be thrown				is already found
if the user does not exist	in the html text box
|
else
|
DashBoardServlet would be presented
	|
Shows the User Details - Profile 
on clicking Logout - back to the index.html - or the main page	

	
			










*/