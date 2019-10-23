package gates;

public class NANDGate {
    private int input1;
    private int input2;

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

    public NANDGate() {
        input1 = 0;
        input2 = 0;
    }

    public NANDGate(int input1, int input2) {
        this.input1 = input1;
        this.input2 = input2;
    }

    private int getOutput(int input1,int input2) {
        setInput1(input1);
        setInput2(input2);
        return (this.input1 == 0 || this.input2 == 0) ? 1 : 0;
    }

    private void printOutput() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(i + " NAND " + j + " results " + getOutput(i,j));
            }
        }
    }

    public void printTruthTable() {
        System.out.println("----Truth Table of NAND Gate----");
        printOutput();
        System.out.println();
    }
}
