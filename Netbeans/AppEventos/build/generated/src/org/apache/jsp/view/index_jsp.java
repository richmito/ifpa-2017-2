package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.CadastroDAO;
import java.util.List;
import model.Cadastro;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Eventos</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"main\">\n");
      out.write("            <div class=\"content left\">\n");
      out.write("                <fieldset>\n");
      out.write("                    <legend>Consulta de Inscrições</legend>\n");
      out.write("                    <table>\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Nome</th>\n");
      out.write("                                <th>Idade</th>\n");
      out.write("                                <th>Sexo</th>\n");
      out.write("                                <th>Endereço</th>\n");
      out.write("                                <th>Telefone</th>\n");
      out.write("                                <th>Editar</th>\n");
      out.write("                                <th>Excluir</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            ");

                                Cadastro cadastro = new Cadastro();
                                List<Cadastro> cadastros = CadastroDAO.getAll();

                                for (Cadastro cad : cadastros)
                                {
                            
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td>");
 out.print(cad.getNome()); 
      out.write("</td>\n");
      out.write("                                <td>");
 out.print(cad.getIdade()); 
      out.write("</td>\n");
      out.write("                                <td>");
 out.print(cad.getSexo()); 
      out.write("</td>\n");
      out.write("                                <td>");
 out.print(cad.getEnd()); 
      out.write("</td>\n");
      out.write("                                <td>");
 out.print(cad.getTelefone()); 
      out.write("</td>\n");
      out.write("                                <td>\n");
      out.write("                                    <a href=\"../view/edicao.jsp?id=");
 out.print(cad.getId()); 
      out.write("\">\n");
      out.write("                                        <img src=\"img/edit.png\"/>\n");
      out.write("                                    </a>\n");
      out.write("                                </td>\n");
      out.write("                                <td>\n");
      out.write("                                    <a href=\"../controller/controleExclusao.jsp?id=");
 out.print(cad.getId()); 
      out.write("\">\n");
      out.write("                                        <img src=\"img/delete.png\"/>\n");
      out.write("                                    </a>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                    <a href=\"cadastro.jsp\" class=\"button\">Cadastrar</a>\n");
      out.write("                </fieldset>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"content right\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
