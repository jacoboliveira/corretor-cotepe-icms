/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.corretor.cotepe.icms;

import br.corretor.cotepe.icms.entities.ReducoesZ;
import br.corretor.cotepe.icms.entities.TipoE14;
import br.corretor.cotepe.icms.util.FileHelper;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.apache.commons.lang.StringUtils;

/**
 *
 * @author jacoboliveira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
//        StringBuilder linhaAlt = new StringBuilder("jacob7896");       
//        linhaAlt.replace(3, 5, "aa");
//        System.out.println(linhaAlt.toString());

        //   Locale.setDefault(new Locale("pt","BR"));
        File arquivo = new File("c:/teste/TDMBE051275610000142726_20131007_081413.TXT");

        List<String> linhas = FileHelper.readLines(arquivo, "ISO-8859-1");
        StringBuilder conteudo = new StringBuilder();
        List<ReducoesZ> reducoesZList = new ArrayList<ReducoesZ>();
        List<TipoE14> e14cooList = new ArrayList<TipoE14>();

        for (String linha : linhas) {

            if (linha.substring(0, 3).equals("E12")) {
                ReducoesZ reducoesZ = new ReducoesZ();
                reducoesZ.setCoo(linha.substring(52, 58));
                reducoesZ.setDataMovimento(linha.substring(64, 72));
                reducoesZList.add(reducoesZ);
                //System.out.println(linha.substring(52, 58));                
            }
            //System.out.println(linha);
        }
        for (ReducoesZ reducoesZ : reducoesZList) {
            for (String linha : linhas) {

                if (linha.substring(0, 3).equals("E14")) {
                    String dataVerificar = linha.substring(58, 66);
                    String e14Coo = linha.substring(52, 58);

                    if (dataVerificar.equals(reducoesZ.getDataMovimento())
                            && !reducoesZ.getCoo().equals(e14Coo)) {
                        StringBuilder linhaAlt = new StringBuilder(linha);
                        linhaAlt.replace(53, 58 + 1, String.valueOf(reducoesZ.getCoo()));
                        linha = linhaAlt.toString();
                        String ccf = linha.substring(46, 52);
                        String coo = linha.substring(52, 58);
                        TipoE14 tipoE14Comparar = new TipoE14();
                        tipoE14Comparar.setCcf(ccf);
                        tipoE14Comparar.setCoo(coo);
                        if (!isContem(tipoE14Comparar, e14cooList)) {
                            TipoE14 tipoE14 = new TipoE14();
                            tipoE14.setCcf(ccf);
                            tipoE14.setCoo(coo);
                            e14cooList.add(tipoE14);
                        }
                        //System.out.println(reducoesZ.getCoo());
                    }
                }
                conteudo.append(linha).append("\n");
            }
//            BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo));
//            writer.write(conteudo.toString());
//            writer.flush();
//            writer.close();
            //registra
            //System.out.println(conteudo.toString());
            // break;
        }
        for (TipoE14 ccf : e14cooList) {
            System.out.println(ccf.getCoo());
        }
        
        StringBuilder passo2Conteudo =new StringBuilder();
        for (String linha : linhas) {

            if (linha.substring(0, 3).equals("E15")) {
                for (TipoE14 tipoE14 : e14cooList) {
                    String ccf = linha.substring(52, 58);
                    if (ccf.equals(tipoE14.getCcf())) {
                        StringBuilder alterarLinha = new StringBuilder(linha);
                        alterarLinha.replace(47, 52 + 1, tipoE14.getCoo());
                        linha = alterarLinha.toString();
                        break;
                    }
                }
            }
            passo2Conteudo.append(linha);
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo));
        writer.write(conteudo.toString());
        writer.flush();
        writer.close();
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
