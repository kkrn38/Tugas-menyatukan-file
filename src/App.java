import java.util.Scanner;

import model.Balok;
import model.Kerucut;
import model.Kubus;
import model.Tabung;

public class App {
    public static void main(String[] args) throws Exception 
    {
        String pesan = "Selamat Datang di Dunia Lingkaran Tahun ";
        int tahun = 2022;
        System.out.println(pesan + tahun);
        System.out.print("============================================\n");
        Scanner keyboard = new Scanner (System.in);

        String yn="";
        do {
            System.out.print ("Program Menghitung Bangun Ruang\n");
            System.out.print ("1. Menghitung Tabung\n2. Menghitung Kubus\n3. Menghitung Balok\n4. Menghitung Kerucut\n5.Menghitung Prisma\n6. Keluar ");
            System.out.print ("Masukkan Pilihanmu (1,2,3,4,5,6) : ");
            int pilihan=0;
            pilihan = keyboard.nextInt();

            if (pilihan==1){
                menuTabung(keyboard);
            }
            else if (pilihan==2){
                menuKubus(keyboard);
            }
            else if (pilihan==3){
                menuBalok(keyboard);
            }
            else if (pilihan==4){
                menuKerucut(keyboard);
            }
            /* 
            else if (pilihan==5){
                menuPrisma(keyboard);
            }
            */
            else if (pilihan==5)break; 
                System.out.print("Apakah Anda ingin kembali ke menu utama? (y/n)");
             yn = keyboard.next();
             //clear screen
             bersihkanLayar();
        }
        while (yn.equals("y"));
        System.out.println("Terimakasih");
    }

    public static void bersihkanLayar()
    {
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
    }
    
    public static void menuKubus (Scanner keyboard)
    {
        Kubus kubus1 = new Kubus();
        System.out.print ("Masukkan Sisi Kubus  = ");
        kubus1.s = keyboard.nextInt();
        kubus1.hitungLuas();
        kubus1.tampilkanLuas();
        kubus1.tampilkanVolume();
    }
    public static void menuBalok (Scanner keyboard)
    {
        Balok balok1 = new Balok();
        System.out.println("Masukkan Panjang Kubus = ");
        balok1.p = keyboard.nextInt();
        System.out.println("Masukkan Lebar Kubus = ");
        balok1.l = keyboard.nextInt();
        System.out.println("Masukkan Tinggi Kubus = ");
        balok1.t = keyboard.nextInt();
        balok1.hitungVolume();
        balok1.tampilkanVolume();
    }

    public static void menuKerucut (Scanner keybaord)
    {
        Kerucut kerucut1 = new Kerucut();
        System.out.println("Masukkan Panjang Radius = ");
        kerucut1.rad = keybaord.nextInt();
        System.out.println("Masukkan Panjang Garis Pelukis = ");
        kerucut1.garpel = keybaord.nextInt();
        kerucut1.hitungLuas();
        kerucut1.tampilkanLuas();
    }

    public static void menuTabung (Scanner keyboard)
    {
        Tabung tabung1 = new Tabung();
        System.out.println("Masukkan Panjang Jari Jari Tabung = ");
        tabung1.r = keyboard.nextInt();
        System.out.println("Masukkan Tinggi Tabung = ");
        tabung1.T = keyboard.nextInt();
        tabung1.hitungLuasPermukaan();
        tabung1.hitungLuasSelimut();
        tabung1.tampilkanLP();
        tabung1.tampilkanLS();
    }
}
        
