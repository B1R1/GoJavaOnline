package javaenterprise.collections;

import javaenterprise.collections.write.ConsoleWriter;
import javaenterprise.collections.write.FileWriter;

import static javaenterprise.collections.Size.*;
import static javaenterprise.collections.benchmark.ResultsGetter.*;

public class Runner {
    public static void main(String[] args) {
        FileWriter fileWriter = new FileWriter();
        ConsoleWriter consoleWriter = new ConsoleWriter();

        System.out.println(SIZE_10K + " elements:");
        toConsole(consoleWriter, SIZE_10K);
        toFile(fileWriter, SIZE_10K);

        System.out.println(SIZE_100K + " elements:");
        toConsole(consoleWriter, SIZE_100K);
        toFile(fileWriter, SIZE_100K);

        System.out.println(SIZE_1000K + " elements:");
        toConsole(consoleWriter, SIZE_1000K);
        toFile(fileWriter, SIZE_1000K);
    }

    private static void toConsole(ConsoleWriter consoleWriter, int size) {
        consoleWriter.write(
                getArrayListResults(size),
                getLinkedListResults(size),
                getHashSetResults(size),
                getTreeSetResults(size));
    }

    private static void toFile(FileWriter fileWriter, int size) {
        fileWriter.write(
                getArrayListResults(size),
                getLinkedListResults(size),
                getHashSetResults(size),
                getTreeSetResults(size));
    }
}

