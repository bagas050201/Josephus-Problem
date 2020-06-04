package Joseph_code;

//memanggil library input
import java.util.Scanner;

public class Main {

    public static void main(String [] args)
    {
    	//inisiasi input
        Scanner input = new Scanner(System.in);
        
        //menginisiasi tanda agar bisa melakukan loop
        String Kembali = "Y";
        
        try {
            System.out.println("Nama = Muhammad Bagas Pradana \nProdi = Ilmu Komputer 2018 \nNIM = 1313618015\nMata Kuliah = Desain dan Analisis Algoritma \n<<<<<<<Tugas Membuat Program Josephus Problem>>>>>>>>");
            System.out.println();
            
            while (Kembali.equalsIgnoreCase("Y")) {
                System.out.print("Masukan Nilai Josephusnya (number of people (n) ): ");
                int jumlah = input.nextInt();
                System.out.println();
                System.out.print("Masukan Nilai perhitungannya  (Counting step (k) ): ");
                int counting = input.nextInt();
                System.out.println();
                System.out.println("Nomor orang yang selamat dari Josephus Problem : " + Josephus_step(jumlah, counting));
                System.out.println();
                System.out.print("Apakah anda ingin mengulangi perhitungan Joseph Problemnya ? Y/T : ");//meminta user untuk memilih mau mengulang kembali atau tidak
                Kembali = input.next();
                System.out.println();
            }
        }
        finally//saat try dipanggil maka finally akan selalu dipanggil apapun yang terjadi (when the try is called then finally it will always be called whatever happens )
        {
            input.close();//tutup fungsi inputnya (close the input function)
        }
    }

    public static int Josephus_step(int i, int j)
    {

        if(i == 1)
        {
            return 1;
        }
        else
        {
            return (Josephus_step(i-1,j) + j-1) % i + 1;
        }
    }

}

