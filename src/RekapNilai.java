import java.util.Scanner;
import java.util.Locale;

public class RekapNilai {

    static final int SELESAI = -1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nilai;
        double total = 0; //harus dimulai dari 0 karena digunakan sebagai akumulator
        int nomor = 1; //harus dimulai dari 1 karena digunakan sebagai akumulator, dan 1 sebagai penanda
        int jumlah_Nilai = 0; // harus dimulai dari 0 karena digunakan sebagai akumulator
        System.out.println("==== REKAP NILAI KELAS ====");
        System.out.println("Ketik -1 Ketika Sudah Selesai");
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
            // Pecobaan : Jika nilai >= 60 diletakkan paling atas, nilai 85 langsung mendapat grade D
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

            System.out.println("\nNilai Sah : " + jumlah_Nilai);

            double rata = total / jumlah_Nilai;
            System.out.println("Rata-rata : " + String.format(new Locale("id", "ID"), "%.2f", rata));

            String status = rata >= 60 ? "LULUS" : "TIDAK LULUS";// ternary untuk memilih kondisi mana yang dijalankan dengan bentuk kondisi ? nilaiJikaBenar : nilaiJikaSalah
            System.out.println("Status : " + status);
        }
    }
}
