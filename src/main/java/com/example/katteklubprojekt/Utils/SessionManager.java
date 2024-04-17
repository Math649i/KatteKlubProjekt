package com.example.katteklubprojekt.Utils;

public class SessionManager {
    private static int loggedInKundeId = -1;
    private static int loggedInMedarbejderId = -1;
    private static String userType = ""; // "kunde", "medarbejder", ""

    public static int getLoggedInKundeId() {
        return loggedInKundeId;
    }

    public static int getLoggedInMedarbejderId() {
        return loggedInMedarbejderId;
    }

    public static String getUserType() {
        return userType;
    }

    public static void setLoggedInUser(int id, String type) {
        resetLoggedInUser();
        if ("kunde".equals(type)) {
            loggedInKundeId = id;
        } else if ("medarbejder".equals(type)) {
            loggedInMedarbejderId = id;
        }
        userType = type;
    }

    public static void resetLoggedInUser() {
        loggedInKundeId = -1;
        loggedInMedarbejderId = -1;
        userType = "";
    }
}
