/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

/**
 *
 * @author Estudiante
 */
public class ProxyValidacion {

    public String persistirIntento() throws UnsupportedEncodingException, IOException {
        String number_intends = read_file();
        if (number_intends.equals("1")) {
            number_intends = "2";
        } else if (number_intends.equals("2")) {
            number_intends = "3";
        } else if (number_intends.equals("3")) {
            number_intends = "fail";
        } else {
            number_intends = "1";

        }

        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("users_log.txt"), "utf-8"))) {
            writer.write(number_intends);
        }
        return number_intends;
    }

    public String read_file() throws FileNotFoundException, IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("users_log.txt"))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            return line;
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return "";
    }

}
