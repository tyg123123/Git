<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/2/26 0026
  Time: 11:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>

    <h1>list</h1>
    <table border="1" width="100%">
        <tr align="">
            <th>id</th>
            <th>user</th>
            <th>password</th>
            <th>权限</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${userlist}" var="c" varStatus="l">
        <tr>

            <td>${c.t_uid}</td>
            <td>${c.t_user}</td>
            <td>${c.t_password}</td>
            <td>${c.authority}</td>
            <td><a href="delete?t_uid=${c.t_uid}">删除</a></td>
        </tr>
        </c:forEach>
    </table>

    <script type="text/javascript">
        function allCheck(){
            var obj=document.getElementsByTagName("input");
            if(document.getElementById("all").checked==true){
                for(var i=0;i<obj.length;i++){
                    obj[i].checked=true;
                }
            }else{
                for(var i=0;i<obj.length;i++){
                    obj[i].checked=false;
                }
            }
        }
        function checkT_F(){
            var obj=document.getElementsByTagName("input");
            var j=0;
            for(var i=0;i<obj.length;i++){
                if(obj[i].id!='all'){    //如果是复选框
                    if(obj[i].checked==true){    //并且为选中
                        j++;
                    }
                }
            }
            if(j==(obj.length-1)){    //如果复选框选中的数量等于（复选框总和减去全选这个选框的数量）
                document.getElementById("all").checked=true; //全选被激活
            }else{
                document.getElementById("all").checked=false;    //取消全选
            }
        }
    </script>

    <table width="500" border="1" cellspacing="0" cellpadding="0" class="ct">
        <tr>
            <td><input type="checkbox" id="all" name="allCK" onclick="javascript:allCheck()"/>全选</td>
            <td>产品名称</td>
            <td>价格(元)</td>
            <td>数量</td>
        </tr>
        <tr>
            <td><input type="checkbox" id="1" /></td>
            <td>诺基亚N85手机</td>
            <td>2589</td>
            <td>6</td>
        </tr>
        <tr>
            <td><input type="checkbox" id="2" /></td>
            <td>佳能数码相机</td>
            <td>1850</td>
            <td>5</td>
        </tr>
        <tr>
            <td><input type="checkbox" id="3" /></td>
            <td>戴尔键盘</td>
            <td>1834</td>
            <td>4</td>
        </tr>
        <tr>
            <td><input type="checkbox" id="4" /></td>
            <td>华为手机</td>
            <td>3432</td>
            <td>3</td>
        </tr>
        <tr>
            <td><input type="checkbox" id="5" /></td>
            <td>iphone</td>
            <td>4000</td>
            <td>20000</td>
        </tr>
        <tr>
            <td><input type="checkbox" id="6" /></td>
            <td>华硕笔记本</td>
            <td>6988</td>
            <td>5</td>
        </tr>
        <tr align="left">
            <td colspan="4">&nbsp;&nbsp;删除选中的产品</td>
        </tr>
    </table>
</head>
<body>

</body>
</html>
