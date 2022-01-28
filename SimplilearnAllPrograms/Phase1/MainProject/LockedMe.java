
import java.io.File;
	import java.io.IOException;
	import java.util.Arrays;
	import java.util.Scanner;

	public class LockedMe {
	    static String DIRECTORY;
	    File file_name;

	    public LockedMe() {
	        DIRECTORY = System.getProperty("user.dir");
	        file_name = new File(DIRECTORY+"/files");
	        if (!file_name.exists())
	            file_name.mkdirs();
	        System.out.println("DIRECTORY : "+ file_name.getAbsolutePath());
	    }

	    private static final String WELCOME_PROMPT =
	               "\n  			LockedMe.com"+
	               "\n			      \n";

	    private static final String MAIN_MENU_PROMPT =
	            "\nMAIN MENU - Please Select any of the following : \n"+
	    
	                    "1 -> To View files in directory\n"+
	                    "2 -> To Add, To Delete or To Search\n"+
	                    "3 -> To Exit Program";

	    private static final String SECONDARY_MENU_PROMPT =
	            "   \n Please Select any of the following: \n"+
	    
	                    "   a -> To Add a file\n"+
	                    "   b -> To Delete a file\n"+
	                    "   c -> To Search a file\n"+
	                    "   d -> To Go Back";

	    void showPrimaryMenu() {
	        System.out.println(MAIN_MENU_PROMPT);
	        try{
	            Scanner scanner = new Scanner(System.in);
	            int option = scanner.nextInt();
	            switch (option){
	                case 1 : {
	                    showFiles();
	                    showPrimaryMenu();
	                }
	                case 2 : {
	                    showSecondaryMenu();
	                }
	                case 3 : {
	                    System.out.println("Thank You");
	                    System.exit(0);
	                }
	                default: showPrimaryMenu();
	            }
	        }
	        catch (Exception e){
	            System.out.println("Please enter 1, 2 or 3");
	            showPrimaryMenu();
	        }
	    }

	    void showSecondaryMenu() {
	        System.out.println(SECONDARY_MENU_PROMPT);
	        try{
	            Scanner scanner = new Scanner(System.in);
	            char[] input = scanner.nextLine().toLowerCase().trim().toCharArray();
	            char option = input[0];

	            switch (option){
	                case 'a' : {
	                    System.out.print("Which File You Want To Add Please Enter a File Name : \n");
	                    String filename = scanner.next().trim().toLowerCase();
	                    addFile(filename);
	                    break;
	                }
	                case 'b' : {
	                    System.out.print("Which File You Want To Delete Please Enter a File Name : \n");
	                    String filename = scanner.next().trim();
	                    deleteFile(filename);
	                    break;
	                }
	                case 'c' : {
	                    System.out.print(" Which File You Want To Search Please Enter a File Name : \n");
	                    String filename = scanner.next().trim();
	                    searchFile(filename);
	                    break;
	                }
	                case 'd' : {
	                    System.out.println("Going Back to MAIN menu");
	                    showPrimaryMenu();
	                    break;
	                }
	                default : System.out.println("Please enter a, b, c or d");
	            }
	            showSecondaryMenu();
	        }
	        catch (Exception e){
	            System.out.println("Please enter a, b, c or d");
	            showSecondaryMenu();
	        }
	    }

	    void showFiles() {
	        if (file_name.list().length==0)
	            System.out.println("The folder is empty");
	        else {
	            String[] list = file_name.list();
	            System.out.println("The files in "+ file_name +" are :");
	            Arrays.sort(list);
	            for (String str:list) {
	                System.out.println(str);
	            }
	        }
	    }

	    void addFile(String filename) throws IOException {
	        File filepath = new File(file_name +"/"+filename);
	        String[] list = file_name.list();
	        for (String file: list) {
	            if (filename.equalsIgnoreCase(file)) {
	                System.out.println("File " + filename + " already exists at " + file_name);
	                return;
	            }
	        }
	        filepath.createNewFile();
	        System.out.println("File "+filename+" added to "+ file_name);
	    }

	    void deleteFile(String filename) {
	        File filepath = new File(file_name +"/"+filename);
	        String[] list = file_name.list();
	        for (String file: list) {
	            if (filename.equals(file) && filepath.delete()) {
	                System.out.println("File " + filename + " deleted from " + file_name);
	                return;
	            }
	        }
	        System.out.println("Delete Operation failed. FILE NOT FOUND");
	    }

	    void searchFile(String filename) {
	        String[] list = file_name.list();
	        for (String file: list) {
	            if (filename.equals(file)) {
	                System.out.println("FOUND : File " + filename + " exists at " + file_name);
	                return;
	            }
	        }
	        System.out.println("File NOT found (FNF)");
	    }

	    public static void main(String[] args) {
	        System.out.println(WELCOME_PROMPT);
	        LockedMe menu = new LockedMe();
	        menu.showPrimaryMenu();
	    }
	}


