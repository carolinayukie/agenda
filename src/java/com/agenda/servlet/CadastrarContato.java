/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agenda.servlet;

import com.agenda.dao.ContatoDAO;
import com.agenda.model.Contato;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
@WebServlet(name = "CadastrarContato", urlPatterns = {"/CadastrarContato"})
public class CadastrarContato extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Contato contato = new Contato();
            contato.setNome(req.getParameter("nome"));
            contato.setCargo(req.getParameter("cargo"));
            contato.setEmpresa(req.getParameter("empresa"));
            
            String data = req.getParameter("dataAniversario");
            
            SimpleDateFormat formatoData = new SimpleDateFormat("dd-MM-yyyy");
            
            Date dtData = new Date(formatoData.parse(data).getTime());
            
            
            
            contato.setDataAniversario(dtData);
            ContatoDAO dao = new ContatoDAO();
            dao.salvar(contato);
            
            PrintWriter out = resp.getWriter();
            out.println("<script>");
            out.println("window.location.href = '';");
            out.println("</script>");
        } catch (ParseException ex) {
            Logger.getLogger(CadastrarContato.class.getName()).log(Level.SEVERE, null, ex);
        }

    }


}
