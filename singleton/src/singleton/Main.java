package singleton;

public class Main {
public static void main(final String[] arguments) throws Exception {
		AbstraktiTehdas tehdas = null;
		
		final String appearance = randomAppearance();	// Nykyinen merkki

		if (appearance.equals("Adidas")) {
			tehdas = AdidasTehdas.getInstance();
		} else if(appearance.equals("Boss")) {
                    
			tehdas = BossTehdas.getInstance();
		} else {
			throw new Exception("ei oleeeeeeee");
		}
		
		final Lippis lippis = tehdas.createLippis();
                final Paita paita = tehdas.createPaita();
                final Housut housut = tehdas.createHousut();
                final Kengat kengat = tehdas.createKengat();

		lippis.pueLippis();
                paita.puePaita();
                housut.pueHousut();
                kengat.pueKengat();
	}


	public static String randomAppearance() {
		final String[] appearanceArray = new String[3];

		appearanceArray[0] = "Adidas";
		appearanceArray[1] = "Boss";
		
		final java.util.Random random = new java.util.Random();

		final int randomNumber = random.nextInt(2);

		return appearanceArray[randomNumber];
	}
}