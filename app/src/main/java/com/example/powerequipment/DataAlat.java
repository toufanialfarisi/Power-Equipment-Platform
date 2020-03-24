package com.example.powerequipment;

import java.util.ArrayList;

public class DataAlat {

    private static String[] namaPeralatan = {
            "Transformator Daya",
            "Circuit Breaker (PMT)",
            "Disconnecting Switch (PMS)",
            "Lightning Arrester (LA)",
            "Kapasitor Shunt",
            "Overcurrent Relay",
            "Reaktor shunt",
            "Current Transformator (CT)",
            "Potentio Transformator (PT)",
            "Netral Ground Resistance (NGR)"
    };

    private static String[] fungsi = {
            "Menyalurkan tenaga atau daya listrik dari tegangan tinggi ke tegangan rendah atau sebaliknya.",
            "Membuka dan menutup arus listrik",
            "Memisahkan peralatan listrik dari peralatan lain atau instalasi lain yang bertegangan",
            "Melindungi peralatan dari lonjakan tegangan (Over voltage) akibat petir",
            "Memperbaiki faktor daya listrik",
            "Mendeteksi lonjakan arus lebih akibat gangguan hubung singkat pada instalasi listrik",
            "Membatasi arus gangguan",
            "Mengukur besaran arus pada peralatan bertegangan tinggi",
            "Mengukur besara tegangan pada peralatan bertegangan tinggi",
            "Melindungi dari gangguan yang mengalir dari sisi netral ke tanah"

    };

    private static String[] spesifikasi = {
            "50 MVA, 150/20 KV",
            "3150 A - 40 KA",
            "2000 A",
            "10 KA",
            "33 KV, 3334 KA, 50 Hz",
            "5A",
            "343 MVar",
            "2000/5 A",
            "154 / 0.11 KV",
            "500 ohm"
    };

    private static String[] prinsipKerja = {
            "Transformator atau Trafo ini bekerja berdasarkan prinsip Induksi Elektromagnet dan hanya dapat bekerja pada tegangan yang berarus bolak balik (AC).Transformator (Trafo) memegang peranan yang sangat penting dalam pendistribusian tenaga listrik. Transformator menaikan listrik yang berasal dari pembangkit listrik PLN hingga ratusan kilo Volt untuk di distribusikan, dan kemudian Transformator lainnya menurunkan tegangan listrik tersebut ke tegangan yang diperlukan oleh setiap rumah tangga maupun perkantoran yang pada umumnya menggunakan Tegangan AC 220Volt",
            "Sakelar PMT ini dapat digunakan untuk memutus arus sampai 10 kA dan pada rangkaian bertegangan sampai 500 kV. Pada saat kontak dipisahkan, busur api akan terjadi didalam minyak, sehingga minyak menguap dan menimbulkan gelembung gas yang menyelubungi busur api, karena panas yang ditimbulkan busur api, minyak mengalami dekomposisi dan menghasilkan gas hydrogen yang bersifat menghambat produksi pasangan ion. Gas yang timbul karena dekomposisi minyak menimbulkan tekanan terhadap minyak, sehingga minyak terdorong ke bawah melalui leher bilik. Di leher bilik, minyak ini melakukan kontak yang intim dengan busur api. Hal ini akan menimbulkan pendinginanbusur api,mendorong proses rekombinasi dan menjauhkan partikel bermuatan dari lintasan busur api.",
            "prinsip saklar biasa. saklar pemutus yang didesain tidak bias terbuka pada saat arus beban yang melewatinya masih ada. Biasanya disconnencting switch dipasang untuk mengisolasi peralatan – perlatan yang mungkin tersupply daya besar.",
            "membuang kelebihan tegangan listrik ke pembumian. misalnya transformator listrik dengan cara kerja lightning arrester adalah sama, dimana prinsip kerja arrester akan membuang kelebihan tegangan listrik ke pembumian. Dalam keadaan normal, arrester akan berfungsi sebagai isolator listrik. Prinsip kerja arrester katup atau cara kerja lightning arrester dapat dijelaskan secara sederhana demikian. Pada saat petir menyambar jaringan listrik, tegangan listrik akan melonjak besar.Hal ini membuat dua logam pada arrester akan bekerja saling terhubung dan menyalurkan arus listrik (sebagai konduktor). Namun fungsi konduktor ini tidak akan mengenai sistem kelistrikan yang ada karena salah satu kutub itu akan meneruskan ke tempat pembumian. Pembuatan tempat pembumian harus bagus dengan nilai tahanan yang kecil sehingga tidak mengganggu kinerja arrester. Dengan demikian adanya tegangan kejut atau surge tidak akan merusak peralatan listrik, dan dengan tanpa memutuskan arus listrik sedikitpun",
            "prinsip energy storage sementara dalam bentuk medan listrik. kapasitor terdiri atas plat-plat. Bila kedua pelat dihubungkan ke sumber tegangan DC atau tegangan searah (misalnya Baterai), Elektron “didorong” ke satu pelat oleh terminal negatif baterai, sementara elektron “ditarik” dari pelat lain oleh terminal positif baterai. Jika perbedaan muatan antara kedua pelat tersebut terlalu besar, maka akan terjadi percikan (spark) yang melompati celah diantara kedua pelat tersebut dan membuang muatan yang tersimpan (discharge). Untuk meningkatkan jumlah muatan pada pelat, bahan dielektrik yang berupa non-konduktif (isolator) ditempatkan diantara kedua pelat tersebut. Fungsi dielektrik tersebut dalam kapasitor adalah sebagai “pemblokir percikan” atau “spark blocker” yang bermanfaat untuk dapat meningkatkan kapasitas muatan kapasito",
            "pendeteksian lonjakan arus yang melewati standar. Prinsip kerja Over Current Relay ( OCR ) yang bekerjanya berdasarkan besaran arus lebih akibat adanya gangguan hubung singkat dan memberikan perintah trip ke PMT sesuai dengan karakteristik waktunya sehingga kerusakan alat akibat gangguan dapat dihindari",
            "prinsip energy storage sementara dalam bentuk medan magnet. reaktor terdiri atas lilitan besi. Perubahan arus listrik yang mengalir pada lilitan inti besi akan menghasilkan medan magnet disekitar kumparan tersebut sehingga, besi tersebut akan berubah menjadi magnet selama mendapat arus magnetik dari sumber daya baik berupa arus bolak balik (AC) maupun arus searah (DC).\n",
            "prinsip konversi arus tinggi ke rendah. Arus yang mengalir pada sistem distribusi tegangan menegah ataupun tegangan rendah berkisar ratusan hingga ribuan ampere. Oleh karena itu, belitan primer dari trafo arus terbuat dari batangan tembaga dengan dimensi yang relative besar agar mampu menahan arus yang mengalir secara terus-menerus disisi primer ataupun arus sesaat ketika terjadi kegagalan sistem. Karena belitan primer terbuat dari batang tembaga yang dimensinya cukup besar, maka impedansi disisi primer bisa dianggap tidak ada karena terlalu kecil dibandingkan impedansi sistem.",
            "prinsip konversi tegangan tinggi ke rendah. Prinsip kerja Trafo tegangan, kumparan primernya dihubungkan parallel dengan jaringan yang akan diukur tegangannya. Voltmeter atau kumparan tegangan wattmeter langsung dihubungkan pada sekundernya. Jadi rangkaian sekunder hampir pada kondisi open circuit. Besar arus primernya tergantung pada beban disisi sekunder. Rancangan trafo tegangan ini sama dengan trafo daya step-down tetapi dengan beban yang sangat ringan.\n",
            "pengontrolan arus gangguan ke tanah. Salah satu metoda pentanahan Trafo Tenaga adalah dengan menggunakan NGR. NGR adalah sebuah tahanan yang dipasang serial dengan neutral sekunder pada transformator sebelum terhubung ke ground/tanah. Tujuan dipasangnya NGR adalah untuk mengontrol besarnya arus gangguan yang mengalir dari sisi neutral ke tanah. Hal ini terkait dengan Pola pengamanan Trafo Tenaga disisi Sekunder (Sistem Distribusi)."
    };

    private static int[] photo = {
            R.drawable.trafo,
            R.drawable.ct,
            R.drawable.pms,
            R.drawable.la,
            R.drawable.cap,
            R.drawable.ocr,
            R.drawable.reactor,
            R.drawable.ct,
            R.drawable.pt,
            R.drawable.ngr
    };

    static ArrayList<DataController> getData(){
        ArrayList<DataController> list = new ArrayList<>();
        int dataSize = namaPeralatan.length;
        for (int index = 0; index < dataSize; index++){
            DataController data = new DataController();
            data.setNamaPeralatan(namaPeralatan[index]);
            data.setFungsi(fungsi[index]);
            data.setPrinsipKerja(prinsipKerja[index]);
            data.setSpesifikasi(spesifikasi[index]);
            data.setFoto(photo[index]);
            list.add(data);
        }
        return list;
    }


}
