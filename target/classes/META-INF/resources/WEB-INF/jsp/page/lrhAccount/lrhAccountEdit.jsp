<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/page/common/taglibs.jsp"%>
<%@ include file="/WEB-INF/jsp/page/common/page_head.jsp"%>
<!DOCTYPE html>

<html>
<script src="/script/lrhAccount/lrhAccount.js"></script>

<link rel="stylesheet" href="/js/zTree_v3/css/zTreeStyle/metro.css" type="text/css">
<script type="text/javascript" src="/js/zTree_v3/js/jquery.ztree.core-3.5.js"></script>
<script type="text/javascript" src="/js/zTree_v3/js/jquery.ztree.excheck-3.5.js"></script>
<script type="text/javascript" src="/js/zTree_v3/js/jquery.ztree.exedit-3.5.js"></script>

<head>
	<title>维信金科后台管理平台 | 管理</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

<script type="text/javascript">
	
</script>

</head>

<body>

        <div class="row wrapper border-bottom white-bg page-heading">
            <div class="col-lg-10">
            		<h>&nbsp;</h>
                <ol class="breadcrumb">
                    <li>
                        <a href="index.html">主页</a>
                    </li>
                    <li>
                        <a>系统管理</a>
                    </li>
                    <li class="active">
                        <strong>管理</strong>
                    </li>
                </ol>
            </div>
            <div class="col-lg-2">

            </div>
        </div>


        <div class="wrapper wrapper-content animated fadeInRight">
            <div class="row">
                <div class="col-lg-12">
                    <div class="ibox float-e-margins">
                        <div class="ibox-title">
                            <h5>基本信息</h5>
                        </div>
                        <div class="ibox-content">
                            <form id="editForm" class="form-horizontal">
                            	
                                
									<input type="hidden" id="accountId" name="accountId" value="${lrhAccount.accountId}"/>
                                
									<div class="form-group"><label class="col-sm-2 control-label">客户手机号</label>
                                    <div class="col-sm-10">${lrhAccount.loginName}</div>
                                </div>
                                <div class="hr-line-dashed"></div>
                                
									<div class="form-group"><label class="col-sm-2 control-label">客户名称</label>
                                    <div class="col-sm-10">${lrhAccount.customerName}</div>
                                </div>
                                <div class="hr-line-dashed"></div>
                                
									<div class="form-group"><label class="col-sm-2 control-label">身份证号码</label>
                                    <div class="col-sm-10">${lrhAccount.customerIdcard}</div>
                                </div>
                                <div class="hr-line-dashed"></div>

                                <div class="form-group"><label class="col-sm-2 control-label">销售工号</label>
                                    <div class="col-sm-3"><input type="text" class="form-control" id="saleNo" name="saleNo" value="" maxlength="200"></div>
                                    <div class="col-sm-3"><a href="javascript:void(0);" onclick="getSaleInfo();" class="btn btn-primary" role="button"><span class="glyphicon glyphicon-ok" aria-hidden="true"></span> 查询</a></div>
                                </div>
                                <div class="hr-line-dashed">

                                </div>
                                <div class="form-group"><label class="col-sm-2 control-label">销售姓名</label>
                                    <div class="col-sm-10" id="saleName"></div>
                                </div>
                                <div class="hr-line-dashed"></div>
                                <div class="form-group"><label class="col-sm-2 control-label">销售所属团队</label>
                                    <div class="col-sm-10" id="teamName"></div>
                                </div>
                                <div class="hr-line-dashed"></div>
                                <div class="form-group"><label class="col-sm-2 control-label">销售所属门店</label>
                                    <div class="col-sm-10" id="storeName"></div>
                                </div>
                                <div class="hr-line-dashed"></div>
                                <div class="form-group"><label class="col-sm-2 control-label">销售所属城市</label>
                                    <div class="col-sm-10" id="city"></div>
                                </div>
                                <div class="hr-line-dashed"></div>
                                <div class="form-group">
                                    <div class="col-sm-4 col-sm-offset-2">
                                    	<a href="javascript:void(0);" onclick="updateLrhAccount1();" class="btn btn-primary" role="button"><span class="glyphicon glyphicon-ok" aria-hidden="true"></span> 保存</a></a>
                                    	<a href="javascript:void(0);" onclick="goBack();" class="btn btn-white" role="button"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span> 取消</a></a>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
	            <div class="col-sm-12 col-md-12">
	                <div id="messageDiv" class="alert alert-danger" role="alert" style="display:none;">
	                    <strong>提示信息!</strong> 
	                </div>
	            </div>
            </div>
        </div>


    <!-- Page-Level Scripts -->
    <script>

    </script>

</body>

</html>
