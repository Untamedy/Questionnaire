package com.noname.questionnaire.servlets;


import com.noname.questionnaire.model.Answers;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author YBolshakova
 */
@WebServlet("/statistics")
public class Statictics extends HttpServlet{
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        Answers answers = Answers.getInstance();
        List<String> list = answers.listOfUser();
        request.setAttribute("users", list);
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("statistic.jsp");
        dispatcher.forward(request, response);
        
    }
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response){
        
    }

}
