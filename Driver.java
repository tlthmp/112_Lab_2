import java.util.ArrayList;

public class Driver {

public static void main (String[] args){
int oddNumbers = 1;	
int[][] intArray = new int [6][6];
for (int row = 0; row < intArray.length; row++){
	for(int col = 0; col < intArray[row].length; col++){
		intArray[row][col] = oddNumbers;
		oddNumbers += 2;
	}
	
}
for (int row = 0; row < intArray.length; row++){
	System.out.println();
	for(int col = 0; col < intArray.length; col++){
		System.out.print(intArray[row][col] + " ");
	}
}

System.out.println();
System.out.println();
int evenNumbers = 2; 
ArrayList<Integer> evenNumberList = new ArrayList<>();
for (int i = 0; i < 12; i++){
evenNumberList.add(evenNumbers);
evenNumbers += 2;
}
System.out.println(evenNumberList.size());
System.out.println();
System.out.print(evenNumberList);
evenNumberList.remove(3);
evenNumberList.remove(7);
System.out.println(evenNumberList);

}
}
