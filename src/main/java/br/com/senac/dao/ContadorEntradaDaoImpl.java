/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.dao;

import br.com.senac.entidade.ContadorEntrada;
import java.io.Serializable;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author silvio.junior
 */
public class ContadorEntradaDaoImpl extends BaseDaoImpl<ContadorEntrada, Long>
                       implements ContadorEntradaDao, Serializable{

    @Override
    public ContadorEntrada pesquisarPorId(Long id, Session sessao) throws HibernateException {
        return sessao.find(ContadorEntrada.class, id);
    }

    @Override
    public List<ContadorEntrada> pesquisarPorNome(String nome, Session sessao) throws HibernateException {
        Query<ContadorEntrada> consulta = sessao
        .createQuery("from ContadorEntrada c where c.nome like :nome order by c.nome");
        consulta.setParameter("nome", "%" + nome + "%");
        return consulta.getResultList();
    }
    
}
