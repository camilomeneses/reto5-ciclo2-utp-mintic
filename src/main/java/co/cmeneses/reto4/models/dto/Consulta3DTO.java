package co.cmeneses.reto4.models.dto;

import co.cmeneses.reto4.models.dao.Consulta3DAO;

import java.sql.ResultSet;
import java.util.ArrayList;

public class Consulta3DTO {
  public static ArrayList<String[]> valores() {
    ArrayList<String[]> salida_dto = new ArrayList<>();
    try {
      ResultSet rs = Consulta3DAO.Consulta();
      while (rs.next()) {
        //ID_Compra, Constructora, Banco_Vinculado
        String ID = String.valueOf(rs.getInt("ID_Compra"));
        String constructora = rs.getString("Constructora");
        String banco = rs.getString("Banco_Vinculado");
        salida_dto.add(new String[]{ID, constructora, banco});
      }
    } catch (Exception e) {
      // handle exception
      System.out.println(e);
    }
    return salida_dto;
  }
}
