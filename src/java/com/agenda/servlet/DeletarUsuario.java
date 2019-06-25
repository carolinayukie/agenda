/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agenda.servlet;

import com.agenda.dao.UsuarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
@WebServlet(name = "DeletarUsuario", urlPatterns = {"/DeletarUsuario"})
public class DeletarUsuario extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        
        
        String contId = req.getParameter("id");

        
        Integer id = Integer.parseInt(contId);

        UsuarioDAO dao = new UsuarioDAO();

        PrintWriter out = resp.getWriter();

       dao.deletar(id);

    }
}