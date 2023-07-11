package Utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Symbol {

   public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_SIYAH = "\u001B[30m";
    public static final String ANSI_KIRMIZI = "\u001B[31m";
    public static final String ANSI_YEŞİL = "\u001B[32m";
    public static final String ANSI_SARI = "\u001B[33m";
    public static final String ANSI_MAVI = "\u001B[34m";
    public static final String ANSI_MOR = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_BEYAZ = "\u001B[37m";





public static void menu(String a, String b, String c,String d, String e, String f){

    System.out.println();
    System.out.println();
    String s=" ";


    String ustSimge="┏━━━━•❅•°•❈•°•❅•━━━━┓";
    String altSimge="┗━━━━•❅•°•❈•°•❅•━━━━┛";
    System.out.println(ANSI_YEŞİL+s.repeat(16)+ustSimge.repeat(1)+s.repeat(1)+ustSimge.repeat(1)
                      +s.repeat(1)+ustSimge.repeat(1)+s.repeat(1)+ustSimge.repeat(1)
                      +s.repeat(1)+ustSimge.repeat(1)+s.repeat(1)
                      +s.repeat(1)+ustSimge.repeat(1)+s.repeat(1)
                      +s.repeat(1)+ustSimge.repeat(1)+s.repeat(1));

    System.out.println(ANSI_SARI+s.repeat(16)
            +s.repeat(4)+"1 -"+ a +s.repeat(1)
            +s.repeat(1)+s.repeat(10)+"2-"+ b +s.repeat(2)
            +s.repeat(1)+s.repeat(6)+"3-"+ c +s.repeat(2)
            +s.repeat(1)+s.repeat(13)+"4- "+ d +s.repeat(2)
            +s.repeat(1)+s.repeat(13)+"5-"+ e +s.repeat(2)
            +s.repeat(1)+s.repeat(13)+"6- "+ f +s.repeat(8)
            +s.repeat(1)+s.repeat(8)+"0- Çıkış Yap"+s.repeat(8)
    );

    System.out.println(ANSI_YEŞİL+s.repeat(16)+altSimge.repeat(1)+s.repeat(1)+altSimge.repeat(1)
                      +s.repeat(1)+altSimge.repeat(1)+s.repeat(1)+altSimge.repeat(1)
                      +s.repeat(1)+altSimge.repeat(1)+s.repeat(1)
                      +s.repeat(1)+altSimge.repeat(1)+s.repeat(1)
                      +s.repeat(1)+altSimge.repeat(1)+s.repeat(1)+"\n");
    System.out.println("\n");

    }
    public static void errTrow(String str){
        String s=" ";

        System.out.print(Symbol.ANSI_YEŞİL+s.repeat(65)+"✩｡:*•.─────  ❁ " + str + " ❁  ─────.•*:｡✩\n\n" +
                s.repeat(65)+"✩｡:*•.─────  ❁"+" ==> ");

    }
public static void versionText(){
        String s=" ";
    String satirUstSol="╭══•";
    String satirUstSag="•══╮";
    String content1="ೋ   •✧   ๑♡   ๑   ✧   •   ೋ";
    String content3="Maceara Adasına hoş geldiniz v-1.0 olarak dizayn edilmiştir";
    String content2="© @author Mehmet Duran Kaya'nın Macera adası her hakkı Saklıdır ©";
    String guvenliEv=ANSI_SARI+"Burada güvendesiniz kimse saldıramaz ve sağlığınıza kavuşursunuz";
    String esyaDukkani=ANSI_MAVI+"Bu lokasyonda savaş araç-gereçleri bulunur";
    String magara=ANSI_BEYAZ+"Magara"+ s.repeat(1)+"-->"+ s.repeat(5)+  "Ödül== Yemek "  + s.repeat(6)+ "   !!!Zombi Çıkabilir";
    String orman=ANSI_YEŞİL+"Orman"  + s.repeat(2)+ "-->"+ s.repeat(5)+ "Ödül== Odun "   + s.repeat(7)+ "   !!!Vampir Çıkabilir";
    String nehir=ANSI_CYAN+"Nehir"   + s.repeat(2)+ "-->"+ s.repeat(5)+ "Ödül== Su "     + s.repeat(10)+ "  !!!Ayı Çıkabilir";
    String maden=ANSI_MOR+"Maden"    + s.repeat(2)+ "-->"+ s.repeat(5)+ "Ödül== Random"  + s.repeat(7) + "  !!!Yılan Çıkabilir";


    String satirAltSol= "╰══•";
    String satirAltSag="•══╯";
    System.out.println(ANSI_YEŞİL+s.repeat(50)+satirUstSol+s.repeat(27)+content1+s.repeat(27)+satirUstSag);
    System.out.println(ANSI_SARI+s.repeat(71)+guvenliEv);
    System.out.println(ANSI_SARI+s.repeat(71)+esyaDukkani);
    System.out.println(ANSI_SARI+s.repeat(71)+magara);
    System.out.println(ANSI_SARI+s.repeat(71)+orman);
    System.out.println(ANSI_SARI+s.repeat(71)+nehir);
    System.out.println(ANSI_SARI+s.repeat(71)+maden);
    System.out.println(ANSI_SARI+s.repeat(71)+content3);
    System.out.println(ANSI_SARI+s.repeat(75)+content2);
    System.out.println(ANSI_YEŞİL+s.repeat(50)+satirAltSol+s.repeat(27)+content1+s.repeat(27)+satirAltSag);
}

public static void imlecAyar(String str){
    String s=" ";
    System.out.println(Symbol.ANSI_YEŞİL+s.repeat(65)+"✩｡:*•.─────  ❁"+str+" ❁  ─────.•*:｡✩\n");
}
public static void oneTable(String name,int damage,int healty,int money){//-----------------ONE PRODUCT TABLE------------
    String s=" ";
    String cizgi="-";

    System.out.println(s.repeat(65)+cizgi.repeat(60)+"\n");
    imlecAyar(ANSI_SARI+"Seçiminiz");
    System.out.printf(s.repeat(65)+"| %-8S  | %-8S  |%-8S|%-8S|%n ","Karakter","Hasar","Sağlık","Para");
    System.out.printf(s.repeat(65)+" %-8S    %-8S %-8S %-8S\n",name,damage,healty,money);
    System.out.println(s.repeat(65)+cizgi.repeat(60)+"\n");
}//-----------------ONE PRODUCT TABLE FINISH------------
    public static void oneTable(int id,String damage,int healty,int money){//-----------------ONE PRODUCT TABLE owerloadin yapıyorum------------
        String s=" ";
        String cizgi="-";

        System.out.println(s.repeat(65)+cizgi.repeat(60)+"\n");
        imlecAyar(ANSI_SARI+"Seçiminiz");
        //System.out.printf(s.repeat(65)+"| %-8S  | %-8S  |%-8S|%-8S|%n ","No","Hasar","Sağlık","Para");
        System.out.printf(s.repeat(65)+" %-8S    %-8S %-8S %-8S\n",id,damage,healty,money);
       // System.out.println(s.repeat(65)+cizgi.repeat(60)+"\n");
    }//-----------------ONE PRODUCT TABLE FINISH------------

public static void headerTable(){ //---------------------HEADER----------------
    String s=" ";
    String cizgi="-";
    String ciftCizgi="=";
    String baslik =s.repeat(65)+"|%-8s | %-8S  | %-8S | %-8S |  %-8S |%n";
    String govde =ANSI_CYAN+ s.repeat(65)+"|%-8s |  %-8S | %-8S | %-8S |  %-8S |%n";
    System.out.printf(s.repeat(65)+ciftCizgi.repeat(60));
    System.out.println();
    System.out.printf(s.repeat(90)+"KARAKTERLER"+s.repeat(60) +"%n");
    System.out.println(ANSI_SARI+s.repeat(65)+cizgi.repeat(60));
    System.out.printf( govde,"No", "Karakter", "Hasar", "Sağlık","Para");
    System.out.println(s.repeat(65)+cizgi.repeat(60));
} //---------------------HEADER FINISH----------------
    public static void bodyTable(int Id,String name,int hasar,int healty ,int money){//-----------------BODY------------
        String s=" ";
        String cizgi="-";
        String govde =s.repeat(65)+"|%-8S |  %-8S | %-8S | %-8S |  %-8S %n";
        System.out.printf(govde, Id, name, hasar, healty,money);
        System.out.println(s.repeat(65)+cizgi.repeat(60));
    }//-----------------BODY FINISH------------

    public static void bodyTable(int healty,int damage,String name,String block,int armour ,int money){
        String s=" ";
        String cizgi="-";
        String govde =s.repeat(65)+"|%-8S |  %-8S | %-8S | %-8S |  %-8S |%-8S %n";
        System.out.printf(govde, healty, damage, name, block,armour,money);
        System.out.println(s.repeat(65)+cizgi.repeat(60));
    }//-----------------BODY FINISH------------
    public static void headerTable(String healty,String damage,String name,String block,String armour ,String money){ //---------------------HEADER-overloading---------------
        String s=" ";
        String cizgi="-";
        String ciftCizgi="=";
        String baslik =s.repeat(65)+"|%-8s|%-8S|%-8S|%-8S|%-8S|%-8S|%n";
        String govde =ANSI_CYAN+ s.repeat(65)+"|%-8s|%-8S|%-8S|%-8S|%-8S|%n";
        System.out.printf(s.repeat(65)+ciftCizgi.repeat(60));
        System.out.println();
        System.out.printf(s.repeat(90)+"KAHRAMAN"+s.repeat(60) +"%n");
        System.out.println(ANSI_SARI+s.repeat(65)+cizgi.repeat(60));
        System.out.printf( govde,healty, damage, name, block,armour,money);
        System.out.println(s.repeat(65)+cizgi.repeat(60));
    } //---------------------HEADER FINISH----------------
    public static void obstacleHeaderTable(String healty,String damage,String money){ //---------------------HEADER-overloading---------------
        String s=" ";
        String cizgi="-";
        String ciftCizgi="=";
        String baslik =s.repeat(65)+"|%-8s|%-8S|%-8S|%n";
        String govde =ANSI_CYAN+ s.repeat(65)+"|%-8s|%-8S|%n";
        System.out.printf(s.repeat(65)+ciftCizgi.repeat(60));
        System.out.println();
        System.out.printf(s.repeat(90)+"CANAVAR"+s.repeat(60) +"%n");
        System.out.println(ANSI_SARI+s.repeat(65)+cizgi.repeat(60));
        System.out.printf( govde,healty, damage,money);
        System.out.println(s.repeat(65)+cizgi.repeat(60));
    }
    public static void obstacleBodyTable(int healty,int damage,int money){
        String s=" ";
        String cizgi="-";
        String govde =s.repeat(65)+"|%-8S|%-8S|%-8S| %n";
        System.out.printf(govde, healty, damage,money);
        System.out.println(s.repeat(65)+cizgi.repeat(60));
    }//-----------------BODY FINISH------------
    public static void footerTable(){//-----------------FOOTER------------
        String s=" ";
        String cizgi="-";
        String baslik =s.repeat(65)+"|%-8S | %-8S  | %-8S | %-8S |  %-8S |%n";
        System.out.printf(baslik, "No", "Karakter", "Hasar", "Sağlık","Para");
        System.out.println(s.repeat(65)+cizgi.repeat(60));
    }//-----------------FOOTER FINIS------------
public static void threeButtonDesign(String str1,String str2,String str3){
    System.out.println();
    System.out.println();
    String s=" ";
    String ustSimge="┏━━━━•❅•°•❈•°•❅•━━━━┓";
    String altSimge="┗━━━━•❅•°•❈•°•❅•━━━━┛";

    System.out.println(ANSI_YEŞİL+s.repeat(80)+ustSimge.repeat(1)
                                 +s.repeat(10)+ustSimge.repeat(1)
                                 +s.repeat(10)+ustSimge.repeat(1));

    System.out.println(ANSI_SARI+s.repeat(80)+s.repeat(5)+str1+s.repeat(7)
                                +s.repeat(10)+s.repeat(5)+str2+s.repeat(5)
                                                   +s.repeat(12)+str3+s.repeat(5));


    System.out.println(ANSI_YEŞİL+s.repeat(80)+altSimge.repeat(1)
                                 +s.repeat(10)+altSimge.repeat(1)
                                 +s.repeat(10)+altSimge.repeat(1));
}

    public static void weaponStateHeader(String num,String name,String damage,String money ){ //---------------------HEADER-overloading---------------
        String s=" ";
        String star="★";
        String cizgi="-";
        String govde =ANSI_SARI+ s.repeat(65)+"|%-8s|%-8S|%-8S|%-8S|%n";
        System.out.print(s.repeat(65)+"»»————- " + star.repeat(30) + "-————-««\n");
        //System.out.println(ANSI_SARI+s.repeat(65)+cizgi.repeat(60));
        System.out.printf( govde,num,name, damage,money);
        //System.out.println(s.repeat(65)+cizgi.repeat(60));
        System.out.print(s.repeat(65)+"»»————- " + star.repeat(30) + "-————-««\n");
    }

    public static void weaponbodyTable(int num,String name,int damage,int money){
        String s=" ";
        String star="★";
        String cizgi="-";
        String govde =s.repeat(65)+"|%-8S|%-8S|%-8S|%-8S|%n";
        System.out.printf(govde, num,name,damage,money);
        System.out.print(s.repeat(65)+"»»————- " + star.repeat(30) + "-————-««\n");
        //System.out.println(s.repeat(65)+cizgi.repeat(60));
    }//-----------------BODY FINISH------------

    public static void dead(String str){
        String s=" ";
        String kafatasi="\uD83D\uDC80";
        System.out.println(s.repeat(78)+kafatasi.repeat(5) + str +kafatasi.repeat(5));
    }
    public static void selfHouse(){
        String s=" ";

        System.out.println(s.repeat(65)+"\uD83D\uDC6E\u200D♂\uFE0F");

        System.out.println(s.repeat(65)+"☠");    }

    public static void arrow(){
        String s=" ";

        System.out.println(s.repeat(65)+"\uD83C\uDFF9");
    }

    public static void hancer(){
    System.out.println("\uD83D\uDDE1");
}
    public static void dolar(String str){
        System.out.println("＄" + str + "＄");
    }
    public static void obstaclePicture(int num){
String bosluk=" ";
    String vampir= "\uD83D\uDE08";
   String canavar="\uD83E\uDDDB  ";
        System.out.print(bosluk.repeat(108)+ vampir.repeat(num)+"\n");



    }
    public static void envanterTable(String silah,String bloklama,int zirh,int hasar,int healty ,int money){//-----------------BODY------------
        String s=" ";
        String cizgi="-";

        System.out.println(s.repeat(65)+cizgi.repeat(60));
        imlecAyar(ANSI_SARI+"Çantanız");
        System.out.printf(s.repeat(65)+"|%-8S| %-8S |%-8S|%-8S|%-8S|%-8S|%n ","Silah","Bloklama","Zırh","Hasar","Sağlık","Para");
        String govde =s.repeat(65)+"|%-8S|%-8S|%-8S|%-8S|%-8S|%-8S|%n";
        System.out.printf(govde, silah, bloklama,zirh, hasar, healty,money);
        System.out.println(s.repeat(65)+cizgi.repeat(60));
    }//-----------------BODY FINISH------------


    public static void amblem(String str){
        String s=" ";
    System.out.println(s.repeat(65)+"»»————- " + s.repeat(15) + "★"+ str + "★" + s.repeat(15) + "————-««");
}
    public static void imlecAmblem(String str){
        String s=" ";
        System.out.print(s.repeat(65)+"»»————- " + s.repeat(15) + "★"+ str + "★" + s.repeat(7) + "-————-««\n" +
                s.repeat(65)+ "»»————- " + s.repeat(15) + "★");


    }
    public static void denizciCapasi(String str){
    String s=" ";
    System.out.println(s.repeat(65)+"⚓"+ str +"⚓" );
   }
   public static void simge(String str){
    String s=" ";
    System.out.println(ANSI_SARI+s.repeat(65) + str+ "⚜");
}
   public static void balArisi(String str){
    String s=" ";

    System.out.println(s.repeat(65)+"\uD83D\uDC1D" + str);
}
   public static void savasYadaGericekil(){

    String s=" ";
    System.out.print(s.repeat(65)+s.repeat(15) +"»»————- "+Symbol.ANSI_KIRMIZI+" <S>avaş" + "⚔ " + Symbol.ANSI_SARI+"<G>eri Çekil"+"\uD83D\uDC0E"+ " -————-««\n" +
            s.repeat(65)+ "»»————- " + s.repeat(15) + "★");


}

}





