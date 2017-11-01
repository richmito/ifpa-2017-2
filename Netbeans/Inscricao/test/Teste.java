
import dao.CadastroDAO;
import model.Cadastro;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author breno.gomes
 */
public class Teste
{
    public static void main(String[] args)
    {
        List<Cadastro> lista = CadastroDAO.getAll();
        
        for (Cadastro cad: lista)
        {
            System.out.print(cad.getNome() + " ");
            System.out.print(cad.getIdade() + " ");
            System.out.print(cad.getSexo() + " ");
            System.out.println("====================");
        }
    }
}
