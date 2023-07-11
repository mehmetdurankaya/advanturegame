public class Weapon {
    private int id;
    private int damage ;
    private int money ;
    private String name;

    public Weapon(int id, int damage, int money, String name) {
        this.id = id;
        this.damage = damage;
        this.money = money;
        this.name = name;
    }

    public static Weapon[] weapons(){
        Weapon[] weaponList = new Weapon[3];
        weaponList[0] = new Weapon(1 , 4 , 25 , "Tabanca");
        weaponList[1] = new Weapon(2 , 6 , 35 , "Kılıç");
        weaponList[2] = new Weapon(3 , 8 , 45 , "Tüfek");
        return weaponList;
    }

    public static Weapon getWeaponObjById(int id){
        for (Weapon w : Weapon.weapons()){
            if (w.getId() == id){
                return w;
            }
        }
        return null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
