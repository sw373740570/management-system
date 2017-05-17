function search(){
	$("#pageNo").val(1);
	pageQuery();
}

function pageQuery(){
	$("#tableDiv").load(ctx+"/datadictionary/list",
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
	$("#contentDiv").load(ctx+"/datadictionary/addPage");
}

function toEditPage(id){
	$("#contentDiv").load(ctx+"/datadictionary/editPage/"+id);
}

function goBack(){
	$("#contentDiv").load(ctx+"/datadictionary/main");
}


/**
 * 验证保存的必填条件
 * return 
 */
function validateSave(){
	
		
	return true;
}

function addDataDictionary(){
	if(!validateSave()){
		return;
	}
	
	var data = $("#addForm").serialize();

	// 取得下拉角色
	//data += ("&roleId="+$("#roleSelector").val());
	
	$.ajax({
		"url" : ctx+"/datadictionary/dataDictionaryAdd",
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
					$("#contentDiv").load(ctx+"/datadictionary/main");
				}
				
			}else{
				showMsg("保存出错!");
			}
		},
		"error" : function() {
			
		}
	});
}

function updateDataDictionary(){
	if(!validateSave()){
		return;
	}

	var data = $("#editForm").serialize();

	// 取得下拉角色
	//data += ("&roleId="+$("#roleSelector").val());
	
	$.ajax({
		"url" : ctx+"/datadictionary/dataDictionaryEdit",
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
					$("#contentDiv").load(ctx+"/datadictionary/main");
				}
				
			}else{
				showMsg("修改出错！");
			}
		},
		"error" : function() {
		}
	});
}

function deleteDataDictionary(id,name){
	$('#deleteConfirmModal').modal('show');
	$("#del_data_name").html(name);
	$("#confirm_del").attr("onclick","deleteDataDictionarySubmit("+id+")");
}

function deleteDataDictionarySubmit(id){
	$.ajax({
		"url" : ctx+"/datadictionary/dataDictionaryDelete/"+id,
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

					$("#"+id).remove();
					$('#deleteConfirmModal').modal('hide');
					alert(data.message);
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

