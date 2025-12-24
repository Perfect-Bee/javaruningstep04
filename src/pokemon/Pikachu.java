package pokemon;

import pokemon.pokemontype.Static;
import pokemon.specification.Pokemon;

// 전기쥐
public class Pikachu extends Pokemon implements Static{
    // 생성자
    public Pikachu(String name) {
        super(name, 65, 55, 40);
    }

    // 정전기 발동 로직
    @Override
    public void applyStatic(Pokemon target) {
        if (Math.random() < 0.03) {
            // 실제 구현 X 그래서 확률 낮춰놓음
            System.out.println(" 정전기 발동! "+ target.getName() + " 이(가) 마비되었다!");
        }
    }
    @Override
    public void useQ(Pokemon target) {
        int damage = getAttackDamage() + 5;
        System.out.println(getName() + " 몸통박치기!");
        target.takeDamage(damage);
        applyStatic(target); // 접촉 → 정전기 가능
    }
    public void useW(Pokemon target) {
        int damage = getAttackDamage() + 15;
        System.out.println(getName() + " 전기쇼크!");
        target.takeDamage(damage);
        // 비접촉이지만 전기쇼크 효과
        applyStatic(target);
    }
    public void useE(Pokemon target) {
        int damage = getAttackDamage() + 20;
        System.out.println(getName() + " 아이언테일!");
        target.takeDamage(damage);
        applyStatic(target); // 접촉
    }
    public void useR(Pokemon target) {
        int damage = getAttackDamage() + 30;
        System.out.println(getName() + " ⚡ 10만 볼트!!!");
        target.takeDamage(damage);
        // 정전기 없음 (비접촉)
}



}
