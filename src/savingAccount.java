public class savingAccount {
    public double CalculatingInvest (double accountBalance){
        if(accountBalance<0)
            throw new IllegalArgumentException("Invalid");

        else if(accountBalance<=100)
            return (accountBalance+(accountBalance*0.03));

        else if(accountBalance<1000)
            return (accountBalance+(accountBalance*0.05));



        return (accountBalance+(accountBalance*0.07));
    }
}
