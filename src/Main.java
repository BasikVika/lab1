public class Main {
    public static void main(String[] args) {
        CustomContainer myContainer = new CustomContainer();

        myContainer.add("Apple");
        myContainer.add("Banana");
        myContainer.add("Cherry");

        int currentSize = myContainer.size();
        System.out.println("Current number of elements: " + currentSize);

        String firstElement = (String) myContainer.get(0);
        System.out.println("First element: " + firstElement);

        myContainer.remove(1);

        currentSize = myContainer.size();
        System.out.println("Updated number of elements: " + currentSize);

        for (int i = 0; i < myContainer.size(); i++) {
            System.out.println("Element at index " + i + ": " + myContainer.get(i));
        }
    }
}
