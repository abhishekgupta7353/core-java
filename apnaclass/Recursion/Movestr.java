package Recursion;

public class Movestr {
    public static void moveAllx(String str,int index,int cunt,String newstr) {
        if(index==str.length()){
            for(int i=0; i<cunt; i++){
              newstr = newstr+'x';
            }
            System.out.println(newstr);
            return;
        }
        char currchar = str.charAt(index);
        if(currchar == 'x'){
            moveAllx(str, index+1, cunt+1, newstr);
        }else{
            newstr = newstr+currchar;
            moveAllx(str, index+1, cunt, newstr);
        }
    }
    public static void main(String[] args) {
        String str = "abxhxfxoxftxsdxsdxlkxxxiuhxbxx";
        moveAllx(str, 0, 0, " ");
    }
}
