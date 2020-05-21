public static void main(String[] ignored) {
   Scanner in = new Scanner(System.in);
   tring name= prompt(in);
   S = prompt(in);
   System.out.println("Your name is "+name);
}

private static String prompt(Scanner in){
  System.out.println("Please enter your name");
  return in.nextLine();
}



private static int countChar(String name){
	return name.length();
}