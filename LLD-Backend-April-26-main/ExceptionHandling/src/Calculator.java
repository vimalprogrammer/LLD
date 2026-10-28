import java.sql.SQLException;

public class Calculator {

    public static int divide(int a, int b) throws SQLException {
//        if(b==0) {
//            System.out.println("Division by 0 not allowed");
//            return -1;
//        }

        if(b==2) {
          throw new SQLException();
        }
        return a/b;
    }

    public static void doSomething(int a) throws ClassNotFoundException, SQLException {
        if(a==2) {
            throw new UnderAgeException();
        }

        else if(a==3) {
            throw new ClassNotFoundException();
        }

        if(a==4) {
            throw new SQLException("Invalid input");
        }

    }
}
