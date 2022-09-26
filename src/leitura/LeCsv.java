
package leitura;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.LinkedList;

public class LeCsv {
        
     public LinkedList<Cliente> leCsvClientes() throws IOException{         
      
        LinkedList<Cliente> clientes = new  LinkedList<Cliente>();             
        String current = new java.io.File( "." ).getCanonicalPath();        
        File inputFile = new File(current + "\\src\\arquivo.csv");                
        FileReader in = new FileReader(inputFile);

        try {
            BufferedReader br = new BufferedReader(in);
            String thisLine = null;
            String[] infoCliente = null;
            
            br.readLine();

            while ((thisLine = br.readLine()) != null) {
               infoCliente = thisLine.split(";", 0);
               Cliente cliente = new Cliente();
               cliente.setId(infoCliente[0]);
               cliente.setNome(infoCliente[1]);
               cliente.setEmail(infoCliente[2]);
               cliente.setDataNascimento(infoCliente[3]);
               cliente.setTelefone(infoCliente[4]);
               cliente.setTotalCompras(Double.parseDouble(infoCliente[5]));
               clientes.add(cliente);
            }       
        } catch(Exception e) {
           e.printStackTrace();
        }
        
        //complete o codigo para ler o csv e criar as instancias de cliente.
        //rode o teste MainReadCsvTest.java para testar o seu código.
        
        return clientes;
     }
}
