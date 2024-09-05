/* 14. Browser History Management:
Write a Java program to simulate a browser history using a Stack of String objects 
representing URLs. Implement functionalities to visit a new URL (push), go back (pop), and 
view the current page (peek). */ 


import java.util.Stack;

class BrowserHistoryManager {
    public static void main(String[] args) {
        Stack<String> browserHistory = new Stack<>();

        
        visitNewURL(browserHistory, "https://www.example.com");
        visitNewURL(browserHistory, "https://www.coolwebsite.com");
        visitNewURL(browserHistory, "https://www.stackoverflow.com");

        // View the current page (peek)
        String currentURL = getCurrentPage(browserHistory);
        System.out.println("Current page: " + currentURL);

        // Go back (pop)
        goBack(browserHistory);
        currentURL = getCurrentPage(browserHistory);
        System.out.println("After going back: " + currentURL);
    }

    // Visit a new URL (push)
    public static void visitNewURL(Stack<String> history, String url) {
        history.push(url);
        System.out.println("Visited: " + url);
    }

    // View the current page (peek)
    public static String getCurrentPage(Stack<String> history) {
        if (!history.isEmpty()) {
            return history.peek();
        }
        return "No pages visited yet.";
    }

    // Go back (pop)
    public static void goBack(Stack<String> history) {
        if (!history.isEmpty()) {
            history.pop();
            System.out.println("Went back.");
        } else {
            System.out.println("No pages to go back to.");
        }
    }
}
