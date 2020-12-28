/**
 * 데이터 유효성 검증
 */

$(function() {

	var form = $('.register > form');

	form.submit(function() { // form의 전송버튼 이벤트

		// 아이디 중복 확인
		if(!isUidOk) { // 아이디가 중복이면
			alert('아이디를 확인하세요.');
			return false;
		}

		// 비밀번호 일치여부 확인
		if(!isPassOk) { // 비밀번호가 일치하지 않으면
			alert('비밀번호를 확인하세요.');
			return false;
		}

		// 이름 한글여부 확인
		if(!isNameOk) { // 이름이 한글이 아니면
			alert('이름은 한글로 입력하세요.');
			return false;
		}

		// 별명 중복 확인
		if(!isNickOk) {
			alert('별명을 확인하세요.');
			return false;
		}

		// 휴대폰 중복 확인
		if(!isHpOk) {
			alert('휴대폰 번호를 확인하세요.');
			return false;
		}

		return true;
	});

});
