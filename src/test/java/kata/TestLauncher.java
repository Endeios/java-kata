package kata;

import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import static org.junit.platform.engine.discovery.DiscoverySelectors.*;
import static org.junit.platform.engine.discovery.ClassNameFilter.*;

import java.util.List;

import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;
import org.junit.platform.launcher.listeners.TestExecutionSummary;
import org.junit.platform.launcher.listeners.TestExecutionSummary.Failure;

public class TestLauncher {
    SummaryGeneratingListener listener = new SummaryGeneratingListener();

    public void runOne(Class<?> cut) {
        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request().selectors(selectClass(cut))
                .build();
        Launcher launcher = LauncherFactory.create();
        launcher.registerTestExecutionListeners(listener);
        launcher.execute(request);
    }

    public void runAll() {
        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request().selectors(selectPackage("kata"))
                .filters(includeClassNamePatterns(".*Test")).build();
        Launcher launcher = LauncherFactory.create();
        launcher.registerTestExecutionListeners(listener);
        launcher.execute(request);
    }

    public static void main(String[] args) {
        TestLauncher runner = new TestLauncher();
        // runner.runOne(AppTest.class);
        runner.runAll();
        TestExecutionSummary summary = runner.listener.getSummary();
        printSuccesses(summary);
        printFailuresIfThereAreAny(summary);
    }

    private static void printSuccesses(TestExecutionSummary summary) {
        System.out.printf("There are \033[32m%d ✔️  over %d\033[0m Tests Passing\n", summary.getTestsSucceededCount(),
                summary.getTestsStartedCount());
    }

    private static void printFailuresIfThereAreAny(TestExecutionSummary summary) {
        if (summary.getTestsFailedCount() > 0) {
            System.out.printf("There are \033[31m%d ❌\033[0m test failures\n", summary.getTestsFailedCount());
            List<Failure> fails = summary.getFailures();
            for (Failure failure : fails) {
                System.out.printf("🚨 %s \n", failure.getException().getMessage());
                
            }
        }
    }
}
