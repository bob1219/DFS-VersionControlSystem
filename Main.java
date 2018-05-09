class Main {
	public static void main(String[] args) {
		try {
			if(args.length == 1) {
				String.out.println("Usage: java vcs.jar [command] <args>");
				System.exit(1);
			}

			CommandProcess(args);
		}
		catch(Exception e) {
			System.out.println("Error: " + e);
			System.exit(1);
		}
	}
}
