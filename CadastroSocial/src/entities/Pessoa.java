/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author willian
 */
@Entity
public class Pessoa implements Serializable{
    @Id
    @GeneratedValue
    private int id;
    @Column(precision = 2)
    private float rendaFamiliar;
    @Column(length= 200)
    private String cuidaCrianca;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar encaminhamento = Calendar.getInstance();
    @Column(length= 200)
    private String instituicao;
    @Column(length= 20)
    private int cadastro;
    //pai
    @Column(length = 100)
    private String nomedoPai;
    private Boolean trabalhodoPai;
    @Column(length = 150)
    private String profissaodoPai;
    @Column(length = 150)
    private String localdeTrabalhodoPai;
    @Column(length = 100)
    private String telefonedoPai;
    //mãe
    @Column(length = 100)
    private String nomedaMae;
    private Boolean trabalhodaMae;
    @Column(length = 150)
    private String profissaodaMae;
    @Column(length = 150)
    private String localdeTrabalhodaMae;
    @Column(length = 100)
    private String telefonedaMae;
    //criança
    private String nome;
    @Temporal(TemporalType.DATE)
    private Calendar datadeNascimento = Calendar.getInstance();
    @Column(length = 100)
    private String nivel;
    //endereço
    @Column(length = 150)
    private String rua;
    @Column(length = 6)
    private int numero;
    @Column(length = 150)
    private String bairro;
    @Column(length = 14)
    private String telefonedeContato;
    
    public Pessoa() {
    }

    public Pessoa(int id, float rendaFamiliar, String cuidaCrianca, String instituicao, int cadastro, String nomedoPai, Boolean trabalhodoPai, String profissaodoPai, String localdeTrabalhodoPai, String telefonedoPai, String nomedaMae, Boolean trabalhodaMae, String profissaodaMae, String localdeTrabalhodaMae, String telefonedaMae, String nome, String nivel, String rua, int numero, String bairro, String telefonedeContato) {
        this.id = id;
        this.rendaFamiliar = rendaFamiliar;
        this.cuidaCrianca = cuidaCrianca;
        this.instituicao = instituicao;
        this.cadastro = cadastro;
        this.nomedoPai = nomedoPai;
        this.trabalhodoPai = trabalhodoPai;
        this.profissaodoPai = profissaodoPai;
        this.localdeTrabalhodoPai = localdeTrabalhodoPai;
        this.telefonedoPai = telefonedoPai;
        this.nomedaMae = nomedaMae;
        this.trabalhodaMae = trabalhodaMae;
        this.profissaodaMae = profissaodaMae;
        this.localdeTrabalhodaMae = localdeTrabalhodaMae;
        this.telefonedaMae = telefonedaMae;
        this.nome = nome;
        this.nivel = nivel;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.telefonedeContato = telefonedeContato;       
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getRendaFamiliar() {
        return rendaFamiliar;
    }

    public void setRendaFamiliar(float rendaFamiliar) {
        this.rendaFamiliar = rendaFamiliar;
    }

    public String getCuidaCrianca() {
        return cuidaCrianca;
    }

    public void setCuidaCrianca(String cuidaCrianca) {
        this.cuidaCrianca = cuidaCrianca;
    }

    public Calendar getEncaminhamento() {
        return encaminhamento;
    }

    public void setEncaminhamento(Calendar encaminhamento) {
        this.encaminhamento = encaminhamento;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public int getCadastro() {
        return cadastro;
    }

    public void setCadastro(int cadastro) {
        this.cadastro = cadastro;
    }

    public String getNomedoPai() {
        return nomedoPai;
    }

    public void setNomedoPai(String nomedoPai) {
        this.nomedoPai = nomedoPai;
    }

    public Boolean getTrabalhodoPai() {
        return trabalhodoPai;
    }

    public void setTrabalhodoPai(Boolean trabalhodoPai) {
        this.trabalhodoPai = trabalhodoPai;
    }

    public String getProfissaodoPai() {
        return profissaodoPai;
    }

    public void setProfissaodoPai(String profissaodoPai) {
        this.profissaodoPai = profissaodoPai;
    }

    public String getLocaldeTrabalhodoPai() {
        return localdeTrabalhodoPai;
    }

    public void setLocaldeTrabalhodoPai(String localdeTrabalhodoPai) {
        this.localdeTrabalhodoPai = localdeTrabalhodoPai;
    }

    public String getTelefonedoPai() {
        return telefonedoPai;
    }

    public void setTelefonedoPai(String telefonedoPai) {
        this.telefonedoPai = telefonedoPai;
    }

    public String getNomedaMae() {
        return nomedaMae;
    }

    public void setNomedaMae(String nomedaMae) {
        this.nomedaMae = nomedaMae;
    }

    public Boolean getTrabalhodaMae() {
        return trabalhodaMae;
    }

    public void setTrabalhodaMae(Boolean trabalhodaMae) {
        this.trabalhodaMae = trabalhodaMae;
    }

    public String getProfissaodaMae() {
        return profissaodaMae;
    }

    public void setProfissaodaMae(String profissaodaMae) {
        this.profissaodaMae = profissaodaMae;
    }

    public String getLocaldeTrabalhodaMae() {
        return localdeTrabalhodaMae;
    }

    public void setLocaldeTrabalhodaMae(String localdeTrabalhodaMae) {
        this.localdeTrabalhodaMae = localdeTrabalhodaMae;
    }

    public String getTelefonedaMae() {
        return telefonedaMae;
    }

    public void setTelefonedaMae(String telefonedaMae) {
        this.telefonedaMae = telefonedaMae;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Calendar getDatadeNascimento() {
        return datadeNascimento;
    }

    public void setDatadeNascimento(Calendar datadeNascimento) {
        this.datadeNascimento = datadeNascimento;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getTelefonedeContato() {
        return telefonedeContato;
    }

    public void setTelefonedeContato(String telefonedeContato) {
        this.telefonedeContato = telefonedeContato;
    }
    
    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", rendaFamiliar=" + rendaFamiliar + ", cuidaCrianca=" + cuidaCrianca + ", encaminhamento=" + encaminhamento + ", instituicao=" + instituicao + ", cadastro=" + cadastro + ", nomedoPai=" + nomedoPai + ", trabalhodoPai=" + trabalhodoPai + ", profissaodoPai=" + profissaodoPai + ", localdeTrabalhodoPai=" + localdeTrabalhodoPai + ", telefonedoPai=" + telefonedoPai + ", nomedaMae=" + nomedaMae + ", trabalhodaMae=" + trabalhodaMae + ", profissaodaMae=" + profissaodaMae + ", localdeTrabalhodaMae=" + localdeTrabalhodaMae + ", telefonedaMae=" + telefonedaMae + ", nome=" + nome + ", datadeNascimento=" + datadeNascimento + ", nivel=" + nivel + ", rua=" + rua + ", numero=" + numero + ", bairro=" + bairro + ", telefonedeContato=" + telefonedeContato + '}';
    }
    
    
}