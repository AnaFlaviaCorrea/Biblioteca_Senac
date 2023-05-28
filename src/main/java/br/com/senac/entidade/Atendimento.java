/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.entidade;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author silvio.junior
 */
@Entity
@Table(name = "Atendimento")
public class Atendimento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String nome;
    
    @Column(nullable = false)
    private String observacao; 
    
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date data_cadastro= new Date();
    
    @ManyToOne
    @JoinColumn(name = "id_tipoAtendimento")
    private TipoAtendimento tipoAtendimento;
    
   // private boolean ativo;
    
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "id_endereco")
//    private Endereco endereco;

    public Atendimento() {
    }

    public Atendimento(String nome, Date data_cadastro) {
        this.nome = nome;
        this.data_cadastro = data_cadastro;
        
    }      

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
    
    public Date getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(Date data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    public TipoAtendimento getTipoAtendimento() {
        return tipoAtendimento;
    }

    public void setTipoAtendimento(TipoAtendimento tipoAtendimento) {
        this.tipoAtendimento = tipoAtendimento;
    }


  

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Atendimento)) {
            return false;
        }
        Atendimento other = (Atendimento) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "br.com.senac.entidade.Cliente[ id=" + id + " ]";
    }
    
}
