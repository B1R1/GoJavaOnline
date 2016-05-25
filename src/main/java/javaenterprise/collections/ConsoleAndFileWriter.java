package javaenterprise.collections;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class ConsoleAndFileWriter {

    private static final String FILE_NAME = "c:/src/500.txt";

    private static final int SIZE_10K = 10_000;
    private static final int SIZE_100K = 100_000;
    private static final int SIZE_1000K = 1000_000;

    public void write() {
        CollectionsTesterRunner runner = new CollectionsTesterRunner();
        File file = new File(FILE_NAME);

        try (PrintStream ps = new PrintStream(file)) {
            writeHead(ps);
            writeArrayListResults(runner, ps);
            writeLinkedListResults(runner, ps);
            writeHashSetResults(runner, ps);
            writeTreeSetResults(runner, ps);
            ps.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void writeHead(PrintStream ps) {
        ps.print(String.format("%19s  %9s  %10s  %10s  %9s  %12s  %14s%n", "add", "get",
                "remove", "contains", "populate", "iterator.add", "iterator.remove"));
        System.out.print(String.format("%19s  %9s  %10s  %10s  %9s  %12s  %14s%n", "add", "get",
                "remove", "contains", "populate", "iterator.add", "iterator.remove"));
    }

    private void writeArrayListResults(CollectionsTesterRunner runner, PrintStream ps) {
        ps.print(String.format("%-10s", "ArrayList"));
        System.out.print(String.format("%-10s", "ArrayList"));
        long[] resultsAL = runner.testArrayList(SIZE_10K);
        for (long s : resultsAL) {
            ps.print(String.format("%10s ", s));
            System.out.print(String.format("%10s ", s));
        }
        ps.println("");
        System.out.println("");
    }

    private void writeLinkedListResults(CollectionsTesterRunner runner, PrintStream ps) {
        ps.print(String.format("%-10s", "LinkedList"));
        System.out.print(String.format("%-10s", "LinkedList"));
        long[] resultsLL = runner.testLinkedList(SIZE_10K);
        for (long s : resultsLL) {
            ps.print(String.format("%10s ", s));
            System.out.print(String.format("%10s ", s));
        }
        ps.println("");
        System.out.println("");
    }

    private void writeHashSetResults(CollectionsTesterRunner runner, PrintStream ps) {
        ps.print(String.format("%-10s","HashSet"));
        System.out.print(String.format("%-10s","HashSet"));
        long[] resultsHS = runner.testHashSet(SIZE_10K);
        ps.print(String.format("%10s ", resultsHS[0]));
        System.out.print(String.format("%10s ", resultsHS[0]));
        ps.print(String.format("%10s ", " "));
        System.out.print(String.format("%10s ", " "));
        for (int i = 1; i < resultsHS.length; i++) {
            ps.print(String.format("%10s ", resultsHS[i]));
            System.out.print(String.format("%10s ", resultsHS[i]));
        }
        ps.println("");
        System.out.println("");
    }

    private void writeTreeSetResults(CollectionsTesterRunner runner, PrintStream ps) {
        ps.print(String.format("%-10s","TreeSet"));
        System.out.print(String.format("%-10s","TreeSet"));
        long[] resultsTS = runner.testTreeSet(SIZE_10K);
        ps.print(String.format("%10s ", resultsTS[0]));
        System.out.print(String.format("%10s ", resultsTS[0]));
        ps.print(String.format("%10s ", " "));
        System.out.print(String.format("%10s ", " "));
        for (int i = 1; i < resultsTS.length; i++) {
            ps.print(String.format("%10s ", resultsTS[i]));
            System.out.print(String.format("%10s ", resultsTS[i]));
        }
    }
}