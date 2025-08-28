package br.com.dio.model;

import lombok.Getter;

import static br.com.dio.model.BankService.ACCOUNT;

import java.util.List;

@Getter
public class AccountWallet extends Wallet {
    private final List<String> pix;

    public AccountWallet(final List<String> pix) {
        super(ACCOUNT);
        this.pix = pix;
    }

    public AccountWallet(final long amount, final List<String> pix) {
        super(ACCOUNT);
        this.pix = pix;
        addMoney(amount, "valor de criação da conta");
    }

    public void addMoney(final long amount, final  String description) {
        var money = generateMoney(amount, description);
        this.money.addAll(money);
    }

    @Override
    public String toString() {
        return "AccountWallet{" +
                "service = " + getService() +
                ", money = R$" + getFunds() / 100 + "," + getFunds() % 100 +
                ", pix = " + pix +
                '}';
    }
}