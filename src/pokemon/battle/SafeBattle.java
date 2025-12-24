package pokemon.battle;

import pokemon.specification.Pokemon;

// 배틀 모듈
public class SafeBattle {
    private final Pokemon p1;
    private final Pokemon p2;

    // 기본 생성자
    public SafeBattle(Pokemon p1, Pokemon p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    // 기본 공격
    public void basicAttack(Pokemon attacker, Pokemon defender) {
        // 둘 다 살아있는지 체크
        validateAction(attacker);
        System.out.println(" 기본 공격");
        attacker.basicAttack(defender);
    }
    public void useQ(Pokemon attacker, Pokemon defender) {
        // 둘 다 살아있는지 체크
        validateAction(attacker);
        validateAction(defender);

        System.out.println("스킬 Q");
        attacker.useQ(defender);
        checkBattle();
    }
    public void useW(Pokemon attacker, Pokemon defender) {
        // 둘 다 살아있는지 체크
        validateAction(attacker);
        validateAction(defender);

        System.out.println("스킬 W");
        attacker.useW(defender);
        checkBattle();
    }
    public void useE(Pokemon attacker, Pokemon defender) {
        // 둘 다 살아있는지 체크\
        validateAction(attacker);
        validateAction(defender);

        System.out.println("스킬 E");
        attacker.useE(defender);

        checkBattle();
        }
    public void useR(Pokemon attacker, Pokemon defender) {
        // 둘 다 살아있는지 체크
        validateAction(attacker);
        validateAction(defender);

        System.out.println(" 스킬 R");
        attacker.useR(defender);

        checkBattle();
    }
    
    // 사망 시 행동 검증
    private void validateAction(Pokemon attacker) {
        if (!attacker.isAlive()) {
            throw new DeadChampionActionException(
                attacker.getName() + " 은(는) 이미 쓰러져 행동할 수 없습니다."
            );
        }
    }
    // 전투 종료 체크
    private void checkBattle() {
        if (!p1.isAlive() || !p2.isAlive()) {
            System.out.println("\n===== 전투 종료 =====");
            
            // 승리/무승부 체크
            if (p1.isAlive()) {
                System.out.println("승자: " + p1.getName());
            } else if (p2.isAlive()) {
                System.out.println("승자: " + p2.getName());
            } else {
                System.out.println("⚠ 무승부");
            }
        }
    }
    // 전투 종료 여부
    public boolean isBattleOver() {
        return !p1.isAlive() || !p2.isAlive();
    }
}
