package loopingstatements;

public class LoopingStatements {

    public static void main(String[] args) {

        // FOR LOOP
        System.out.println("For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // WHILE LOOP
        System.out.println("\nWhile Loop:");
        int j = 1;
        while (j <= 5) {
            System.out.println(j);
            j++;
        }

        // DO-WHILE LOOP
        System.out.println("\nDo-While Loop:");
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= 5);

        // ENHANCED FOR LOOP
        System.out.println("\nEnhanced For Loop:");
        int numbers[] = {10, 20, 30, 40, 50};

        for (int num : numbers) {
            System.out.println(num);
        }
    }
}