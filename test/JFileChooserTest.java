/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import br.corretor.cotepe.icms.util.StringHelper;
import java.io.File;
import javax.swing.JFileChooser;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jacoboliveira
 */
public class JFileChooserTest {
    
    public JFileChooserTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void hello() {
//     JFileChooser chooser = new JFileChooser();            
//            
//            chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
//            
//            chooser.setMultiSelectionEnabled(false);
//
//            
//
//            int choice = chooser.showSaveDialog(null);
//
//            if (choice == JFileChooser.APPROVE_OPTION) {
//                File arquivoEscolhido = chooser.getSelectedFile();
//     //           buscaArquivoField.setText(arquivo.getPath());
//            }
         System.out.println(StringHelper.substringAfterLast("arqui.vo.txt", "."));
     }
}
