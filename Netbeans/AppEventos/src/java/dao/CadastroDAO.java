package dao;

import connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Cadastro;

public class CadastroDAO
{

    public static void save(Cadastro cadastro)
    {
        String sql = "INSERT INTO cadastro(nome,idade,sexo,end,telefone)"
                + " VALUES(?,?,?,?,?)";

        Connection conn = null;
        PreparedStatement pstm = null;

        try
        {
            conn = Conexao.conectar();

            pstm = conn.prepareStatement(sql);

            pstm.setString(1, cadastro.getNome());
            pstm.setInt(2, cadastro.getIdade());
            pstm.setString(3, cadastro.getSexo());
            pstm.setString(4, cadastro.getEnd());
            pstm.setString(5, cadastro.getTelefone());

            //Executa a sql para inserção dos dados
            pstm.execute();

        } catch (Exception e)
        {
            e.printStackTrace();
        } finally
        {
            //Fecha as conexões
            try
            {
                if (pstm != null)
                {
                    pstm.close();
                }
                if (conn != null)
                {
                    conn.close();
                }
            } catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }

    public static void delete(Cadastro cadastro)
    {
        String sql = "DELETE FROM cadastro WHERE id = ?";

        Connection conn = null;
        PreparedStatement pstm = null;

        try
        {
            conn = Conexao.conectar();

            pstm = conn.prepareStatement(sql);

            pstm.setInt(1, cadastro.getId());

            pstm.execute();

        } catch (Exception e)
        {
            e.printStackTrace();
        } finally
        {
            try
            {
                if (pstm != null)
                {
                    pstm.close();
                }
                if (conn != null)
                {
                    conn.close();
                }
            } catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }

    public static void update(Cadastro cadastro)
    {
        String sql = "UPDATE cadastro "
                + " SET nome = ? "
                + "   , idade = ? "
                + "   , sexo = ? "
                + "   , end = ? "
                + "   , telefone = ? "
                + " WHERE id = ?";

        Connection conn = null;
        PreparedStatement pstm = null;

        try
        {
            conn = Conexao.conectar();

            pstm = conn.prepareStatement(sql);

            pstm.setString(1, cadastro.getNome());
            pstm.setInt(2, cadastro.getIdade());
            pstm.setString(3, cadastro.getSexo());
            pstm.setString(4, cadastro.getEnd());
            pstm.setString(5, cadastro.getTelefone());
            pstm.setInt(6, cadastro.getId());

            pstm.execute();

        } catch (Exception e)
        {

            e.printStackTrace();
        } finally
        {

            //Fecha as conexões
            try
            {
                if (pstm != null)
                {

                    pstm.close();
                }

                if (conn != null)
                {
                    conn.close();
                }

            } catch (Exception e)
            {

                e.printStackTrace();
            }
        }
    }

    public static List<Cadastro> getAll()
    {
        String sql = "SELECT * FROM cadastro";

        List<Cadastro> collection = new ArrayList<Cadastro>();

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

        try
        {
            conn = Conexao.conectar();

            pstm = conn.prepareStatement(sql);

            rset = pstm.executeQuery();

            while (rset.next())
            {
                Cadastro cadastro = new Cadastro();
                
                cadastro.setId(rset.getInt("id"));
                cadastro.setNome(rset.getString("nome"));
                cadastro.setIdade(Integer.parseInt(rset.getString("idade")));
                cadastro.setSexo(rset.getString("sexo"));
                cadastro.setEnd(rset.getString("end"));
                cadastro.setTelefone(rset.getString("telefone"));

                //Adiciono o contato recuperado, a lista de contatos
                collection.add(cadastro);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        } finally
        {
            try
            {
                if (rset != null)
                {
                    rset.close();
                }

                if (pstm != null)
                {
                    pstm.close();
                }

                if (conn != null)
                {
                    conn.close();
                }

            } catch (Exception e)
            {
                e.printStackTrace();
            }
        }

        return collection;
    }
    
    public static Cadastro getById(int id)
    {
        String sql = "SELECT * FROM cadastro WHERE id = ? ";

        Cadastro cadastro = new Cadastro();

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;

        try
        {
            conn = Conexao.conectar();
            
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            
            rset = pstm.executeQuery();

            if (rset.next())
            {
                cadastro.setId(rset.getInt("id"));
                cadastro.setNome(rset.getString("nome"));
                cadastro.setIdade(Integer.parseInt(rset.getString("idade")));
                cadastro.setSexo(rset.getString("sexo"));
                cadastro.setEnd(rset.getString("end"));
                cadastro.setTelefone(rset.getString("telefone"));                
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        } finally
        {
            try
            {
                if (rset != null)
                {
                    rset.close();
                }

                if (pstm != null)
                {
                    pstm.close();
                }

                if (conn != null)
                {
                    conn.close();
                }

            } catch (Exception e)
            {
                e.printStackTrace();
            }
        }

        return cadastro;
    }
}
