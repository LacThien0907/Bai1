public class App {
    public static void main(String[] args) {
//        Đếm số từ viết in hoa trong chuỗi
//        Viết in hoa toàn bộ chữ đầu của các từ trong chuỗi đó
//        Chuyển ký tự đầu tiên của chuỗi hoặc ký tự đầu tiên của từ sau dấu chấm là viết in hoa,
//        các chữ con lại viết thường

        String str = "You Only Live Once. But if You do it right. once is Enough";
        System.out.println("Cho chuỗi sau: " + str);

        // Đếm số từ viết in hoa trong chuỗi
        char ch;
        int uppercase = 0;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            int asciivalue = (int) ch;
            if (asciivalue >= 65 && asciivalue <= 90) {
                uppercase = uppercase + 1 ;
            }

        System.out.println("Số từ viết in hoa trong chuỗi: " + uppercase);

        }
        // Viết in hoa toàn bộ chữ đầu của các từ trong chuỗi đó
        char[] charArray = str.toCharArray();
        boolean foundSpace = true;
        //sử dụng vòng lặp for để duyệt các phần tử trong charArray
        for(int i = 0; i < charArray.length; i++) {
            // nếu phần tử trong mảng là một chữ cái
            if(Character.isLetter(charArray[i])) {
                // kiểm tra khoảng trắng có trước chữ cái
                if(foundSpace) {
                    //đổi chữ cái thành chữ in hoa bằng phương thức toUpperCase()
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    foundSpace = false;
                }
            }
            else {
                foundSpace = true;
            }
        }
        // chuyển đổi mảng char thành string
        str = String.valueOf(charArray);
        System.out.println("Chuỗi sau khi đổi: \n" + str);

        System.out.println("\n---------------------------------");


    }
}
