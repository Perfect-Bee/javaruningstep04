package pokemon.specification;

import pokemon.pokemontype.Torrent;

// 추상클래스
public abstract class Pokemon {
    // 포켓몬 공용 사용
    private String name;         // 포켓몬 이름
    private int level;
    private int maxLevel;        // 1세대 기준 100
    private int pokemonHp;       // 포켓몬 체력
    private int pokemonMaxHp;
    private int attackDamage;   // 공격력
    private int defense;         // 방어력

    // 기본 생성자
    public Pokemon(String name, int hp, int attackDamage, int defense){
        this.name = name;
        this.level = 1;
        this.pokemonHp = hp;
        this.pokemonMaxHp = hp;
        this.attackDamage = attackDamage;
        this.defense = defense;
    }

    // getter와 setter 사용 후 필요 없는 거 지우기
    // getter(타입~변수, 읽기)
    public String getName(){return this.name;}              // 이름
    public int getHp(){return this.pokemonHp;}              // 체력
    public int getMaxHp(){return this.pokemonMaxHp;}
    public int getAttackDamage(){return this.attackDamage;} // 공격력
    public int getdefense(){return this.defense;}           // 방어력

    // setter(void~return, 쓰기(변환))
    // 이름 바꾸기
    public void setName(String name){this.name = name;}     // 이름 바꾸는 용도
    public void setHp(int hp){this.pokemonHp = hp;}         //
    public void setAttackDamage(int attackDamage){
        this.attackDamage = attackDamage;}      //
    public void setdefense(int defense){
        this.defense = defense;}                //

    // 공통 매서드
    // 기본 공격
    public void basicAttack(Pokemon target){
        // A가 B를 공격한다
        // A.basicAttack(B) : () 괄호 안에 매개변수 넣자.
        int damage;

        // 20% 확률 치명타
        if (Math.random() < 0.2) {
            damage = this.attackDamage + 25;
            System.out.println(name + " → " + target.name + " 기본 공격 치명타!");
        } else {
            damage = this.attackDamage;
            System.out.println(name + " → " + target.name + " 기본 공격!");
        }
        // 계산한 데미지 출력
        target.takeDamage(damage);
    }
    // 데미지 계산 : takeDamage
    public void takeDamage(int damage){
        int actualDamage = damage - defense;
        if (actualDamage < 0) actualDamage = 0;

        pokemonHp -= actualDamage;

           if (pokemonHp <= 0) {
               pokemonHp = 0;
               System.out.println(name + " 이(가) 사망하였습니다!");
           } else {
               System.out.println(name + " " + actualDamage + " 피해!");
               System.out.println("현재 체력: " + pokemonHp + "\n");
           }
        }
    // 레밸업
    public final void levelUp() {
        if (this.level >= maxLevel) {
            System.out.println("이미 최고 레밸입니다!");
        } else {
            this.level++;
            System.out.println(this.name + " 레벨업! 현재 레벨: " + this.level);
        }
    }

    // 스킬
    public abstract void useQ(Pokemon target);
    public abstract void useW(Pokemon target);
    public abstract void useE(Pokemon target);
    public abstract void useR(Pokemon target);


}

