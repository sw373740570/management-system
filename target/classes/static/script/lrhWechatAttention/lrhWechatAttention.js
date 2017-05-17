function search(){
	if($('#wechatNickname').val() == '' || $('#vbsSaleSaleAgentId').val() == ''){
		return false;
	}
	$("#pageNo").val(1);
	pageQuery();
}

function pageQuery(){
	$("#tableDiv").load(ctx+"/lrhwechatattention/list",
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
	$("#contentDiv").load(ctx+"/lrhwechatattention/addPage");
}

function toEditPage(id){
	$("#contentDiv").load(ctx+"/lrhwechatattention/editPage/"+id);
}

function goBack(){
	$("#contentDiv").load(ctx+"/lrhwechatattention/main");
}


/**
 * 验证保存的必填条件
 * return 
 */
function validateSave(){
	
		
	return true;
}

function addLrhWechatAttention(){
	if(!validateSave()){
		return;
	}
	
	var data = $("#addForm").serialize();

	// 取得下拉角色
	//data += ("&roleId="+$("#roleSelector").val());
	
	$.ajax({
		"url" : ctx+"/lrhwechatattention/lrhWechatAttentionAdd",
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
					$("#contentDiv").load(ctx+"/lrhwechatattention/main");
				}
				
			}else{
				showMsg("保存出错!");
			}
		},
		"error" : function() {
			
		}
	});
}

function updateLrhWechatAttention(){
	if(!validateSave()){
		return;
	}

	var data = $("#editForm").serialize();

	// 取得下拉角色
	//data += ("&roleId="+$("#roleSelector").val());
	
	$.ajax({
		"url" : ctx+"/lrhwechatattention/lrhWechatAttentionEdit",
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
					$("#contentDiv").load(ctx+"/lrhwechatattention/main");
				}
				
			}else{
				showMsg("修改出错！");
			}
		},
		"error" : function() {
		}
	});
}

function deleteLrhWechatAttention(id,name){
	$('#deleteConfirmModal').modal('show');
	$("#del_user_name").html(name);
	$("#confirm_del").attr("onclick","deleteLrhWechatAttentionSubmit("+id+")");
}

function deleteLrhWechatAttentionSubmit(id){
	$.ajax({
		"url" : ctx+"/lrhwechatattention/lrhWechatAttentionDelete/"+id,
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

