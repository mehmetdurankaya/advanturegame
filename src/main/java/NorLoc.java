public abstract class NorLoc extends Location {
    public NorLoc(Player player , String name){
        super(player , name );
    }

    @Override
    public boolean onLocation(){
        return true;
    }
}