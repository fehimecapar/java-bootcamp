
public class stringsDemo {

	public static void main(String[] args) {
		
		String text = "Bugün hava çok güzel";
		
//		System.out.println("count of txt "+ text.length());
//		System.out.println("data of 5 index "+ text.charAt(4));
//		System.out.println(text.concat("yaşasın!"));
//		text = text.concat("yaşasın!");
//		System.out.println(text.startsWith("b"));
//		System.out.println(text.endsWith("!"));
//		
//		char[] characters = new char[5];
//		text.getChars(0, 4, characters, 0);
//		System.out.println(characters);
//		System.out.println(text.indexOf("a")); // ilk bulduğu a harfinde aramayı bitirir
//		System.out.println(text.lastIndexOf("a"));
		
		
		// part-18 Strings-2
		
		System.out.println(text.replace("Bugün", "Yarın"));
		System.out.println(text.substring(2));
		System.out.println(text.substring(2,4)); //2'den başla 4'e kadar, 4. index dahil değil
//		System.out.println(text.split(" "));
		
		for(String word:text.split(" ")) {
			
			System.out.println(word);
		}
		

	}

}
