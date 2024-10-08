package codestral.task28;

public class Task28_MISTRAL_codestral_latest {
    public static String likes(String[] names) {
        int n = names.length;
        if (n == 0) {
            return "no one likes this";
        } else if (n == 1) {
            return names[0] + " likes this";
        } else if (n == 2) {
            return names[0] + " and " + names[1] + " like this";
        } else if (n == 3) {
            return names[0] + ", " + names[1] + " and " + names[2] + " like this";
        } else {
            return names[0] + ", " + names[1] + " and " + (n-2) + " others like this";
        }
    }
}