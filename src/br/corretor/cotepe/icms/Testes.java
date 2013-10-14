/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.corretor.cotepe.icms;

import br.corretor.cotepe.icms.entities.TipoE14;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author Tércio
 */
public class Testes {

    public static void main(String args[]) throws IOException {


        String enconding = "ISO-8859-1";
        File arquivo = new File("c:/teste/TDMBE051275610000142726_20131007_081413.TXT");
        List<String> linhas = FileUtils.readLines(arquivo, enconding);
        StringBuilder b = new StringBuilder();
        for (String linha : linhas) {   
            
            b.append(linha).append(File.separator.equals("\\")?"\r\n":"\n");
        }
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(arquivo), enconding));
        writer.write(b.toString());
        writer.flush();
        writer.close();
        //System.out.println(File.separator);

//        String cooE12 = "007965";
//        String dataE12 = "20130902";
//        File arquivo = new File("c:/teste/TDMBE051275610000142726_20131007_081413.TXT");
//        String enconding = "ISO-8859-1";
//        List<String> linhas = FileUtils.readLines(arquivo, enconding);
//        StringBuilder conteudo = new StringBuilder();
//        List<TipoE14> e14cooList = new ArrayList<TipoE14>();
//        for (String linha : linhas) {
//
//            if (linha.substring(0, 3).equals("E14")) {
//                String dataE14 = linha.substring(58, 66);
//                String cooE14 = linha.substring(52, 58);
//                //System.out.println(cooE14);
//                if (dataE12.equals(dataE14) && !cooE14.equals(cooE12)) {
//                    StringBuilder altCoo = new StringBuilder(linha);
//
//                    linha = altCoo.replace(52, 58, cooE12).toString();
//                    //System.out.println(linha);
//                    String ccf = linha.substring(46, 52);
//                    String coo = linha.substring(52, 58);
//                    TipoE14 tipoE14Comparar = new TipoE14();
//                    tipoE14Comparar.setCcf(ccf);
//                    tipoE14Comparar.setCoo(coo);
//                    if (!isContem(tipoE14Comparar, e14cooList)) {
//                        TipoE14 tipoE14 = new TipoE14();
//                        tipoE14.setCcf(ccf);
//                        tipoE14.setCoo(coo);
//                        e14cooList.add(tipoE14);
//                    }
//                }
//            }
//            conteudo.append(linha).append("\n");
//
//        }
//
//
//        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(arquivo), enconding));
//        writer.write(conteudo.toString());
//        writer.flush();
//        writer.close();
//        for (TipoE14 tipoE14 : e14cooList) {
//            System.out.println(tipoE14.getCoo());
//        }
//        
//        linhas = FileUtils.readLines(arquivo, enconding);
//        
//        for (TipoE14 tipoE14 : e14cooList) {
//
//            StringBuilder conteudo2 = new StringBuilder();
//            for (String linha : linhas) {
//                if (linha.substring(0, 3).equals("E15")) {
//                    StringBuilder altCoo2 = new StringBuilder(linha);
//
//                    String ccfE15 = linha.substring(52, 58);
//                    String ccfE14 = tipoE14.getCcf();
//                    if (ccfE14.equals(ccfE15)) {
//                        System.out.println(linha.substring(46, 52) + " para " + cooE12);
//                        linha = altCoo2.replace(46, 52, cooE12).toString();
//                    }
//                }
//                conteudo2.append(linha).append("\n");
//            }
//            BufferedWriter writer2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(arquivo), enconding));
//            writer2.write(conteudo2.toString());
//            writer2.flush();
//            writer2.close();
//            
//        }
    }

    private static boolean isContem(TipoE14 tipoE14Comparar, List<TipoE14> e14cooList) {
        for (TipoE14 tipoE14 : e14cooList) {
            if (tipoE14.getCoo().equals(tipoE14Comparar.getCoo())) {
                return true;
            }
        }
        return false;
    }
}
