/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest.rednit;

import com.controller.rednit.ExplorerController;
import com.model.rednit.Usuario;
import com.utils.rednit.CriarTxt;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Alexandre
 */
@Path("/usuario")
public class UsuarioRestful {

    @Path("/insert")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response insertProfile(Usuario u) {
        try {
            CriarTxt ct = new CriarTxt();
            ct.writeFile("ID: " + u.getId() + "\n Nome:" + u.getNome()
                    + "\n Sobre:" + u.getSobre()
                    + "\n É petista? " + u.getPetista() + "\n \n \n" + u.getFotoEncoded());
            return Response.status(Response.Status.OK).build();
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
    }
    
    
    @Path("/get")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Usuario getUsuario(Usuario u){        
        ExplorerController ec = new ExplorerController();        
        return ec.buscaUsuario(u.getId());        
    }
}
