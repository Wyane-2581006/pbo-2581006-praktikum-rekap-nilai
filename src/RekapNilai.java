import java.util.Scanner;

public class RekapNilai {

    static final int SELESAI = -1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nilai;
        double total = 0;
        int nomor = 1;
        int jumlah_Nilai = 0;

        do {// do-while digunakan karena nilai pertama harus diminta terlebih dahulu sebelum kondisi diperiksa.
            System.out.print("Masukkan nilai ke- " + nomor + " : ");
            nilai = scanner.nextInt();

            if (nilai == SELESAI) {
                break;
            }
            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai Tidak Valid.");
                continue;
            }

            char grade;
            // Jika nilai >= 60 diletakkan paling atas, nilai 85 langsung mendapat grade D
            // karena kondisi pertama sudah bernilai true dan kondisi berikutnya tidak diperiksa.
            if (nilai >= 90) {
                grade = 'A';
            } else if (nilai >= 80) {
                grade = 'B';
            } else if (nilai >= 70) {
                grade = 'C';
            } else if (nilai >= 60) {
                grade = 'D';
            } else {
                grade = 'E';
            }

            String keterangan_Nilai = switch (grade) {
                case 'A' -> "Sangat Baik";
                case 'B' -> "Baik";
                case 'C' -> "Cukup";
                case 'D' -> "Kurang";
                default -> "Tidak Lulus";
            };

            System.out.println("Grade: " + grade);
            System.out.println("Keterangan: " + keterangan_Nilai);

            total += nilai;
            jumlah_Nilai++;

            nomor++;

        } while (true);

        if (jumlah_Nilai > 0) {
            double rata = total / jumlah_Nilai;
            System.out.println("Rata-rata : " + String.format("%.2f", rata));
        }
    }
}
