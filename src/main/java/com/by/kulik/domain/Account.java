package com.by.kulik.domain;

import java.util.Objects;

public class Account {
    private int id;
    private int account;
    private int userId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account1 = (Account) o;
        return id == account1.id &&
                account == account1.account &&
                userId == account1.userId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, account, userId);
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", account=" + account +
                ", userId=" + userId +
                '}';
    }
}
