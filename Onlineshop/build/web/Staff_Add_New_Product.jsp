<%-- 
    Document   : Staff_Add_New_Product
    Created on : Oct 8, 2019, 11:16:55 AM
    Author     : tri
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/includes/StaffHeader.jsp" %>
<!-- start body -->

        <title> Add Products </title>
        
<!-- start body -->
<%@ include file="/includes/StaffLeft.jsp" %>

<!-- PAGE TITLE -->
                <div class="page-title">                    
                    <h2><span class="fa fa-arrow-circle-o-left"></span> Add Product</h2>
                </div>
                <!-- END PAGE TITLE -->                

                <!-- PAGE CONTENT WRAPPER -->
                <div class="page-content-wrap">
                
                    <div class="row">
                        <div class="col-md-12">
                            <form class="form-horizontal" method="POST" action="StaffAddProductServlet">
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h3 class="panel-title"><strong>Add</strong> Product</h3>
                                    <ul class="panel-controls">
                                        <li><a href="#" class="panel-remove"><span class="fa fa-times"></span></a></li>
                                    </ul>
                                </div>
                                <div class="panel-body">
                                    <p> Hello, do whatever you want !!! </p>
                                </div>
                                <div class="panel-body">                                                                        
                                    
                                    <div class="row">
                                        
                                        <div class="col-md-6">
                                            <div class="form-group">                                        
                                                <label class="col-md-3 control-label">Product ID</label>
                                                <div class="col-md-9 col-xs-12">
                                                    <div class="input-group">
                                                        <span class="input-group-addon"><span class="fa fa-pencil"></span></span>
                                                        <input type="text" class="form-control" name="productID" value=""/>
                                                    </div>            
                                                    <span class="help-block">Must be a number</span>
                                                </div>
                                            </div>
                                            <div class="form-group">                                        
                                                <label class="col-md-3 control-label">Product Category ID</label>
                                                <div class="col-md-9 col-xs-12">
                                                    <div class="input-group">
                                                        <span class="input-group-addon"><span class="fa fa-pencil"></span></span>
                                                        <input type="text" class="form-control" name="categoryID" value=""/>
                                                    </div>            
                                                    <span class="help-block">Must be a number</span>
                                                </div>
                                            </div>
                                            
                                            <div class="form-group">                                        
                                                <label class="col-md-3 control-label">Product Name</label>
                                                <div class="col-md-9 col-xs-12">
                                                    <div class="input-group">
                                                        <span class="input-group-addon"><span class="fa fa-pencil"></span></span>
                                                        <input type="text" class="form-control" name="productName" value="${product.NAME}"/>
                                                    </div>            
                                                    <span class="help-block">Must be a string</span>
                                                </div>
                                            </div>
                                            
                                                    
                                            <div class="form-group">                                        
                                                <label class="col-md-3 control-label">Size</label>
                                                <div class="col-md-9 col-xs-12">
                                                    <div class="input-group">
                                                        <span class="input-group-addon"><span class="fa fa-pencil"></span></span>
                                                        <input type="text" class="form-control" name="productSize" value="${product.size}"/>
                                                    </div>            
                                                    <span class="help-block">Example : XL, XXL</span>
                                                </div>
                                            </div>
                                                    
                                             <div class="form-group">                                        
                                                <label class="col-md-3 control-label">Color</label>
                                                <div class="col-md-9 col-xs-12">
                                                    <div class="input-group">
                                                        <span class="input-group-addon"><span class="fa fa-pencil"></span></span>
                                                        <input type="text" class="form-control" name="productColor" value="${product.color}"/>
                                                    </div>            
                                                    <span class="help-block">Example : Green , Yellow</span>
                                                </div>
                                            </div>
                                                    
                                            <div class="form-group">                                        
                                                <label class="col-md-3 control-label">Country</label>
                                                <div class="col-md-9 col-xs-12">
                                                    <div class="input-group">
                                                        <span class="input-group-addon"><span class="fa fa-pencil"></span></span>
                                                        <input type="text" class="form-control" name="productCountry" value="${product.country}"/>
                                                    </div>            
                                                    <span class="help-block">Example : VietNam, China</span>
                                                </div>
                                            </div>
                                                    
                                            <div class="form-group">                                        
                                                <label class="col-md-3 control-label">Price</label>
                                                <div class="col-md-9 col-xs-12">
                                                    <div class="input-group">
                                                        <span class="input-group-addon"><span class="fa fa-pencil"></span></span>
                                                        <input type="text" class="form-control" name="productPrice" value="${product.PRICE}"/>
                                                    </div>            
                                                    <span class="help-block">Example : 4000</span>
                                                </div>
                                            </div>
                                            
                                             
                                            
                                        </div>
                                                    
                                                    
                                        <div class="col-md-6">
                                            <div class="form-group">                                        
                                                <label class="col-md-3 control-label">Quantity Remaining</label>
                                                <div class="col-md-9 col-xs-12">
                                                    <div class="input-group">
                                                        <span class="input-group-addon"><span class="fa fa-pencil"></span></span>
                                                        <input type="text" class="form-control" name="quantityRemaining" value="${product.quantity_remaining}"/>
                                                    </div>            
                                                    <span class="help-block">Example : 100</span>
                                                </div>
                                            </div>   
                                            <div class="form-group">                                        
                                                <label class="col-md-3 control-label">Gender</label>
                                                <div class="col-md-9 col-xs-12">
                                                    <div class="input-group">
                                                        <span class="input-group-addon"><span class="fa fa-pencil"></span></span>
                                                        <input type="text" class="form-control" name="productGender" value="${product.gender}"/>
                                                    </div>            
                                                    <span class="help-block">Example : Male, Female, Sexual</span>
                                                </div>
                                            </div>  
                                                    
                                            <div class="form-group">                                        
                                                <label class="col-md-3 control-label">Kind Of Fabric</label>
                                                <div class="col-md-9 col-xs-12">
                                                    <div class="input-group">
                                                        <span class="input-group-addon"><span class="fa fa-pencil"></span></span>
                                                        <input type="text" class="form-control" name="productFabric" value="${product.kindOfFabric}"/>
                                                    </div>            
                                                    <span class="help-block">Example : cotton</span>
                                                </div>
                                            </div>  
                                                    
                                            <div class="form-group">                                        
                                                <label class="col-md-3 control-label">Supplier</label>
                                                <div class="col-md-9 col-xs-12">
                                                    <div class="input-group">
                                                        <span class="input-group-addon"><span class="fa fa-pencil"></span></span>
                                                        <input type="text" class="form-control" name="productSupplier" value="${product.SUPPLIER}"/>
                                                    </div>            
                                                    <span class="help-block">Example : Le Minh Tri Shop</span>
                                                </div>
                                            </div>  
                                                    
                                                    
                                                    <div class="form-group">                                        
                                                <label class="col-md-3 control-label">Image</label>
                                                <div class="col-md-9 col-xs-12">
                                                    <div class="input-group">
                                                        <span class="input-group-addon"><span class="fa fa-pencil"></span></span>
                                                        <input type="text" class="form-control" name="productImage" value="${product.SUPPLIER}"/>
                                                    </div>            
                                                    <span class="help-block">Example : aogiap.jpg </span>
                                                </div>
                                            </div>  
                                                    
                                            <div class="form-group">
                                                <label class="col-md-3 control-label">Information</label>
                                                <div class="col-md-9 col-xs-12">                                            
                                                    <textarea class="form-control" rows="5" name="productInformation" rows="5" cols="30"></textarea>
                                                    <span class="help-block">More information about product</span>
                                                </div>
                                            </div>        
                                        </div>
                                        
                                    </div>

                                </div>
                                <div class="panel-footer">
                                    <button class="btn btn-default">Clear Form</button>                                    
                                    <button class="btn btn-primary pull-right">Submit</button>
                                </div>
                            </div>
                            </form>
                            
                        </div>
                    </div>                    
                    
                </div>
                <!-- END PAGE CONTENT WRAPPER -->                                                
            </div>            
            <!-- END PAGE CONTENT -->
        </div>
        <!-- END PAGE CONTAINER -->   
            
            
  <!-- footer -->        
  <div id="footer"><jsp:include page="/includes/StaffFooter.jsp"></jsp:include></div>
