package com.example.springboot3_bootiful__youtube_2024;

public class SwitchPatternMatching_Java21 {

    public String usage(Loan loan) {
        String message = "";

        if (loan instanceof SecuredLoan) {
            var sl = (SecuredLoan) loan;
            message = "SecuredLoan";
        }
        if (loan instanceof UnsecuredLoan) {
            var usl = (UnsecuredLoan) loan;
            message = "UnsecuredLoan " + usl.interest();
        }
        return message;
    }

    public String usageNew(Loan loan) {
        String message = "";

        if (loan instanceof SecuredLoan sl) {
            message = "SecuredLoan";
        }
        if (loan instanceof UnsecuredLoan usl) {
            message = "UnsecuredLoan " + usl.interest();
        }
        return message;
    }

    public String usageNew2(Loan loan) {
        // compile will check that all cases were used
        String message = switch (loan) {
            case SecuredLoan sl -> "SecuredLoan";
            case UnsecuredLoan usl -> "UnsecuredLoan " + usl.interest();
        };
        return message;
    }

    // //

    sealed interface Loan permits SecuredLoan, UnsecuredLoan {
    }

    record UnsecuredLoan(float interest) implements Loan {
    }

    final class SecuredLoan implements Loan {
    }
}
