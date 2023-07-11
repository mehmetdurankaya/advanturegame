public class Armor {
    private int id;
    private String name ;
    private int block ;
    private int money;

    public Armor(int id , String name , int block , int money){
        this.id = id;
        this.name = name ;
        this.block = block;
        this.money = money;
    }

    public static Armor[] armours(){
        Armor[] armorList = new Armor[3];
        armorList[0] = new Armor(1 , "Hafif Zırh" , 3 ,20 );
        armorList[1] = new Armor(2 , "Orta Zırh" , 5 ,30 );
        armorList[2] = new Armor(3 , "Ağır Zırh" , 9 ,50 );
        return armorList;
    }

    public static Armor getArmourObjById(int id){
        for (Armor a : Armor.armours()){
            if (a.getId() == id){
                return a;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}