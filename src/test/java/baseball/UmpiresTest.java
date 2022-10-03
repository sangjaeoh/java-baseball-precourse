package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class UmpiresTest {

    @ParameterizedTest
    @CsvSource(value = {"1:2", "3:0", "0:3", "0:0"}, delimiter = ':')
    @DisplayName("스트라이크, 볼, 낫싱 프린트")
    void shout(int ball, int strike) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        // given
        Umpires umpires = new Umpires(new Rule());

        // when
        Method method = umpires.getClass().getDeclaredMethod("shout", int.class, int.class);
        method.setAccessible(true);

        // then
        method.invoke(umpires, ball, strike);

    }

}