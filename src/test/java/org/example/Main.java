package org.example;
import org.junit.platform.console.ConsoleLauncher;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // This will automatically scan the classpath for tests and run them
        String[] junitArgs = {"--scan-classpath", "--details=tree"};
        ConsoleLauncher.main(junitArgs);
    }
}