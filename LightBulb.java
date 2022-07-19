public class LightBulb {

    public void light() {
            System.out.println("lighting a room");
    }

    static class SmartBulb extends LightBulb {
        public void light() {
            System.out.println("doing everything in a smart way");
        }
    }


    public static void main(String[] args) {
        SmartBulb smart = new SmartBulb();
        LightBulb bulb = smart;

        bulb.light();
    }

}
