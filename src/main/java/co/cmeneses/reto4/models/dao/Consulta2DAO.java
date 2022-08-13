package co.cmeneses.reto4.models.dao;

import co.cmeneses.reto4.util.JDBCUtilities;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Consulta2DAO {
  public static ResultSet Consulta(){
    ResultSet rs=null;
    String csql="SELECT ID_Proyecto, Constructora, Numero_Habitaciones,Ciudad  FROM  Proyecto  WHERE Clasificacion=='Casa Campestre' AND Ciudad IN('Santa Marta', 'Cartagena', 'Barranquilla');";
    try {
      Connection conn= JDBCUtilities.getConnection();
      Statement stmt=conn.createStatement();
      rs=stmt.executeQuery(csql);

    } catch (Exception e) {
      //TODO: handle exception
      System.out.println(e);
    }
    return rs;
  }
}
