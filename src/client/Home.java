package client;

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

import ws.MonExceptionException;
import ws.PaysServiceStub;
import ws.PaysServiceStub.GetListeTousLesPaysResponse;
import ws.PaysServiceStub.Pays;

@WebServlet("/home")
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
		List<Pays> mesPays;

		try {			
			PaysServiceStub.GetListeTousLesPaysResponse lpr;
			
			lpr = service.getListeTousLesPays();
			
			mesPays = new ArrayList<Pays>();
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
		} catch (MonExceptionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
