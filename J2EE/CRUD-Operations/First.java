package First_Sevlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class First extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Hi i am called");
		PrintWriter pw = res.getWriter();
		pw.print("<html><body>");
		pw.print("<h1>Hi this is first servlet getting triggered</h1>");
		pw.print("</html></body>");		
	}

}
