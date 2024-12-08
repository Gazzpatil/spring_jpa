package org.example.customseq_generator;


import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Account {

    private String account_name;
    private String account_branch;
    @EmbeddedId
    private AccountPk account_pk;

    public AccountPk getAccount_pk() {
        return account_pk;
    }

    public void setAccount_pk(AccountPk account_pk) {
        this.account_pk = account_pk;
    }

    public String getAccount_branch() {
        return account_branch;
    }

    public void setAccount_branch(String account_branch) {
        this.account_branch = account_branch;
    }

    public String getAccount_name() {
        return account_name;
    }

    public void setAccount_name(String account_name) {
        this.account_name = account_name;
    }

    @Override
    public String toString() {
        return "Account{" +
                "account_name='" + account_name + '\'' +
                ", account_branch='" + account_branch + '\'' +
                ", account_pk=" + account_pk +
                '}';
    }
}
