package lendle.courses.network.simplemvc;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */

@WebServlet(name = "ShowBalanceServelet",urlPatterns = {"/ShowBalanceServelet"})
public class ShowBalanceServelet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id=request.getParameter("id");
        BankCustomer customer=BankCustomer.getCustomer(id);
        if(customer==null){
        }else if(customer.getBalance()<0){
            request.setAttribute("customer", customer);
            RequestDispatcher rd=request.getRequestDispatcher("/bank-account/NegativeBalance.jsp");
            rd.forward(request, response);
        }else if(customer.getBalance()>10000){
        }else{
    }
    }
}