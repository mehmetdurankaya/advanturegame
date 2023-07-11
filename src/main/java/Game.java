import Utils.Symbol;

import java.util.Scanner;

public class Game {
    Scanner inp = new Scanner(System.in);
    public void run(){


        Symbol.imlecAyar("Macera oyununa hoşeldiniz !");
        Symbol.errTrow("Lütfen bir isim giriniz : ");
        String playerName  = inp.nextLine().toUpperCase();
        Player player = new Player(playerName);
        System.out.println();
        Symbol.imlecAyar(player.getName() + " Macera Adasına hoşgeldin !");

        player.selectChar();

        Location location = null;

        while (true){
            player.printInfo();//Oyuncunun seçtiği karakterden gelen bilgi

            Symbol.amblem("BÖLGELER");

            Symbol.versionText();// version bilgisi ve info içerir
            Symbol.menu("Güvenli Ev","Eşya Dükkanı","Mağara","Orman","Maden","Nehir");



            Symbol.errTrow(Symbol.ANSI_SARI+"Lütfen gitmek istediğiniz yeri seçin :");//pointer maniplasyonu yapıldı

            String selectLoc = inp.nextLine();

            switch (selectLoc){

                case "0":
                    location = null;
                    break;
                case "1" :
                    location = new SafeHouse(player);
                    break;
                case "2":
                    location = new ToolStore(player);
                    break;
                case "3":
                    if(Cave.isCheckloc() != true){
                        location = new Cave(player);
                        break;
                    }else{
                        printClosed();
                        continue;
                    }
                case "4":
                    if (Forest.isCheckloc() != true){
                        location = new Forest(player);
                        break;
                    }else {
                        printClosed();
                        continue;
                    }
                case "5" :
                    if (River.isCheckloc() != true){
                        location = new Coal(player);
                        break;
                    }else {
                        printClosed();
                        continue;
                    }
                case "6" :

                    location = new River(player);
                    break;

                default:
                    Symbol.imlecAmblem("Lütfen geçerli bir bölge giriniz !!");
                    continue;

            }


            if (location == null){
               Symbol.imlecAmblem("Oyundan Çıkış Yapıldı !\n" +
                        "\tGörüşmek Üzere !!");
                break;
            }

            if (!location.onLocation()){
                if (player.getInventory().getAwardNumber() != 3){
                    Symbol.amblem("GAME OVER!");
                }
                break;
            }

        }

    }

    public void printClosed(){

        String s="\uD83D\uDC1D";
        Symbol.amblem(s.repeat(3)+" BURADAKİ GÖREVİ TAMAMLADINIZ !!! TEKRAR SEÇEMEZSİNİZ !!!"+s.repeat(3) );
        System.out.println();
    }

    public static class Archer extends GameChar {
        public Archer(){
            super(2 , "Okçu" , 7 , 20 , 20);
        }
    }

    public abstract static class GameChar {
        private int id ;
        private int damage ;
        private int healty ;
        private int money ;
        private String name ;

        public GameChar(int id ,String name,int damage, int healty, int money) {
            this.id = id;
            this.damage = damage;
            this.healty = healty;
            this.money = money;
            this.name = name;
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

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }


    }

    public static class Knight extends GameChar {
        public Knight(){
            super(3 , "Şovalye",9,22 , 8);
        }
    }

    public static class Samurai extends GameChar {
        public Samurai(){
            super( 1, "Samuray" , 20 , 23 , 100 );
        }
    }
}
