import Utils.Symbol;

import java.util.Random;

public abstract class BattleLoc extends Location {
    Random random = new Random();
    private Obstacle obstacle;
    private String award;
    private int maxObstacle;


    public BattleLoc(Player player , String name , Obstacle obstacle , String award, int maxObstacle ){
        super(player,name);
        this.obstacle = obstacle;
        this.award = award;
        this.maxObstacle = maxObstacle;
    }
    @Override
    public boolean onLocation(){
        int obsNumber = randomObstacleNumber();

        Symbol.amblem("Şuan buradasınız : " + this.getName());
        Symbol.amblem("Dikkatli ol ! Burada "+ obsNumber + " tane " + this.obstacle.getName() + " yaşıyor !");
        Symbol.obstaclePicture(obsNumber);
        Symbol.savasYadaGericekil();//metot haline getirildi
        String selectCase = Location.input.nextLine();
        selectCase = selectCase.toUpperCase();

        if (selectCase.equals("S") && combat(obsNumber)){
            Symbol.amblem(this.getName() + " tüm düşmanları yendiniz !");
            switch (this.getName()){
                case "Mağara" :
                    Cave.setCheckloc(true);
                    break;
                case "Orman" :
                    Forest.setCheckloc(true);
                    break;
                case "Nehir" :
                    River.setCheckloc(true);
                    break;
                case "Maden":
                    Coal.setCheckloc(true);
                    break;
            }
            if (!this.getObstacle().getName().equals("Yılan")){
                this.getPlayer().getInventory().onAwardNumber(1);
            }
            if (this.getPlayer().getInventory().getAwardNumber() == 3){
                System.out.println();
                Symbol.amblem("Tüm ödülleri topladınız! Oyunu KAZANDINIZ !!!!");
                return false;
            }
            return true;
        }

        if (this.getPlayer().getHealty() <= 0){
            Symbol.amblem("ÖLDÜNÜZ !");
            Symbol.dead("İYİ SAVAŞTINIZ ");
            return false;
        }
        return true;
    }


    public boolean combat(int obsNumber){
        for (int i = 1 ; i <= obsNumber ; i++){

            int firstKick = random.nextInt(2);//ilk vuruş için variable declare edildi ve ilk vuruşu yapacak olan belirlendi
            this.getObstacle().setHealth(this.getObstacle().getOrginalHealth());
            playerStats();
            obstacleStats(i);
            while (this.getPlayer().getHealty() > 0 && this.getObstacle().getHealth() > 0){
                Symbol.savasYadaGericekil();
                String selectCombat = Location.input.nextLine().toUpperCase();
                yilanDamage(); //Yılan Random hasar verecek
                if (selectCombat.equals("S")){

                    if (firstKick == 0){
                        System.out.println();
                        Symbol.amblem("Canavara vurdunuz !");
                        this.getObstacle().setHealth(this.obstacle.getHealth() - this.getPlayer().getTotalDamage());
                        afterHit();
                        if (this.getObstacle().getHealth() > 0){
                            System.out.println();
                            Symbol.amblem(Symbol.ANSI_KIRMIZI+"Canavar size vurdu !");
                            int obstacleDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmour().getBlock();
                            if (obstacleDamage < 0) {
                                obstacleDamage = 0;
                            }

                            this.getPlayer().setHealty(this.getPlayer().getHealty() - obstacleDamage);
                            afterHit();
                        }
                    }else{
                        System.out.println();
                        Symbol.amblem(Symbol.ANSI_KIRMIZI+"Canavar size vurdu !");
                        int obstacleDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmour().getBlock();
                        if (obstacleDamage < 0) {
                            obstacleDamage = 0;
                        }
                        this.getPlayer().setHealty(this.getPlayer().getHealty() - obstacleDamage);
                        afterHit();

                        if (this.getPlayer().getHealty() > 0){
                            System.out.println();
                            Symbol.amblem(Symbol.ANSI_CYAN+"Canavara vurdunuz !");
                            this.getObstacle().setHealth(this.obstacle.getHealth() - this.getPlayer().getTotalDamage());
                            afterHit();
                        }
                    }
                }else {
                    return false;
                }
            }
            if (this.getObstacle().getHealth() < this.getPlayer().getHealty()){
                Symbol.amblem(Symbol.ANSI_CYAN+"Düşmanı yendiniz !");
                Symbol.amblem("Kahramanımız");
                if (!obstacle.getName().equals("Yılan")){
                    Symbol.amblem(Symbol.ANSI_YEŞİL+ this.getObstacle().getAwardCoin() + " para kazandınız !");
                    this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getObstacle().getAwardCoin());
                    Symbol.amblem("Güncel paranız : " + this.getPlayer().getMoney());
                }else {
                    randomItemSnake();
                }
            }else {
                return false;
            }
        }
        return true;
    }

    public void playerStats(){

        Symbol.headerTable("SAĞLIK","HASAR","KARAKTER","BLOK","ZIRH","PARA");
        Symbol.bodyTable(this.getPlayer().getHealty(),this.getPlayer().getTotalDamage(),
                this.getPlayer().getInventory().getWeapon().getName(),
                this.getPlayer().getInventory().getArmour().getName(),
                this.getPlayer().getInventory().getArmour().getBlock(),
                this.getPlayer().getMoney());// int healty int damage String getname int getblock int armour int getmoney


    }

    public void obstacleStats(int i){


        Symbol.obstacleHeaderTable("SAĞLIK","HASAR","GANİMET");
        Symbol.obstacleBodyTable(this.getObstacle().getHealth(),this.getObstacle().getDamage(),this.getObstacle().getAwardCoin());


    }

    public void afterHit(){

        Symbol.amblem("Canınız : " + this.getPlayer().getHealty());
        Symbol.amblem(this.getObstacle().getName() + " kalan can : " + this.getObstacle().getHealth());
    }

    public int randomObstacleNumber(){
        return random.nextInt(this.getMaxObstacle()) + 1;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }


    public void randomItemSnake(){    //Yılan için rastgele hasar tanımlama ve item tanımlama
        Weapon rewardWeapon = Weapon.getWeaponObjById(randomItems());
        Armor rewardArmour = Armor.getArmourObjById(randomItems());
        randomNumber();

        if (randomNumber() >= 0 && randomNumber() <= 14){

            Symbol.imlecAyar(rewardWeapon.getName() + " yere düştü ! Almak istermisiniz ? ");
            Symbol.imlecAyar("<E>vet / <H>ayır  : ");
            String take = Location.input.nextLine().toUpperCase();
            System.out.println();
            if (take.equals("E")){
                this.getPlayer().getInventory().setWeapon(rewardWeapon);
                printBosluk();
                Symbol.amblem(rewardWeapon.getName() + " kazandınız !");
                printBosluk();
            }else {
                Symbol.amblem("Yerdeki itemi almadın !!!");
            }

        }else if(randomNumber() >= 15 && randomNumber() <= 29){
            Symbol.imlecAyar(rewardArmour.getName() + " yere düştü ! Almak istermisiniz ? ");
            Symbol.imlecAyar(Symbol.ANSI_CYAN+"<E>vet / <H>ayır  : ");
            String take = Location.input.nextLine().toUpperCase();
            if (take.equals("E")){
                this.getPlayer().getInventory().setArmour(rewardArmour);
                printBosluk();
                Symbol.amblem(rewardArmour.getName() + " kazandınız !");
                printBosluk();
            }else {
               Symbol.amblem("Yerdeki itemi almadın !!!");
            }

        }else if(randomNumber() >= 30 && randomNumber() <= 54){
            this.getPlayer().setMoney(this.getPlayer().getMoney() + randomMoney());
            printBosluk();
           Symbol.imlecAmblem(randomMoney() + " para kazandınız.");
            printBosluk();

        }else{
            printBosluk();
           Symbol.imlecAyar(" Burada hiçbir şey yok Üzgünüm !!!");
            printBosluk();
        }
    }

    public int randomNumber(){
        int randomNumber = random.nextInt(99);
        return randomNumber;
    }

    public void printBosluk(){
        System.out.println();
    }
    public int yilanDamage(){
        if (this.getObstacle().getName().equals("Yılan")){
            int randomDamage = random.nextInt(4) + 3;
            obstacle.setDamage(randomDamage);
        }
        return obstacle.getDamage();
    }

    public int randomItems(){
        int input = random.nextInt(99);

        if (input >= 0 && input <= 19){
            return 3;
        }else if (input >= 20 && input <= 49){
            return 2;
        }else if (input >= 50 && input <= 99){
            return 1;
        }
        return 0;
    }

    public int randomMoney(){
        int input = random.nextInt(99);
        if (input >= 0 && input <= 19){
            return 10;
        }else if (input >= 20 && input <= 49){
            return 5;
        }else if (input >= 50 && input <= 99){
            return 1;
        }
        return 0;
    }
}