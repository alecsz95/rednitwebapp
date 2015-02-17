/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utils.rednit;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Alexandre
 */
public class CriarTxt {

    public void writeFile(String jsonRecebido) {
        try {



            File file = new File("C:\\Users\\Alexandre\\Desktop\\JSON.txt");

            // if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(jsonRecebido);
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

