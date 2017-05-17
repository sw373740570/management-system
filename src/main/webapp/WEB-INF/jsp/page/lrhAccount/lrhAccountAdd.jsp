﻿<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
							
                                
									<div class="form-group"><label class="col-sm-2 control-label">登录用户名</label>
                                    <div class="col-sm-10"><input type="text" class="form-control" id="loginName" name="loginName" maxlength="200"></div>
                                </div>
                                <div class="hr-line-dashed"></div>
                                
									<div class="form-group"><label class="col-sm-2 control-label">登录密码</label>
                                    <div class="col-sm-10"><input type="text" class="form-control" id="password" name="password" maxlength="200"></div>
                                </div>
                                <div class="hr-line-dashed"></div>
                                
									<div class="form-group"><label class="col-sm-2 control-label">帐号类型（01：客户，02销售）</label>
                                    <div class="col-sm-10"><input type="text" class="form-control" id="accountType" name="accountType" maxlength="200"></div>
                                </div>
                                <div class="hr-line-dashed"></div>
                                
									<div class="form-group"><label class="col-sm-2 control-label">创建时间</label>
                                    <div class="col-sm-10"><input type="text" class="form-control" id="createTime" name="createTime" maxlength="200"></div>
                                </div>
                                <div class="hr-line-dashed"></div>
                                
									<div class="form-group"><label class="col-sm-2 control-label">更新时间</label>
                                    <div class="col-sm-10"><input type="text" class="form-control" id="updateTime" name="updateTime" maxlength="200"></div>
                                </div>
                                <div class="hr-line-dashed"></div>
                                
									<div class="form-group"><label class="col-sm-2 control-label">我的邀请码标识</label>
                                    <div class="col-sm-10"><input type="text" class="form-control" id="inviteCode" name="inviteCode" maxlength="200"></div>
                                </div>
                                <div class="hr-line-dashed"></div>
                                
									<div class="form-group"><label class="col-sm-2 control-label">帐号是否启用(1: 已启用，0: 未启用)</label>
                                    <div class="col-sm-10"><input type="text" class="form-control" id="isEnabled" name="isEnabled" maxlength="200"></div>
                                </div>
                                <div class="hr-line-dashed"></div>
                                
									<div class="form-group"><label class="col-sm-2 control-label">注册时间</label>
                                    <div class="col-sm-10"><input type="text" class="form-control" id="registerTime" name="registerTime" maxlength="200"></div>
                                </div>
                                <div class="hr-line-dashed"></div>
                                
									<div class="form-group"><label class="col-sm-2 control-label">app渠道来源</label>
                                    <div class="col-sm-10"><input type="text" class="form-control" id="appChannel" name="appChannel" maxlength="200"></div>
                                </div>
                                <div class="hr-line-dashed"></div>
                                
									<div class="form-group"><label class="col-sm-2 control-label">手机品牌型号</label>
                                    <div class="col-sm-10"><input type="text" class="form-control" id="brand" name="brand" maxlength="200"></div>
                                </div>
                                <div class="hr-line-dashed"></div>
                                
									<div class="form-group"><label class="col-sm-2 control-label">注册设备唯一标识</label>
                                    <div class="col-sm-10"><input type="text" class="form-control" id="deviceId" name="deviceId" maxlength="200"></div>
                                </div>
                                <div class="hr-line-dashed"></div>
                                
									<div class="form-group"><label class="col-sm-2 control-label">注册设备类型(android, ios)</label>
                                    <div class="col-sm-10"><input type="text" class="form-control" id="deviceType" name="deviceType" maxlength="200"></div>
                                </div>
                                <div class="hr-line-dashed"></div>
                                
                                <div class="form-group">
                                    <div class="col-sm-4 col-sm-offset-2">
                                    	<a href="javascript:void(0);" onclick="addLrhAccount();" class="btn btn-primary" role="button"><span class="glyphicon glyphicon-ok" aria-hidden="true"></span> 保存</button></a>
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
