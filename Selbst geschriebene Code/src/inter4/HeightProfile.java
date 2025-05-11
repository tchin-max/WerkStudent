package inter4;

public class HeightProfile {
    
	public static char [] Heightforms(int[] height) {//fur jede hohe ein zeichnen geben

        char[]forms = new char[height.length];//Ein Array, das für jede Höhe ein Profilzeichen speichert.
        int length = height.length;//lange von heigth um schleifen zu steuern
        forms[0]=(height[1]>height[0])?'/' : (height[0]>height[1]) ?'\\' : '_';
	
        for(int i=1;i < length-1;i++) {//ieteriert das array ohne ersten und letzten Element,1 elment keinen linken Nachbar hat
		if(height[i-1]==height[i]) {//wenn aktuele punkt gleich als voeherigen ist es ein plateau
			forms[i]=(height[i]<height[i+1])?'/' : '_';

		}else if(height[i-1]<height[i]){
			forms[i]=(height[i]<height[i+1])?'/' : (height[i]>height[i+1]) ? '^' :'_';
	}else {
		forms[i]='\\';
	}
	}
       forms[length-1] = (height[length-1]<height[length-2])? '\\' : '_';
       
       return forms;
        
	}
	public static void drawHeightProfile(int[] height) {
	    char[] forms =Heightforms (height);
	    int maxHeight = 0;//hochste hohe .profil von oben nach unten zu zeichnen

	   
	    for (int h : height) {
	        if (h > maxHeight) {
	            maxHeight = h;
	        }
	    }

	    // Höhenprofil von oben nach unten zeichnen
	    for (int i = maxHeight; i >= 0; i--) {
	        System.out.printf("%2d ", i); // Höhe beschriften
	        for (int j = 0; j < height.length; j++) {
	            if (height[j] == i) {
	                System.out.print(forms[j]); // Profilzeichen
	            } else if (height[j] > i) {
	                System.out.print(" "); // Füllzeichen für Höhe
	            } else {
	                System.out.print(" "); // Leerzeichen
	            }
	        }
	        System.out.println(); // Zeilenumbruch am Ende jeder Zeile
	    }
	}




public static void main (String [] args) {
	
	int[] Height = {0, 1, 2, 3, 3, 3, 4, 4, 5, 6, 7, 6, 5, 5, 5, 4, 3, 2, 1, 0};
	drawHeightProfile(Height);
}
}