package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/user")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,HttpServletResponse response) 
	throws ServletException, IOException{
		System.out.println("接收到请求");
		PrintWriter writer = response.getWriter();
		writer.print("scuccess");
<<<<<<< HEAD
		System.out.println("a22");
=======
		System.out.println("a22");
>>>>>>> refs/remotes/origin/master
		writer.close();
	}

}
