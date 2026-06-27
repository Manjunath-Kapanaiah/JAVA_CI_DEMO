public class App {
    public static void main(String[] args) {
        System.out.println("Hello Jenkins CI Demo!");
        
        // Display app information
        System.out.println("Application: Simple Java App");
        System.out.println("Status: Running successfully");
        
        // Process command line arguments if provided
        if (args.length > 0) {
            System.out.println("\nArguments provided:");
            for (int i = 0; i < args.length; i++) {
                System.out.println("  [" + i + "] " + args[i]);
            }
        } else {
            System.out.println("\nNo arguments provided.");
        }
        
        // Simple calculation example
        int sum = add(5, 3);
        System.out.println("\nExample calculation: 5 + 3 = " + sum);
    }
    
    // Simple utility method
    public static int add(int a, int b) {
        return a + b;
    }
}
