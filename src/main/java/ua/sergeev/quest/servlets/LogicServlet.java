package ua.sergeev.quest.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LogicServlet", value = "/logic")
public class LogicServlet extends HttpServlet {
    @Override
    protected void doGet(javax.servlet.http.HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int index = getSelectedIndex(req);
        if(index == 12) resp.sendRedirect("/game.jsp");
    }
//Quest_war/

    private int getSelectedIndex(HttpServletRequest request) {
        String click = request.getParameter("click");
        boolean isNumeric;
        if (!click.chars().allMatch(Character::isDigit)) {
            isNumeric = false;
        } else {
            isNumeric = true;
        }
        if (isNumeric)
            return Integer.parseInt(click);
        return 0;
    }

}

