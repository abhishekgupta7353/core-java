public class fclass {
    public static void main(String[] args) {
        System.out.println("my name is abhishek kumar");
        int age = 71;
        if(age>=18){
            System.out.println("your age is above 18");
        }
        /*  conditional statement / decision making statement
        --- there are four type of conditional statement---
        1. if 
        2. if alse 
        3. if else if
        4. switch case
        */
        // 1. if 
        int age1 = 20;
        if(age1>=19){
            System.out.println("you age is above 19");
        }

        // 2. if alse
        int number = 15;
        if(number%2==0){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
        // 3. if else if
        int marks = 50;
        if(marks<50){
            System.out.println("you are fail");
        }else if(marks>=50 && marks<=60){
            System.out.println("d grade");
        }else if(marks>=60 && marks<=70){
            System.out.println("c grade");
        }else if(marks>=70 && marks<=80){
            System.out.println("grade b");
        }else if(marks>=80 && marks<=90){
            System.out.println("grade a");
        }else if(marks>=90 && marks<=100){
            System.out.println("grade a+");
        }else{
            System.out.println("non any grade");
        }

        // 4. switch case 

        int num = 35;
        switch(num){
            case 20:
            System.out.println("20");
            break;
            case 25:
            System.out.println("25");
            break;
            case 35:
            System.out.println("35");
            break;
        }
        
    }
}
