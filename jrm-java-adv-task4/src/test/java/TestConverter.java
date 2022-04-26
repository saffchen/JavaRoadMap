import jrm.ObjectToJson;
import jrm.User;
import org.junit.jupiter.api.Test;

public class TestConverter {

    @Test
    void test(){
        User user = new User("Denis", "23", "SPb");
        ObjectToJson objectToJson = new ObjectToJson();
        System.out.println(objectToJson.convertToJson(user));
    }
}