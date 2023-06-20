package ClassObjects;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Super Class of all classes Object
        Object[] generalObjects = new Object[]{
                45.4,
                45681L,
                "Archil Sikharulidze",
                new String[]{"Artiom", "Ylia", "Ivan", "Irina"},
                true
        };

        System.out.println(generalObjects[2]);
        System.out.println(generalObjects[4]);

        generalObjects[4] = false;

        System.out.println(generalObjects[4]);

        for (Object elements : generalObjects)
        {
            System.out.println(elements);
        }

        System.out.println(Arrays.deepToString((Object[]) generalObjects[3]));
    }
}
