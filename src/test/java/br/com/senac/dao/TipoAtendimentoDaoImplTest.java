/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.dao;

import br.com.senac.entidade.TipoAtendimento;
import static br.com.senac.util.Gerador.*;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author silvio.junior
 */
public class TipoAtendimentoDaoImplTest {
    
    private TipoAtendimento perfil;
    private TipoAtendimentoDao perfilDao;
    private Session sessao;
    
    public TipoAtendimentoDaoImplTest() {
        perfilDao = new TipoAtendimentoDaoImpl();
    }

//    @Test
    public void testSalvar() {
        perfil = new TipoAtendimento(null, gerarSenha(7), "descrição bla, bla");
        sessao = HibernateUtil.abrirConexao();
        perfilDao.salvarOuAlterar(perfil, sessao);
        sessao.close();
        assertNotNull(perfil.getId());
    }
    
//    @Test
    public void testPesquisarPorId() {
        System.out.println("pesquisarPorId");
    }

//    @Test
    public void testPesquisarPorNome() {
        System.out.println("pesquisarPorNome");
    }

//    @Test
    public void testPesquisarTodos() {
        System.out.println("pesquisarTodos");
    }
    
    public TipoAtendimento buscarPerfilBD(){
        sessao = HibernateUtil.abrirConexao();
        Query<TipoAtendimento> consulta = sessao
                .createQuery("from Perfil ");
        consulta.setMaxResults(1);
        List<TipoAtendimento> perfis = consulta.getResultList();
        sessao.close();
        if(perfis.isEmpty()){
            testSalvar();
        }else{
            perfil = perfis.get(0);
        }
        return perfil;
    }
    
}
