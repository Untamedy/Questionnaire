package com.noname.questionnaire.servlets;

import com.noname.questionnaire.entity.User;
import com.noname.questionnaire.model.Answers;
import java.io.IOException;
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
@WebServlet("/questions")
public class Questions extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("form.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User();
        user.setName(request.getParameter("name"));
        user.setLastname(request.getParameter("lastname"));
        user.setAge(Integer.valueOf(request.getParameter("age")));
        if (request.getParameter("happy").equalsIgnoreCase("yes")) {
            user.setHappy(true);
        } else {
            user.setHappy(false);
        }
        Answers answers = Answers.getInstance();
        answers.add(user);
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("/");
        dispatcher.forward(request, response);
       
        
    }

}
