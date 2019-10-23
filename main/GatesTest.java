package main;

import gates.NOTGate;
import gates.ORGate;
import gates.ANDGate;
import gates.NANDGate;
import gates.NORGate;
import gates.XORGate;
import gates.XNORGate;

public class GatesTest {
    public static void main(String[] args) {
        ANDGate andGate = new ANDGate();
        andGate.printTruthTable();
        ORGate orGate = new ORGate();
        orGate.printTruthTable();
        NOTGate notGate = new NOTGate();
        notGate.printTruthTable();
        NANDGate nandGate = new NANDGate();
        nandGate.printTruthTable();
        NORGate norGate = new NORGate();
        norGate.printTruthTable();
        XORGate xorGate = new XORGate();
        xorGate.printTruthTable();
        XNORGate xnorGate = new XNORGate();
        xnorGate.printTruthTable();
    }
}
