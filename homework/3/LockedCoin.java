//********************************************************************
// LockedCoin.java
//
// Programming Project 7.8 on page 402.
//********************************************************************

public class LockedCoin {

	public static void main(String[] args) {

		Coin coin = new Coin();

		System.out.println("Before set key and unlock:");
		coin.flip();
		System.out.println(coin);

		coin.setKey(2065);
		coin.unlock(2065);

		System.out.println("After set key and unlock:");
		System.out.println(coin);

	}

}