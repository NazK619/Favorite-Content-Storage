import java.util.ArrayList;
import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Object> contents = new ArrayList<>();
        int choice = -1;
        System.out.println("[Content Manager]\n");

        while (choice != 0) {
            
            System.out.println("1. Add written content");
            System.out.println("2. Add image content");
            System.out.println("3. Add audio content");
            System.out.println("4. Add video content");
            System.out.println("5. List all content");
            System.out.println("0. Quit");
            System.out.print("Enter option: ");

            if (!scan.hasNextInt()) {
                scan.nextLine();
                continue;
            }
            choice = scan.nextInt();
            scan.nextLine(); 
            System.out.println();

            switch (choice) {
                case 1: { // written 
                    System.out.print("Enter content's name: ");
                    String name = scan.nextLine();
                    System.out.print("Enter content's description: ");
                    String description = scan.nextLine();
                    System.out.print("Where is the content stored? ");
                    String location = scan.nextLine();
                    System.out.print("Enter author's name: ");
                    String author = scan.nextLine();
                    System.out.print("Enter number of words: ");
                    int wordCount = scan.nextInt();
                    scan.nextLine();

                    contents.add(new WrittenContent(name, description, location, author));
                    System.out.println("Content added.\n");
                    break;
                }
                case 2: { // Image 
                    System.out.print("Enter content's name: ");
                    String name = scan.nextLine();
                    System.out.print("Enter content's description: ");
                    String description = scan.nextLine();
                    System.out.print("Where is the content stored? ");
                    String location = scan.nextLine();
                    System.out.print("Enter author's name: ");
                    String author = scan.nextLine();
                    System.out.print("Enter image's width: ");
                    int width = scan.nextInt();
                    System.out.print("Enter image's height: ");
                    int height = scan.nextInt();
                    scan.nextLine();

                    contents.add(new ImageContent(name, description, location, author, new int[]{width, height}));
                    System.out.println("Content added.\n");
                    break;
                }
                case 3: { // Audio Conent
                    System.out.print("Enter content's name: ");
                    String name = scan.nextLine();
                    System.out.print("Enter content's description: ");
                    String description = scan.nextLine();
                    System.out.print("Where is the content stored? ");
                    String location = scan.nextLine();
                    System.out.print("Enter duration, in milliseconds: ");
                    int duration = scan.nextInt();
                    scan.nextLine();

                    System.out.println("Enter the name of every participant, or blank to finish.");
                    ArrayList participants = new ArrayList<>();
                    while (true) {
                        System.out.print("Enter participant: ");
                        String p = scan.nextLine();
                        if (p.trim().isEmpty()) {
                            break;
                        }
                        participants.add(p);
                    }

                    contents.add(new AudioContent(name, description, location, duration, participants));
                    System.out.println("Content added.\n");
                    break;
                }
                case 4: { // Video 
                    System.out.print("Enter content's name: ");
                    String name = scan.nextLine();
                    System.out.print("Enter content's description: ");
                    String description = scan.nextLine();
                    System.out.print("Where is the content stored? ");
                    String location = scan.nextLine();
                    System.out.print("Enter duration, in milliseconds: ");
                    int duration = scan.nextInt();
                    System.out.print("Enter resolution: ");
                    int resolution = scan.nextInt();
                    scan.nextLine();

                    contents.add(new VideoContent(name, description, location, duration, resolution));
                    System.out.println("Content added.\n");
                    break;
                }
                case 5: { // List all 
                    if (contents.isEmpty()) {
                        System.out.println("List of contents is empty.\n");
                    } else {
                        System.out.println("List of contents:");
                        for (Object c : contents) {
                            System.out.println(c.toString());
                            System.out.println();
                        }
                    }
                    break;
                }
                case 0:
                    System.out.println("Shutting off...");
                    break;
                default:
                    break;
            }
        }
        scan.close();
    }
}