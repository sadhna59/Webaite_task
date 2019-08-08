package website_task;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SigninServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	//	super.service(arg0, arg1);
	
		//************session thing
		
	/*	HttpSession ses= req.getSession();
		System.out.println("value of reference variable of httpsession " + ses);
	System.out.println(ses.getId());
	System.out.println("class name "+ ses.getClass().getName());
	*/		
		
	System.out.println("service of loginservlet10");
	String unm=req.getParameter("uname");
	String pw=req.getParameter("password");
	Writer out=res.getWriter();
	
	out.write("<h1>Hi,Welcome to Jtc");
	String page="";
	boolean check=true;
	
	if(unm==null||unm.trim().isEmpty()) {
		page="Required.html";
		
		check=false;
		
		RequestDispatcher rd=req.getRequestDispatcher(page);
		
        rd.forward(req, res);
	
	}else if(pw==null||pw.trim().isEmpty()) {
		page="Required.html";
		check=false;
		RequestDispatcher rd=req.getRequestDispatcher(page);
		
        rd.forward(req, res);
	
	}
	
if(check) {
	 if(unm.equals(pw)){

		page="Home.html";
		RequestDispatcher rd=req.getRequestDispatcher(page);
		
        rd.forward(req, res);
	
 }else {
		page="success.html";
		RequestDispatcher rd=req.getRequestDispatcher(page);
		
        rd.forward(req, res);
 }	}
	
	
out.write("<h1>Again welcominh to jtc");
System.out.println("*******service completed-last-statement");

	}
	
	

}
