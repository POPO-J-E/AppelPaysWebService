package fr.polytech.pays.client;

import java.io.IOException;
import java.rmi.RemoteException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.axis2.AxisFault;

import fr.polytech.pays.ws.PaysServiceExceptionException;
import fr.polytech.pays.ws.PaysServiceStub;
import fr.polytech.pays.ws.PaysServiceStub.Pays;

@WebServlet("/pays")
public class ShowPays  extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			appelWebservice(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			appelWebservice(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		}
	}

	public void appelWebservice(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		PaysServiceStub service = new PaysServiceStub();
		Pays monPays;
		String name = request.getParameter("name");
		System.out.println(name);
		try {			
			PaysServiceStub.GetUnPays r = new PaysServiceStub.GetUnPays();			
			PaysServiceStub.GetUnPaysResponse pr;

			r.setNomp(name);
			pr = service.getUnPays(r);
			
			monPays = pr.get_return();
				
			request.setAttribute("pays", monPays);

			this.getServletContext()
					.getRequestDispatcher("/pays.jsp")
					.forward(request, response);

		} catch (AxisFault t) {
			t.printStackTrace();
		} catch (RemoteException e1) {
			e1.printStackTrace();
		} catch (PaysServiceExceptionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
