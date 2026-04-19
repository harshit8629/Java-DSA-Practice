class Bank {
    String getInterest() {
        return "5%";
    }
}

class SBI extends Bank {
    @Override
    String getInterest() {
        return "7%";
    }
}

public class task7
 {
    public static void main(String[] args) {
        SBI s = new SBI();
        System.out.println(s.getInterest());
    }
}