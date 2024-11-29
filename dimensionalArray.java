public class Main {
	public static void main(String[] args) { 
	char [] key= {'D','B','D','C','C','D','A','E','A','D'}; 
	char [] [] studentAnswer = {
{'A','B','A','C','C','D','E','E','A','D'},
{'D','B','A','B','C','A','E','E','A','D'},
{'E','D','D','A','C','B','E','E','A','D'},
{'C','B','A','E','D','C','E','E','A','D'},
{'A','B','D','C','C','D','E','E','A','D'},
{'B','B','E','C','C','D','E','E','A','D'},
{'B','B','A','C','C','D','E','E','A','D'},
{'E','B','E','C','C','D','E','E','A','D'}};
   for (int i = 0; i < studentAnswer.length; i++) { 
   int count = 0;
   
		    for (int j = 0; j < studentAnswer.length; j++) {
		        if (studentAnswer [i] [j] == key[j]){
		       count++;
		         }
		    }
		    }
		  System.out.println("Student " + studentAnswer);
	}
}