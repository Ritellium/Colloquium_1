package org.example;

public class StringEngine {

    public static String concatString(String in, String add) {
        if (in != null)
            in += add;
        return in;
    }
    public static String multiplicateString(String str, int n) {
        if (str != null && n > 0) {
            StringBuilder strBuild = new StringBuilder(str);
            for (int i = 1; i < n; i++) {
                strBuild.append(str);
            }
            return strBuild.toString();
        } else {
            return "";
        }
    }
}
