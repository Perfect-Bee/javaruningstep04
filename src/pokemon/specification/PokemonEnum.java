package pokemon.specification;

import pokemon.Pikachu;
import pokemon.Wartortle;

public enum PokemonEnum {
    PIKACHU(
            GameConstants.pikachu_HP,
            GameConstants.pikachu_AD,
            GameConstants.pikachu_DF
    ) {
        @Override
        public Pokemon create(String name) {
            return new Pikachu(name);
        }
    },
    WARTORTLE(
            GameConstants.wartortle_HP,
            GameConstants.wartortle_AD,
            GameConstants.wartortle_DF
    ) {
        @Override
        public Wartortle create(String name) {
            return new Wartortle(name);
        }
    };


    // ===== 공통 필드 =====
    protected final int hp;
    protected final int attackDamage;
    protected final int defense;

    PokemonEnum(int hp, int attackDamage, int defense) {
        this.hp = hp;
        this.attackDamage = attackDamage;
        this.defense = defense;
    }

    // 팩토리 메서드
    public abstract Pokemon create(String name);
}
