package com.jagadeesh.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
//		set the content type
		response.setContentType("text/html");
		
//		get the parameter value for userName from the request
		String userName= request.getParameter("userName");
		
//		get the parameter value for credit card from the request
		String userCreditCardNumber=request.getParameter("userNumber");
		
//		get a PrintWriter
		PrintWriter out=response.getWriter();
//		Response with a message
//		out.println("Hello good morning every one");
		
		
		out.println("wellcome to jagadeesh......");
//		out.println("<br>Welcome"     + userName+ "<br>");
//		
//		out.println("your number is "+userCreditCardNumber);

}
	


}
