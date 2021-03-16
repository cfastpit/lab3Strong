/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import domain.Customer;
import domain.LoginException;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletContext;

/**
 *
 * @author dstrong
 */
public class LoginServlet extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Customer.initialize();
        
        ServletContext sc = getServletContext();
        
        String action = request.getParameter("action");
         
        String url = "/login.jsp";
        String uid = request.getParameter("userId");
        String pass = request.getParameter("password");
        Customer c = null;
        try{
            c = Customer.login(uid, pass);
            request.setAttribute("customer", c);
            url = "/order.jsp";
        }
        
        catch(LoginException e){
           request.setAttribute("message", e.getMessage()); 
        }
        
         finally{
            sc.getRequestDispatcher(url).forward(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
