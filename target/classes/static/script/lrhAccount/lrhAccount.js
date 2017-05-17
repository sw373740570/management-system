function search(){
	if($("#loginName").val() == ''){
		//return false;
	}
	$("#pageNo").val(1);
	pageQuery();
}

function pageQuery(){
	$("#tableDiv").load(ctx+"/lrhaccount/list",
			$("#searchForm").serialize()
			,function(){
	});
}

function enterPress(e){
	var e = e || window.event; 
	if(e.keyCode == 13){ 
		search(); 
	}
}

function toAddPage(){
	$("#contentDiv").load(ctx+"/lrhaccount/addPage");
}

function toEditPage(id){
	$("#contentDiv").load(ctx+"/lrhaccount/editPage/"+id);
}

function goBack(){
	$("#contentDiv").load(ctx+"/lrhaccount/main");
}


/**
 * 验证保存的必填条件
 * return 
 */
function validateSave(){
	
		
	return true;
}

function addLrhAccount(){
	if(!validateSave()){
		return;
	}
	
	var data = $("#addForm").serialize();

	// 取得下拉角色
	//data += ("&roleId="+$("#roleSelector").val());
	
	$.ajax({
		"url" : ctx+"/lrhaccount/lrhAccountAdd",
		"type" : "PUT",
		data:data,
		dataType : 'json',
		"success" : function(data) {
			if(data!=""&&data!=null){
				var status=data.status;
				if(status==0){
					showMsg(data.message);
				}else{
					//showMsg("保存成功！", 2000);
					alert(data.message);
					$("#contentDiv").load(ctx+"/lrhaccount/main");
				}
				
			}else{
				showMsg("保存出错!");
			}
		},
		"error" : function() {
			
		}
	});
}

function updateLrhAccount(){
	if(!validateSave()){
		return;
	}

	var data = $("#editForm").serialize();

	// 取得下拉角色
	//data += ("&roleId="+$("#roleSelector").val());
	
	$.ajax({
		"url" : ctx+"/lrhaccount/lrhAccountEdit",
		"type" : "POST",
		data:data,
		dataType : 'json',
		"success" : function(data) {
			if(data!=""&&data!=null){
				var status=data.status;
				if(status==0){
					showMsg(data.message);
				} else {
					//showMsg("修改成功！", 2000);
					alert(data.message);
					$("#contentDiv").load(ctx+"/lrhaccount/main");
				}
				
			}else{
				showMsg("修改出错！");
			}
		},
		"error" : function() {
		}
	});
}

function deleteLrhAccount(id,name){
	$('#deleteConfirmModal').modal('show');
	$("#del_user_name").html(name);
	$("#confirm_del").attr("onclick","deleteLrhAccountSubmit("+id+")");
}

function deleteLrhAccountSubmit(id){
	$.ajax({
		"url" : ctx+"/lrhaccount/lrhAccountDelete/"+id,
		"type" : "DELETE",
		data:null,
		dataType : 'json',
		"success" : function(data) {
			if(data!=""&&data!=null){
				var status=data.status;
				if(status==0){
					showMsg(data.message,2000);
					$('#deleteConfirmModal').modal('hide');
				}else{
					alert(data.message);
					$("#"+id).remove();
					$('#deleteConfirmModal').modal('hide');
					pageQuery();
				}
				
			}else{
				showMsg("保存出错！",2000);
				$('#deleteConfirmModal').modal('hide');
			}
		},
		"error" : function() {
		}
	});
}

function getSaleInfo() {
	$.ajax({
		"url" : ctx+"/lrhaccount/getSaleInfo/" + $("#saleNo").val(),
		"type" : "POST",
		data:"",
		dataType : 'json',
		"success" : function(data) {
			if(data.Status == 1){
				result = $.parseJSON(data.Content);
				//showMsg($.parseJSON(data.Content).SaleAgent);
				//showMsg(data.Content);
				$("#saleName").html(result.SaleAgentName);
				$("#teamName").html(result.TeamName);
				$("#storeName").html(result.StoreName);
				$("#city").html(result.CityName);
			}else{
				showMsg("查询失败！");
				$("#saleName").html('');
				$("#teamName").html('');
				$("#storeName").html('');
				$("#city").html('');
			}
		},
		"error" : function() {
			showMsg("查询失败！");
		}
	});
}

