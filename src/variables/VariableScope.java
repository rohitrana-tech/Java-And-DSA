package variables;

public class VariableScope{

         // 1. CLASS SCOPE
        // Added "static" so our main method can read it directly
        static int classLevelVar = 100;

        // THE MAIN METHOD: This is the entry point where Java starts running
        public static void main(String[] args) {

            // 2. LOCAL SCOPE (Inside main method)
            int localLevelVar = 50;

            // Valid: Main can see its own local variable
            System.out.println(localLevelVar); // Prints 50

            // Valid: Main can see the class-level variable
            System.out.println(classLevelVar); // Prints 100

            // 3. BLOCK SCOPE (Inside an if-statement block)
            if (localLevelVar > 10) {
                int blockLevelVar = 25;
                System.out.println(blockLevelVar); // Prints 25
            }

            // ERROR! blockLevelVar died when the 'if' block ended
            // System.out.println(blockLevelVar);
        }
    }


