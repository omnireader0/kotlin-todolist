### 개발 목표

- crud 구현에 집중
- db 대신 메모리에 저장 (jpa는 적용 x)
- 테스트.. Tdd? 시도
- exception, valid
- 자바식 → 코틀린식 문법 적용


### 질문

- TodoDtoTest 테스트에서, 예외가 나는 상황도 테스트가 필요한지
- ServiceTest 테스트에서, 어떤 부분 테스트? convert?

### 보완할 부분

- TodoApiController에서 create, update
- controller 테스트 없음
- service 테스트 없음
- TodoRepositoryTest 테스트에서, findone
- jpa 사용한다면, db 셋팅
- swagger 적용

### Refrence

- Validation, BindingResult

vlidator를 통한 검증 과정의 결과를 확인, Errors의 서브 인터페이스

[https://cornswrold.tistory.com/495](https://cornswrold.tistory.com/495)
[https://cornswrold.tistory.com/381](https://cornswrold.tistory.com/381)

- 함수형 프로그래밍
  - 범위 지정 함수 apply, with, let, also, run
      - 수신 객체와 수신 객체 지정 람다를 갖는다.
  - apply
      - 수신 객체 자신을 반환할 때 사용
      - 수신 객체의 프로퍼티만을 사용할 때 사용
  - let
      - 지정된 값이 null 아닌 경우에 코드 실행할 때
      - nullable객체를 다른 Nullable객체로 변환
  - run
      - 수신 객체말고 수신 객체의 연산 결과를 리턴할 때 사용

[https://medium.com/@limgyumin/코틀린-의-apply-with-let-also-run-은-언제-사용하는가-4a517292df29](https://medium.com/@limgyumin/%EC%BD%94%ED%8B%80%EB%A6%B0-%EC%9D%98-apply-with-let-also-run-%EC%9D%80-%EC%96%B8%EC%A0%9C-%EC%82%AC%EC%9A%A9%ED%95%98%EB%8A%94%EA%B0%80-4a517292df29)
