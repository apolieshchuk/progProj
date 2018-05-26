public class Main {

    public static void main(String[] args) {
	Table t = new Table(10,10);
	Ship s = new Ship(8,true);
	System.out.println();
	t.putShip(s);
    }
}
