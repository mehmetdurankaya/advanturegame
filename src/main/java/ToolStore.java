import Utils.Symbol;

public class ToolStore extends NorLoc {
    public ToolStore(Player player){
        super(player , "Mağaza");
    }

    @Override
    public boolean onLocation() {
        Symbol.imlecAyar("Mağazaya hoşgeldiniz !");
        boolean showMenu = true;
        while (showMenu){

            Symbol.threeButtonDesign("1 - Silahlar","2 - Zırhlar","3 - Çıkış Yap");
            Symbol.errTrow("Seçiminiz ="); ;

            int selectCase = input.nextInt();
            while (selectCase <  1 || selectCase > 3){
                Symbol.errTrow(Symbol.ANSI_KIRMIZI+"Lütfen geçerli bir değer giriniz !! : ");
                selectCase = input.nextInt();
            }

            switch (selectCase){
                case 1 :
                    printWeapon();
                    buyWeapon();
                    break;
                case 2:
                    printArmour();
                    buyArmour();
                    break;
                case 3:
                    Symbol.amblem("Marketten çıkış yapılıyor , Yine bekleriz !");
                    showMenu = false;
                    break;
            }
        }
        return true;
    }

    public void printWeapon(){
        Symbol.amblem("Silahlar");
        Symbol.weaponStateHeader("No","Silah","Hasar","Para");
        for (Weapon w : Weapon.weapons()){
            Symbol.weaponbodyTable(w.getId(),w.getName(),w.getDamage(),w.getMoney());

        }
        Symbol.amblem("0 - Çıkış yap");
    }

    public void buyWeapon(){

       Symbol.imlecAmblem("Bir silah seçiniz : ");
        int selectWeaponID = input.nextInt();

        while (selectWeaponID <  0 || selectWeaponID > Weapon.weapons().length){
            Symbol.imlecAyar(Symbol.ANSI_KIRMIZI+"Lütfen geçerli bir değer giriniz !! : ");
            selectWeaponID = input.nextInt();
        }

        if (selectWeaponID !=0){
            Weapon selectedWeapon = Weapon.getWeaponObjById(selectWeaponID);
            if ( selectedWeapon != null){
                if (selectedWeapon.getMoney() > this.getPlayer().getMoney()){
                    Symbol.imlecAyar(Symbol.ANSI_KIRMIZI+"Yeterli paranız bulunmamaktadır !");
                }else {
                    Symbol.imlecAyar(selectedWeapon.getName() + " silahını satın adldınız !");
                    int balance = this.getPlayer().getMoney() - selectedWeapon.getMoney();
                    this.getPlayer().setMoney(balance);
                    Symbol.imlecAyar(Symbol.ANSI_MOR+"Kalan paranız = " + this.getPlayer().getMoney());//morarttım onu :))
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                }
            }
        }
    }

    public void printArmour(){
        Symbol.amblem("Zırhlar");
        for(Armor a : Armor.armours()){

            Symbol.oneTable(a.getId(),a.getName(),a.getMoney(),a.getBlock()  );//test
        }

        Symbol.imlecAyar("0 - Çıkış yap");
    }

    public void buyArmour(){
        Symbol.errTrow("Bir zırh seçiniz : ");
        int selectArmourID = input.nextInt();

        while (selectArmourID <  0 || selectArmourID > Armor.armours().length){
           Symbol.errTrow("Lütfen geçerli bir değer giriniz !! : ");
            selectArmourID = input.nextInt();
        }

        if (selectArmourID != 0){
            Armor selectedArmour = Armor.getArmourObjById(selectArmourID);

            if(selectedArmour != null){
                if (selectedArmour.getMoney() > this.getPlayer().getMoney()){
                    Symbol.imlecAyar(Symbol.ANSI_KIRMIZI+"Yeterli paranız bulunmamaktadır !");
                }else {
                    Symbol.imlecAyar(selectedArmour.getName() + " satın aldınız !");
                    int balance = this.getPlayer().getMoney() - selectedArmour.getMoney();
                    this.getPlayer().setMoney(balance);
                    this.getPlayer().getInventory().setArmour(selectedArmour);
                    Symbol.imlecAyar("Kalan paranız :" +this.getPlayer().getMoney());
                }
            }
        }
    }
}
