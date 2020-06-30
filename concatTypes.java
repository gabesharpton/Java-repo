public class concatTypes {
        public static void main(String[] args) {
            byte zero = 0;
            short a = 3;
            int b = 1;
            char d = ' ';
            float e = 2.0f;
            boolean f = true;
            String output = "H" + a + b + b + zero + d + "w" + zero + "r" + b + "d" + d + e + d + f;
            System.out.println(output);
        }
    }
//returns "H3110 w0r1d 2.0 true"