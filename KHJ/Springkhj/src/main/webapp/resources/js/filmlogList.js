/**
 * 
 */

$(document).ready(function(){
	var actionForm = $("#actionForm");
	// 현재 페이지 번호를 클릭하면
	$(".paginate_button a").on("click", function(e){
		e.preventDefault();
		actionForm.find("input[name='pageNum']").val($(this).attr("href"))
		actionForm.submit(); // list.jsp form의 action태그에 보내게 되고 form 태그가 get방식이라서 get 방식으로 제출
	})
	// form태그 안에 있는 값을 가져와라
	
	$("input[type='submit']").on("click", function(e){
		e.preventDefault(); // 실제로 구현할때는 없어도 됨
		// pageNum의 값을 1로 설정
		actionForm.find("input[name='pageNum']").val("1")
		actionForm.submit();
		
	})
	
	
})
