package CellphoneLoad;

public class MainCellphoneLoad {
    public static void main(String[] args) {
        Phone phone = new Phone();
        System.out.println("Before loading: " + phone);

        // Load CITLoad
        CellphoneLoad citLoad = new CITLoad();
        phone.load(citLoad);
        System.out.println("After loading CITLoad: " + phone);

        // Load CTLoad

        CellphoneLoad ctLoad = new CTLoad();
        phone.load(ctLoad);
        System.out.println("After loading CTLoad: " + phone);

        // Load ILoad
        CellphoneLoad iLoad = new ILoad();
        phone.load(iLoad);
        System.out.println("After loading ILoad: " + phone);
    }
}