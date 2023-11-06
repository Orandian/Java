public class Main {
    public static void main(String[] args) {
        PaperBag paperBag = new PaperBag();
        paperBag.setLength(10.0);
        paperBag.setWidth(10.0);
        System.out.println(paperBag.getPrice());

        PlasticBag plasticBag = new PlasticBag();
        plasticBag.setLength(20.0);
        plasticBag.setWidth(10.0);
        plasticBag.setTax(2);
        System.out.println(plasticBag.getTax());
        System.out.println(plasticBag.getPrice());
    }
}