/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 847240
 */
public class shoppingList extends HttpServlet {

   

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //session
        HttpSession session = request.getSession();
        
        if (request.getParameter("action") != null) {
            if (request.getParameter("action").equals("logout")) {

                session.invalidate();
                getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
                return;
            }
        } else {
            
            System.out.println("run");
            ArrayList<String> List = new ArrayList<>();
            session.setAttribute("List", List);
            getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
            return;
        }

        
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //session
         HttpSession session = request.getSession();
        if (request.getParameter("action") != null) {
            
            if (request.getParameter("action").equals("registerName")) {
                
                ArrayList<String> List = new ArrayList<>();
                session.setAttribute("List", List);
   
            }
        }

        ArrayList<String> List;
        String addItem = request.getParameter("addItem");

        List = (ArrayList<String>) session.getAttribute("List");
        if (addItem != null) {
            if (!addItem.trim().isEmpty()) {
                List.add(addItem);
                session.setAttribute("List", List);
            }
        }

        String username = request.getParameter("username");
        if (username != null) {
            session.setAttribute("username", username);
        }

        if (request.getParameter("item_group") != null) {
            List.remove(request.getParameter("item_group"));
            session.setAttribute("List", List);
        }
        getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request, response);
    }

}
       
    

    


