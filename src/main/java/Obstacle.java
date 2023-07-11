import java.util.Random;

public class Obstacle {
    private int id ;
    private String name ;
    private int damage ;
    private int health ;
    private int awardCoin;
    private int orginalHealth;
    private String award ;
    public Obstacle(int id, String name, int damage, int health , int awardCoin , String award ) {
        this.id = id;
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.orginalHealth =health ;
        this.awardCoin = awardCoin;
        this.award = award;
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

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0){
            health=0;
        }
        this.health = health;
    }

    public int getAwardCoin() {
        return awardCoin;
    }

    public void setAwardCoin(int awardCoin) {
        this.awardCoin = awardCoin;
    }

    public int getOrginalHealth() {
        return orginalHealth;
    }

    public void setOrginalHealth(int orginalHealth) {
        this.orginalHealth = orginalHealth;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

}
