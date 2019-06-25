/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agenda.servlet;

import com.agenda.dao.UsuarioDAO;
import com.agenda.model.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Aluno
 */
@WebServlet(name = "CadastrarUsuario", urlPatterns = {"/CadastrarUsuario"})
public class CadastrarUsuario extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        Usuario usuario = new Usuario();
        usuario.setNome(request.getParameter("nome"));
        usuario.setLogin(request.getParameter("login"));
        usuario.setSenha(request.getParameter("senha"));

        UsuarioDAO dao = new UsuarioDAO();
        dao.salvar(usuario);

        //out.println("ok");
        out.println("<script>");
        out.println("window.location.href = 'menu.jsp';");
        out.println("</script>");
    }
}
