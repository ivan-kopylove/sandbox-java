package a8267e6a29d84c338e75b58599527f5d;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Nested;
import org.springframework.security.crypto.encrypt.Encryptors;
import org.springframework.security.crypto.encrypt.TextEncryptor;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class Test
{
    @org.junit.jupiter.api.Test
    void abc()
    {
        // given
        PasswordEncoder delegatingPasswordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();

        // when
        String abc = delegatingPasswordEncoder.encode("abc");

        // then
        assertThat(abc, equalTo("{bcrypt}$2a$10$BQyL02dp7upBfjJve.CYJ.GknphCHkRoz4Ik4U.iW/poOV.5Rt2vi"));
    }

    @org.junit.jupiter.api.Test
    void should_do_something_when_condition()
    {
        // given
        TextEncryptor text = Encryptors.text("password", "abcdef");


        // when
        String encrypted = text.encrypt("abc");
        // then
        assertThat(text.decrypt(encrypted), equalTo("abc"));
    }
}
