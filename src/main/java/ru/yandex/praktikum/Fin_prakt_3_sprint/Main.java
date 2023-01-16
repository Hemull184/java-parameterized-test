package ru.yandex.praktikum.Fin_prakt_3_sprint;


import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


public class Main {

    @RunWith(Parameterized.class)// Напиши аннотацию для параметризованных тестов
    public class CheckIsAdultTest {

        private final int age;
        private final boolean result;

        public CheckIsAdultTest(int age, boolean result) {

            this.age = age;
            this.result = result;
            // Инициализируй поля класса в конструкторе
        }
    }
}