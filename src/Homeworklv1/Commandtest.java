package Homeworklv1;

public class Commandtest {
    public static void main(String[] args) {
        Commandenvelope N3 = new Commandenvelope();
        N3.tell();
        N3.num = 10;
        N3.money = 100.00;
        N3.command = "CYJ是2货";
        N3.separate();
    }
}
