package gates;

public class ORGate {
    private int input1;
    private int input2;

    public ORGate() {
        input1 = 0;
        input2 = 0;
    }

    public int getInput1() {
        return input1;
    }

    public void setInput1(int input1) {
        this.input1 = input1;
    }

    public int getInput2() {
        return input2;
    }

    public void setInput2(int input2) {
        this.input2 = input2;
    }

    public ORGate(int input1, int input2) {
        this.input1 = input1;
        this.input2 = input2;
    }

    private int getOutput(int input1, int input2) {
        setInput1(input1);
        setInput2(input2);
        return (this.input1 == 1 || this.input2 == 1) ? 1 : 0;
    }

    private void printOutput() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(i + " OR " + j + " results " + getOutput(i,j));
            }
        }
    }
    public void printTruthTable() {
        System.out.println("----Truth Table For OR Gate----");
        printOutput();
        System.out.println();
    }
}
