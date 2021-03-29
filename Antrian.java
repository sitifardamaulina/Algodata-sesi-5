
import java.util.InputMismatchException;
import java.util.Scanner;

public class Antrian {
    private static int[]antrian=new int[10];
    private static int counters=0;
    
    private static boolean antrianStorage(){
        if(counters<antrian.length){
            return true;
        }
        else{
            return false;
        }
    }
    private static void createAntrian(){
        int loopX =0;
        int alpha =0;
        while(loopX==0){
            System.out.print("Masukkan Data (angka): ");
            Scanner alphaX= new Scanner(System.in);
            try{
                alpha= alphaX.nextInt();
                loopX= 1;
            }
            catch(InputMismatchException e){
                System.out.println("Masukkan  berupa Angka!");
                loopX= 0;
            }
        }
        antrian[counters]=alpha;
        counters++;
    }
    private static void removeantrian(){
        counters--;
        for(int i=0; i<counters; i++){
            antrian[i]=antrian[i+1];
        }
        System.out.println("Data Pertama dalam antrian sudah dikeluarkan");
    }
    private static void aListantrian(){
        String aList = null;
        
        System.out.println("salah satuData Pertama dalam antrian dikeluarkan\t:"+aList);
    }
    private static void displayDataAntrian(){
        System.out.print("Data dalam Antrian : ");
        for(int i=0; i<counters; i++){
            System.out.print("["+i+"=>"+antrian[i]+"]");
        }
        System.out.println("");
    }
    private static void cleanAntrian() {
    counters = 0;
}
    
    private static void quitApp(){
        String quitss ="iya";
        System.out.print("Keluar dari program?(iya/tidak)");
        quitss= new Scanner(System.in).nextLine();
        if(quitss.equalsIgnoreCase("iya")){
            System.exit(0);
        }
        else{
            menuProgram();
        }
    }
    private static void menuChooser(int choosenMenu){
        switch(choosenMenu){
            case 1:
                boolean insert = antrianStorage();
                if(insert){
                    createAntrian();
                }
                 insert = antrianStorage();
                if(insert){
                    createAntrian();
                }
                else{
                    System.out.println("Antrian Penuh! kosongkan data terlebih dahulu");
                }
                break;
            case 2:
                removeantrian();
                break;
            case 3:
                aListantrian();
                break;
            case 4:
               cleanAntrian () ;
                break;
            case 5:
                displayDataAntrian();
                break;
            case 6:
                quitApp();
                break;
        }
        menuProgram();
    }
    private static void menuProgram(){
        int loopX = 0;
        int choosenMenu = 0;
        while(loopX==0){
            System.out.println("Antrian bank : ");
            System.out.println("1. Tambah Data Antrian");
            System.out.println("2. Hapus Antrian 1");
            System.out.println("3. menghapus Antrian tertentu");
            System.out.println("4. Hapus semua data");
            System.out.println("5. tampilkan data antrian");
            System.out.println("6. Keluar dari Program");
            System.out.println("Pilih Menu(1-6)");
            Scanner menuOption = new Scanner(System.in);
            try{
                choosenMenu= menuOption.nextInt();
                loopX =1;
            }catch(InputMismatchException e){
                System.out.println("Masukkan  Angka!");
            }
        }
        System.out.println("");
        menuChooser(choosenMenu);
    }
    public static void main(String[]args){
        menuProgram();
    }

    private static void pollAntrian() {
        throw new UnsupportedOperationException("Not supported yet."); 
  
}

    private static void alistAntrian() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private static void insertAntrian() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
    
