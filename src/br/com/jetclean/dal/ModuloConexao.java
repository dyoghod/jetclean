/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jetclean.dal;

import java.sql.*;

/**
 *
 * @author dyogh
 */
public class ModuloConexao {
    //metodo responsavel por estabelecer a conexao com o banco
    public static Connection conector(){
        java.sql.Connection conexao = null;
        //chamar o driver
        String driver = "com.mysql.jdbc.Driver";
        // armazenar informações referente ao banco
        String url = "jdbc:mysql://localhost:3306/dbjetclean";
        String user = "root";
        String password = "";
        // estabelecer conexao com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            System.out.print(e);
            return null;
        }
        
    }
    
}
