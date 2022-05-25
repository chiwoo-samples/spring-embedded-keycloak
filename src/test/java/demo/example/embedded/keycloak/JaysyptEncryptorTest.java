package demo.example.embedded.keycloak;

import org.jasypt.encryption.StringEncryptor;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = {AuthorizationServerApp.class})
public class JaysyptEncryptorTest {

    @Autowired
    private StringEncryptor lazyJasyptStringEncryptor;

    @Test
    public void whenLoadApplication_thenSuccess() {
        System.setProperty("jasypt.encryptor.password", "symplesims");

        System.out.println(lazyJasyptStringEncryptor.encrypt("eugene"));
        System.out.println(lazyJasyptStringEncryptor.encrypt("choi123$"));

    }

}
