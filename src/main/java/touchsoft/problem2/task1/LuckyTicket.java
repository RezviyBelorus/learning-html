package touchsoft.problem2.task1;

interface LuckyTicket {
    boolean isLucky(String number);

    long countLucky(long min, long max);
}

class LuckyTicketImpl implements LuckyTicket {
    /**
     * Description:  divides the ticket into two parts and
     * hen calculates the sum of the digits to the middle and after the middle
     */
    @Override
    public boolean isLucky(String number) {
        int middle = number.length() / 2;
        int fromMiddle = middle;
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < middle; i++) {
            leftSum += Integer.valueOf(number.charAt(i));
            rightSum += Integer.valueOf(number.charAt(fromMiddle));
            fromMiddle++;
        }
        if (leftSum == rightSum) {
            return true;
        }
        return false;
    }

    /**
     * Description: takes each ticket in the specified range and then uses
     * the iLutsky() method to check lucky or not. If the ticket is a lucky one,
     * the counter increases
     * */
    @Override
    public long countLucky(long min, long max) {
        long counter = 0;
        for (long i = min; i <= max; i++) {
            String ticket = String.valueOf(i);
            boolean isLucky = isLucky(ticket);
            if (isLucky) {
                counter++;
            }
        }
        return counter;
    }
}

class Main {
    public static void main(String[] args) {
        LuckyTicket luckyTicket = new LuckyTicketImpl();
        boolean lucky = luckyTicket.isLucky("1230");
        System.out.println(lucky);

        long l = luckyTicket.countLucky(123456123456L, 123456123465L);
        System.out.println(l);

    }
}
