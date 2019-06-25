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
 * @author User
 */
@WebServlet(name = "AtualizarUsuario", urlPatterns = {"/AtualizarUsuario"})
public class AtualizarUsuario extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Usuario usuario = new Usuario();
        UsuarioDAO dao = new UsuarioDAO();
        usuario.setNome(req.getParameter("nome"));
        usuario.setLogin(req.getParameter("login"));
        usuario.setSenha(req.getParameter("senha"));


        String contId = req.getParameter("id");

        Integer id = Integer.parseInt(contId);
        usuario.setIdUsuario(id);
        dao.Atualizar(usuario);

        PrintWriter out = resp.getWriter();

        out.println("ok");

    }

}