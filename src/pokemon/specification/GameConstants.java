package pokemon.specification;

public class GameConstants{
    public static final int MAX_LEVEL = 100; // 최대 레밸
    public static final double CRITICAL_CHANCE = 0.2;

    // 능력치
    // 포켓몬 체력
    public static final int pikachu_HP = 65;
    public static final int wartortle_HP = 84;
    // 포켓몬 공격력
    public static final int pikachu_AD = 55;
    public static final int wartortle_AD = 48;
    // 포켓몬 방어력
    public static final int pikachu_DF = 40;
    public static final int wartortle_DF = 50;

    private GameConstants() {} // 인스턴스 생성 방지 : main에서 GameConstants 호출 같은 거 막기 위함
}
