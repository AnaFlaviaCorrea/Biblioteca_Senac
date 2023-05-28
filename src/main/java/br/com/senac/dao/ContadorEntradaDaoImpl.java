/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.dao;

import br.com.senac.entidade.ContadorEntrada;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

/**
 *
 * @author silvio.junior
 */
public class ContadorEntradaDaoImpl extends BaseDaoImpl<ContadorEntrada, Long>
        implements ContadorEntradaDao, Serializable {

    @Override
    public ContadorEntrada pesquisarPorId(Long id, Session sessao) throws HibernateException {
        return sessao.find(ContadorEntrada.class, id);
    }

    @Override
    public List<ContadorEntrada> pesquisarPorNome(String nome, Session sessao) throws HibernateException {
        Query<ContadorEntrada> consulta = sessao
                .createQuery("From ContadorEntrada c where c.nome like :nome order by c.nome");
        consulta.setParameter("nome", "%" + nome + "%");
        return consulta.getResultList();
    }

    @Override
    public List<ContadorEntrada> pesquisarPorPeriodo(Date dataInicio, Date dataFim, Session sessao) throws HibernateException {
        Query<ContadorEntrada> consulta = sessao
                .createQuery("SELECT c FROM ContadorEntrada c join fetch WHERE c.data_cadastro BETWEEN " + "'" + dataInicio + "'" + " and " + "'" + dataFim + "'");
        consulta.setParameter("%" + dataInicio + "%", "%" + dataFim + "%");

        return consulta.getResultList();
    }
    //select c from projetoJPAt c join fetch c.movimentacoes where c.id = :pid

    @Override
    public List<ContadorEntrada> pesquisarPorData(Date dataInicio, Date dataFim, Session sessao) throws HibernateException {
        List ListaEntreDatas = sessao.getSession().createCriteria(ContadorEntrada.class).add(Restrictions.ge("data_cadastro", dataInicio)).
                add(Restrictions.le("data_cadastro", dataFim)).list();
        return ListaEntreDatas;
    }

    @Override
    public ContadorEntrada contemAberturaDataCadastro(Session sessao) throws HibernateException {

        Query<ContadorEntrada> consulta = sessao.createQuery("SELECT c FROM ContadorEntrada c "
                + "WHERE c.data_cadastro = CURRENT_DATE ");

        return consulta.getSingleResult();

    }

    @Override
    public List<ContadorEntrada> pesquisarPorMes(Date dataInicio, Date dataFim, Session sessao) throws HibernateException {
        List ListaEntreDatas = sessao.getSession().createCriteria(ContadorEntrada.class).add(Restrictions.ge("data_cadastro", dataInicio)).
                add(Restrictions.le("data_cadastro", dataFim)).list();
        return ListaEntreDatas;

    }

}
