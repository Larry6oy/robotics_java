import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class mainframe {
    @SuppressWarnings("UseSpecificCatch")
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Hello! I am a simple chatbot. Ask me a question!");

            while (true) {
                System.out.print("You: ");
                String question = scanner.nextLine().toLowerCase();

                if (question.matches(".*\\b(hello|hi|hey|greetings|good morning|good afternoon|good evening)\\b.*")) {
                    System.out.println("Bot: Hello there! How can I help you today?");
                } else if (question.matches(".*\\b(how are you|how's it going|how do you do|what's up)\\b.*")) {
                    System.out.println("Bot: I'm just a program, but I'm doing great! Thanks for asking.");
                } else if (question.matches(".*\\b(bye|goodbye|see you|farewell|exit|quit)\\b.*")) {
                    System.out.println("Bot: Goodbye! Have a nice day!");
                    break;
                } else if (question.matches(".*\\b(your name|who are you|what are you called|identify yourself)\\b.*")) {
                    System.out.println("Bot: My name is ChatBot! I'm here to chat with you.");
                } else if (question.matches(".*\\b(weather)\\b.*")) {
                    System.out.println("Bot: I can't check the weather, but I hope it's nice where you are!");
                } else if (question.matches(".*\\b(time|current time|what time is it)\\b.*")) {
                    String time = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm"));
                    System.out.println("Bot: The current time is " + time + ".");
                } else if (question.matches(".*\\b(joke|tell me a joke|make me laugh)\\b.*")) {
                    System.out.println("Bot: Why did the computer show up at work late? It had a hard drive!");
                } else if (question.matches(".*\\b(who made you|who created you|who is your creator)\\b.*")) {
                    System.out.println("Bot: I was created by Larry6oy using copilot to help answer your questions!");
                } else if (question.matches(".*\\b(help|what can you do|commands|options)\\b.*")) {
                    System.out.println("Bot: I can greet you, tell you the time, share a joke, answer simple questions, search the web, and launch your Caterpillar game.");
                } else if (question.matches(".*\\b(programming|program|what is programming|define programming|explain programming|what is code|what is coding)\\b.*")) {
                    System.out.println("Bot: Programming is the process of creating instructions for computers. I can answer basic questions about Java, Python, C++, and JavaScript!");
                } else if (question.matches(".*\\b(code|coding|python code|java code|help me code|write code|fix code|copilot|github copilot|ai help|ai assistant|debug|debugging|how do i code|can you code|can you help me code)\\b.*")) {
                    System.out.println("Bot: I am GitHub Copilot, your AI coding assistant! Please describe your coding problem or what you want to build, and I'll help you with code, explanations, or debugging.");
                    // You can expand this section to interactively accept code snippets and provide suggestions.
                } else if (question.matches(".*\\b(science|physics|chemistry|biology)\\b.*")) {
                    System.out.println("Bot: Science helps us understand the world. Physics studies matter and energy, chemistry studies substances, and biology studies living things.");
                } else if (question.matches(".*\\b(history|who was|when did|where is)\\b.*")) {
                    System.out.println("Bot: History is full of interesting events and people. If you want to know more, I can help you search the web!");
                } else if (question.matches(".*\\b(search|google|look up|find|web search)\\b.*")) {
                    System.out.println("Bot: I'll search the web for you. Opening your browser...");
                    try {
                        String query = question.replaceAll(".*\\b(search|google|look up|find|web search)\\b", "").trim();
                        if (query.isEmpty()) {
                            query = "something interesting";
                        }
                        String url = "https://www.google.com/search?q=" + java.net.URLEncoder.encode(query, "UTF-8");
                        java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                    } catch (Exception e) {
                        System.out.println("Bot: Sorry, I couldn't open the browser.");
                    }
                } else if (question.matches(".*\\b(play|game|racing|race|racing game|car game|drive|drive game|start racing|start game|start car)\\b.*")) {
                    System.out.println("Bot: Launching the Racing game for you!");
                    try {
                        String pythonScript = "/Users/peng.larry/Downloads/coding-python-main/racing.py";
                        ProcessBuilder pb = new ProcessBuilder("python3", pythonScript);
                        pb.directory(new java.io.File("/Users/peng.larry/Downloads/coding-python-main"));
                        pb.redirectErrorStream(true);
                        pb.inheritIO();
                        Process process = pb.start();
                        // Optionally wait for the process to finish:
                        // process.waitFor();
                    } catch (Exception e) {
                        System.out.println("Bot: Sorry, I couldn't launch the Racing game. Make sure Python 3 is installed and the script path is correct.");
                    }
                } else if (question.matches(".*\\b(caterpillar|snake)\\b.*")) {
                    System.out.println("Bot: Launching the Caterpillar game for you!");
                    try {
                        String pythonScript = "/Users/peng.larry/Downloads/coding-python-main/original_caterpillar.py";
                        ProcessBuilder pb = new ProcessBuilder("python3", pythonScript);
                        pb.directory(new java.io.File("/Users/peng.larry/Downloads/coding-python-main"));
                        pb.redirectErrorStream(true);
                        pb.inheritIO();
                        Process process = pb.start();
                        // Optionally wait for the process to finish:
                        // process.waitFor();
                    } catch (Exception e) {
                        System.out.println("Bot: Sorry, I couldn't launch the Catipillar game. Make sure Python 3 is installed and the script path is correct.");
                    }
                } else {
                    System.out.println("Bot: Sorry, I don't understand that question.");
                }
            }
        }
    }
}