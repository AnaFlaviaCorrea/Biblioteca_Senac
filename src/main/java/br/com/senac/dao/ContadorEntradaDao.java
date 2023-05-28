/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.dao;

import br.com.senac.entidade.ContadorEntrada;
import java.util.Date;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author silvio.junior
 */
public interface ContadorEntradaDao extends BaseDao<ContadorEntrada, Long> {

    List<ContadorEntrada> pesquisarPorNome(String nome, Session sessao) throws HibernateException;
    
    List<ContadorEntrada> pesquisarPorPeriodo(Date dataInicio,Date dataFim, Session sessao) throws HibernateException;

    List<ContadorEntrada> pesquisarPorData(Date dataInicio,Date dataFim, Session sessao) throws HibernateException;
    
    List<ContadorEntrada> pesquisarPorMes(Date dataInicio,Date dataFim, Session sessao) throws HibernateException;

   ContadorEntrada contemAberturaDataCadastro(Session sessao) throws HibernateException;
}
