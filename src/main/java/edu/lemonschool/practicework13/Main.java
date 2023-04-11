package edu.lemonschool.practicework13;

import java.util.Arrays;

public class Main {
    private static final String PERSON_FIRST_NAME = "Oleksandr";
    private static final String PERSON_SECOND_NAME = "Myliutin";
    private static final String PERSON_THIRD_NAME = "Yevgeniovich";
    private static final int PERSON_AGE = 19;
    private static final int[] PERSON_DATE = new int[]{20, 1, 2004};
    private static final String PERSON_ID = "GT151244145";

    public static void main(String[] args) {
        Human human1 = new Human();
        Human human2 = new Human(PERSON_FIRST_NAME,
                PERSON_SECOND_NAME,
                PERSON_THIRD_NAME,
                PERSON_AGE,
                PERSON_DATE,
                PERSON_ID);
        System.out.println(human1);
        System.out.println(human2);
        Human human3 = Human.builder()
                .firstName(PERSON_FIRST_NAME)
                .secondName(PERSON_SECOND_NAME)
                .build();

        System.out.println(human3);
        Human human4 = new Human();
        System.out.println(Arrays.toString(human4.varargs(new int[]{15, 16, 18})));

        Human ob1 = new Human();
        ob1.setAge(75);
        System.out.println(ob1.getAge());
    }
}
