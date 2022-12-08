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
@Table(name = "ContadorEntrada")
public class ContadorEntrada implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private int quantidade;
        
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date data_cadastro= new Date();
    
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "id_endereco")
    //private Endereco endereco;

    public ContadorEntrada() {
    }

    public ContadorEntrada(Date data_cadastro) {
        this.data_cadastro= data_cadastro;
    }    

    public Long getId() {
        return id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    
    public Date getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(Date data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

  
   

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof ContadorEntrada)) {
            return false;
        }
        ContadorEntrada other = (ContadorEntrada) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "br.com.senac.entidade.Cliente[ id=" + id + " ]";
    }
    
}
