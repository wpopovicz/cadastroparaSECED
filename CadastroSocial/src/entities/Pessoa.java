/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


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
    @Column(length= 200)
    private String encaminhamento;
    @Column(length= 200)
    private String instituicao;
    @Column(length= 200)
    private String instituicaoPretendida;
    @Column(length= 200)
    private int cadastro;
    @Column (length=200)
    private String OBS;
    @Column (length = 20)
    private String estadoCivil;
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
    @Column(length = 100)
    private String nome;
    @Column(length = 100)
    private String DatadeNascimento;
    @Column(length = 3)
    private int anosdeNascimento;
    @Column(length = 2)
    private int mesdeNascimento;
    @Column(length = 100)
    private String nivel;
    //endereço
    @Column(length = 150)
    private String rua;
    @Column(length = 11)
    private String CEP;
    @Column(length = 10)
    private int numero;
    @Column(length = 150)
    private String bairro;
    @Column(length = 15)
    private String telefonedeContato;

    public Pessoa() {
    }

    public Pessoa(int id, float rendaFamiliar, String cuidaCrianca, String encaminhamento, String instituicao, String instituicaoPretendida, int cadastro, String OBS, String estadoCivil, String nomedoPai, Boolean trabalhodoPai, String profissaodoPai, String localdeTrabalhodoPai, String telefonedoPai, String nomedaMae, Boolean trabalhodaMae, String profissaodaMae, String localdeTrabalhodaMae, String telefonedaMae, String nome, String DatadeNascimento, int anosdeNascimento, int mesdeNascimento, String nivel, String rua, String CEP, int numero, String bairro, String telefonedeContato) {
        this.id = id;
        this.rendaFamiliar = rendaFamiliar;
        this.cuidaCrianca = cuidaCrianca;
        this.encaminhamento = encaminhamento;
        this.instituicao = instituicao;
        this.instituicaoPretendida = instituicaoPretendida;
        this.cadastro = cadastro;
        this.OBS = OBS;
        this.estadoCivil = estadoCivil;
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
        this.DatadeNascimento = DatadeNascimento;
        this.anosdeNascimento = anosdeNascimento;
        this.mesdeNascimento = mesdeNascimento;
        this.nivel = nivel;
        this.rua = rua;
        this.CEP = CEP;
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

    public String getEncaminhamento() {
        return encaminhamento;
    }

    public void setEncaminhamento(String encaminhamento) {
        this.encaminhamento = encaminhamento;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getInstituicaoPretendida() {
        return instituicaoPretendida;
    }

    public void setInstituicaoPretendida(String instituicaoPretendida) {
        this.instituicaoPretendida = instituicaoPretendida;
    }

    public int getCadastro() {
        return cadastro;
    }

    public void setCadastro(int cadastro) {
        this.cadastro = cadastro;
    }

    public String getOBS() {
        return OBS;
    }

    public void setOBS(String OBS) {
        this.OBS = OBS;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
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

    public String getDatadeNascimento() {
        return DatadeNascimento;
    }

    public void setDatadeNascimento(String DatadeNascimento) {
        this.DatadeNascimento = DatadeNascimento;
    }

    public int getAnosdeNascimento() {
        return anosdeNascimento;
    }

    public void setAnosdeNascimento(int anosdeNascimento) {
        this.anosdeNascimento = anosdeNascimento;
    }

    public int getMesdeNascimento() {
        return mesdeNascimento;
    }

    public void setMesdeNascimento(int mesdeNascimento) {
        this.mesdeNascimento = mesdeNascimento;
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

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
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
        return "Pessoa{" + "id=" + id + ", rendaFamiliar=" + rendaFamiliar + ", cuidaCrianca=" + cuidaCrianca + ", encaminhamento=" + encaminhamento + ", instituicao=" + instituicao + ", instituicaoPretendida=" + instituicaoPretendida + ", cadastro=" + cadastro + ", OBS=" + OBS + ", estadoCivil=" + estadoCivil + ", nomedoPai=" + nomedoPai + ", trabalhodoPai=" + trabalhodoPai + ", profissaodoPai=" + profissaodoPai + ", localdeTrabalhodoPai=" + localdeTrabalhodoPai + ", telefonedoPai=" + telefonedoPai + ", nomedaMae=" + nomedaMae + ", trabalhodaMae=" + trabalhodaMae + ", profissaodaMae=" + profissaodaMae + ", localdeTrabalhodaMae=" + localdeTrabalhodaMae + ", telefonedaMae=" + telefonedaMae + ", nome=" + nome + ", DatadeNascimento=" + DatadeNascimento + ", anosdeNascimento=" + anosdeNascimento + ", mesdeNascimento=" + mesdeNascimento + ", nivel=" + nivel + ", rua=" + rua + ", CEP=" + CEP + ", numero=" + numero + ", bairro=" + bairro + ", telefonedeContato=" + telefonedeContato + '}';
    }
                
}