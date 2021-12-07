package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Harimau;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Kupu;
import simple.example.hewanpedia.model.Singa;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Harimau> initDataUlar(Context ctx) {
        List<Harimau> harimaus = new ArrayList<>();
        harimaus.add(new Harimau("Harimau Siberia", "Siberia",
                "Disebut juga Harimau Amur. Selain di siberia Mereka juga Hidup di tingkok Dan Korut", R.drawable.siberia));
        harimaus.add(new Harimau("Harimau India", "India",
                "Harimau India juga disebut sebagai harimau Bengal yang terancam punah karena perburuan ", R.drawable.india));
        harimaus.add(new Harimau("Harimau Cina Selatan", "Cina selatan",
                "Harimau ini termasuk dalam subspesies harimau terkecil kedua didunia", R.drawable.harimaucinaselatan));
        harimaus.add(new Harimau("Harimau Indocina ", "Thailadn,vietnam, dan kawasan asia tenggara",
                "harimau yang hidup dikawasna asi tenggara ini juga terdapat di tiongkok selatan ", R.drawable.indocian));
        harimaus.add(new Harimau("Harimau Malaya", "Semenanjung Malaya",
                "merekaduku dikelompokkan sebagai hariumau indocina namun tes DNA pada 2004 menunjukkan mereka subspesies yang berbeda", R.drawable.malaya));
        harimaus.add(new Harimau("Harimau Sumatra", "Sumatra",
                "merupakan subspesia paling kecil yang berkisaran 2,4 meter dan memiliki bulu yang gelap ", R.drawable.sumtra));

        return harimaus;
    }

    private static List<Kupu> initDataIkan(Context ctx) {
        List<Kupu> kupus = new ArrayList<>();
        kupus.add(new Kupu("bidadari","sulawesi",
                "kupu-kupu raja adalah jenis kupu-kupu yang termasukke dalam famili danaidae", R.drawable.kupubidadari));
        kupus.add(new Kupu("raja melayu", "Asia tenggara",
                "kupu jenis ini merupakan kupu-kupu yang tersebar diasia tenggara", R.drawable.rajakalimantan));
        kupus.add(new Kupu("trogon", "Sumatra",
                "Merupakan  jenis kupu dari ordo lepidoptera. endemik regional. sebarannya hanay dipulau kalimantan", R.drawable.rajamiranda));
        kupus.add(new Kupu("kaiser-i-hind","India",
                "nama umum scara harfiah berarti(kaisar india). kaiser i handa banyak dicari oleh para kolektor Kupu-Kupu karena keindahan dan kelangkaannya", R.drawable.kaisarihand));
        kupus.add(new Kupu("raja miranda","sumatra",
                "raja miranda merupakan spesies kupu-kupu besar yang dosebut dengan Common Birdwing", R.drawable.rajamiranda));
        kupus.add(new Kupu("rajakalimantan","kalimantan",
                "roides cuneifera adalah kupu-kupu yang masuk dalam kelompok kupu-kupu ekor layang-layang yang ditemukan di Thailand, semenanjung malaya, sumatra, jawa dan kalimantan", R.drawable.rajakalimantan));

        return kupus;
    }

    private static List<Singa>initDataBurung(Context ctx) {
        List<Singa> singas = new ArrayList<>();
        singas.add(new Singa("Singa Katanga", "Afrika",
                "Singa ketanga termasuk singa besar dengan berat bisa mencapai 280 kilogram", R.drawable.katanga));
        singas.add(new Singa("Singa Kongo", "Kongo ",
                "memiliki panjang sekitar 2,5 meter dan berat 150kg", R.drawable.kongo));
        singas.add(new Singa("Singa Transvaal", "Afrika Selatan",
                "singa afrika ini adalah variates dari bagian selatan afrika dan dianggap masih saudara dengan singa ketanga ", R.drawable.transsval1));
        singas.add(new Singa("Singa Barbary", "Afrika",
                "Merupakan singa yang punah sekirat 1942, namun subspesiesmen dapat dilihat di kebun binatang", R.drawable.barbary));
        singas.add(new Singa("Singa Afrika Timur", "Afrika Timur",
                "memiliki erat sekitar 150 sampai 200kg dan oejantan memiliki surai lebih gelap", R.drawable.afrikatimur));
        singas.add(new Singa("Singa Asia", "india",
                "merupakan satwa asli india dan juga terncam punah karena kurangnya habitat mereka ", R.drawable.asia));

        return singas;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataUlar(ctx));
        hewans.addAll(initDataIkan(ctx));
        hewans.addAll(initDataBurung(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
