
package javaapplication1;
import java.util.Scanner;
public class audisiMusik {
    public static void main(String[] args) {
        boolean kompetisi;
        int tingkatKompetisi=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Keikutsertaan Kompetisi : ");
        kompetisi=sc.nextBoolean();
        if(kompetisi){
            System.out.println("Tingkat Kompetisi : ");
            System.out.println("(1)Nasional/Internasional");
            System.out.println("(2)Selain Nasional/Internasional");
            tingkatKompetisi=sc.nextInt();  
        }
        if(kompetisi&&tingkatKompetisi==1){
                System.out.println("Lolos seleksi tanpa harus audisi");
        }else{
                System.out.print("Masukkan Intstitusi yang mengeluarkan nilai : ");
                String institusi = sc.next();
                System.out.print("Masukkan nilai aural : ");
                int aural = sc.nextInt();
                System.out.print("Masukkan nilai sight-reading : ");
                int sr = sc.nextInt();
                if(institusi.equals("rcm")){
                    if((aural>=17&&aural<=18)&&(sr>=19&&sr<=21)){
                        System.out.println("Lolos seleksi tanpa harus audisi");
                    }else if(((aural>=12)&&(sr>=14))||((aural>=17)&&(sr>=14&&sr<=18))||(aural>=12&&aural<=16)&&sr>=19){
                        System.out.println("Harus audisi");
                    }else if ((aural<12&&sr<14)||(aural<12&&sr>=14)||(aural>=12&&sr<14)){
                        System.out.println("Gagal seleksi karena tidak boleh ikut audisi");
                    }
                }else if (institusi.equals("tcl")){
                    if((aural>=9&&aural<=10)&&(sr>=12&&sr<=14)){
                        System.out.println("Lolos seleksi tanpa harus audisi");
                    }else if(((aural>=6)&&(sr>=8))||((aural>=9)&&(sr>=9&&sr<=11))||(aural>=6&&aural<=8)&&sr>=12){
                        System.out.println("Harus audisi");
                    }else if ((aural<6&&sr<9)||(aural<6&&sr>=9)||(aural>=6&&sr<9)){
                        System.out.println("Gagal seleksi karena tidak boleh ikut audisi");
                    }
                }else{
                    System.out.println("Institusi tidak ada");
                }
        }
    }
}
