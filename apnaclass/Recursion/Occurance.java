package Recursion;

public class Occurance {
    public static int first = -1;
    public static int last = -1;
    public static void findOccurance(String str, int index , char el) {
        if(index == str.length()){
            return;
        }
        if(str.charAt(index)== el){
          if( first == -1){
            first = index;
          }else{
            last = index;
          }
        }
        findOccurance(str, index+1, el);
    }
    public static void main(String[] args) {
        String str = "ababab";
        char el = 'a';
        findOccurance(str, 0, el);
        System.out.println("first occurance is :-" +first);
        System.out.println("last occurance is :-" +last);

    }
}
 