package org.example;

import com.slack.api.bolt.App;
import com.slack.api.bolt.AppConfig;

public class SlackBot {

    public static void main(String[] args) {
        // Initialize the app with the Slack token
        String slackToken = System.getenv("SLACK_BOT_TOKEN"); // Use environment variable
        AppConfig config = AppConfig.builder()
                .singleTeamBotToken(slackToken)
                .build();
        App app = new App(config);

        // Listen for the slash command
        app.command("test", (req, ctx) -> {
            String text = req.getPayload().getText();
            String responseText = "Running automation...";

            // Trigger the Selenium automation here
            runSeleniumAutomation();

            return ctx.ack(responseText);
        });

        // Start the app
        try {
            app.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Method to run the Selenium automation
    private static void runSeleniumAutomation() {
        // Call your Selenium automation code here
        System.out.println("Automation triggered!");
    }
}
