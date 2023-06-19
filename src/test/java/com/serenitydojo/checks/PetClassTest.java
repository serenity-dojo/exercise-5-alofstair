package com.serenitydojo.checks;

import com.serenitydojo.Cat;
import com.serenitydojo.Dog;
import com.serenitydojo.Hamster;
import com.serenitydojo.Pet;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class PetClassTest {
    @Test
    public void thePetClassShouldExist() throws ClassNotFoundException {
        assertThat(Class.forName("com.serenitydojo.Pet")).isNotNull();
    }

    @Test
    public void shouldHaveAName() throws Exception {
        assertThat(Class.forName("com.serenitydojo.Pet").getDeclaredField("name").getGenericType()).isEqualTo(String.class);
    }

    @Test
    public void shouldHaveAnAge() throws Exception {
        assertThat(Class.forName("com.serenitydojo.Pet").getDeclaredField("age").getGenericType()).isEqualTo(int.class);
    }

    @Test
    public void whenAnimalsPlay() {
        Pet fido = new Dog("Fido", "Bone", 5);
        Pet spot = new Cat("Spot", "String", 5);
        Pet hazel = new Hamster("Hazel",  "Wheel", 1);

        assertThat(fido.play(), equalTo("plays with bone"));
        assertThat(spot.play(), equalTo("plays with string"));
        assertThat(hazel.play(), equalTo("runs in wheel"));
    }
}
