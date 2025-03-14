package game;

public class ConsoleColors {
    // ANSI escape code to reset color
    public static final String RESET = "\033[0m";
    // ANSI escape codes for text colors
    public static final String RED = "\033[0;31m"; // action
    public static final String GREEN = "\033[0;32m"; // perception
    public static final String YELLOW = "\033[0;33m"; // player interaction prompt
    public static final String BLUE = "\033[0;34m";
    public static final String PURPLE = "\033[0;35m"; // debug messages
    public static final String CYAN = "\033[0;36m"; // usable items
}
