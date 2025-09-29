package io.embrace.android.embracesdk;

import android.app.Application;

import java.util.Map;

public final class Embrace {
    private static final Embrace INSTANCE = new Embrace();

    private Embrace() {
    }

    public static Embrace getInstance() {
        return INSTANCE;
    }

    public void start(Application application) {
        // no-op stub
    }

    public void startEvent(String name) {
        // no-op stub
    }

    public void endEvent(String name) {
        // no-op stub
    }

    public void endAppStartup() {
        // no-op stub
    }

    public void setUserIdentifier(String userIdentifier) {
        // no-op stub
    }

    public void setUsername(String username) {
        // no-op stub
    }

    public void setUserEmail(String email) {
        // no-op stub
    }

    public void setUserPersona(String persona) {
        // no-op stub
    }

    public void logError(Throwable throwable) {
        // no-op stub
    }

    public void logBreadcrumb(String message) {
        // no-op stub
    }

    public void logInfo(String message, Map<String, Object> props) {
        // no-op stub
    }

    public void clearUserPersona(String persona) {
        // no-op stub
    }
}
