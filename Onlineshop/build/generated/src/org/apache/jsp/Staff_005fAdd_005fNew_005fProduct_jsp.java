package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Staff_005fAdd_005fNew_005fProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/includes/StaffHeader.jsp");
    _jspx_dependants.add("/includes/StaffLeft.jsp");
  }

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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <!-- META SECTION -->       \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("        \n");
      out.write("        <link rel=\"icon\" href=\"favicon.ico\" type=\"image/x-icon\" />\n");
      out.write("        <!-- END META SECTION -->\n");
      out.write("        \n");
      out.write("        <!-- CSS INCLUDE -->        \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" id=\"theme\" href=\"css/theme-default.css\"/>\n");
      out.write("        <!-- EOF CSS INCLUDE -->       \n");
      out.write("\n");
      out.write("<!-- start body -->\n");
      out.write("\n");
      out.write("        <title> Update Products </title>\n");
      out.write("        \n");
      out.write("<!-- start body -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("    <body>\n");
      out.write("        <!-- START PAGE CONTAINER -->\n");
      out.write("        <div class=\"page-container\">\n");
      out.write("            \n");
      out.write("            <!-- START PAGE SIDEBAR -->\n");
      out.write("            <div class=\"page-sidebar\">\n");
      out.write("                <!-- START X-NAVIGATION -->\n");
      out.write("                <ul class=\"x-navigation\">\n");
      out.write("                    <li class=\"xn-logo\">\n");
      out.write("                        <a href=\"Staff_Dashboard.jsp\">Admin</a>\n");
      out.write("                        <a href=\"#\" class=\"x-navigation-control\"></a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"xn-profile\">\n");
      out.write("                        <a href=\"#\" class=\"profile-mini\">\n");
      out.write("                            <img src=\"assets/images/users/avatar.jpg\" alt=\"John Doe\"/>\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"profile\">\n");
      out.write("                            <div class=\"profile-image\">\n");
      out.write("                                <img src=\"assets/images/users/avatar.jpg\" alt=\"John Doe\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"profile-data\">\n");
      out.write("                                <div class=\"profile-data-name\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.staff.NAME}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </div>\n");
      out.write("                                <div class=\"profile-data-title\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.staff.EMAIL}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"profile-controls\">\n");
      out.write("                                <a href=\"pages-profile.html\" class=\"profile-control-left\"><span class=\"fa fa-info\"></span></a>\n");
      out.write("                                <a href=\"pages-messages.html\" class=\"profile-control-right\"><span class=\"fa fa-envelope\"></span></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>                                                                        \n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"xn-title\">Navigation</li>\n");
      out.write("                    <li class>\n");
      out.write("                        <a href=\"Staff_Dashboard.jsp\"><span class=\"fa fa-desktop\"></span> <span class=\"xn-text\">Dashboard</span></a>                        \n");
      out.write("                    </li>   \n");
      out.write("                    <li class>\n");
      out.write("                        <a href=\"Staff_View_Users.jsp\"><span class=\"glyphicon glyphicon-user\"></span> <span class=\"xn-text\">Users</span></a>                        \n");
      out.write("                    </li>\n");
      out.write("                    <li class>\n");
      out.write("                        <a href=\"Staff_View_New_Orders.jsp\"><span class=\"fa fa-edit\"></span> <span class=\"xn-text\">Order</span></a>                        \n");
      out.write("                    </li>  \n");
      out.write("                    <li class>\n");
      out.write("                        <a href=\"Staff_Product.jsp\"><span class=\"fa fa-columns\"></span> <span class=\"xn-text\">Product</span></a>                        \n");
      out.write("                    </li>   \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                </ul>\n");
      out.write("                <!-- END X-NAVIGATION -->\n");
      out.write("            </div>\n");
      out.write("            <!-- END PAGE SIDEBAR -->\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <!-- PAGE CONTENT -->\n");
      out.write("            <div class=\"page-content\">\n");
      out.write("                \n");
      out.write("                <!-- START X-NAVIGATION VERTICAL -->\n");
      out.write("                <ul class=\"x-navigation x-navigation-horizontal x-navigation-panel\">\n");
      out.write("                    <!-- TOGGLE NAVIGATION -->\n");
      out.write("                    <li class=\"xn-icon-button\">\n");
      out.write("                        <a href=\"#\" class=\"x-navigation-minimize\"><span class=\"fa fa-dedent\"></span></a>\n");
      out.write("                    </li>\n");
      out.write("                    <!-- END TOGGLE NAVIGATION -->\n");
      out.write("                    \n");
      out.write("                    <!-- SIGN OUT -->\n");
      out.write("                    <li class=\"xn-icon-button pull-right\">\n");
      out.write("                        <a href=\"StaffLogoutServlet\"  > \n");
      out.write("                            <span class=\"fa fa-sign-out\">\n");
      out.write("                            \n");
      out.write("                            </span> \n");
      out.write("                        </a>  \n");
      out.write("                                           \n");
      out.write("                    </li> \n");
      out.write("                    <!-- END SIGN OUT -->\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                </ul>\n");
      out.write("                <!-- END X-NAVIGATION VERTICAL -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- PAGE TITLE -->\n");
      out.write("                <div class=\"page-title\">                    \n");
      out.write("                    <h2><span class=\"fa fa-arrow-circle-o-left\"></span> Update Product</h2>\n");
      out.write("                </div>\n");
      out.write("                <!-- END PAGE TITLE -->                \n");
      out.write("\n");
      out.write("                <!-- PAGE CONTENT WRAPPER -->\n");
      out.write("                <div class=\"page-content-wrap\">\n");
      out.write("                \n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                            <form class=\"form-horizontal\" method=\"POST\" action=\"StaffUpdateProductServlet\">\n");
      out.write("                            <div class=\"panel panel-default\">\n");
      out.write("                                <div class=\"panel-heading\">\n");
      out.write("                                    <h3 class=\"panel-title\"><strong>Update</strong> Product</h3>\n");
      out.write("                                    <ul class=\"panel-controls\">\n");
      out.write("                                        <li><a href=\"#\" class=\"panel-remove\"><span class=\"fa fa-times\"></span></a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"panel-body\">\n");
      out.write("                                    <p> Hello, do whatever you want !!! </p>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"panel-body\">                                                                        \n");
      out.write("                                    \n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        \n");
      out.write("                                        <div class=\"col-md-6\">\n");
      out.write("                                            <input type=\"hidden\" name=\"codeProduct\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.ID_PRODUCT}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <label class=\"col-md-3 control-label\">Category ID</label>\n");
      out.write("                                                <div class=\"col-md-9\">                                            \n");
      out.write("                                                    <div class=\"input-group\">\n");
      out.write("                                                        <span class=\"input-group-addon\"><span class=\"fa fa-pencil\"></span></span>\n");
      out.write("                                                        <input type=\"text\" class=\"form-control\" name=\"categoryID\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.ID_CATEGORY}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                                                    </div>                                            \n");
      out.write("                                                    <span class=\"help-block\">Must be a number</span>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            \n");
      out.write("                                            <div class=\"form-group\">                                        \n");
      out.write("                                                <label class=\"col-md-3 control-label\">Product Name</label>\n");
      out.write("                                                <div class=\"col-md-9 col-xs-12\">\n");
      out.write("                                                    <div class=\"input-group\">\n");
      out.write("                                                        <span class=\"input-group-addon\"><span class=\"fa fa-pencil\"></span></span>\n");
      out.write("                                                        <input type=\"text\" class=\"form-control\" name=\"productName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.NAME}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                                                    </div>            \n");
      out.write("                                                    <span class=\"help-block\">Must be a string</span>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            \n");
      out.write("                                            <div class=\"form-group\">                                        \n");
      out.write("                                                <label class=\"col-md-3 control-label\">Size</label>\n");
      out.write("                                                <div class=\"col-md-9 col-xs-12\">\n");
      out.write("                                                    <div class=\"input-group\">\n");
      out.write("                                                        <span class=\"input-group-addon\"><span class=\"fa fa-pencil\"></span></span>\n");
      out.write("                                                        <input type=\"text\" class=\"form-control\" name=\"productSize\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                                                    </div>            \n");
      out.write("                                                    <span class=\"help-block\">Example : XL, XXL</span>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                                    \n");
      out.write("                                            <div class=\"form-group\">                                        \n");
      out.write("                                                <label class=\"col-md-3 control-label\">Size</label>\n");
      out.write("                                                <div class=\"col-md-9 col-xs-12\">\n");
      out.write("                                                    <div class=\"input-group\">\n");
      out.write("                                                        <span class=\"input-group-addon\"><span class=\"fa fa-pencil\"></span></span>\n");
      out.write("                                                        <input type=\"text\" class=\"form-control\" name=\"productSize\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                                                    </div>            \n");
      out.write("                                                    <span class=\"help-block\">Example : XL, XXL</span>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                                    \n");
      out.write("                                             <div class=\"form-group\">                                        \n");
      out.write("                                                <label class=\"col-md-3 control-label\">Color</label>\n");
      out.write("                                                <div class=\"col-md-9 col-xs-12\">\n");
      out.write("                                                    <div class=\"input-group\">\n");
      out.write("                                                        <span class=\"input-group-addon\"><span class=\"fa fa-pencil\"></span></span>\n");
      out.write("                                                        <input type=\"text\" class=\"form-control\" name=\"productColor\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.color}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                                                    </div>            \n");
      out.write("                                                    <span class=\"help-block\">Example : Green , Yellow</span>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                                    \n");
      out.write("                                            <div class=\"form-group\">                                        \n");
      out.write("                                                <label class=\"col-md-3 control-label\">Country</label>\n");
      out.write("                                                <div class=\"col-md-9 col-xs-12\">\n");
      out.write("                                                    <div class=\"input-group\">\n");
      out.write("                                                        <span class=\"input-group-addon\"><span class=\"fa fa-pencil\"></span></span>\n");
      out.write("                                                        <input type=\"text\" class=\"form-control\" name=\"productCountry\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.country}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                                                    </div>            \n");
      out.write("                                                    <span class=\"help-block\">Example : VietNam, China</span>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                                    \n");
      out.write("                                            <div class=\"form-group\">                                        \n");
      out.write("                                                <label class=\"col-md-3 control-label\">Price</label>\n");
      out.write("                                                <div class=\"col-md-9 col-xs-12\">\n");
      out.write("                                                    <div class=\"input-group\">\n");
      out.write("                                                        <span class=\"input-group-addon\"><span class=\"fa fa-pencil\"></span></span>\n");
      out.write("                                                        <input type=\"text\" class=\"form-control\" name=\"productPrice\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.PRICE}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                                                    </div>            \n");
      out.write("                                                    <span class=\"help-block\">Example : 4000</span>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            \n");
      out.write("                                             \n");
      out.write("                                            \n");
      out.write("                                        </div>\n");
      out.write("                                                    \n");
      out.write("                                                    \n");
      out.write("                                        <div class=\"col-md-6\">\n");
      out.write("                                            <div class=\"form-group\">                                        \n");
      out.write("                                                <label class=\"col-md-3 control-label\">Quantity Remaining</label>\n");
      out.write("                                                <div class=\"col-md-9 col-xs-12\">\n");
      out.write("                                                    <div class=\"input-group\">\n");
      out.write("                                                        <span class=\"input-group-addon\"><span class=\"fa fa-pencil\"></span></span>\n");
      out.write("                                                        <input type=\"text\" class=\"form-control\" name=\"quantityRemaining\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.quantity_remaining}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                                                    </div>            \n");
      out.write("                                                    <span class=\"help-block\">Example : 100</span>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>   \n");
      out.write("                                            <div class=\"form-group\">                                        \n");
      out.write("                                                <label class=\"col-md-3 control-label\">Gender</label>\n");
      out.write("                                                <div class=\"col-md-9 col-xs-12\">\n");
      out.write("                                                    <div class=\"input-group\">\n");
      out.write("                                                        <span class=\"input-group-addon\"><span class=\"fa fa-pencil\"></span></span>\n");
      out.write("                                                        <input type=\"text\" class=\"form-control\" name=\"productGender\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.gender}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                                                    </div>            \n");
      out.write("                                                    <span class=\"help-block\">Example : Male, Female, Sexual</span>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>  \n");
      out.write("                                                    \n");
      out.write("                                            <div class=\"form-group\">                                        \n");
      out.write("                                                <label class=\"col-md-3 control-label\">Kind Of Fabric</label>\n");
      out.write("                                                <div class=\"col-md-9 col-xs-12\">\n");
      out.write("                                                    <div class=\"input-group\">\n");
      out.write("                                                        <span class=\"input-group-addon\"><span class=\"fa fa-pencil\"></span></span>\n");
      out.write("                                                        <input type=\"text\" class=\"form-control\" name=\"productFabric\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.kindOfFabric}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                                                    </div>            \n");
      out.write("                                                    <span class=\"help-block\">Example : cotton</span>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>  \n");
      out.write("                                                    \n");
      out.write("                                            <div class=\"form-group\">                                        \n");
      out.write("                                                <label class=\"col-md-3 control-label\">Supplier</label>\n");
      out.write("                                                <div class=\"col-md-9 col-xs-12\">\n");
      out.write("                                                    <div class=\"input-group\">\n");
      out.write("                                                        <span class=\"input-group-addon\"><span class=\"fa fa-pencil\"></span></span>\n");
      out.write("                                                        <input type=\"text\" class=\"form-control\" name=\"productSupplier\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.SUPPLIER}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                                                    </div>            \n");
      out.write("                                                    <span class=\"help-block\">Example : Le Minh Tri Shop</span>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>  \n");
      out.write("                                                    \n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <label class=\"col-md-3 control-label\">Information</label>\n");
      out.write("                                                <div class=\"col-md-9 col-xs-12\">                                            \n");
      out.write("                                                    <textarea class=\"form-control\" rows=\"5\" name=\"productInformation\" rows=\"5\" cols=\"30\"></textarea>\n");
      out.write("                                                    <span class=\"help-block\">More information about product</span>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>        \n");
      out.write("                                        </div>\n");
      out.write("                                        \n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"panel-footer\">\n");
      out.write("                                    <button class=\"btn btn-default\">Clear Form</button>                                    \n");
      out.write("                                    <button class=\"btn btn-primary pull-right\">Submit</button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            </form>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                    </div>                    \n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <!-- END PAGE CONTENT WRAPPER -->                                                \n");
      out.write("            </div>            \n");
      out.write("            <!-- END PAGE CONTENT -->\n");
      out.write("        </div>\n");
      out.write("        <!-- END PAGE CONTAINER -->   \n");
      out.write("            \n");
      out.write("            \n");
      out.write("  <!-- footer -->        \n");
      out.write("  <div id=\"footer\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/includes/StaffFooter.jsp", out, false);
      out.write("</div>\n");
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
