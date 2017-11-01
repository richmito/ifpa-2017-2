<%@page import="dao.CadastroDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inscrição Hackaton</title>   
    <img src="img/IEPTB_PA.jpg" alt=""/>
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>      
        
        <div class="main">
            <img src="img/bandeira.jpg" align="left"/>
            <div class="content left">
                <fieldset>
                    
                    
                    <form class="form-content" method="POST" action="../controller/controleCadastro.jsp">
                        
                        <table align="right">
                            
                            <tr>
                        <div class="grupo">
                            <td><label for="txt_nome">Nome:</label></td>
                            <td><input type="text" id="txt_nome" name="nome" /></td>
                        </div></tr>
                        <tr>
                        <div class="grupo">
                            <td><label for="txt_idade">Idade:</label>
                            <td><input type="text" id="txt_idade" name="idade" />
                        </div> </tr>
                        <div class="grupo"><tr>
                            <td><label for="txt_sexo">Gênero:</label>
                            <td><input type="text" id="txt_sexo" name="sexo" />
                        </div> </tr>
                        <div class="grupo"><tr>
                            <td><label for="txt_end">Endereço:</label>
                            <td><input type="text" id="txt_end" name="end" />
                        </div> </tr>
                        <div class="grupo"><tr>
                            <td><label for="txt_telefone">Telefone:</label>
                            <td><input type="text" id="txt_telefone" name="telefone" />
                        </div></tr>
                        <div class="grupo"><tr>
                            <td><input type="submit" text="Salvar" />
                        </div></tr>
                            </table>
                    </form>
                </fieldset>
            </div>
            <div class="content right">

            </div>
        </div>
            
    </body>
</html>