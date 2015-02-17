/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.rednit;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Alexandre
 */


public class Explorer {    
    private String idUsuario;
    private String fotoEncoded;

    

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getFotoEncoded() {
        return fotoEncoded;
    }

    public void setFotoEncoded(String fotoEncoded) {
        this.fotoEncoded = fotoEncoded;
    }
    
   
    
}
