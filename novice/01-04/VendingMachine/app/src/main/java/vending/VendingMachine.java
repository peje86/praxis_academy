package vending;


import java.util.List;

/**
  * Decleare public API for Vending Machine
  * @author Javin Paul
  */
  public interface VendingMachine { 
public static void main(String[] args) {
    
    
  }
  public long selectItemAndGetPrice(Item item);
  public void insertCoin(Coin coin);
  public List<Coin> refund();
  public Bucket<Item, List<Coin>> collectItemAndChange();   
  public void reset();
  
    
}




