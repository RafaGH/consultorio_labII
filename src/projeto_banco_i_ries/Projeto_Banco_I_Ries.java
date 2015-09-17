/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_banco_i_ries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 631420049
 */
public class Projeto_Banco_I_Ries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
       
        try {
            Class.forName("org.postgresql.Driver");                     //Habilitando o Driver JDBC
            String url = "jdbc:postgresql://localhost:5432/lp2_crudpessoas"; // url da conexao criada
            Connection conexao = DriverManager.getConnection(url,"postgres","senac2015");   //Passando os parametros para conexao.
            if(conexao != null){System.out.println("CONECTADO");}
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro na conexao");
            Logger.getLogger(Projeto_Banco_I_Ries.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Projeto_Banco_I_Ries.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
