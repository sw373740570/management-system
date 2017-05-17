<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/page/common/taglibs.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>丽人荟管理平台 | 管理</title>
</head>

<body>
		<table class="table table-striped table-bordered table-hover" id="editable" style="font-size:13px;">
			<thead>
				<tr>
						
						<th style="width:5%">客户微信昵称</th>
						<th style="width:5%">销售工号</th>
						<th style="width:5%">销售姓名</th>
						<th style="width:5%">销售所属团队名称</th>
						<th style="width:5%">销售所属门店名称</th>
						<th style="width:5%">销售所属城市</th>
						<th style="width:5%">关注时间</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="item" varStatus="status">
				
						<tr class="gradeX" id="${item.attentionId}">
				
						<td><c:out value="${item.wechatNickname}" escapeXml="true" /></td>
				
						<td><c:out value="${item.saleNo}" escapeXml="true" /></td>

						<td><c:out value="${item.vbsSaleAgentName}" escapeXml="true" /></td>
				
						<td><c:out value="${item.vbsSaleTeamName}" escapeXml="true" /></td>
				
						<td><c:out value="${item.vbsSaleStoreName}" escapeXml="true" /></td>
				
						<td><c:out value="${item.vbsSaleCityName}" escapeXml="true" /></td>

						<td><fmt:formatDate value="${item.attentionTime}" pattern="yyyy-MM-dd HH:mm:ss" /></td>

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
