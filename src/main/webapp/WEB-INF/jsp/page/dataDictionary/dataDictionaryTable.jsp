<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/page/common/taglibs.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>聚品商城后台管理平台 | 管理</title>
</head>

<body>
		<table class="table table-striped table-bordered table-hover" id="editable" style="font-size:13px;">
			<thead>
				<tr>
						<th style="width:14%">类型</th>
						<th style="width:14%">KEY值</th>
						<th style="width:14%">VALUE值</th>
						<th style="width:14%">描述</th>
						<th style="width:14%">是否启用</th>
				<th style="width:14%">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="item" varStatus="status">
				
						<tr class="gradeX" id="${item.id}">
				
						<td><c:out value="${item.codeType}" escapeXml="true" /></td>
				
						<td><c:out value="${item.codeKey}" escapeXml="true" /></td>
				
						<td><c:out value="${item.codeValue}" escapeXml="true" /></td>
				
						<td><c:out value="${item.codeDescribe}" escapeXml="true" /></td>
				
						<td><c:choose>
							<c:when test="${item.isEnable=='1'}">可用</c:when>
							<c:otherwise>停用</c:otherwise>
						</c:choose>
						</td>
				
				     <td class="center">
					 <a href="javascript:void(0);" onclick="toEditPage('${item.id}')" class="btn btn-warning btn-sm" role="button">
					     		<span class="glyphicon glyphicon-edit" aria-hidden="true"></span> 修改
					     	</a>
					<a href="javascript:void(0);" onclick="deleteDataDictionary('${item.id}','${item.codeKey}');" class="btn btn-danger btn-sm" role="button">
					     		<span class="glyphicon glyphicon-trash" aria-hidden="true"></span> 删除
					     	</a>
				     </td>
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
