/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.dao;

import br.com.senac.entidade.TipoAtendimento;
import java.io.Serializable;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author silvio.junior
 */
public class TipoAtendimentoDaoImpl extends BaseDaoImpl<TipoAtendimento, Long>
        implements TipoAtendimentoDao, Serializable {

    @Override
    public TipoAtendimento pesquisarPorId(Long id, Session sessao)
            throws HibernateException {
        return sessao.find(TipoAtendimento.class, id);
    }

    @Override
    public List<TipoAtendimento> pesquisarPorNome(String nome,
            Session sessao) throws HibernateException {
        Query<TipoAtendimento> consulta = sessao
                .createQuery("from TipoAtendimento p where "
                        + "p.nome like :nome order by p.nome");
        consulta.setParameter("nome", "%" + nome + "%");
        return consulta.getResultList();
    }

    @Override
    public List<TipoAtendimento> pesquisarTodos(Session sessao)
            throws HibernateException {
        Query<TipoAtendimento> consulta = sessao
                .createQuery("from TipoAtendimento p order by p.nome");
        return consulta.getResultList();
    }

   
}
