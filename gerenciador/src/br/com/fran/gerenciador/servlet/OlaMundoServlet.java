package br.com.fran.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//olamundo
@WebServlet(urlPatterns = "/olamundo")
public class OlaMundoServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException  {
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("Ol� mundo! Servlet funcionando.");
		out.println("</body>");
		out.println("</html>");
		
		System.out.println("O servlet OlaMundo foi chamado");
		
	}

}
