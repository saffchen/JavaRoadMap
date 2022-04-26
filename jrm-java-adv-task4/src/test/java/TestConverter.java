import jrm.ObjectToJson;
import jrm.User;
import org.junit.jupiter.api.Test;

public class TestConverter {

    @Test
    void test(){
        User user = new User("Ivan", "31", "SpB");
        ObjectToJson objectToJson = new ObjectToJson();
        System.out.println(objectToJson.convertToJson(user));
    }
}