package persistencias.api.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoDB {

    private static Connection con;

    public static Connection conectar() throws Exception{
        try{
            String url = "jdbc:postgresql://localhost:5432/meu_banco_de_dados";
            String usuario = "usuario_do_banco";
            String senha = "senha_do_banco";
            con = DriverManager.getConnection(url, usuario, senha);
            return con;
        }catch (Exception e){
            throw new Exception("Ouve um erro ao criar a conexao. "+e);
        }
    }

}
