package warnakepribadian;
import java.util.Scanner;


/*
 * NAMA              : Tassyakur Pasya
 * KELAS             : IF-01
 * NIM               : 10118009
 * DESKRIPSI PROGRAM : Warna Kepribadiaan
 */

public class IF01PBO110118009Latihan40WarnaKepribadian {

    /**
     * @param args
     */
   
        // TODO code application logic here
    public static String nama;
    public static String warna;
    public static String warnaPeriksa;
    public static String Nama;
    
    public static final String reset = "\u001B[0m";
    public static final String merah = "\u001B[31m";
    public static final String hijau = "\u001B[32m";
    public static final String kuning = "\u001B[33m";
    public static final String biru = "\u001B[34m";
    public static final String ungu = "\u001B[35m";
    public static final String biruMuda = "\u001B[36m";
    public static final String putih = "\u001B[37m";
    public static final String bgMerah = "\u001B[41m";
    public static final String bgHijau = "\u001B[42m";
    public static final String bgKuning = "\u001B[43m";
    public static final String bgBiru = "\u001B[44m";
    public static final String bgUngu = "\u001B[45m";
    
    public static void main(String[] args) {
      // TODO code application logic here
          System.out.println(merah + " YUK " + hijau + "CEK " + kuning + "KEPRIBADIANMU" + biruMuda +
                " DARI " + ungu + "WARNA " + biru + "FAVORITMU\n\n");
          
          System.out.println(bgMerah+putih+"\t\t MERAH \t\t\t");
          System.out.println(bgHijau+putih+"\t\t HIJAU \t\t\t");
          System.out.println(bgKuning+putih+"\t\t KUNING \t\t");
          System.out.println(bgBiru+putih+"\t\t BIRU \t\t\t");
          System.out.println(bgUngu+putih+"\t\t UNGU \t\t\t");
          
          System.out.print(reset+"PILIH WARNA FAVORITMU : ");
          Scanner tampWarna = new Scanner(System.in);
          warna = tampWarna.nextLine();
          warnaPeriksa = warna.toUpperCase();
          
          System.out.print("NAMA KAMU : ");
          Scanner tampNama = new Scanner(System.in);
          nama = tampNama.nextLine();
          Nama = nama.toUpperCase();
          
          System.out.println("=====HASIL TEST KEPRIBADIAN "+nama+"=====");
          switch(warnaPeriksa){
              case "MERAH" :
                  System.out.println(reset+"WARNA FAVORITMU ADALAH "+merah+warnaPeriksa);
                  warnaMerah mRh = new warnaMerah();
                  mRh.warnamErah();
                  break;
              case "HIJAU" :
                  System.out.println(reset+"WARNA FAVORITMU ADALAH "+hijau+warnaPeriksa);
                  warnaHijau hJu = new warnaHijau();
                  hJu.warnahIjau();
                  break;
              case "BIRU" :
                  System.out.println(reset+"WARNA FAVORITMU ADALAH "+biru+warnaPeriksa);
                  warnaBiru bRu = new warnaBiru();
                  bRu.warnabIru();
                  break;
              case "UNGU" :
                  System.out.println(reset+"WARNA FAVORITMU ADALAH "+ungu+warnaPeriksa);
                  warnaUngu uGu = new warnaUngu();
                  uGu.warnauNgu();
                  break;
              case "KUNING" :
                  System.out.println(reset+"WARNA FAVORITMU ADALAH "+kuning+warnaPeriksa);
                  warnaKuning kUg = new warnaKuning();
                  kUg.warnakUning();
                  break;
              default:
                  System.out.println("OOoopppsss... Belum terindentifinisi");
              
          
    }

}  
    }
        
    
