public class CodeGuruExample {
    public static void main(String[] args) {
        String[] names = new String[5];
        names[0] = "Alice";
        names[1] = "Bob";
        names[2] = "Charlie";

        for (int i = 0; i < 5; i++) {
            System.out.println(names[i].length()); // Potential NPE here
        }

        List<String> items = null;

        if (items.isEmpty()) { // Potential NPE here
            System.out.println("List is empty.");
        }

        try {
            FileReader fileReader = new FileReader("nonexistent-file.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
