import kotlin.reflect.jvm.internal.impl.types.AbstractTypeCheckerContext;

import java.lang.reflect.Array;

public class Task1 {
    public static void main(String[] args) {

        int age[] = {12, 33, 77, 32,43};
        String name[] = {"Armen","Babken","Karen","Vazgen","Gurgen"};
        for (int i = 0; i < 5;i++){
            if (age[i] % 2 == 0) {
                System.out.println(name[i]);

            }
        }

    }
}
