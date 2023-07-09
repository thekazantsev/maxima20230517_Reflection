public class Reflection {
    public static void main(String[] args) {
        Class stringClass = String.class;

        System.out.println("String class full name: " + stringClass.getName());

        Class stringClassParent = stringClass.getSuperclass();

        System.out.println("String class's superclass full name: " + stringClassParent.getName());

        try {
            Class stringClassSuperParent = stringClassParent.getSuperclass();

            System.out.println(stringClassSuperParent.getName());
        } catch (NullPointerException e) {
            System.out.println("Object class haven't superclass \n");
        }

        System.out.println("String.class interfaces:");
        Class[] stringInterfaces = stringClass.getInterfaces();
        for (Class currentClass : stringInterfaces) {
            System.out.println(currentClass.getName());
        }

        System.out.println("\nTHE END");
    }
}
