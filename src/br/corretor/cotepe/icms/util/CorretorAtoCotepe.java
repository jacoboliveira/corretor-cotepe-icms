/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.corretor.cotepe.icms.util;

import br.corretor.cotepe.icms.entities.ReducoesZ;
import br.corretor.cotepe.icms.entities.TipoE14;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jacoboliveira
 */
public class CorretorAtoCotepe {

    public boolean corrigir(String caminho) throws IOException {
        File arquivo = new File(caminho);
        String enconding = "ISO-8859-1";
        List<String> linhas = FileHelper.readLines(arquivo, enconding);

        List<ReducoesZ> reducoesZList = new ArrayList<ReducoesZ>();
        List<TipoE14> e14cooList = new ArrayList<TipoE14>();
        boolean contemErros=false;
        for (String linha : linhas) {

            if (linha.substring(0, 3).equals("E12")) {
                ReducoesZ reducoesZ = new ReducoesZ();
                reducoesZ.setCoo(linha.substring(52, 58));
                reducoesZ.setDataMovimento(linha.substring(64, 72));
                reducoesZList.add(reducoesZ);
            }
        }
        for (ReducoesZ reducoesZ : reducoesZList) {
            StringBuilder conteudo = new StringBuilder();
            linhas = FileHelper.readLines(arquivo, enconding);
            for (String linha : linhas) {

                if (linha.substring(0, 3).equals("E14")) {
                    String dataVerificar = linha.substring(58, 66);
                    String e14Coo = linha.substring(52, 58);
                    if (dataVerificar.equals(reducoesZ.getDataMovimento()) && !reducoesZ.getCoo().equals(e14Coo)) {
                        contemErros = true;
                        StringBuilder linhaAlt = new StringBuilder(linha);
                        linhaAlt.replace(52, 58, reducoesZ.getCoo());
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

                    }
                }
                conteudo.append(linha).append(File.separator.equals("\\") ? "\r\n" : "\n");
            }
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(arquivo), enconding));
            writer.write(conteudo.toString());
            writer.flush();
            writer.close();

        }
       

        for (TipoE14 tipoE14 : e14cooList) {
            StringBuilder conteudo = new StringBuilder();
            linhas = FileHelper.readLines(arquivo, enconding);
            for (String linha : linhas) {
                if (linha.substring(0, 3).equals("E15")) {

                    String ccf = linha.substring(52, 58);
                    if (ccf.equals(tipoE14.getCcf())) {
                        StringBuilder alterarLinha = new StringBuilder(linha);
                        alterarLinha.replace(46, 52, tipoE14.getCoo());
                        linha = alterarLinha.toString();
                    }

                }
                conteudo.append(linha).append(File.separator.equals("\\") ? "\r\n" : "\n");
            }
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(arquivo), enconding));
            writer.write(conteudo.toString());
            writer.flush();
            writer.close();
        }
        return contemErros;
    }

    private static boolean isContem(TipoE14 tipoE14Comparar, List<TipoE14> e14cooList) {
        for (TipoE14 tipoE14 : e14cooList) {
            if (tipoE14.getCcf().equals(tipoE14Comparar.getCcf())) {
                return true;
            }
        }
        return false;
    }
}
