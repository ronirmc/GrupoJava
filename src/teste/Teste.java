package teste;
import java.sql.*;

public class Teste {
	public static void main(String[] args) throws Exception {
		//Não sei o significado :)
		Class.forName("org.h2.Driver");
		// Abre uma conexão. Para o teste escolha algum diretório do seu pc escolha um nome de usuário qualquer
		// e uma senha qualquer.
		Connection conn = DriverManager.getConnection("jdbc:h2:~/banco", "vh", "");
		//Instancia um objeto responsável por executar os comandos SQL.
		Statement test = conn.createStatement();
		
		//Comandos de criação/inserção de tabelas/dados, executar apenas na primeira vez que você testar.
//		test.execute("CREATE TABLE MATERIAIS(ID INT PRIMARY KEY, URL VARCHAR(255));"); //Cria tabela
//		test.execute("INSERT INTO MATERIAIS VALUES(1,'www.google.com');"); //Insere algo conforme o declarado na criação da tabela
//		test.execute("INSERT INTO MATERIAIS VALUES(2,'www.youtube.com');"); //Insere algo conforme o declarado na criação da tabela
		
		//Instancia o objeto que contém o resultado da busca.
		ResultSet rs = test.executeQuery("SELECT * FROM MATERIAIS");
		
		//Percorre o objeto resultado da busca convertendo os elementos do objeto para String.
		while(rs.next()){ //rs.next() é necessário para posicionar o leitor do ResultSet na posição correta.
			System.out.println(rs.getString("ID")+" "+rs.getString("URL")); //getString converte a saída do banco para String
		}
		//Fecha a conexão.
		conn.close();
	}
}
