import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLException;
public class DAO_Implementation implements DAOInterface{

    public Connection con3;

    public DAO_Implementation(Connection con3) throws SQLException {
        this.con3 = con3;
    }

    @Override
    public void add(Category cat) throws  ClassNotFoundException, SQLException {
        String quer1 = "INSERT INTO Category VALUES (?, ?)";
        PreparedStatement query = con3.connect().prepareStatement(quer1);

        query.setString(1, cat.getCatcode());
        query.setString(2, cat.getCatdesc());

        query.executeUpdate();
        System.out.println("One record added");
    }
    @Override
    public Category edit(Category cat, String ccat) throws SQLException, ClassNotFoundException{
        return null;
    }
    @Override
    public void delete(String catcode) throws SQLException{

    }
    @Override
    public void display() throws ClassNotFoundException, SQLException{

    }

    @Override
    public Category search(String catcode) throws SQLException, ClassNotFoundException {
        String quer1 = "Select * from category where catcode = ?";
        PreparedStatement query = con3.connect().prepareStatement(quer1, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        query.setString(1, catcode);
        ResultSet rs = query.executeQuery();

        if (!rs.first()){
            System.out.println("Record not existing");
            return  null;
        }

        Category obj1

        return null;
    }


}
