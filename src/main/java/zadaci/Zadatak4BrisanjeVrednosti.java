package zadaci;


import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;

import java.sql.SQLException;

/**
 * Created by android on 1.10.16..
 */
public class Zadatak4BrisanjeVrednosti {
    public static void main(String[] args) {
        ConnectionSource connectionSource = null;

        try {
                connectionSource = new JdbcConnectionSource("jdbc:sqlite:avionRoba.db");
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
}