/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest.rednit;

import com.controller.rednit.ExplorerController;
import com.model.rednit.Explorer;
import java.util.ArrayList;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Alexandre
 */
@Path("/explorer")
public class ExplorerRestful {

    @POST
    @Path("/get")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Explorer> getUsuarios() {        
        return new ExplorerController().setArrayExplorer();

    }

}
