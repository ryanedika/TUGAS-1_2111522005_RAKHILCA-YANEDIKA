public class VirtualDemo {
    
    public static void main(String[] args) {
        Gaji s = new Gaji("Wahyu ", "KUBAR ", 3, 5000.00);//upcasting
        Pegawai e = new Gaji("Ini Nama ", "Samarinda ", 2, 2500.00);//polymorphism
        System.out.println("Memanggil mailCheck Berdasarkan Referensi Gaji --");

        s.mailCheck();
        System.out.println("\nMemanggil mailCheck Berdasarkan Referensi Pegawai--");
        e.mailCheck();
    }
}
    //output dari run program menghasilkan dua kali "menyusun pegawai", kenapa? 
    //karena "menyusun pegawai" itu terdapat di dalam public class Pegawai, 
    //dan supeclass pada public class Gaji adalah private, maka access proses pemanggilannya melalui public class Pegawai
    //Dan "menyusun pegawai" terdapat di dalam public class Pegawai 
    //dan pegawai tersebut memiliki object yang akan di-poli atau memiliki polymorphism di Main Class VirtualDemo
    //Gaji s dan Pegawai e merupakan polymorphism, sehingga secara proses pemanggilan sama dan akan menghasilkan hasil yang sama
    //Maka, ketika Gaji s dihapus atau ditiadakan dan method pegawai hanya dipanggil sekali
    //, output dari run program hanya akan menghasilkan satu "menyusun pegawai"