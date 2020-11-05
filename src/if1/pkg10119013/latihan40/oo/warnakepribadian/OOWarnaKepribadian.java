/*
 * NAMA  : Fiona Avila Putri
 * NIM   : 10119013
 * KELAS : IF1 2019/2020 (PBO1)
 */



package if1.pkg10119013.latihan40.oo.warnakepribadian;

import java.util.Scanner;
/**
 *
 * @author Fiona Avila
 */


public class OOWarnaKepribadian {
    
    static Scanner scan = new Scanner(System.in);
    
    public String warna, nama;
    
    public String netral = "\u001b[0m";
    public String merah = "\u001b[31m";
    public String merah2 = "\u001b[41m";
    public String biru = "\u001b[34m";
    public String biru2    = "\u001b[44m";
    public String kuning = "\u001b[33m";
    public String kuning2  = "\u001b[43m";
    public String ungu = "\u001b[35m";
    public String ungu2    = "\u001b[45m";
    public String hijau = "\u001b[32m";
    public String hijau2   = "\u001b[42m";
    public String putih ="\u001b[37m";
    
    public void sifatMerah(){
        System.out.println("Warna Favoritmu adalah " + netral + merah + warna);
        System.out.println("1. Melambangkan kekuatan, kesehatan, dan vitalitas\n" +
                        "2. Terbuka\n" +
                        "3. Agresif\n" +
                        "4. Impulsif\n" +
                        "5. Penuh semangat\n" +
                        "6. Optimisme\n" +
                        "7. Rasa disiplin yang tinggi\n" +
                        "8. Bersikap dinamis\n" +
                        "9. Terlalu ambisius\n" +
                        "10. Terlalu subjektif\n" +
                        "11. Mudah menghakimi orang lain");
    }
    
    public void sifatBiru(){
        System.out.println("Warna Favoritmu adalah " + netral + biru + warna);
        System.out.println("1. Melambangkan kehati-hatian, konservatisme, dan introspeksi\n" +
                        "2. Memberikan kesan lembut\n" +
                        "3. Menenangkan\n" +
                        "4. Perhatian\n" +
                        "5. Sabar\n" +
                        "6. Sensitif\n" +
                        "7. Pengendalian diri yang bagus\n" +
                        "8. Mudah menyadari kesalahannya\n" +
                        "9. Bijaksana dan stabil\n" +
                        "10. Loyal jika sudah meyakini sesuatu\n" +
                        "11. Sikap yang terlalu hati-hati\n" +
                        "12. Menyukai sesuatu yang bersifat konservatif\n" +
                        "13. Sering curiga pada orang-orang yang memiliki kepribadian serba spontan dan menonjol");
    }
    
    public void sifatKuning(){
        System.out.println("Warna Favoritmu adalah " + netral + kuning + warna);
        System.out.println("1. Melambangkan keceriaan, kebijaksanaan, dan imajinasi\n" +
                        "2. Haus petualangan dan menyukai hal-hal baru\n" +
                        "3. Berkepribadian cerah\n" +
                        "4. Cerdik\n" +
                        "5. Berbakat dalam bisnis\n" +
                        "6. Memiliki selera humor yang baik\n" +
                        "7. Menyukai kebebasan\n" +
                        "8. Orang yang independen\n" +
                        "9. Suka melalaikan tanggung jawab\n" +
                        "10. Sulit bekerja dengan orang lain");
    }
    
    public void sifatUngu(){
        System.out.println("Warna Favoritmu adalah " + netral + ungu + warna);
        System.out.println("1. Individualistik\n" +
                        "2. Jenaka\n" +
                        "3. Sensitif\n" +
                        "4. Selalu ingin tampil beda\n" +
                        "5. Menyukai hal-hal unik dan berbeda\n" +
                        "6. Dipenuhi ide-ide kreatif\n" +
                        "7. Tidak menyukai hal-hal yang konvensional\n" +
                        "8. Cocok memimpin\n" +
                        "9. Toleran\n" +
                        "10. Cenderung rewel\n" +
                        "11. Temperamental\n" +
                        "12. Berharga diri tinggi\n" +
                        "13. Suka menarik diri dan bersikap kasar jika ada orang yang salah paham terhadap mereka");
    }    
    
    public void sifatHijau(){
        System.out.println("Warna Favoritmu adalah " + netral + hijau + warna);
        System.out.println("1. Melambangkan harmoni dan keseimbangan\n" +
                        "2. Mewakili harapan dan perdamaian\n" +
                        "3. Lembut\n" +
                        "4. Jujur\n" +
                        "5. Terus terang dalam berkata-kata\n" +
                        "6. Suka berada dalam komunitas\n" +
                        "7. Mampu bersosialisasi dengan baik\n" +
                        "8. Menyukai kedamaian hidup\n" +
                        "9. Tidak suka mencari masalah dan pemecahan lewat jalan kekerasan\n" +
                        "10. Lebih memilih untuk tidak menonjolkan diri saat berinteraksi dalam komunitas\n" +
                        "11. Sederhana\n" +
                        "12. Sabar");
    }
    
    public void kepribadian(){
        switch (warna) {
            case ("MERAH") :
                sifatMerah();
                break;
            case ("BIRU") :
                sifatBiru();
                break;
            case ("HIJAU") :
                sifatHijau();
                break;
            case ("KUNING") :
                sifatKuning();
                break;
            case ("UNGU") :
                sifatUngu();
                break;
            default:
                System.out.println("Oops.. Warna kesukaanmu belum teridentifikasi!");
        }
    }
    
    public static void main(String[] args) {
        
        OOWarnaKepribadian sifat = new OOWarnaKepribadian();
        
        System.out.println(sifat.merah + "YUK " + sifat.hijau + "CEK " + sifat.kuning + "KEPRIBADIAN " + sifat.biru + "DARI " + sifat.ungu + "WARNA " + sifat.biru + "FAVORITMU" + sifat.netral + "\n");
        System.out.println(sifat.merah2 + sifat.putih + "         MERAH        " + sifat.netral);
        System.out.println(sifat.biru2 + sifat.putih + "         BIRU         " + sifat.netral);
        System.out.println(sifat.kuning2 + sifat.putih + "         KUNING       " + sifat.netral);
        System.out.println(sifat.ungu2 + sifat.putih + "         UNGU         " + sifat.netral);
        System.out.println(sifat.hijau2 + sifat.putih + "         HIJAU        " + sifat.netral);
        System.out.print("\nPILIH WARNA FAVORITMU\t: ");
        sifat.warna = scan.next().toUpperCase();
        
        System.out.print("NAMA KAMU\t\t: ");
        sifat.nama = scan.next().toUpperCase();
        System.out.println();
        
        System.out.println("===HASIL TEST KEPRIBADIAN " + sifat.nama + "===");
        sifat.kepribadian();
    }
}
