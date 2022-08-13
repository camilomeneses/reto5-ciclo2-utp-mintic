package co.cmeneses.reto4.models.dao;

import co.cmeneses.reto4.util.JDBCUtilities;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Consulta1DAO {
  public static ResultSet Consulta(){
    ResultSet rs=null;
    String csql="SELECT ID_Lider, Nombre, Primer_Apellido, Ciudad_Residencia  FROM Lider ORDER BY Ciudad_Residencia;";
    try {
      Connection conn= JDBCUtilities.getConnection();
      Statement stmt=conn.createStatement();
      rs=stmt.executeQuery(csql);

    } catch (Exception e) {
      // handle exception
      System.out.println(e);
    }
    return rs;
  }
}
