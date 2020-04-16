package com.example.alumnihub

import java.util.ArrayList

class DataAnggota {
    object dataAnggota  {
        private val dataAnggotaNama = arrayOf(

            /*1*/ "Bara Satria Raharja",
            /*2*/ "Muhammad Faza",
            /*3*/ "Ilham Yusuf Alfiansyah",
            /*4*/ "Rendhika Devano Ramadhan",
            /*5*/ "Satria Yudhustira",
            /*6*/ "Tantyo Trimulya Sutedjo",
            /*7*/ "Helmi Setiabudi",
            /*8*/ "Fayza miriam Mahatma",
            /*9*/ "Daffa Yundra Widodo",
            /*10*/ "Reno Satria Dewangga"
        )


        private val dataAnggotaTTL = arrayOf(

            /*1*/ "31 Januari 2002",
            /*2*/ "23 Januari 2001",
            /*3*/ "21 Februari 2002",
            /*4*/ "31 Juli 2001",
            /*5*/ "21 November 2001",
            /*6*/ "17 Agustus 2002",
            /*7*/ "10 November 2001",
            /*8*/ "31 Mei 2002",
            /*9*/ "1 Januari 2002",
            /*10*/ "12 Oktober 2001"

        )

        private val dataAnggotaKelas = arrayOf(
            /*1*/ "XII Mipa 4",
            /*2*/ "XII IBB",
            /*3*/ "XII Mipa 2",
            /*4*/ "XII Ips 2",
            /*5*/ "XII Ips 1",
            /*6*/ "XII Mipa 7",
            /*7*/ "XII IBB",
            /*8*/ "XII Ips 5",
            /*9*/ "XII Mipa 4",
            /*10*/ "XII Ipa 1"
        )

        private val dataAnggotaTelp = arrayOf(
            /*1*/ "0852171581223",
            /*2*/ "0851212131233",
            /*3*/ "0812638126317",
            /*4*/ "0862176318236",
            /*5*/ "0885317263532",
            /*6*/ "0812980534058",
            /*7*/ "0893162312367",
            /*8*/ "0896372856747",
            /*9*/ "0852735153217",
            /*10*/ "0877867598672"
        )

        private val dataAnggotaIG = arrayOf(
            /*1*/ "barabere_",
            /*2*/ "barbershop",
            /*3*/ "ilhamasek",
            /*4*/ "sepedabutut",
            /*5*/ "motorbekas",
            /*6*/ "npmrmas",
            /*7*/ "ambyarakumas",
            /*8*/ "dakigunung",
            /*9*/ "upinipin",
            /*10*/ "maeleeee"
        )

        private val dataAnggotaAlamat = arrayOf(
            /*1*/ "Jl Ketintang Baru Tenggara VII",
            /*2*/ "JL Jonggol No 123",
            /*3*/ "Jl Kuningan Pasar Lama 21B",
            /*4*/ "Griya Mega Buram 12A",
            /*5*/ "Mutiara Laut Selatan 23F",
            /*6*/ "Jl Surabaya-Madura KM234",
            /*7*/ "Jl Condet 44E Timur Laut",
            /*8*/ "Jl Jati Negara, Kuningan",
            /*9*/ "Griya Asri Tenan Blok A5",
            /*10*/ "Griya Mulia Asri Blok A4"
        )

        private val dataAnggotaQuote = arrayOf(
            /*1*/ "Yang hari ini kamu remehkan,suatu hari akan jadi yang paling kamu sesalkan dan mungkin pesan ini.",
            /*2*/ "loss gak rewel!!",
            /*3*/ "sleep is one way to reach your dreams,but to make it real you need to wake up",
            /*4*/ "open you mind before you open your mouth",
            /*5*/ "sekolah saat SMA itu kayak naik sepeda pancal gak ada rantainya,LOSS",
            /*6*/ "none of my assignments are done not i sure am",
            /*7*/ "tuhan bersama orang-orang yang santuy",
            /*8*/ "repetation is the mother of all success",
            /*9*/ "hidup hanya sekali dan mari nikmati ,dont worry be happy",
            /*10*/ "life is better when you're laughing"
        )

        private val dataAnggotaPhoto = intArrayOf(
            /*1*/ R.drawable.photo_1,
            /*2*/ R.drawable.photo_2,
            /*3*/ R.drawable.photo_3,
            /*4*/ R.drawable.photo_4,
            /*5*/ R.drawable.photo_5,
            /*6*/ R.drawable.photo_6,
            /*7*/ R.drawable.photo_7,
            /*8*/ R.drawable.photo_8,
            /*9*/ R.drawable.photo_9,
            /*10*/ R.drawable.photo_10
        )

        val listData : ArrayList<item_anggota.Anggota>
        get() {
            val List = arrayListOf<item_anggota.Anggota>()
                for (position in dataAnggotaNama.indices){
                    val ANGGOTA = item_anggota.Anggota()
                    ANGGOTA.Nama = dataAnggotaNama[position]
                    ANGGOTA.Kelas = dataAnggotaKelas[position]
                    ANGGOTA.Quote = dataAnggotaQuote[position]
                    ANGGOTA.Photo = dataAnggotaPhoto[position]
                    ANGGOTA.TTL = dataAnggotaTTL[position]
                    ANGGOTA.Telp = dataAnggotaTelp[position]
                    ANGGOTA.Alamat = dataAnggotaAlamat[position]
                    ANGGOTA.IG = dataAnggotaIG[position]
                    List.add(ANGGOTA)
                }
            return List
        }

    }
}