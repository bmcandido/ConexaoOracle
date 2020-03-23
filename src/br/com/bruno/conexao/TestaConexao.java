package br.com.bruno.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {

		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sankhya","tecsis");
		System.out.println("Abriu uma conexão");
		Statement statement = connection.createStatement();
		
		boolean resultado = statement.execute("select *from tgfpro");
		
		System.out.println(resultado);
		
		ResultSet resultSet = statement.getResultSet();
		while(resultSet.next()) {
			String descricao = resultSet.getString("DESCRPROD");
			System.out.println(descricao);	
		}

		connection.close();
		
		
		
		
		
	}

}
