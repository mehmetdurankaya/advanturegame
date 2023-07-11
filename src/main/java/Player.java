import Utils.Symbol;

import java.util.Scanner;
public class Player {
    private int id;
    private int damage;
    private int healty;
    private int money;
    private String charName;
    private String name;
    private Scanner input = new Scanner(System.in);
    private Inventory inventory;
    private int orginalHealt;

    public Player(String name) {
        this.name = name;
        this.inventory = new Inventory();
    }

    public void selectChar() {
        Game.GameChar[] charList = {new Game.Samurai(), new Game.Archer(), new Game.Knight()};

        Symbol.headerTable();
        int count=0;
        for (Game.GameChar gameChar : charList) {

                Symbol.bodyTable(gameChar.getId(), gameChar.getName(),gameChar.getDamage(),gameChar.getHealty(),gameChar.getMoney() );
        }
        Symbol.footerTable();

        Symbol.errTrow("Lütfen oyuna başlamak için bir karakter seçiniz : ");
        String selectChar = input.nextLine();

        switch (selectChar) {
            case "1":
                initPlayer(new Game.Samurai());
                break;
            case "2":
                initPlayer(new Game.Archer());
                break;
            case "3":
                initPlayer(new Game.Knight());
                break;
            default:
                initPlayer(new Game.Samurai());
        }

Symbol.oneTable(this.getCharName(),this.getDamage(),this.getHealty(),this.getMoney());//tablo şeklinde görünüm kazandırıldı
        System.out.println();
    }

    public void initPlayer(Game.GameChar gameChar) {
        this.setDamage(gameChar.getDamage());
        this.setHealty(gameChar.getHealty());
        this.setMoney(gameChar.getMoney());
        this.setCharName(gameChar.getName());
        this.setOrginalHealt(gameChar.getHealty());
    }


    public void printInfo() {//ekrana tablo şeklinde yansıtıldı
        Symbol.envanterTable(this.getInventory().getWeapon().getName(),this.getInventory().getArmour().getName(),this.getInventory().getArmour().getBlock(),this.getTotalDamage(),this.getHealty(),this.getMoney());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotalDamage() {
        return damage + this.getInventory().getWeapon().getDamage();
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
    }

    public int getHealty() {
        return healty;
    }

    public void setHealty(int healty) {
        this.healty = healty;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getOrginalHealt() {
        return orginalHealt;
    }

    public void setOrginalHealt(int orginalHealt) {
        this.orginalHealt = orginalHealt;
    }
}