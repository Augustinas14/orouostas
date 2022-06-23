import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AirportDAO {
    public static final String DATABASE_NAME= "airport";
    public static void creat(Airport airport) {

        //Naujo uzraso sukurimo uzklausa
        String query = "INSERT INTO airport(id,biz_name,adress,city) VALUES(0,'kraken air','klaipedos pl 2','klaipeda');";
        //prisijungimas prie duomenu bazes
        String url = "jdbc:mysql://localhost:3306/" + DATABASE_NAME;
        try {
            //sukuremas prisijungimas prie duomenu bazes
            Connection connection = DriverManager.getConnection(url, "root", "");
            //uzklausos duomenu bazei paruosimas
            PreparedStatement preparedStatement= connection.prepareStatement(query);
            //uzklausos vygdymas
            preparedStatement.executeUpdate();//executeUpdate naudosim kai norime sukurti nauja yrasa /redaguoti esama yrasa/ir istrinti
            //esamu yrasu paieskai bus naudojemas "executeQuery"

            //uzdaromas prisijungimas prie duomenu bazes
            connection.close();
            preparedStatement.close();
            System.out.println("pavyko prisijungti prie duomenu bazes");
        } catch (SQLException e) {
            System.out.println("nepasiekema duomenu baze. Placiau:");
            e.printStackTrace();
        }


    }

}
