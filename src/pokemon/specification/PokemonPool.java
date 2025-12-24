package pokemon.specification;

import java.util.Map;
import java.util.HashMap;
import java.util.Optional;

public class PokemonPool {

    private final Map<String, Pokemon> pool = new HashMap<>();

    // pool에 enum으로 생성
    public Pokemon createAndAdd(PokemonEnum type, String name) {
        Pokemon pokemon = type.create(name);
        pool.put(name, pokemon);
        return pokemon;
    }

    // 포켓몬 조회(맞으면 반환)
    public Optional<Pokemon> get(String name) {
        return Optional.ofNullable(pool.get(name));
    }
}