package pokemon.pokemontype;

import pokemon.specification.Pokemon;

// 전기 포켓몬 특성 : 정전기 : 근접 공격 시 30% 확률로 마비
public interface Static {
    void applyStatic(Pokemon target);
}
