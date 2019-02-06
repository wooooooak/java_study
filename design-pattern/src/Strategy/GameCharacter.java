public class GameCharacter {

    // 접근점
    private Weapon weapon;

    // 교환기능
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        // 델리게이트
        // 나는 어떻게 동작하는지 세부 사항은 모른다.
        // weapon이 알아서 할거다.
        if (weapon == null)  {
            System.out.println("맨손 공격");
        }else {
            weapon.attack();

        }
    }

}
