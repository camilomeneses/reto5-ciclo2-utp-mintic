package co.cmeneses.reto4.models.dao;

import co.cmeneses.reto4.util.JDBCUtilities;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Consulta3DAO {
  public static ResultSet Consulta(){
    ResultSet rs=null;
    String csql="SELECT ID_Compra, Constructora, Banco_Vinculado from Compra  JOIN Proyecto USING(ID_Proyecto) WHERE Proveedor=='Homecenter' AND Ciudad=='Salento';";
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
