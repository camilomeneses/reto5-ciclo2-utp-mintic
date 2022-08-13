package co.cmeneses.reto4.models.dto;

import co.cmeneses.reto4.models.dao.Consulta2DAO;

import java.sql.ResultSet;
import java.util.ArrayList;

public class Consulta2DTO {
  public static ArrayList<String[]> valores() {
    ArrayList<String[]> salida_dto = new ArrayList<>();
    try {
      ResultSet rs = Consulta2DAO.Consulta();
      while (rs.next()) {
        //ID_Proyecto, Constructora, Numero_Habitaciones,Ciudad
        String ID = String.valueOf(rs.getInt("ID_Proyecto"));
        String constructora = rs.getString("Constructora");
        String nh = rs.getString("Numero_Habitaciones");
        String ciudad = rs.getString("Ciudad");
        salida_dto.add(new String[]{ID, constructora, nh, ciudad});
      }
    } catch (Exception e) {
      // handle exception
      System.out.println(e);
    }
    return salida_dto;
  }
}
