import java.util.Scanner;

import character.Enemy;
import character.Player;
import util.Poin;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player(100, 35, 100, 10, 10, new Poin(10,5), 0);

        Enemy pocong = new Enemy(100, 35, 10, 100, 5, 10, new Poin(40,5), "Pocong");

        do{
            int pilihPlayer = menuPilihPlayer(scanner);
            if(pilihPlayer == 1){
                player.jalan();
            } else if(pilihPlayer == 2){
                player.lari();
            } else if(pilihPlayer == 3){
                player.lompat();
            } else if(pilihPlayer == 4){
                player.jongkok();
            } else if(pilihPlayer == 5){
                player.serang(pocong);
                if (pocong.mati()){
                    break;
                }
            } else{
                player.ulti(pocong);
                if (pocong.mati()){
                    break;
                }
            }
           
            int pilihEnemy = menuPilihEnemy(scanner);
            if(pilihEnemy == 1){
                pocong.jalan();
            } else if(pilihEnemy == 2){
                pocong.lari();
            } else if(pilihEnemy == 3){
                pocong.serang(player);
                if (player.mati()){
                    break;
                }
            }
        }while(true);
        

    }

    public static int menuPilihPlayer(Scanner scanner){
        int pilih;
        System.out.println("Menu Pilih Player");
        System.out.println("1. Jalan");
        System.out.println("2. Lari");
        System.out.println("3. Lompat");
        System.out.println("4. Jongkok");
        System.out.println("5. Serang");
        System.out.println("6. Ulti");
        System.out.print("Masukkan Pilihan = ");
        pilih = scanner.nextInt();
        return pilih;
    } 

    public static int menuPilihEnemy(Scanner scanner){
        int pilih;
        System.out.println("Menu Pilih Enemy");
        System.out.println("1. Jalan");
        System.out.println("2. Lari");
        System.out.println("3. Serang");
        System.out.print("Masukkan Pilihan = ");
        pilih = scanner.nextInt();
        return pilih;
    }
}
