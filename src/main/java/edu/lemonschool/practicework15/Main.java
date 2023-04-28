package edu.lemonschool.practicework15;


public class Main {
    public static void main(String [] args){
        Producer samsung = new Producer("Korea", "samsung@gmail.com","+45789511230");
        Producer canon = new Producer("USA","canon@gmail.com","+961514143");
        Producer nvidia = new Producer("USA", "nvidia@gmail.com", "+987456123");
        Producer intel = new Producer("USA", "intel@gmail.com","+984565127");
        Producer amd = new Producer("America","amd@gmail.com","+9878151133");
        Hardware printer = new Printer("Printer SAMSUNG", "HQR3212", "The coolest", samsung);
        Hardware scanner = new Scanner("Scanner Canon", "SQs1d2", "Amazing scanner", canon);
        Hardware videoCardNvidia = new VideoCard("NVIDIA RTX 3040","QsR12304q","RTX modification",nvidia);
        Hardware videoCardAMD = new VideoCard("AMD RX 580","QaR10s4q","8g memory",amd);
        Hardware processor = new Processor("Intel core", "i7","good processing capabilities",intel);
        Store<Hardware> hardwareStore = new HardwareStore();
        hardwareStore.addProduct(printer);
        hardwareStore.addProduct(scanner);
        hardwareStore.addProduct(videoCardNvidia);
        hardwareStore.addProduct(videoCardAMD);
        hardwareStore.addProduct(processor);
        System.out.println("\n"+"Товари занесені в кошик");
        for (Hardware product : hardwareStore.getAllProducts()) {
            System.out.println(product);
        }
        System.out.println("\n"+"Товари, які залишилися в кошику,після придбання");
        hardwareStore.sellProduct(videoCardAMD);
        hardwareStore.sellProduct(scanner);
        for (Hardware product : hardwareStore.getAllProducts()) {
            System.out.println(product);
        }

    }
}
