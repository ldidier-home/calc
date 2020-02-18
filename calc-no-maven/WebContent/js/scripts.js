"use strict";

function callOperationWs(operation) {
	var a = $("#a").val();
	var b = $("#b").val();
	var operation = $(operation).val();
	var getUrl = "api/operation/" + operation + "?a="+ a + "&b="+ b;
	$.getJSON({
		url:getUrl,
		success:function(data){
			$("#result").val(data.result);
		},
		error:function(xhr) {
			$("body").replaceWith(xhr.responseText)
		}
	});
}