import pokemon.Pikachu;
import pokemon.Wartortle;
import pokemon.specification.Pokemon;

public class Main {
    public static void main(String[] args) {

        Pokemon pikachu = new Pikachu("피카츄");
        Pokemon wartortle = new Wartortle("꼬부기");

        System.out.println("===== 전투 시작 =====\n");

        // 1️⃣ 기본 공격 1번씩
        System.out.println("[기본 공격]");
        pikachu.basicAttack(wartortle);
        wartortle.basicAttack(pikachu);

        // 2️⃣ 스킬 교환
        System.out.println("\n[스킬 공격]");

        // 피카츄 → Q, W
        pikachu.useQ(wartortle);
        pikachu.useW(wartortle);

        // 꼬부기 → E, R
        wartortle.useE(pikachu);
        wartortle.useR(pikachu);

        System.out.println("\n===== 전투 종료 =====");
    }
}