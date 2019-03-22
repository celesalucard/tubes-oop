//Property abstract class karena secara logis tidak bisa dibuat objeknya, kelas anak perlu mengimplementasi tipe yang berbeda
public abstract class Property extends Tile{
    protected String name; //nama dari property
    protected int price; //harga property
    protected boolean isBought; //status apakah property sudah dibeli, bernilai true jika property sudah dibeli, false jika belum dibeli
    protected Player owner;
    
    //konstruktor
    public Property(String name, int price){
        this.name = name;
        this.price = price;
        this.isBought = false;
        this.owner = null;
    }
    
    //getter, tidak ada setter karena nama,harga,dan status property tidak bisa diubah sendiri, harus melalui method Buy
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
    
    //method buy 
    public void buy (Player pl){

    }
    //method sell, menjual property ini.
    public void sell(){

    }
    //method rent, jika ada pemain yang bukan pemilik property tersebut, pemain tersebut membayar harga sewa ke pemilik property
    public abstract void rent(Player pl);

}
