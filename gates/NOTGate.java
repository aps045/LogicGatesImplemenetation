package gates;

public class NOTGate {
    private int input;

    public NOTGate() {
        input = 0;
    }

    public NOTGate(int input) {
        this.input = input;
    }

    public int getInput() {
        return this.input;
    }

    public void setInput(int input) {
        this.input = input;
    }

    private int getOutput(int input) {
        setInput(input);
        return (this.input == 1) ? 0 : 1;
    }

    private void printOutput() {
        for (int i = 0; i < 2; i++) {
            System.out.println("NOT " + i + " results " + getOutput(i));
        }
    }

    public void printTruthTable() {
        System.out.println("----Truth Table For NOT Gate----");
        printOutput();
        System.out.println();
    }
}
