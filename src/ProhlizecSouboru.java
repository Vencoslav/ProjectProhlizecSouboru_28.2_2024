import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class ProhlizecSouboru extends JFrame {

    private JButton btOpenFile;
    private JPanel panelMain;
    private JScrollPane scrollPane;
    private JTextArea txA;

    public ProhlizecSouboru(){
        initComponent();
        ziskejData();

        btOpenFile.addActionListener(e -> ziskejData());
    }
    private void initComponent() {
        setTitle("Prohlížeč souborů");
        setContentPane(panelMain);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,300);
    }
    //Doplň menu do tohoto codu

    public void ziskejData(){
        JFileChooser fc = new JFileChooser();
        File setselectedFile = fc.getSelectedFile();
        try(Scanner sc = new Scanner(new BufferedReader(new FileReader(setselectedFile)))) {


       } catch (FileNotFoundException e) {
           throw new RuntimeException(e);
       }

    }

}
