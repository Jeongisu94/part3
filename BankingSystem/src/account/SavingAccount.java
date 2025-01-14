package account;

import bank.Bank;

import java.math.BigDecimal;

//TODO: SavingAccount는 Account에서 상속을 받습니다.
public class SavingAccount extends Account{
    //TODO: 적금 계좌 클래스의 속성은 목표금액 속성을 추가로 가집니다.
    private BigDecimal goalAmount = new BigDecimal(100000);

    public SavingAccount(){
        //TODO: 카테고리를 S로 설정해 줍니다.
        this.setCategory("S");
    }

    public SavingAccount(String accNo, String owner, BigDecimal balance, BigDecimal goalAmount) {
        super(accNo, owner, balance);
        this.goalAmount = goalAmount;
        this.setCategory("S");
    }
//TODO: GoalAmount getter 구현
    public BigDecimal getGoalAmount() {
        return goalAmount;
    }

    public void setGoalAmount(BigDecimal goalAmount) {
        this.goalAmount = goalAmount;
    }

    //TODO: getAccountInfo를 재정의하여 "목표 금액"도 노출해줍니다.
    @Override
    public void getAccountInfo() {
        System.out.printf("계좌종류: %s | 계좌번호: %s | 계좌주명: %s | 목표금액: %s원 | 잔액: %s원 \n",category,accNo,owner, goalAmount,balance);
    }
}
