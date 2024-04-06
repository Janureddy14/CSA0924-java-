import java.util.*;
class ReverseWord{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String inputString, reversedString;
        System.out.print("Enter a String:");
        inputString = s.nextLine();
        reversedString = reverseString(inputString);
        System.out.println("The Reversed string is:"+reversedString);
    }
    public static String reverseString(String input)
    {
        char[] charArray = input.toCharArray();
        int start = 0;
        int end = input.length() - 1;
        while(start<end)
        {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        return new String(charArray);
    }
}
