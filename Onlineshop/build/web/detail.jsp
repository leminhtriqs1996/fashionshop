<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ include file="/includes/header.jsp" %>

<!-- start body -->
<link rel="stylesheet" href="css/detail.css" />
<style type="text/css">
            #main {
                width: 1060px;
                padding: 0;
                margin-left: auto;
                margin-right: auto;
            }

            #head {
                height: 200px;
                background-color: #F5F5F5;
                border: 1px solid #CDCDCD;
                margin-bottom: 5px;
                margin-top: 5px;
            }

            #head-link {
                height: 50px;
                line-height: 30px;
                border: 1px solid #CDCDCD;
                background-color: #F5F5F5;
                margin-bottom: 5px;
                clear: both;
            }

            #content {
                width: 1060px;
                min-height: 430px;
                border: 1px solid #CDCDCD;
                float: left;
                margin-bottom: 5px;
                clear: both;
            }

            #footer {
                height: 50px;
                clear: both;
                border: 1px solid #CDCDCD;
                background-color: #F8F8FF;
                margin-bottom: 5px;
            }
        </style>
        <title> Product detail </title>
        
<!-- start body -->
<%@ include file="/includes/column_left_home.jsp" %>

<!-- Start the content  -->
        
    
            <div id="content">
                <div class="left-1">
                    <img src="sanpham/${productByID.IMAGE}" width="200px" height="200px" />
                </div>
                <div class="left-2">
                    <table>
                        <tr class="row1">
                            <td class="col2" colspan="2" style="padding: 10px; color: blue; font-size: 15px; text-transform: uppercase; text-align: center; font-weight: bold">
                                ${productByID.NAME}
                            </td>
                        </tr>
                        <tr class="row2">
                            <td class="col1">Hãng sản xuất:</td>
                            <td class="col2">
                                ${productByID.SUPPLIER}
                            </td>
                        </tr>

                        <tr class="row2">
                            <td class="col1">Giá bán:</td>
                            <td class="col2">
                                ${productByID.PRICE}
                            </td>
                        </tr>

                    </table>
                </div>
                
                <div
                    style="margin-left: auto; margin-right: auto; text-align: center; margin-top: 10px; padding: 10px; clear: both;">
                    <a
                        href="#"><img
                            src="images/giohang.png" /></a>
                    <form action="CartServlet" method="post">
                        <input type="number" min="1" value="1" name="soluong"/>
                        <input type="hidden" value="setCart" name="command"/>
                        <input type="hidden" value="${productByID.ID_PRODUCT}" name="ma_san_pham"/>
                        <input type="submit" value="Thêm vào giỏ hàng">
                    </form>	
                </div>
                <div class="left-3">
                    <article> <input type="checkbox" id="read_more"
                                     role="button"> <label for="read_more" onclick=""
                                     style="width: 770px; margin-left: 150px; margin-right: auto;"><span>Xem
                                thông tin chi tiết</span> <span>Đóng</span></label> <section>
                            <table>

                                <!-- thong tin chung -->
                                <tr rowspan="2">
                                    <td class="detail-1">Thông chi tiết</td>
                                    <td class="detail-2">Đang cập nhật</td>
                                </tr>


                            </table>
                        </section> 
                    </article>
                </div>

            </div>
<!-- footer -->        
  <div id="footer"><jsp:include page="/includes/footer.jsp"></jsp:include></div>
