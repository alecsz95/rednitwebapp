/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.rednit;

/**
 *
 * @author Alexandre
 */
public class Usuario {

    private String id;
    private String nome;
    //private Blob foto;
    private String sobre;
    //private String time;
    private int petista;
    private String fotoEncoded;
    private int sync;

    public String getFotoEncoded() {
        return fotoEncoded;
    }

    public void setFotoEncoded(String fotoEncoded) {
        if(fotoEncoded != null) {
            this.fotoEncoded = fotoEncoded;
        }
    }

    public int getSync() {
        return sync;
    }

    public void setSync(int sync) {
        this.sync = sync;
    }

    public String getSobre() {
        return sobre;
    }

    public void setSobre(String sobre) {
        this.sobre = sobre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    public int getPetista() {
        return petista;
    }

    public void setPetista(int petista) {
        this.petista = petista;
    }
}
