package edu.lemonschool.practicework15;

public class Main {
    public static void main(String [] args){
        Producer samsung = new Producer("Korea", "samsung@gmail.com","+45789511230");
        Producer canon = new Producer("USA","canon@gmail.com","+961514143");
        Producer nvidia = new Producer("USA", "nvidia@gmail.com", "+987456123");
        Producer intel = new Producer("USA", "intel@gmail.com","+984565127");
        Producer amd = new Producer("America","amd@gmail.com","+9878151133");
        Printer printer = new Printer("Printer SAMSUNG", "HQR3212", "The coolest", samsung);
        Scanner scanner = new Scanner("Scanner Canon", "SQs1d2", "Amazing scanner", canon);
        VideoCard videoCardNvidia = new VideoCard("NVIDIA RTX 3040","QsR12304q","RTX modification",nvidia);
        VideoCard videoCardAMD = new VideoCard("AMD RX 580","QaR10s4q","8g memory",amd);
        Processor processor = new Processor("Intel core", "i7","good processing capabilities",intel);
        System.out.println(printer);
        System.out.println(scanner);
        System.out.println(videoCardNvidia);
        System.out.println(videoCardAMD);
        System.out.println(processor);
    }
}
