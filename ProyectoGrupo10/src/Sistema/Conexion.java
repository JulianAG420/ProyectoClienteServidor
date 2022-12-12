/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Roberto
 */
public class Conexion {

    private static DataOutputStream dataOutputStream = null;
    private static DataInputStream dataInputStream = null;
    private static final String URL = "jdbc:mysql://localhost:3306/clienteservidor10";
    private static final String USERNAME = "root";
    private static final String PASS = "Roberto240103";
    PreparedStatement ps;
    ResultSet rs;

    public static Connection getConnection() {

        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection(URL, USERNAME, PASS);

        } catch (Exception e) {
            System.out.println(e);
        }

        return conn;
    }

    public static String agregarPlanilla(Colaborador colaborador, float total, String id) {
        int resultado = 0;
        String msg = "";
        Connection conn = getConnection();

        try {

            String sql = "INSERT INTO planilla  Values ('" + id + "','" + colaborador.getCedula() + "','" + colaborador.getNombre() + "','"
                    + colaborador.getSalarioXhoras() + "','" + colaborador.getMes() + "','" + colaborador.getAnio() + "','"
                    + colaborador.getHoras() + "','" + total + "')";

            Statement st = conn.createStatement();
            resultado = st.executeUpdate(sql);

            if (resultado > 0) {
                msg = "correcto";
                return msg;
            } else {
                msg = "error almacenar";
                return msg;
            }

        } catch (Exception e) {
            msg = "duplicado";
            return msg;
        }

    }

    public static String contador() {
        Connection conn = getConnection();
        String msg;
        try {

            String sql = "SELECT COUNT(cedula) AS cuenta FROM planilla;";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            rs.next();
            int count = rs.getInt("cuenta");
            rs.close();

            msg = Integer.toString(count);

            return msg;

        } catch (Exception e) {
            msg = "error base";
            return msg;
        }
    }

    public static Lista listaPlanilla() {

        String msg;
        Connection conn = getConnection();
        Lista lista = new Lista();

        try {
            String sql = "SELECT * FROM clienteservidor10.planilla;";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                Planilla planilla = new Planilla();

                planilla.setId(rs.getString("idhistorial"));
                planilla.setCedula(rs.getInt("cedula"));
                planilla.setNombre(rs.getString("nombre"));
                planilla.setSalarioXhoras(rs.getFloat("salarioxhora"));
                planilla.setMes(rs.getInt("mes"));
                planilla.setAnio(rs.getInt("anio"));
                planilla.setHoras(rs.getDouble("horastrabajadas"));
                planilla.setTotal(rs.getFloat("total"));

                lista.insertar(planilla);

            }
            msg = "correcto";

        } catch (Exception e) {
            msg = "error base";
        }
        return lista;
    }

}
