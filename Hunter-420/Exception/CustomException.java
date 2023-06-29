package Exception;
import java.lang.*;

class AmountNotEnoughException extends Exception{

    public AmountNotEnoughException(String message){
        super(message);
    }
}

class CustomException{
    public static void main(String[] args) throws AmountNotEnoughException{
         int amount = 400;
         if (amount<500){
             throw new AmountNotEnoughException("amount must be greater than 500");

         }
         else {
             System.out.println(amount);
         }

    }
}