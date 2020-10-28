package ex7;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Storm
 */
public class Calculate extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        String num1Str = request.getParameter("num1");
        double num1 = Double.parseDouble(num1Str);
        
        String num2Str = request.getParameter("num2");
        double num2 = Double.parseDouble(num2Str);
        double answer=0.0;
        
        if (request.getParameter("Add") != null) {
                System.out.print("Button1 is pushed");
                answer = num1+num2;
            }
        else if (request.getParameter("Sub") != null) {
                System.out.print("Button2 is pushed");
                answer = num1-num2;
            }
        else if (request.getParameter("Mult") != null) {
                System.out.print("Button3 is pushed");
                answer = num1*num2;
            }
        else if(request.getParameter("Div") != null){
                System.out.print("Button4 is pushed");
                answer = num1/num2;
        }
        request.setAttribute("answer",answer);
        request.getRequestDispatcher("result.jsp").forward(request, response);
        return;
        /*
        try ( PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Calculate</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Calculate at " + answer + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }*/
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
