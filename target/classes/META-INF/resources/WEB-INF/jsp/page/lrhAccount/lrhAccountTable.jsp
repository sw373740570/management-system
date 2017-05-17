<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/page/common/taglibs.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>丽人荟后台管理平台 | 管理</title>
</head>

<body>
		<table class="table table-striped table-bordered table-hover" id="editable" style="font-size:13px;">
			<thead>
				<tr>
						
						<th style="width:8%">客户手机号码</th>
						<th style="width:8%">客户名称</th>
						<th style="width:8%">身份证号码</th>
						<th style="width:8%">销售工号</th>
						<th style="width:8%">销售名称</th>
						<th style="width:8%">销售所属团队</th>
						<th style="width:8%">销售所属门店</th>
						<th style="width:8%">城市</th>
						<th style="width:8%">客户注册时间</th>
					<th style="width:8%">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="item" varStatus="status">
				
						<tr class="gradeX" id="${item.accountId}">
				
						<td><c:out value="${item.loginName}" escapeXml="true" /></td>
				
						<td><c:out value="${item.customerName}" escapeXml="true" /></td>
				
						<td><c:out value="${item.customerIdcard}" escapeXml="true" /></td>
				
						<td><c:out value="${item.saleNo}" escapeXml="true" /></td>
				
						<td><c:out value="${item.vbsSaleAgentName}" escapeXml="true" /></td>
				
						<td><c:out value="${item.vbsSaleTeamName}" escapeXml="true" /></td>
				
						<td><c:out value="${item.vbsSaleStoreName}" escapeXml="true" /></td>
				
						<td><c:out value="${item.vbsSaleCityName}" escapeXml="true" /></td>

						<td><fmt:formatDate value="${item.registerTime}" pattern="yyyy-MM-dd HH:mm:ss" /></td>

							<td class="center">
								<a href="javascript:void(0);" onclick="toEditPage('${item.accountId}')" class="btn btn-warning btn-sm" role="button" style="display: ${item.vbsSaleAgentName == null?'inline':'none'};">
									<span class="glyphicon glyphicon-edit" aria-hidden="true"></span> 修改
								</a></td>

				</tr>
				</c:forEach>
			</tbody>
		</table>
            
        <!-- table div -->
        <div class="row">
            <%@ include file="/WEB-INF/jsp/page/common/listPage.jsp" %>
        </div>

    <!-- Page-Level Scripts -->
    <script>
    
    </script>

</body>

</html>
