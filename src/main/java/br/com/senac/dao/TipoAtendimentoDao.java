/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.dao;

import br.com.senac.entidade.TipoAtendimento;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author silvio.junior
 */
public interface TipoAtendimentoDao extends BaseDao<TipoAtendimento, Long> {

    List<TipoAtendimento> pesquisarPorNome(String nome,
            Session sessao) throws HibernateException;
    
    List<TipoAtendimento> pesquisarTodos(Session sessao)
                               throws HibernateException;
    
  
    
    
}
