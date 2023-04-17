package ca.bcit.bankingsystem;

/**
 * @author Mingwei Luo
 * @version 1.0
 * This class models Bank Account Information
 */

class BankAccount
{
    private double balanceCdn;
    private final String accountNumber;
    private final String memberLastName;
    private final double amountCdn = 0;

    /**
     * Constructor will run everytime a new object is created.
     * @param balanceCdn The bank account balance
     * @param accountNumber The bank account number
     * @param memberLastName The last name of a bank account holder
     */
    public BankAccount(final double balanceCdn, final String accountNumber, final String memberLastName)
    {
        this.balanceCdn = balanceCdn;
        this.accountNumber = accountNumber;
        this.memberLastName = memberLastName;
    }

    /**
     * @return the balance of the bank account
     */
    public double getBalanceCdn() {
        return balanceCdn;
    }

    /**
     * @return the bank account number
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * @return the last name of a bank account holder
     */
    public String getMemberLastName() {
        return memberLastName;
    }

    /**
     * This function will subtract the amount in the parameter from the bank balance
     * @param amountCdn Canadian amount that will be withdrawn from a bank account
     */
    public void withdraw(final double amountCdn)
    {
        balanceCdn -= amountCdn;
    }

    /**
     * This function will add the amount in the parameter from the bank balance
     * @param amountCdn Canadian amount that will be deposited to a bank account
     */
    public void deposit(final double amountCdn)
    {
        balanceCdn += amountCdn;
    }

    /**
     * This function will subtract the amount from one account's balance and add it to the other account provided.
     * @param amountCdn Canadian amount that will be transferred from one account to another.
     * @param account Bank account that will be receiving the transferred amount.
     */
    public void transfer(final double amountCdn, final BankAccount account)
    {
        account.deposit(amountCdn);
        this.withdraw(amountCdn);
    }
}
