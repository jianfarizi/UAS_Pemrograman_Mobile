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
        harimaus.add(new Harimau (ctx.getString(R.string.siberia_nama),ctx.getString(R.string.siberia_asal),
                ctx.getString(R.string.siberia_deskripsi), R.drawable.siberia));
        harimaus.add(new Harimau(ctx.getString(R.string.india_nama),ctx.getString(R.string.india_asal),
                ctx.getString(R.string.india_deskripsi), R.drawable.india));
        harimaus.add(new Harimau(ctx.getString(R.string.cina_nama),ctx.getString(R.string.cina_asal),
                ctx.getString(R.string.cina_deskripsi), R.drawable.harimaucinaselatan));
        harimaus.add(new Harimau(ctx.getString(R.string.indocina_nama),ctx.getString(R.string.indocina_asal),
                ctx.getString(R.string.indocina_deskripsi), R.drawable.indocian));
        harimaus.add(new Harimau(ctx.getString(R.string.malaya_nama),ctx.getString(R.string.malaya_asal),
                ctx.getString(R.string.malaya_deskripsi), R.drawable.malaya));
        harimaus.add(new Harimau(ctx.getString(R.string.sumatra_nama),ctx.getString(R.string.sumatra_asal),
                 ctx.getString(R.string.sumatra_deskripsi), R.drawable.sumtra));

        return harimaus;
    }

    private static List<Kupu> initDataIkan(Context ctx) {
        List<Kupu> kupus = new ArrayList<>();
        kupus.add(new Kupu(ctx.getString(R.string.bidadari_nama),ctx.getString(R.string.bidadari_asal),
                ctx.getString(R.string.bidadari_deskripsi), R.drawable.kupubidadari));
        kupus.add(new Kupu(ctx.getString(R.string.melayu_nama),ctx.getString(R.string.melayu_asal),
                ctx.getString(R.string.melayu_deskripsi), R.drawable.rajakalimantan));
        kupus.add(new Kupu(ctx.getString(R.string.trogon_nama),ctx.getString(R.string.trogon_asal),
                ctx.getString(R.string.trogon_deskripsi), R.drawable.rajamiranda));
        kupus.add(new Kupu(ctx.getString(R.string.hind_nama),ctx.getString(R.string.hind_asal),
                ctx.getString(R.string.hind_deskripsi), R.drawable.kaisarihand));
        kupus.add(new Kupu(ctx.getString(R.string.miranda_nama),ctx.getString(R.string.miranda_asal),
                ctx.getString(R.string.mirand_deskripsi), R.drawable.rajamiranda));
        kupus.add(new Kupu(ctx.getString(R.string.kalimantan_nama),ctx.getString(R.string.kalimantan_asal),
                ctx.getString(R.string.kalimantan_deskripsi), R.drawable.rajakalimantan));

        return kupus;
    }

    private static List<Singa>initDataBurung(Context ctx) {
        List<Singa> singas = new ArrayList<>();
        singas.add(new Singa(ctx.getString(R.string.katanga_nama),ctx.getString(R.string.katanga_asal),
                ctx.getString(R.string.katanga_deskripsi), R.drawable.katanga));
        singas.add(new Singa(ctx.getString(R.string.kongo_nama),ctx.getString(R.string.kongo_asal),
                ctx.getString(R.string.kongo_deskripsi), R.drawable.kongo));
        singas.add(new Singa(ctx.getString(R.string.transvaal_nama),ctx.getString(R.string.transvaal_asal),
                ctx.getString(R.string.transvaal_deskripsi), R.drawable.transsval1));
        singas.add(new Singa(ctx.getString(R.string.barbary_nama),ctx.getString(R.string.barbary_asal),
                ctx.getString(R.string.barbary_deskripsi), R.drawable.barbary));
        singas.add(new Singa(ctx.getString(R.string.afrikatimur_nama),ctx.getString(R.string.afrikatimur_asal),
                ctx.getString(R.string.afrikatimur_deskripsi), R.drawable.afrikatimur));
        singas.add(new Singa(ctx.getString(R.string.asia_nama),ctx.getString(R.string.asia_asal),
                ctx.getString(R.string.asia_deskripsi), R.drawable.asia));

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
