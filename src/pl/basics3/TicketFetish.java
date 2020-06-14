package pl.basics3;

public class TicketFetish {
    /*
    Paul loves to ride public transport and after receiving the ticket, he immediately checks whether he got
    the lucky one. A ticket is considered a lucky one if the sum of the first three numbers in this ticket matches
    the sum of the last three numbers in the same ticket.

However, Paul does not count well in his head. That is why he asks you to write the program, which will check
 the equality of the sums and display "Lucky" if the sums match, and "Regular" if the sums differ.
     */

    public static boolean isTicketLucky(String ticketNo) {
        int first3 = 0;
        int last3 = 0;
        if (ticketNo == null || ticketNo.length() < 6) {
            return false;
        }
        try {
            for (String s : ticketNo.substring(0, 3).split("")) {
                first3 += Integer.parseInt(s);
            }
            for (String s : ticketNo.substring(ticketNo.length() - 3).split("")) {
                last3 += Integer.parseInt(s);
            }
        } catch (NumberFormatException e) {
            System.out.println("Cannot parse number.");
            return false;
        }
        System.out.println(first3 + " " + last3 + " " + ticketNo);
        return last3 == first3;
    }
}
