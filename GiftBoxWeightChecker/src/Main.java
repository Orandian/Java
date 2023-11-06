import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<GiftBox> boxes = new ArrayList<GiftBox>();
        double[] biscuitsWeights1 = {200.0, 100.0}; // 2 biscuit sets
        double[] chocolateWeights1 = {200.0, 100.0}; // 2 chocolate sets
        String[] chocolateFlavors1 = {"mint", "orange"};
        boxes.add(new GiftBox(biscuitsWeights1, chocolateWeights1, chocolateFlavors1));

        double[] biscuitsWeights2 = {300.0, 100.0, 100.0}; // 3 biscuit sets
        double[] chocolateWeights2 = {200.0, 100.0, 300.0}; // 3 chocolate sets
        String[] chocolateFlavors2 = {"milk", "vanilla", "coffee"};
        boxes.add(new GiftBox(biscuitsWeights2, chocolateWeights2, chocolateFlavors2));

        for (GiftBox box : boxes) {
            if (box.getWeight() > 1000.0) {
                System.out.println("The box with " + box.getNumBiscuits() +
                        " biscuits and " + box.getNumChocolate() + " chocolates is overweight");
                System.out.println("The biscuit weights are:");
                box.showBiscuitsWeights();
                System.out.println("The chocolate weights are:");
                box.showChocolateWeights();
                System.out.println("The chocolate flavors are:");
                box.showChocolateFlavors();
                System.out.println();
            }
        }
    }
}