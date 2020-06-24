public class Classroom {

    public static void main(String[] args) {

        // Jean Claude est une nouvelle instance de Wild class
        Wilder jean_claude = new Wilder("Jean Claude", true);

	System.out.println(jean_claude.whoAmI());

        jean_claude.setAware(false); // change l'état de ean Claude

	System.out.println(jean_claude.whoAmI());
        // Michel est une nouvelle instance de Wild class
        Wilder michel = new Wilder("Michel", false);
         
	System.out.println(michel.whoAmI());

    }
}
