/**
 * 
 */

var FilmReplyService = (function(){ // FilmreplyService 함수선언
	// 댓글쓰기(add)를 하기 위한 함수 선언
	function add(reply, callback){
		console.log(reply)
		$.ajax({
			url : "/Filmreplies/new",
			type : "post",
			data : JSON.stringify(reply), // JSON.stringify : 자바스크립트의 값을 JSON 문자열로 변환
			contentType:"application/json;charset=utf-8",
			success:function(result){ // 통신이 정상적으로 성공했으면 
				// callback함수 선언
				// 만약에 callback이 있으면
				if(callback)
				// callback함수를 호출
					callback(result);
				
			}, 
			error:function(){ // 통신이 비정상적으로 처리가 되어 error가 있으면
				
			} 
		})
	}
	
	// 댓글 목록 리스트를 하기 위한 함수 선언
	function getList(param,callback){
		var bno = param.bno;
		console.log(bno);
		$.getJSON(
				"/Filmreplies/list/"+bno+".json",
				function(data){
					if(callback)
						callback(data);
				})			
	}
	
	// 댓글 수정을 하기 위해 댓글내용 가져오기 함수 선언
	function reDetail(rno, callback){
		var rno = rno;
		$.getJSON(
				"/Filmreplies/"+rno+".json",
				function(data){
					if(callback)
						callback(data);
				})
	}
	
	// 댓글 수정을 하기 위한 함수 선언
	function reUpdate(reply, callback){
		console.log(reply);
		$.ajax({
			url : "/Filmreplies/update",
			type : "put",
			data : JSON.stringify(reply), 
			contentType:"application/json;charset=utf-8",
			success:function(result){ 
				// callback함수 선언
				// 만약에 callback이 있으면
				if(callback)
				// callback함수를 호출
					callback(result);
				
			}, 
			error:function(){ // 통신이 비정상적으로 처리가 되어 error가 있으면
			} 
		})
	}
	
	// 댓글 삭제를 하기 위한 함수 선언
	function remove(reply, callback){
		console.log(reply);
		$.ajax({
			url : "/Filmreplies/remove",
			type : "delete",
			data : JSON.stringify(reply), 
			contentType:"application/json;charset=utf-8",
			success:function(result){ 
				// callback함수 선언
				// 만약에 callback이 있으면
				if(callback)
				// callback함수를 호출
					callback(result);
				
			}, 
			error:function(){ // 통신이 비정상적으로 처리가 되어 error가 있으면
			} 
		})
	}
	
	
	
	
	
	return {
		add : add,
		getList : getList,
		reDetail:reDetail,
		reUpdate:reUpdate,
		remove:remove
		};
})()








$(document).ready(function(){
	// bno값
	var bno=$("#bno").html();
	
	// 상세페이지가 시작되자마자 이미지를 출력하기 위한 ajax
	$.getJSON("/filmlog/fileList/"+bno+".json",
			function(data){ // filmlogController에 있는 fileList를 통해 얻어진 select결과를 저장한 후,
		// detail.jsp에 뿌리기
		console.log(data)
		var str = "";
		$(data).each(function(i, obj){
			if(!obj.image) { // 사용자가 업로드한 파일의 타입이 이미지가 아니면(excel 문서 파일, ppt파일),
				var fileCallPath = encodeURIComponent(obj.uploadPath + "/" + obj.uuid + "_" + obj.fileName)
				str += "<li data-path='" + obj.uploadPath + "'";
				str += "data-uuid='" + obj.uuid + "'data-filename = '" + obj.fileName + "'data-type='" + obj.image + "'>";
				str += "<a href = '/download?fileName=" + fileCallPath + "'>" + obj.fileName + "</a></li>"
			} else { // 사용자가 업르도한 파일의 타입이 이미지이면(.jpg, .png, .gif),
				var fileCallPath = encodeURIComponent(obj.uploadPath + "/s_" + obj.uuid + "_" + obj.fileName)
				// console.log(fileCallPath);
				// img 태그를 사용해서 웹브라우저 이미지 출력
				str += "<li data-path='" + obj.uploadPath + "'";
				str += "data-uuid='" + obj.uuid + "'data-filename = '" + obj.fileName + "'data-type='" + obj.image + "'>";
				str += "<img src = '/display?fileName=" + fileCallPath + "'></li>"
			}
			
		})
		$("#uploadResult ul").html(str)
		
	})
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// 상세페이지가 실행되면 댓글 글쓰기 버튼 활성화
	$("#modalRegisterBtn").show();
	// 상세페이지가 실행되면 댓글 글수정 버튼 활성화
	$("#modalModBtn").show();
	// 상세페이지가 실행되면 댓글 글삭제 버튼 활성화
	$("#modalRemoveBtn").show();
	
	//댓글쓰기 버튼을 클릭하면
	$("#addReplyBtn").on("click",function(e){
		
		// bno값을 가져와라.
		var bno=$("#bno").val();
		$("input[name='bno']").val(bno);
		// rno값 비워라
		$("input[name='rno']").val("")
		// reply값 비워라
		$("input[name='reply']").val("")
		// replyer값 비워라
		$("input[name='replyer']").val("")
		// 댓글 글수정 버튼 비활성화
		$("#modalModBtn").hide();
		// 댓글 글삭제 버튼 비활성화
		$("#modalRemoveBtn").hide();
		// 모달창을 띄워라
		$(".modal fade").modal("show");
	});
	
	
	showList();		// detail.jsp가 실행되자마자 댓글목록리스트가 실행되어야 함
	
	function showList(){

		FilmReplyService.getList({bno:bno},function(list){
			
			console.log(list);
			var str="";
			
			for(var i = 0; i < list.length; i++ ){
				str+="<li data-rno='"+list[i].rno+"'><div><b>"+list[i].replyer+"</b></div>"
				str+="<div>"+list[i].reply+"</div>"
				str+="</li>"
			}

			
			$("#relist").html(str)
			
		}); // 소스를 간결하게 가져갈 수 있고, 유지보수를 쉽게 할 수 있음
	}
	
	// console.log(FilmreplyService); // FilmreplyService함수 호출
	// 댓글쓰기 버튼(id가 값이 modalRegisterBtn)을 클릭하면
	$("#modalRegisterBtn").on("click", function(){
		// bno값 가져오기
		var bno=$("#bno").val();
		// 사용자가 입력한 댓글내용을 저장
		var reply = $("input[name='reply']").val()
		// 사용자가 입력한 댓글작성자를 저장
		var replyer = $("input[name='replyer']").val()
		//              ajax보내고자하는 json타입                                 , callback
		FilmReplyService.add({reply:reply, replyer:replyer,bno:bno}, 
				function(result){ // callback함수호출
					alert("insert 작업 : "+result)
					// 목록리스트를 처리
					showList();
				}
		);
		// 모달창을 숨겨라
		$(".modal").modal("hide");
	}) // 모달창안에 댓글 쓰기 버튼
	// 댓글 내용을 클릭하면 ( 수정 및 삭제를 하기 위해서 )
	$("#relist").on("click","li",function(){
		
		// rno값을 가져오기
		var rno = $(this).data("rno");
		
		FilmReplyService.reDetail(rno,function(detail){
			console.log(detail)
			
			$("input[name='rno']").val(detail.rno)
			$("input[name='replyer']").val(detail.replyer)
			$("input[name='reply']").val(detail.reply)
		})
		
		// 글쓰기 버튼 비활성화
		$("#modalRegisterBtn").hide();
		// 댓글 글수정 버튼 활성화
		$("#modalModBtn").show();
		// 댓글 글삭제 버튼 활성화
		$("#modalRemoveBtn").show();
		// 모달창을 띄워라
		$(".modal").modal("show");
	})
	
	
		// 댓글 수정 버튼을 클릭하면
		$("#modalModBtn").on("click",function(){
		// alert("aa")
		var reply = {rno:$("input[name='rno']").val(),reply:$("input[name='reply']").val()}
		console.log(reply);
		// 댓글 수정 함수를 호출해서 처리
		FilmReplyService.reUpdate(reply,function(update){
			// 콜백영역(update가 정상적으로 처리된 후 조치)
			alert("update 작업 : "+update)
			// 모달창 닫고
			$(".modal").modal("hide");
			// 목록리스트를 실행
			showList();
		})
	})

	
	
	
	
	
	// 댓글 삭제 버튼을 클릭하면
	$("#modalRemoveBtn").on("click",function(){
		// alert("aa")
		var reply = {rno:$("input[name='rno']").val()}
		FilmReplyService.remove(reply,function(remove){
			// 클릭영역 ( delete가 정상적으로 처리된 후 조치 )
			alert("delete 작업 : "+remove)
			// 모달창 닫고
			$(".modal").modal("hide");
			// 목록리스트를 실행
			showList();
			
			
			
			
		})
	})
	// 댓글 삭제 함수를 호출해서 처리

}) 







