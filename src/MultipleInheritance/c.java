package MultipleInheritance;

public class c implements a, b {
    public void displayA() {
        System.out.println("Display A");
    }

    public void displayB() {
        System.out.println("Display B");
    }


    public static void main(String[] args) {
    c c = new c();
    c.displayA();  // Memanggil metode dari interface A
    c.displayB();  // Memanggil metode dari interface B
	}
}