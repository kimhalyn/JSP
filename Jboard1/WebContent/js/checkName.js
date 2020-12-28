/**
 * 이름 한글 확인
 */

var isNameOk = false;

$(function(){
	
	// 정규표현식
	var regName = /^[ㄱ-힣]{2,10}$/;
	
	$('input[name=name]').focusout(function(){
		var name = $(this).val();
		
		if(regName.test(name) == false){ // name에 한글 아닌 값이 있다면
			$('.resultName').css('color','red').text('이름은 한글이어야 합니다.');
			isNameOk = false;
		}else{
			$('.resultName').text('');
			isNameOk = true;
		}
	});	
});