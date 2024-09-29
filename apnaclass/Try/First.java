package Try;

public class First {
    public static void moveAllx(String str,int index,int count,String newstr)
    { 
    if(index == str.length()){
        for(int i =0; i<count; i++){
            newstr = newstr+'x';
        }
        System.out.println(newstr);
        return;
    }  
    char currChar = str.charAt(index); 
    if(currChar=='x'){
        count++;
        moveAllx(str, index+1, count, newstr);
    }else{
        newstr = newstr+currChar;
        moveAllx(str, index+1, count, newstr);
    }
}
public static void main(String[] args) {
    String str = "aytxtsrexryyerdxlyhuxpoiipxokotfxeyrdtvx";
    moveAllx(str, 0, 0, "");
}

}
