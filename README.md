## **“LOL 1:1 결투 모드 – 통합 프로젝트 완성”**
## -> 포켓몬으로 변경

이번 과제는 지금까지 배운 내용을 모두 활용해

**하나의 완성된 ‘1:1 결투 모드’ 프로그램을 만드는 과제**입니다.

---

# 1. 과제 목표

- 객체지향 OOP 설계를 실전처럼 통합하여 구현
- 클래스/상속/추상화/다형성의 실사용 경험
- static, final, 상수 설계 활용
- 컬렉션과 제네릭 기반의 챔피언 관리
- Optional & 예외를 사용한 “안전한 전투 로직” 구현

---

# 2. 필수 구현 요구사항

아래 항목을 모두 포함해야 합니다.

---

## ✔ ① Champion 추상 클래스 완성

- 공통 필드: name, level, hp, attackDamage, defense
- 공통 메서드: basicAttack(), takeDamage(), levelUp()
- 추상 메서드: useQ()

---

## ✔ ② 챔피언 2명 이상 구현

예: Garen, Ashe, Lux …

- 각 클래스는 useQ() 내용을 다르게 정의
- 원하는 만큼 스킬 데미지/특수효과 추가 가능

---

## ✔ ③ static / final 활용

- Champion 생성 시 createdCount 증가
- GameConstants 클래스에 상수 포함
    
    (MAX_LEVEL, BASE_CDR 등 자유롭게)
    

---

## ✔ ④ ChampionPool(Map) 구현

- 이름으로 챔피언 조회 가능
- Optional<Champion> 기반 안전 조회

---

## ✔ ⑤ SafeBattle(전투 모듈) 구현

- 공격/스킬 턴 진행
- 사망자 행동 시 커스텀 예외 처리
    
    (DeadChampionActionException 등)
    

---

## ✔ ⑥ 최종 "1:1 결투 모드" 실행 클래스

### 필수 조건:

1. 챔피언 Pool 생성
2. 사용자 입력 또는 랜덤 선택으로 2명 선택
3. 안전 전투(SafeBattle) 진행
4. 승패 또는 전투 종료 메시지 출력
5. 모든 출력은 콘솔 기반이면 충분함

---

# 3. 선택 구현

아래 중 1개 이상 구현하면 보너스 점수 부여.
- Q/W/E/R 모든 스킬 구현
- 패시브(Passive) 능력 구현
- 치명타 확률
- Stream을 활용한 전투 로그 요약 출력
- Enum
