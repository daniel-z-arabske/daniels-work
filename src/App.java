public class App {
    public class Trojuhlenik{
        double a = 0;
        double b = 0;
        double c = 0;

        private void dopocitejStranuC() {
            double c = Math.sqrt(a*a + b*b);
        }

        private void obvod() {
            double obvod = (a + b + c);
        }

        private void obsah() {
            double obsah = (a*b)/2;
        }

    }
    public static void main(String[] args) throws Exception {
        Trojuhlenik t = new Trujuhelnik();
    }
}
