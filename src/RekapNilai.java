import java.util.Scanner;

public class RekapNilai {

    static final int SELESAI = -1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nilai;
        double total;
        int nomor = 1;

        do{// do-while digunakan karena nilai pertama harus diminta terlebih dahulu sebelum kondisi diperiksa.
            System.out.print("Masukkan nilai ke- " + nomor + " : ");
            nilai = scanner.nextInt();

            if(nilai==SELESAI){
                break;
            }
            if(nilai<0 || nilai >100) {
                System.out.println("Nilai Tidak Valid.");
                continue;
            }

            nomor++;

        } while(true);
    }
}
