public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        System.out.println("Before Loading: " + phone);

        CellphoneLoad citLoad = new CITLoad();
        phone.load(citLoad);
        System.out.println("After loading CITLoad: " + phone);
    }
}