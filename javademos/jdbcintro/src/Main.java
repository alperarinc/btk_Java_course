import java.sql.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws SQLException {
        selectQueryDemo();
        insertData();
        updateData();
        deleteData();


    }
    public static void deleteData() throws SQLException{
        Connection connection = null;
        dbHelper helper = new dbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;


        try {
            connection = helper.getConnetion();
            System.out.println("Bağlantı başarılı");
            String sql = "delete from city where id = ?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1, 4089);
            int result = statement.executeUpdate();
            System.out.println(result + " Kayıt Başarıyla Silindi");

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
            System.out.println("Bağlantı kapatıldı");
        }
    }

    public static void updateData() throws SQLException {
        Connection connection = null;
        dbHelper helper = new dbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;


        try {
            connection = helper.getConnetion();
            System.out.println("Bağlantı başarılı");
            String sql = "update city set population = 90000,district = 'Düzceee' where id=?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1, 4082);
            int result = statement.executeUpdate();
            System.out.println(result + " Kayıt Başarıyla Güncellendi");

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
            System.out.println("Bağlantı kapatıldı");
        }
    }

    public static void selectQueryDemo() throws SQLException {
        Connection connection = null;
        dbHelper helper = new dbHelper();
        Statement statement = null;
        ResultSet resultSet;
        ArrayList<Country> countries = new ArrayList<Country>();

        try {
            connection = helper.getConnetion();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select Code, Name, Continent, Region from country");
            System.out.println("Bağlantı başarılı");
            while (resultSet.next()) {
                countries.add(new Country(resultSet.getString("Code"), resultSet.getString("Name"), resultSet.getString("Continent"), resultSet.getString("Region")));
            }


        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            connection.close();
            System.out.println(countries.size() + " Kayıt Başarı ile sorgulandı");
            System.out.println("Bağlantı kapatıldı");
        }


    }

    public static void insertData() throws SQLException {
        Connection connection = null;
        dbHelper helper = new dbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;


        try {
            connection = helper.getConnetion();
            System.out.println("Bağlantı başarılı");
            String sql = "Insert into city (Name, CountryCode, District, Population) values (?,?,?,?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1, "Düzce");
            statement.setString(2, "TUR");
            statement.setString(3, "Turkey");
            statement.setInt(4, 80000);
            int result = statement.executeUpdate();
            System.out.println(result + " Kayıt Başarıyla Eklendi");

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
            System.out.println("Bağlantı kapatıldı");
        }
    }
}


