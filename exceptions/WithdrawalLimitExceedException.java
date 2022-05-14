package exceptions;

public class WithdrawalLimitExceedException extends Exception{

    long limit;
    String msg = "Withdrawal amount exceeds designated withdrawal limit ($"; //this is our thrown exception message

    public WithdrawalLimitExceedException(long amt) {
        this.limit = amt;
        this.msg += String.format("%.2f", (double)amt/100) + ")";
    }

    @Override
    public String getMessage(){
        return this.msg; // return message declared above
    }
}
