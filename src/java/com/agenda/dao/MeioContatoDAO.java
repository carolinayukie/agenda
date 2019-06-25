package com.agenda.dao;

import com.agenda.model.MeioContato;
import com.agenda.util.HibernateUtil;
import org.hibernate.Session;

public class MeioContatoDAO {
    
    public void salvar(MeioContato meioContato) {
        // cria e abre uma sessão
        Session session = HibernateUtil.getSessionFactory().openSession();
        //inicia uma transição
        session.beginTransaction();

        //realiza a operação de salvar
        session.persist(meioContato);

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

        MeioContato meioContato = (MeioContato) session.get(MeioContato.class, id);

        session.delete(meioContato);

        session.getTransaction().commit();

        session.close();
    }

    public MeioContato pesquisarPorId(Integer id) {
        Session sessao = HibernateUtil.getSessionFactory().openSession();

        sessao.beginTransaction();

        MeioContato meioContato = (MeioContato) sessao.get(MeioContato.class, id);

        sessao.getTransaction().commit();

        sessao.close();

        return meioContato;
    }

    public void Atualizar(MeioContato meioContato) {
        // cria e abre uma sessão
        Session session = HibernateUtil.getSessionFactory().openSession();
        //inicia uma transição
        session.beginTransaction();
        //realiza a operação de salvar
        session.update(meioContato);
        //comita a operação de salvar
        session.getTransaction().commit();

        //libera a memória
        session.flush();

        //fecha a sessão.
        session.close();
    }

}
