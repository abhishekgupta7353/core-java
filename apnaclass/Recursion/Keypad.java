package Recursion;

public class Keypad {
    public static String[] keypads = {".","abc","def","ghi","jkl",
"mno","pqrs","tu","vwx","yz"};

public static void printCom(String str, int index, String combination) {
    if(index==str.length()){
        System.out.println(combination);
        return;
    }
    char currchar = str.charAt(index);
    String mapping = keypads[currchar-'0'];
    for(int i=0; i<mapping.length(); i++){
       printCom(str, index+1, combination+mapping.charAt(i));
    }
}
public static void main(String[] args) {
    String str = "23";
    printCom(str, 0, "");
}
}
