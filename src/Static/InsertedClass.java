package Static;

public class InsertedClass {
    public InsertedClass()
    {
        System.out.println("External class");
    }

    class Internal
    {
        public Internal()
        {
            System.out.println("Internal Class");
        }
    }
}
