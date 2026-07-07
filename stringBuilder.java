public class stringBuilder {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        // System.out.println("Character at index 1 is " + sb.charAt(0));

        //Modifying character at index

        // sb.setCharAt(0, 'P');
        // System.out.println("After replacing the character at first index " + sb);

        //Inserting a character

        // sb.insert(2, 'n');
        // System.out.println("String after inserting at index 2 " + sb);

        //Reverse a String
        for(int i = 0;i < sb.length()/2;i++){
            int front = i;
            int back = sb.length() - 1 - i;
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}
