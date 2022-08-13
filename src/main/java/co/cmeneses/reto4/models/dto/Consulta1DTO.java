package co.cmeneses.reto4.models.dto;

import co.cmeneses.reto4.models.dao.Consulta1DAO;

import java.sql.ResultSet;
import java.util.ArrayList;

public class Consulta1DTO {
  public static ArrayList<String[]> valores() {
    ArrayList<String[]> salida_dto = new ArrayList<>();
    try {
      ResultSet rs = Consulta1DAO.Consulta();
      while (rs.next()) {
        // ID_Lider, Nombre, Primer_Apellido, Ciudad_Residencia
        String ID = String.valueOf( rs.getInt("ID_Lider"));
        String nombre = rs.getString("Nombre");
        String apellido = rs.getString("Primer_Apellido");
        String ciudad = rs.getString("Ciudad_Residencia");
        salida_dto.add(new String[]{ID, nombre, apellido, ciudad});
      }
    } catch (Exception e) {
      System.out.println(e);
    }
    return salida_dto;
  }
}
