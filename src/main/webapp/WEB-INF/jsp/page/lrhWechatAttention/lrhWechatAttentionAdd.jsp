<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/page/common/taglibs.jsp"%>
<%@ include file="/WEB-INF/jsp/page/common/page_head.jsp"%>
<!DOCTYPE html>

<html>
<script src="/script/lrhWechatAttention/lrhWechatAttention.js"></script>

<link rel="stylesheet" href="/js/zTree_v3/css/zTreeStyle/metro.css" type="text/css">
<script type="text/javascript" src="/js/zTree_v3/js/jquery.ztree.core-3.5.js"></script>
<script type="text/javascript" src="/js/zTree_v3/js/jquery.ztree.excheck-3.5.js"></script>
<script type="text/javascript" src="/js/zTree_v3/js/jquery.ztree.exedit-3.5.js"></script>

<head>
	<title>维信金科后台管理平台 | 管理</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
                            <form id="addForm" class="form-horizontal">
							
                                
									<div class="form-group"><label class="col-sm-2 control-label">客户微信号</label>
                                    <div class="col-sm-10"><input type="text" class="form-control" id="wechatNo" name="wechatNo" maxlength="200"></div>
                                </div>
                                <div class="hr-line-dashed"></div>
                                
									<div class="form-group"><label class="col-sm-2 control-label">客户微信昵称</label>
                                    <div class="col-sm-10"><input type="text" class="form-control" id="wechatNickname" name="wechatNickname" maxlength="200"></div>
                                </div>
                                <div class="hr-line-dashed"></div>
                                
									<div class="form-group"><label class="col-sm-2 control-label">VBS——销售Id</label>
                                    <div class="col-sm-10"><input type="text" class="form-control" id="vbsSaleSaleAgentId" name="vbsSaleSaleAgentId" maxlength="200"></div>
                                </div>
                                <div class="hr-line-dashed"></div>
                                
									<div class="form-group"><label class="col-sm-2 control-label">VBS——销售所属团队名称</label>
                                    <div class="col-sm-10"><input type="text" class="form-control" id="vbsSaleTeamName" name="vbsSaleTeamName" maxlength="200"></div>
                                </div>
                                <div class="hr-line-dashed"></div>
                                
									<div class="form-group"><label class="col-sm-2 control-label">VBS——销售所属团队代码</label>
                                    <div class="col-sm-10"><input type="text" class="form-control" id="vbsSaleTeamFullKey" name="vbsSaleTeamFullKey" maxlength="200"></div>
                                </div>
                                <div class="hr-line-dashed"></div>
                                
									<div class="form-group"><label class="col-sm-2 control-label">VBS——销售所属门店代码</label>
                                    <div class="col-sm-10"><input type="text" class="form-control" id="vbsSaleStoreKey" name="vbsSaleStoreKey" maxlength="200"></div>
                                </div>
                                <div class="hr-line-dashed"></div>
                                
									<div class="form-group"><label class="col-sm-2 control-label">VBS——销售所属门店名称</label>
                                    <div class="col-sm-10"><input type="text" class="form-control" id="vbsSaleStoreName" name="vbsSaleStoreName" maxlength="200"></div>
                                </div>
                                <div class="hr-line-dashed"></div>
                                
									<div class="form-group"><label class="col-sm-2 control-label">VBS——销售所属城市</label>
                                    <div class="col-sm-10"><input type="text" class="form-control" id="vbsSaleCityName" name="vbsSaleCityName" maxlength="200"></div>
                                </div>
                                <div class="hr-line-dashed"></div>
                                
									<div class="form-group"><label class="col-sm-2 control-label">VBS——销售所属城市代码</label>
                                    <div class="col-sm-10"><input type="text" class="form-control" id="vbsSaleRegionKey" name="vbsSaleRegionKey" maxlength="200"></div>
                                </div>
                                <div class="hr-line-dashed"></div>
                                
									<div class="form-group"><label class="col-sm-2 control-label">客户微信OpenID</label>
                                    <div class="col-sm-10"><input type="text" class="form-control" id="openId" name="openId" maxlength="200"></div>
                                </div>
                                <div class="hr-line-dashed"></div>
                                
									<div class="form-group"><label class="col-sm-2 control-label">关注时间</label>
                                    <div class="col-sm-10"><input type="text" class="form-control" id="attentionTime" name="attentionTime" maxlength="200"></div>
                                </div>
                                <div class="hr-line-dashed"></div>
                                
									<div class="form-group"><label class="col-sm-2 control-label">记录创建时间</label>
                                    <div class="col-sm-10"><input type="text" class="form-control" id="createTime" name="createTime" maxlength="200"></div>
                                </div>
                                <div class="hr-line-dashed"></div>
                                
									<div class="form-group"><label class="col-sm-2 control-label">记录更新时间</label>
                                    <div class="col-sm-10"><input type="text" class="form-control" id="modifyTime" name="modifyTime" maxlength="200"></div>
                                </div>
                                <div class="hr-line-dashed"></div>
                                
									<div class="form-group"><label class="col-sm-2 control-label">VBS——销售姓名</label>
                                    <div class="col-sm-10"><input type="text" class="form-control" id="vbsSaleAgentName" name="vbsSaleAgentName" maxlength="200"></div>
                                </div>
                                <div class="hr-line-dashed"></div>
                                
									<div class="form-group"><label class="col-sm-2 control-label">VBS——城市code</label>
                                    <div class="col-sm-10"><input type="text" class="form-control" id="vbsCityCode" name="vbsCityCode" maxlength="200"></div>
                                </div>
                                <div class="hr-line-dashed"></div>
                                
									<div class="form-group"><label class="col-sm-2 control-label">VBS——销售部名称</label>
                                    <div class="col-sm-10"><input type="text" class="form-control" id="vbsSalesDepartmentName" name="vbsSalesDepartmentName" maxlength="200"></div>
                                </div>
                                <div class="hr-line-dashed"></div>
                                
									<div class="form-group"><label class="col-sm-2 control-label">VBS——销售部FullKey</label>
                                    <div class="col-sm-10"><input type="text" class="form-control" id="vbsSalesDepartmentKey" name="vbsSalesDepartmentKey" maxlength="200"></div>
                                </div>
                                <div class="hr-line-dashed"></div>
                                
									<div class="form-group"><label class="col-sm-2 control-label">VBS——分部名称</label>
                                    <div class="col-sm-10"><input type="text" class="form-control" id="vbsDivisionName" name="vbsDivisionName" maxlength="200"></div>
                                </div>
                                <div class="hr-line-dashed"></div>
                                
									<div class="form-group"><label class="col-sm-2 control-label">VBS——分部FullKey</label>
                                    <div class="col-sm-10"><input type="text" class="form-control" id="vbsDivisionKey" name="vbsDivisionKey" maxlength="200"></div>
                                </div>
                                <div class="hr-line-dashed"></div>
                                
                                <div class="form-group">
                                    <div class="col-sm-4 col-sm-offset-2">
                                    	<a href="javascript:void(0);" onclick="addLrhWechatAttention();" class="btn btn-primary" role="button"><span class="glyphicon glyphicon-ok" aria-hidden="true"></span> 保存</button></a>
                                    	<a href="javascript:void(0);" onclick="goBack();" class="btn btn-white" role="button"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span> 取消</button></a>
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
