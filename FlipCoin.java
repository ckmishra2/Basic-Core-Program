package basic;
public class FlipCoin {

	public static void main(String[] args) {
		double Tails=0;
		double Heads=0;
		for(int i=1;i<=10;i++) {
			double CoinFlip=Math.random();
			System.out.println("coin "+CoinFlip);
			if(CoinFlip < 0.5) {
				Tails++;
			}
			else
				Heads++;
		}
		System.out.println("head"+Heads);
		double percentageHeads=(Heads/10)*100;
		double percentageTails=(Tails/10)*100;
		System.out.println("heads percentage is "+percentageHeads);
		System.out.println("tails percentage is "+percentageTails);

	}

}

