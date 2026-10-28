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
            System.out.printf("Obvod a obsah jsou %.2f a %.2f jednotek", obvod(), obsah());
        }
    }

    public static void main(String[] args) throws Exception {
        Trojuhlenik t = new Trojuhlenik(3, 4);
        t.dopocitejTrojuhlenik();
    }
}
