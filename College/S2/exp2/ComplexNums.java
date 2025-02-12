package College.S2.exp2;
import java.util.Scanner;
public class ComplexNums {
    String expression;
    int real,imaginary;
    char sign;
    ComplexNums(String expression){
        this.expression=expression;
        trim();
        // System.out.println("Real no : "+real);
        // System.out.println("Imaginary no : "+imaginary);
        // System.out.println("Expression contains : "+this.sign);
    }

    public int giveCount(String str,char check){
        int cnt=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==check)cnt++;
        }
        return cnt;
    }

    public void trim(){
        int plus=giveCount(expression, '+');
        int minus=giveCount(expression, '-');
        if(plus==1&& minus==0){
            //1+2i
            int index=expression.indexOf('+');
            this.real=Integer.parseInt(expression.substring(0,index));
            this.imaginary=Integer.parseInt(expression.substring(index+1,expression.length()-1));
        } else if(plus==0&& minus==1){
            //1-2i
            int index=expression.indexOf('-');
            this.real=Integer.parseInt(expression.substring(0,index));
            this.imaginary=-Integer.parseInt(expression.substring(index+1,expression.length()-1));
        } else if(plus==1 && minus==1){
            //-1+2i
            int index=expression.indexOf('+');
            this.real=-Integer.parseInt(expression.substring(1,index));
            this.imaginary=Integer.parseInt(expression.substring(index+1,expression.length()-1));
        }else if(minus==2){
            //-1-2i
            int index=expression.indexOf('-',2);
            this.real=-Integer.parseInt(expression.substring(1,index));
            this.imaginary=-Integer.parseInt(expression.substring(index+1,expression.length()-1));
        }
   
        
    }

    public static String giveSum(ComplexNums obj1,ComplexNums obj2){  
        // System.out.println("obj1.real = "+obj1.real);
        // System.out.println("obj2.real = "+obj2.real);

        int realSum=obj1.real+obj2.real;
        int imaginarySum=obj1.imaginary+obj2.imaginary;
        String ret="";
        // System.out.println("realum = "+realSum);
        // System.out.println("ImaginarySum = "+imaginarySum);
        
        if(realSum>=0){
            ret+=(String.valueOf(realSum));
        } else {
            ret+=(String.valueOf(realSum));
        }

        if(imaginarySum>=0){
            ret+='+'+String.valueOf(imaginarySum);
        } else {
            ret+=String.valueOf(imaginarySum);
        }
        return ret+"i";
    }


    public static String giveDiff(ComplexNums obj1,ComplexNums obj2){
        int realDiff=(obj1.real-obj2.real);
        int imaginaryDiff=(obj1.imaginary-obj2.imaginary);
        String ret="";
        if(realDiff>=0){
            ret+=(String.valueOf(realDiff));
        } else {
            ret+=(String.valueOf(realDiff));
        }

        if(imaginaryDiff>=0){
            ret+='+'+String.valueOf(imaginaryDiff);
        } else {
            ret+=String.valueOf(imaginaryDiff);
        }
        return ret+"i";
    }

    public static String giveProd(ComplexNums obj1,ComplexNums obj2){
        int realProd=(obj1.real*obj2.real);
        int imaginaryProd=(obj1.imaginary*obj2.imaginary);
        String ret="";
        if(realProd>=0){
            ret+=(String.valueOf(realProd));
        } else {
            ret+=('-'+String.valueOf(realProd));
        }

        if(imaginaryProd>=0){
            ret+='+'+String.valueOf(imaginaryProd);
        } else {
            ret+=String.valueOf(imaginaryProd);
        }
        return ret+"i";
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String expression1,expression2;
        System.out.print("Enter complex no 1 : ");
        expression1=input.next();
        System.out.print("Enter complex no 2 : ");
        expression2=input.next();
        ComplexNums obj1=new ComplexNums(expression1);
        ComplexNums obj2=new ComplexNums(expression2);
        System.out.println("Addtion of these two Complex numbers is : "+giveSum(obj1, obj2));
        System.out.println("Differance of these two Complex numbers is : "+giveDiff(obj1, obj2));
        System.out.println("Product of these two Complex numbers is : "+giveProd(obj1, obj2));
    }
}



// int index=expression.indexOf('+');
// if(index<0){
//     index=expression.indexOf('-');
//     if(index<0){
//         System.out.println("invlid expression");
//         return;
//     } 
//     this.sign='-';
//     String realPart=expression.substring(0,index);
//     String imaginaryPart=expression.substring(index+1,expression.length()-1);
//     this.real=Integer.parseInt(realPart);
//     this.imaginary=-(Integer.parseInt(imaginaryPart));
// } else {
//     this.sign='+';
//     String realPart=expression.substring(0,index);
//     String imaginaryPart=expression.substring(index+1,expression.length()-1);
//     if(realPart.contains("-")){
//         this.real=-(Integer.parseInt(realPart));
//     } else {
//         this.real=Integer.parseInt(realPart);
//     }

//     this.imaginary=Integer.parseInt(imaginaryPart);
// }


