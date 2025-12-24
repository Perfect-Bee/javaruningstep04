package pokemon;

import pokemon.pokemontype.Torrent;
import pokemon.specification.Pokemon;

// 꼬부기, 물속성-급류 특성
public class Wartortle extends Pokemon implements Torrent {
    // 생성자
    public Wartortle(String name) {
        super(name, 84, 48, 50);
    }
    
    // 꼬부기 특성 : 급류 = 체력 1/3이면 수속성 데미지 1.5배
    @Override
    public int applyTorrent(int damage) {
        if (getHp() <= getMaxHp() / 3) {
            System.out.println("급류 발동! 수속성 데미지 1.5배");
            return (int)(damage * 1.5);
        }
        return damage;
    }
    
    // 스킬
    @Override
    public void useQ(Pokemon target) {
        int damage = getAttackDamage() + 10;   // 스킬 기본 데미지
        damage = applyTorrent(damage);         // 급류 판정
        System.out.println(getName() + " 물대포!");
        target.takeDamage(damage);
    }
    public void useW(Pokemon target) {
        int damage = getAttackDamage() + 5;
        damage = applyTorrent(damage);
        System.out.println(getName() + " 거품 공격!");
        target.takeDamage(damage);
    }
    public void useE(Pokemon target) {
        int damage = getAttackDamage() * 2;
        damage = applyTorrent(damage);
        System.out.println(getName() + " 아쿠아테일!");
        target.takeDamage(damage);
    }
    public void useR(Pokemon target) {
        int damage = getAttackDamage() * 3;
        damage = applyTorrent(damage);
        System.out.println(getName() + " 하이드로 펌프!!!");
        target.takeDamage(damage);
    }


}
