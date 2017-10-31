package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao
{
    private static final String USERNAME = "root";
    private static final String PASSWORD = "ifpa@123";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/ifpa";

    public static Connection conectar() throws Exception
    {
        Class.forName("com.mysql.jdbc.Driver"); //Faz com que a classe seja carregada pela JVM

        //Cria a conexão com o banco de dados
        Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);

        return connection;
    }
}
