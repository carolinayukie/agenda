package com.agenda.model;
// Generated 24/06/2019 16:42:09 by Hibernate Tools 4.3.1



/**
 * Meiocontato generated by hbm2java
 */
public class MeioContato  implements java.io.Serializable {


     private Integer idMeioContato;
     private Contato contato;
     private String tipoContato;
     private String conteudo;

    public MeioContato() {
    }

    public MeioContato(Contato contato, String tipoContato, String conteudo) {
       this.contato = contato;
       this.tipoContato = tipoContato;
       this.conteudo = conteudo;
    }
   
    public Integer getIdMeioContato() {
        return this.idMeioContato;
    }
    
    public void setIdMeioContato(Integer idMeioContato) {
        this.idMeioContato = idMeioContato;
    }
    public Contato getContato() {
        return this.contato;
    }
    
    public void setContato(Contato contato) {
        this.contato = contato;
    }
    public String getTipoContato() {
        return this.tipoContato;
    }
    
    public void setTipoContato(String tipoContato) {
        this.tipoContato = tipoContato;
    }
    public String getConteudo() {
        return this.conteudo;
    }
    
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }




}


