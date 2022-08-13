package co.cmeneses.reto4.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtilities {
  private static final String UBICACION_BD = "D:\\MINTIC\\UTP\\CICLO2\\PROGRAMACION\\UNIDAD 5\\Reto5\\ProyectosConstruccion.db";

  public static Connection getConnection() throws SQLException {
    String url = "jdbc:sqlite:" + UBICACION_BD;
    return DriverManager.getConnection( url );
  }
}
