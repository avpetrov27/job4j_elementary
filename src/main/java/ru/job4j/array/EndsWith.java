package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        if (post.length > word.length) {
            return false;
        }
        for (int i = 0; i < post.length; i++) {
            if (word[i + word.length - post.length] != post[i]) {
                return false;
            }
        }
        return true;
    }
}
