package quiz;

public class ListSplitter {
    public static void main(String[] args) {
        String data = "1234";

        int combinations = (int) Math.pow(2, data.length() - 1);
        for(int c = 0; c < combinations; c++) {
            String pattern = "";
            int half = (int)combinations / 2;
            while(half >= 1) {
                pattern += Integer.toString((int)(c/half) % 2);
                half = (int)half / 2;
            }
            System.out.println(tokenize(pattern, data));
        }
    }

    private static String tokenize(String pattern, String data) {

        int patternIndex = 0;
        int dataIndex = 0;
        String result="";

        for(int index = 0; index < (data.length() * 2) - 1; index++) {
            if(index % 2 == 0) {
                result += data.charAt(dataIndex++);
            }
            else {
                if(pattern.charAt(patternIndex++) == '1') {
                    result += ",";
                }
            }
        }
        return result;
    }
}
