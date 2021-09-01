package bank;

import account.Account;

import java.util.ArrayList;
import java.util.List;

public class CentralBank {
    //은행시스템의 계좌들을 관리하는 중앙은행 클래스입니다.
    //TODO: 싱글톤 패턴으로 설계합니다.
    private static CentralBank centralBank = new CentralBank();

    private CentralBank(){}
    //TODO: accountList(Account로 이루어진 ArrayList)
    List<Account> accountList = new ArrayList<Account>();
    //TODO: BANK_NAME(은행명)

    //TODO: getInstance 함수
    public static CentralBank getInstance() {
        return centralBank;
    }
    //TODO: accountList getter/setter
    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }
}