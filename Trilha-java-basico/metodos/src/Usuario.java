public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();


        System.out.println("TV ligadad ?" + smartTv.ligada);
        System.out.println("Canal Atual :" + smartTv.canal);
        System.out.println("Volume atual :" + smartTv.volume);
    }
}
