
import pokemon.specification.Pokemon;
import pokemon.battle.SafeBattle;
import pokemon.battle.DeadChampionActionException;
import pokemon.specification.PokemonPool;
import pokemon.specification.PokemonEnum;

public class Main {
    public static void main(String[] args) {

        // Pokemon pikachu = new Pikachu("피카츄");
        // Pokemon wartortle = new Wartortle("꼬부기");
        // Map 사용 : PokemonPool 사용
        PokemonPool pool = new PokemonPool();
        // enum기능추가
        Pokemon pikachu = pool.createAndAdd(PokemonEnum.PIKACHU, "피카츄");
        Pokemon wartortle = pool.createAndAdd(PokemonEnum.WARTORTLE, "꼬부기");


        System.out.println("===== 전투 시작 =====\n");
        try {
            SafeBattle battle = new SafeBattle(pikachu, wartortle);

            battle.basicAttack(pikachu, wartortle);
            battle.basicAttack(wartortle, pikachu);

            battle.useQ(pikachu, wartortle);
            battle.useW(pikachu, wartortle);

            battle.useE(wartortle, pikachu);
            battle.useR(wartortle, pikachu);
            battle.useR(wartortle, pikachu);

            System.out.println("\n===== 전투 종료 =====");
        } catch (DeadChampionActionException e) {
            System.out.println("패배 : " + e.getMessage());
            System.out.println("전투를 종료합니다.");
        }
    }
}