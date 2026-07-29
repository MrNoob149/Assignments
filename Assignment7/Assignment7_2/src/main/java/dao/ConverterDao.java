package dao;

import java.sql.*;
import java.util.*;
import model.Converter;
import datasource.ConverterDatasource;

public class ConverterDao {
    public List<Converter> getAllCurrencies() {
        Connection conn = ConverterDatasource.getConnection();
        String sql = "SELECT names, converted_to, exchanged_rate FROM currency";
        List<Converter> currency = new ArrayList<Converter>();

        try {
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(sql);

            while (rs.next()) {
                String names = rs.getString(1);
                String converted_to = rs.getString(2);
                double exchanged_rate = rs.getDouble(3);
                Converter con = new Converter(names, converted_to, exchanged_rate);
                currency.add(con);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return currency;
    }

    public double getExchangedRate(String Curcode) {
        Connection conn = ConverterDatasource.getConnection();
        String sql = "SELECT exchanged_rate FROM currency WHERE converted_to = ?";



        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, Curcode);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getDouble("exchanged_rate");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }

    public void persist(Converter con) {
        Connection conn = ConverterDatasource.getConnection();
        String sql = "INSERT INTO currency (names, converted_to, exchanged_rate) VALUES (?, ?, ?)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, con.getNames());
            ps.setString(2, con.getConverted_to());
            ps.setDouble(3, con.getexchanged_rate());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


