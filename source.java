public static void main(String[] ignored) {
   Scanner in = new Scanner(System.in);
   String x = prompt(in);

   System.out.println("Your name is "+x);
}

private static String prompt(Scanner in){
  System.out.println("Please enter your name");
  return in.nextLine();
}

