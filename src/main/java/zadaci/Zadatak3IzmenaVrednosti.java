package zadaci;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import model.Avion;
import model.Roba;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by android on 1.10.16..
 */
public class Zadatak3IzmenaVrednosti {
    static Dao<Avion,Integer> avionDao;
    static Dao<Roba,Integer> robaDao;

    public static void main(String[] args) {
        ConnectionSource connectionSource = null;

        try {
            connectionSource = new JdbcConnectionSource("jdbc:sqlite:avionRoba.db");
            avionDao= DaoManager.createDao(connectionSource, Avion.class);
            robaDao=DaoManager.createDao(connectionSource, Roba.class);

            List<Roba> robe=robaDao.queryForAll();
            for(Roba r:robe)
                System.out.println("r = " + r);

            robe=robaDao.queryForEq(Roba.POLJE_OPIS,"Plasticna stolica");
            Roba zaIzmenu=robe.get(0);
            zaIzmenu.setOpis("Drvena stolica");
            robaDao.update(zaIzmenu);

            robe=robaDao.queryForAll();
            for(Roba r:robe)
                System.out.println("r = " + r);


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
