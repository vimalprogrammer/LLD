import java.sql.SQLException;

public class Client {

    public static void main(String[] args) throws SQLException {

        System.out.println("A");

        try {
            Calculator.doSomething(4);
        } catch (Exception e) {
            System.out.println();
        }
        finally {
            System.out.println("D");
        }
    }
}
