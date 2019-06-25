package com.agenda.dao;

import com.agenda.model.Usuario;
import com.agenda.util.HibernateUtil;
import org.hibernate.Session;

public class UsuarioDAO {
    
    public void salvar(Usuario usuario) {
        // cria e abre uma sessão
        Session session = HibernateUtil.getSessionFactory().openSession();
        //inicia uma transição
        session.beginTransaction();

        //realiza a operação de salvar
        session.persist(usuario);

        //comita a operação de salvar
        session.getTransaction().commit();

        //libera a memória
        session.flush();

        //fecha a sessão.
        session.close();
    }
    
    public void deletar(Integer id) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();

        Usuario usuario = (Usuario) session.get(Usuario.class, id);

        session.delete(usuario);

        session.getTransaction().commit();

        session.close();
    }

    public Usuario pesquisarPorId(Integer id) {
        Session sessao = HibernateUtil.getSessionFactory().openSession();

        sessao.beginTransaction();

        Usuario usuario = (Usuario) sessao.get(Usuario.class, id);

        sessao.getTransaction().commit();

        sessao.close();

        return usuario;
    }

    public void Atualizar(Usuario usuario) {
        // cria e abre uma sessão
        Session session = HibernateUtil.getSessionFactory().openSession();
        //inicia uma transição
        session.beginTransaction();
        //realiza a operação de salvar
        session.update(usuario);
        //comita a operação de salvar
        session.getTransaction().commit();

        //libera a memória
        session.flush();

        //fecha a sessão.
        session.close();
    }

}
