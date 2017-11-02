package fr.polytech.pays.client;

import java.io.IOException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.axis2.AxisFault;

import fr.polytech.pays.ws.PaysServiceExceptionException;
import fr.polytech.pays.ws.PaysServiceStub;
import fr.polytech.pays.ws.PaysServiceStub.Pays;

@WebServlet("")
public class Home extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
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
		List<Pays> mesPays = new ArrayList<Pays>();

		try {
			PaysServiceStub.GetListeTousLesPays lp = new PaysServiceStub.GetListeTousLesPays();			
			PaysServiceStub.GetListeTousLesPaysResponse lpr;

			lpr = service.getListeTousLesPays(lp);
			
			Pays[] pays = (Pays[]) lpr.get_return();
			
			for(int i = 0; i < pays.length; i++)
			{
				mesPays.add(pays[i]);
			}
				
			request.setAttribute("pays", mesPays);

			this.getServletContext()
					.getRequestDispatcher("/index.jsp")
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
