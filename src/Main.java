import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

class User {
    protected ArrayList<String> usercs = new ArrayList<>();
    protected ArrayList<String> usersetor = new ArrayList<>();
    protected ArrayList<String> usertarik = new ArrayList<>();
    int jumlah_usercs = 0;
    int jumlah_usersetor = 0;
    int jumlah_usertarik = 0;

    protected String demiMasa() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

    protected String customerservice(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sugeng Rawuh ing Customer Service BRI :) ");
        System.out.println("Ketik Jeneng : ");
        String jeneng = scanner.nextLine();
        String waktu = demiMasa();
        System.out.println("Sampeyan Sampun Terdaftar");
        jumlah_usercs++;
        System.out.println("Pencet Enter");
        scanner.nextLine();
        String customercall = "Sdr " + jeneng + " NO.A" + jumlah_usercs + " Ing Cutomer Service No.1 pada " + waktu;
        System.out.println(customercall + " Monggo teng Customer Service");
        usercs.add(jeneng);
        return customercall;
    }


    protected String setortunai() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sugeng Rawuh ing layanan Setor Tunai BRI");
        System.out.println("Ketik Jeneng : ");
        String jeneng = scanner.nextLine();
        jumlah_usersetor++;
        String noSetor = "Setor Tunai No.B " + jumlah_usersetor + " Ing Teller 1";
        String current_time = demiMasa();
        usersetor.add(noSetor);
        System.out.println("Sampeyan Sampun Terdaftar");
        System.out.println(noSetor + "\npada " + current_time);
        System.out.println("Pencet Enter");
        scanner.nextLine();
        System.out.println("Mongoo Mang Isi Formulir : ");
        System.out.print("Jeneng Owner Rekening : ");
        String namaPemilik = scanner.nextLine();
        System.out.print("No Rekening : ");
        String noRekening = scanner.nextLine();
        System.out.print("Nominal : Rp ");
        String nominal = scanner.nextLine();
        System.out.println("Pencet Enter");
        System.out.println(noSetor + " Sampeyan Terdaftar");
        System.out.println("Matur Sembah Nuwun");
        System.out.println("Pidak Enter");

        return namaPemilik;
    }
    public void tarikTunai() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sugeng Rawuh ing layanan Tarik Tunai BRI :*");
        jumlah_usertarik++;
        String noTarik = "Tarik Tunai No.C " + jumlah_usertarik + " di Teller 2";
        String current_time = demiMasa();
        usertarik.add(noTarik);
        System.out.println("Sampeyan Sampun Terdaftar");
        System.out.println(noTarik + "\npada " + current_time);
        System.out.println("Pidak Enter Kanggo Nutukno");
        scanner.nextLine();
        System.out.println("Monggo , Mang Isi Formulir  :");
        System.out.print("Jeneng Owner Rekening : ");
        String namaPemilik = scanner.nextLine();
        System.out.print("No Rekening : ");
        String noRekening = scanner.nextLine();
        System.out.print("Nominal : Rp ");
        String nominal = scanner.nextLine();
        System.out.println("Pidak Enter");
        System.out.println(noTarik + " Sampeyan sampun Terdaftar");
        System.out.println("Terima Kasih");
    }
}

public class Main {
    public static void main(String[] args) {
        User bri = new User();
        System.out.println("========== SUGENG RAWUH ING BRI , MENIR ==========");
        System.out.println("kuat dilakoni, rakuat utang bri");

        while (true) {
            System.out.println("\nMenu : ");
            System.out.println("1. Customer Service");
            System.out.println("2. Setor & Tarik Tunai");
            System.out.println("3. Keluar");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan Pilihan : ");
            String ch = scanner.nextLine();

            if (ch.equals("1")) {
                bri.customerservice();
            } else if (ch.equals("2")) {
                System.out.println("Masukkan Pilihan :");
                System.out.println("1. Setor Tunai");
                System.out.println("2. Tarik Tunai");
                System.out.print("Masukkan Pilihan : ");
                ch = scanner.nextLine();

                if (ch.equals("1")) {
                    bri.setortunai();
                } else if (ch.equals("2")) {
                    bri.tarikTunai();
                } else {
                    System.out.println("Pilihan Tidak Valid");
                }
            } else if (ch.equals("3")) {
                System.out.println("Sampai Jumpa");
                break;
            } else {
                System.out.println("Pilihan Tidak Valid");
            }
        }
    }
}



