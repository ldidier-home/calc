// place here your main js script
function callWS() {
	$.getJSON({
		url:"/api/project/hello",
		success:function(data){
			alert("WS call result " + JSON.stringify(data));
		}
	});
}