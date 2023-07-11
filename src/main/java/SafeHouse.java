import Utils.Symbol;

public class SafeHouse extends NorLoc {
    public SafeHouse(Player player){
        super(player , "Güvenli Ev");
    }

    @Override
    public boolean onLocation(){
        this.getPlayer().setHealty(this.getPlayer().getOrginalHealt());
        Symbol.imlecAyar(Symbol.ANSI_MOR+"Güvenli evdesiniz !");
        Symbol.imlecAyar(Symbol.ANSI_MOR+"Canınız yenilendi !");
        return true;
    }


}