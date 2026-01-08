public class Pr3{
	public static void main (String[] args){
		String name = " 1 YUVRAJ";
		String name2 = name.toLowerCase();
		System.out.println(name2);
		
		String P2 = " Yadav Yuvraj Singh";
		System.out.println(P2.replace(" ","_"));
		
		// replace ka use kiya hai isme  uska special operator ka sath <|replace|>
		String P3 = " Dear <|name|>,Thanks a lot";  //<|   |> replace karne ka liya aese aur yah koi speific ka ko replace karne ka liya use karte hai especially symbol 
		System.out.println(P3.replace("<|name|>","Yuvraj"));
		
		// indexOf ka use kiya hai isme space find karne ka liya 
		String P4 = " This is the   best    program "; 
		System.out.println(P4.indexOf("   "));
		System.out.println(P4.indexOf("    "));


		String P5 = "Dear Yuvraj ,\n\t This is future";
		System.out.println(P5);
	}
	
}