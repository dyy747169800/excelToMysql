<%@ page language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <title>excelToMysql</title>
        <script type="text/javascript" src="/js/jquery-1.10.2.min.js"></script>
        <script type="text/javascript" src="/js/jquery.form.js"></script>
    </head>
    <body>
    <div>1.通过简单的form表单提交方式，进行文件的上</br> 2.通过jquery.form.js插件提供的form表单一步提交功能 </div></br>
        <form method="POST" enctype="multipart/form-data" id="form1" action="/upload.do">
            <table>
                <tr>
                    <td>上传文件: </td>
                    <td> <input id="upfile" type="file" name="upfile"></td>
                </tr>
                <tr>
                    <td><input type="submit" value="提交" onclick="checkData()"></td>
                    <td><input type="button" value="ajax方式提交" id="btn" name="btn" ></td>
                </tr>
            </table>
        </form>
    </body>
    <script type="text/javascript">
        //ajax 方式上传文件操作
        $(function(){
            $('#btn').click(function(){
                if(checkData()){
                    $('#form1').ajaxSubmit({
                        url:'/ajaxUpload.do',
                        dataType: 'text',
                        success: resutlMsg,
                        error: errorMsg
                    });
                    function resutlMsg(msg){
                        alert(msg);
                        $("#upfile").val("");
                    }
                    function errorMsg(){
                        alert("导入excel出错！");
                    }
                }
            });
        });

        //JS校验form表单信息
        function checkData(){
            var fileDir = $("#upfile").val();
            var suffix = fileDir.substr(fileDir.lastIndexOf("."));
            if("" == fileDir){
                alert("选择需要导入的Excel文件！");
                return false;
            }
            if(".xls" != suffix && ".xlsx" != suffix ){
                alert("选择Excel格式的文件导入！");
                return false;
            }
            return true;
        }
    </script>
</html>