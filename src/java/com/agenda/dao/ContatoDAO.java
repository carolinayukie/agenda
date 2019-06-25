package com.agenda.dao;

import com.agenda.model.Contato;
import com.agenda.util.HibernateUtil;
import org.hibernate.Session;

public class ContatoDAO {    

    public void salvar(Contato contato) {
        // cria e abre uma sessão
        Session session = HibernateUtil.getSessionFactory().openSession();
        //inicia uma transição
        session.beginTransaction();

        //realiza a operação de salvar
        session.persist(contato);

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

        Contato contato = (Contato) session.get(Contato.class, id);

        session.delete(contato);

        session.getTransaction().commit();

        session.close();
    }

    public Contato pesquisarPorId(Integer id) {
        Session sessao = HibernateUtil.getSessionFactory().openSession();

        sessao.beginTransaction();

        Contato contato = (Contato) sessao.get(Contato.class, id);

        sessao.getTransaction().commit();

        sessao.close();

        return contato;
    }

    public void Atualizar(Contato contato) {
        // cria e abre uma sessão
        Session session = HibernateUtil.getSessionFactory().openSession();
        //inicia uma transição
        session.beginTransaction();
        //realiza a operação de salvar
        session.update(contato);
        //comita a operação de salvar
        session.getTransaction().commit();

        //libera a memória
        session.flush();

        //fecha a sessão.
        session.close();
    }

}
