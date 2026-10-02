import java.util.Scanner;

public class RekapNilai {

    static final int SELESAI = -1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nilai;
        double total;

        do{
            System.out.print("Masukkan nilai: ");
            nilai = scanner.nextInt();
        } while(nilai != SELESAI);

        if(nilai<0 || nilai >100){
            System.out.println("Nilai Tidak Valid.");
            continue;
        }

    }
}
