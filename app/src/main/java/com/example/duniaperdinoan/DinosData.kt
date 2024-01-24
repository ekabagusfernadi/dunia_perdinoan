package com.example.duniaperdinoan

object DinosData {
    private val dinoNames = arrayOf("Tyrannosaurus Rex",
        "Brontosaurus",
        "Stegosaurus",
        "Triceratops",
        "Velociraptor",
        "Dilophosaurus",
        "Spinosaurus",
        "Corythosaurus",
        "Pterodactyl",
        "Ankylosaurus",
        "Megalosaurus",
        "Edmontosaurus",
        "Liopleurodon",
        "Ultrasaurus")

    private val dinoDetails = arrayOf("Tyrannosaurus Rex yang lebih terkenal sebagai T-Rex. Dinosaurus satu ini tingginya mencapai 4-5 meter dengan berat yang konon menyentuh 1 ton. T-Rex tergolong karnivora, makanya ia memiliki rahang besar yang penuh dengan gigi tajam. Fungsi utamanya untuk mencabik mangsa dengan mudah saat sedang berburu.",
        "Pernah melihat dinosaurus besar dengan leher panjang seperti jerapah? Memiliki nama Brontosaurus, spesies satu ini ukurannya konon lebih besar dari T-Rex. Lehernya saja bisa mencapai ketinggian 27 meter dengan berat keseluruhan hingga 38 ton. Terlepas dari tubuhnya yang besar dan terlihat menyeramkan, dinosaurus satu ini ternyata masuk golongan hewan herbivora, lo.",
        "Tampilannya unik dengan garis lempeng duri di bagian punggung. Stegosaurus dewasa memiliki ukuran yang mencapai 9 meter dengan berat hingga 3 ton. Meski tubuhnya besar, konon ia memiliki otak yang sangat kecil.",
        "Macam-macam dinosaurus berikutnya bernama Triceratops ini sekilas tampak seperti badak. Hanya saja, ia memiliki dua tanduk panjang atau cula di bagian kepala. Lalu, kupingnya tampak lebar dengan ujung yang runcing menyerupai duri.",
        "Bentuk Velociraptor mirip T-Rex, tetapi tubuhnya lebih kurus dan kecil. Oleh sebab itu, pergerakannya lincah dan gesit saat sedang berburu. Mangsa utama Velociraptor adalah mamalia kecil, reptil kecil, serta berbagai jenis serangga.",
        "Dilophosaurus. Ia memiliki ciri fisik yang unik yakni ada sirip di bagian kepala yang bisa menutup dan membuka. Tidak hanya itu, sebagai karnivora ia memiliki rahang yang kuat untuk melahap mangsanya.",
        "Ada juga dinosaurus yang bernama Spinosaurus. Hewan satu ini memiliki kemampuan untuk berenang di dalam air. Oleh sebab itu, mangsa utamanya pun adalah ikan air laut atau hewan laut lainnya.",
        "Ada Corythosaurus yang bentuk mulutnya mirip paruh bebek. Lalu, di bagian kepalanya ada jengger yang mirip seperti jambul ayam. Jenis dinosaurus satu ini memiliki tinggi yang bisa mencapai 9 meter dengan berat 3-4 ton.",
        "Dinosaurus satu ini dikenal juga sebagai Pterosaurus yang artinya kadal bersayap. Seperti namanya, Pterodactyl memang memiliki sayap besar yang memberinya kemampuan untuk terbang. Hewan purba satu ini termasuk paling misterius karena tidak ada yang tahu ia dahulu hidup di mana saja.",
        "Memiliki tubuh yang panjangnya hingga 9 meter, struktur tubuh Ankylosaurus mirip seperti kura-kura. Pasalnya, di bagian punggung ia memiliki cangkang keras yang berfungsi sebagai perisai. Hanya saja, ia tidak bisa masuk ke dalam cangkang tersebut seperti kura-kura.",
        "Jenis dinosaurus ini konon merupakan yang pertama ditemukan oleh para peneliti. Ukuran tubuhnya besar dengan tinggi mencapai 3-4 meter dan berat 3,5 ton. Sekilas tampilannya mirip T-Rex, hanya saja rahang dan giginya cenderung lebih tumpul.",
        "Ada juga spesies Edmontosaurus yang tergolong hewan purba herbivora. Konon, ia hidup di area barat Amerika Utara pada zaman kapur akhir. Menariknya, hewan ini memiliki kaki depan yang lebih kecil dari kaki belakang. Oleh sebab itu, ketika berjalan biasanya ia hanya menggunakan dua kaki belakang saja.",
        "Ada juga dinosaurus bernama Liopleurodon yang tergolong reptil laut. Ia memiliki leher pendek dan hidup sekitar 155-160 juta tahun lalu. Bentuk kepalanya memanjang dengan leher pendek dan sirip panjang untuk berenang.",
        "Bentuk tubuh Ultrasaurus mirip seperti Brontosaurus. Hanya saja, bentuk tubuh Ultrasaurus cenderung lebih ramping atau kurus. Ultrasaurus ditemukan pertama kali di Korea Selatan oleh arkeolog bernama Haang Mook Kim.")

    private val dinosImages = intArrayOf(R.drawable.tyrannosaurus_rex,
        R.drawable.brontosaurus,
        R.drawable.stegosaurus,
        R.drawable.triceratops,
        R.drawable.velociraptor,
        R.drawable.dilophosaurus,
        R.drawable.spinosaurus,
        R.drawable.corythosaurus,
        R.drawable.pterodactyl,
        R.drawable.ankylosaurus,
        R.drawable.megalosaurus,
        R.drawable.edmontosaurus,
        R.drawable.liopleurodon,
        R.drawable.ultrasaurus)

    val listData: ArrayList<Dino>
        get() {
            val list = arrayListOf<Dino>()
            for (position in dinoNames.indices) {
                val dino = Dino()
                dino.name = dinoNames[position]
                dino.detail = dinoDetails[position]
                dino.photo = dinosImages[position]
                list.add(dino)
            }
            return list
        }
}