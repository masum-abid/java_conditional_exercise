//Problem 3:1Extract the transaction ID from the HTML body

public class extractTrans {
    public static void main(String[] args) {
        String htmlBody = "<html> + ' ' + <title> + ' ' + Test + ' ' + </title> + ' ' + <body> + ' ' + Your trnx is successful. + ' ' + Trnx Id is: TXN123456 + ' ' + </body> + ' ' + </html>";
        int Index = htmlBody.indexOf("TXN");
        System.out.println(htmlBody.substring(Index, htmlBody.length() - 31));
      }
}
