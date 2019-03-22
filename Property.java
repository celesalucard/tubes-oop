public abstract class Property extends Tile{
    protected String name;
    protected int price;
    protected boolean isBought;
    protected Player owner;

    public Property(String name, int price){
        this.name = name;
        this.price = price;
        this.isBought = false;
        this.owner = null;
    }
    
    public Player getName(){
        return this.name;
    }
    
    public int getPrice(){
        return this.price;
    }
    
    public boolean getBoughtStatus(){
        return this.isBought;
    }

    public Player getOwner(){
        return this.owner;
    }

    public void buy (Player pl){

    }

    public void sell(){

    }

    public abstract void rent(Player pl);

}