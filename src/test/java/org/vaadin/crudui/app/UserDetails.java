package org.vaadin.crudui.app;

import java.util.List;

/**
 *
 */
public class UserDetails {

    private String email;
    private List<UserHistoryItem> history;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<UserHistoryItem> getHistory() {
        return history;
    }

    public void setHistory(List<UserHistoryItem> history) {
        this.history = history;
    }
}
