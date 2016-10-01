package model;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by android on 1.10.16..
 */
@DatabaseTable(tableName = "avion")
public class Avion {

    public static final String POLJE_OZNAKA="oznaka";
    public static final String POLJE_RASPON_KRILA="raspon_krila";

    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField(columnName = POLJE_OZNAKA)
    private String oznaka;
    @DatabaseField(columnName = POLJE_RASPON_KRILA)
    private int rasponKrila;

    @ForeignCollectionField(foreignFieldName = "avion")
    private ForeignCollection<Roba> robe;

    private Boolean spreman = true;

    public Avion(){

    }

    public Avion(String oznaka, int rasponKrila) {
        this.oznaka = oznaka;
        this.rasponKrila = rasponKrila;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOznaka() {
        return oznaka;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }

    public int getRasponKrila() {
        return rasponKrila;
    }

    public void setRasponKrila(int rasponKrila) {
        this.rasponKrila = rasponKrila;
    }

    public ForeignCollection<Roba> getRobe() {
        return robe;
    }

    public void setRobe(ForeignCollection<Roba> robe) {
        this.robe = robe;
    }

    public Boolean isSpreman() {
        return spreman;
    }

    public void setSpreman(Boolean spreman) {
        this.spreman = spreman;
    }

    @Override
    public String toString() {
        return "Avion{" +
                "id='" + id + '\'' +
                ", oznaka=" + oznaka +
                ", raspon krila=" + rasponKrila +
                '}';
    }
}


