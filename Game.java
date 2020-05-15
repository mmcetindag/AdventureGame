import java.util.Scanner;

public class Game {
	Player player;
	Location location;
	Scanner scan = new Scanner(System.in);

	public void login() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Macera Oyununa Hoþgeldiniz !");
		System.out.println("Oyuna baþlamadan önce isminizi giriniz : a");
		String playerName = scan.nextLine();
		player = new Player("a");
		player.selectCha();
		start();
	}

	public void start() {
		while (true) {
			System.out.println();
			System.out.println("=================================================");
			System.out.println();
			System.out.println("Eylem gerçekleþtirmek için bir yer seçiniz : ");
			System.out.println("1. Güvenli Ev --> Size ait güvenli bir mekan, düþman yok !");
			System.out.println("2. Maðara --> Karþýnýza belki zombi çýkabilir !");
			System.out.println("3. Orman --> Karþýnýza belki vampir çýkabilir !");
			System.out.println("4. Nehir --> Karþýnýza belki ayý çýkabilir !");
			System.out.println("5. Maðaza --> Silah veya Zýrh alabilirsiniz!");
			System.out.print("Gitmek istediðiniz yer : ");
			int selLoc = scan.nextInt();
			while (selLoc < 0 || selLoc > 5) {
				System.out.print("Lütfen geçerli bir yer seçiniz : ");
				selLoc = scan.nextInt();
			}

			switch (selLoc) {
			case 1:
				location = new SafeHouse(player);
				break;
			case 2:
				location = new Cave(player);
				break;
			case 3:
				location = new Forest(player);
				break;
			case 4:
				location = new River(player);
				break;
			case 5:
				location = new ToolStore(player);
				break;
			default:
				location = new SafeHouse(player);
			}

			if (location.getClass().getName().equals("SafeHouse")) {
				if (player.getInv().isFirewood() && player.getInv().isFood() && player.getInv().isWater()) {
					System.out.println("Tebrikler Oyunu Kazandýnýz !");
					break;
				}
			}
			if (!location.getLocation()) {
				System.out.println("Oyun Bitti !");
				break;
			}

		}
	}
}
