
package laboratory.exercise.pkg7;


public class Test {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5};
        int n = array.length;
        System.out.println("Original Array");
        
        //Diplay the Original array
        for(int i=0 ; i<n ; i++){
            System.out.print(array[i]+ " ");
        }
        
        System.out.println(" ");
        
        //increment the value by 1
        for(int i=0; i<n ; i++){
            array[i]=array[i]+1;
        }
        
        //Display the update array
        System.out.println("Update array ");
        
        for(int i=0 ; i<n ; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println(" ");
        
        //Display the reverse array
        System.out.println("Reverse array");
        
        for(int i=(n - 1) ; i>=0 ; i--){
            System.out.print(array[i]+" ");
        }
        System.out.println(" ");
        
        //Display the minimum, maximum, total and average
        
        int min = array [0] ;
        int max = array [0] ;
        int sum = 0 ;
        
        for (int i : array){
            if (i > max){
                max = i;
            }
            
            if (i < min){
                min = i;
            }
            
            sum += i;
        }
        
        System.out.println("Minimum Number : "+ min);
        System.out.println("Maximum Number : "+ max);
        System.out.println("Total Number : "+ sum);
        
        double average = sum /n ;
        System.out.println("Average : " + average); 
       
        
        //Q1.part 2
        
        String strarr[]={"Lakshan " , "  to" , "java " , " aruna " , "ruvan " , "laptop"};
        
        for(int i = 0; i<strarr.length ;i++){
            String newStr = strarr[i].trim();
            System.out.println(newStr);
        }
        
        //Concatenate array
        
        String conStr = "" ;
        for (String i : strarr ){
            conStr += i ;
        }
        System.out.println(conStr);
        
        int splitIndex = conStr.length()/2;
        System.out.println("splitIndex : " + splitIndex );
        
        String firstHalf = conStr.substring(0,splitIndex);
        String secondHalf = conStr.substring(splitIndex);
        
        System.out.println("First Half : " + firstHalf);
        System.out.println("Second Half : " + secondHalf);
        
        System.out.println("First Half in uppercase : " + firstHalf.toLowerCase());
        System.out.println("Second Half in uppercase : " + secondHalf.toUpperCase());
        
        Circle[] cirArr = new Circle[5];
        
        cirArr[0] = new Circle (3);
        cirArr[1] = new Circle (4);
        cirArr[2] = new Circle (5);
        cirArr[3] = new Circle (6);
        cirArr[4] = new Circle (7);
        
        for (int i=0 ; i<cirArr.length;i++){
            cirArr[i].setRadius(cirArr[i].getRadius()*140/100);
            System.out.println("New Radius : " + cirArr[i].getRadius());
        }
        
        double total = 0;
        for (Circle cirArr1 : cirArr){
            total += cirArr1.getRadius();
        }
        double averageR = total/cirArr.length;
        System.out.println("Average Radius :" + averageR);
    }
}
