package test;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dao.UnidadDAO;

import dao.impl.UnidadDAOImpl;

import entity.Unidad;

/**
 * Servlet implementation class Test
 */
@WebServlet("/Test")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
UnidadDAO dao=new UnidadDAOImpl();
Unidad uni=new Unidad();
uni.setIdUnidad(1);
uni.setDescripcion("DIRTIC");
uni.setEstado(1);




try {
	System.out.println("Insert......"+dao.save(uni));
	System.out.println("listar......"+dao.listar().toString());
	System.out.println("listar......"+dao.update(uni));
	System.out.println("listar......"+dao.getObjeto(1).toString());
	
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

		
		
		
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
