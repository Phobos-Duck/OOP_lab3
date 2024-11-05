import java.util.Scanner;
class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Длина первого множества: ");
        int n1 = scanner.nextInt();
        Set set1 = new Set(n1);

        System.out.println("Длина второго множества: ");
        int n2 = scanner.nextInt();
        Set set2 = new Set(n2);

        System.out.println("Множество 1:");
        set1.printSet();
        System.out.println("Множество 2:");
        set2.printSet();

        // Объединение множеств
        Set unionSet = set1.union(set2);
        System.out.println("Объединение множеств:");
        unionSet.printSet();

        // Пересечение множеств
        Set intersectionSet = set1.intersection(set2);
        System.out.println("Пересечение множеств:");
        intersectionSet.printSet();
    }
}