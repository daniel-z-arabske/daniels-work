public class App {
    public static class Trojuhlenik{
        double a;
        double b;
        double c;

        public Trojuhlenik(double a, double b){
            this.a = a;
            this.b = b;
            this.c = Math.sqrt(a*a + b*b);
        }

        private double obvod() {
            return (a + b + c);
        }

        private double obsah() {
            return (a*b)/2;
        }

        public void dopocitejTrojuhlenik() {
            System.out.printf("Strana C je velká: %.2f jednotek\n", c);
            System.out.printf("Obvod a obsah trojúhlelníku jsou %.2f a %.2f jednotek\n", obvod(), obsah());
        }
    }

    public static class Ctverec {
        double a;

        public Ctverec(double a){
            this.a = a;
        }

        private double obvod(){
            return a*4;
        }

        private double obsah(){
            return a*a;
        }

        public void dopocitejCtverec(){
            System.out.printf("Obvod a obsah ctverce je %.2f a %.2f jednotek\n", obvod(), obsah());
        }
    }

    public static class Obdelnik {
        double a;
        double b;

        public Obdelnik(double a, double b) {
            this.a = a;
            this.b = b;
        }

        private double obvod(){
            return 2*(a + b);
        }

        private double obsah(){
            return a*b;
        }

        public void dopocitejObdelnik(){
            System.out.printf("Obvod a obsah obdélníku jsou %.2f a %.2f jednotek", obvod(), obsah());
        }
    }

    public static void main(String[] args) throws Exception {
        Trojuhlenik t = new Trojuhlenik(3, 4);
        t.dopocitejTrojuhlenik();
        Ctverec c = new Ctverec(4);
        c.dopocitejCtverec();
        Obdelnik o = new Obdelnik(3, 6);
        o.dopocitejObdelnik();  
    }
}
