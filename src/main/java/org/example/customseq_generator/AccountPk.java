package org.example.customseq_generator;

import jakarta.persistence.Embeddable;

import java.io.Serializable;


@Embeddable
public class AccountPk implements Serializable {

    private Integer account_Id;
    private String account_Type;
    private String account_Num;

    public Integer getAccount_Id() {
        return account_Id;
    }

    public void setAccount_Id(Integer account_Id) {
        this.account_Id = account_Id;
    }

    public String getAccount_Type() {
        return account_Type;
    }

    public void setAccount_Type(String account_Type) {
        this.account_Type = account_Type;
    }

    public String getAccount_Num() {
        return account_Num;
    }

    public void setAccount_Num(String account_Num) {
        this.account_Num = account_Num;
    }

    @Override
    public String toString() {
        return "AccountPk{" +
                "account_Id=" + account_Id +
                ", account_Type='" + account_Type + '\'' +
                ", account_Num='" + account_Num + '\'' +
                '}';
    }
}
