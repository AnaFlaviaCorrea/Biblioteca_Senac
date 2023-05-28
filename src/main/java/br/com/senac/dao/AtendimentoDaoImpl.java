/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.dao;

import br.com.senac.entidade.Atendimento;
import java.io.Serializable;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author silvio.junior
 */
public class AtendimentoDaoImpl extends BaseDaoImpl<Atendimento, Long>
                       implements AtendimentoDao, Serializable{

    @Override
    public Atendimento pesquisarPorId(Long id, Session sessao) throws HibernateException {
        return sessao.find(Atendimento.class, id);
    }

    @Override
    public List<Atendimento> pesquisarPorNome(String nome, Session sessao) throws HibernateException {
        Query<Atendimento> consulta = sessao
        .createQuery("from Atendimento c where c.nome like :nome order by c.nome");
        consulta.setParameter("nome", "%" + nome + "%");
        return consulta.getResultList();
    }
    
}
