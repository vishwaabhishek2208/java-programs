public class Demo3 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(isr);

        String name = br.readLine();

        System.out.println(name);
    }

}

/*
 * 1. Aditya --> I/p
 * 2. OS Buffer (65, 100, 105, 116, 121, 97)
 * 3. System.in(InputStream) recieves bytes
 * 4. InputStream --> readLine --> Aditya --> name
 * ('A', 'd', 'i', 't', 'y', 'a')
 * 5. BufferedReader --> readLinr -->Aditya --> name
 * 6. Aditya --> O/p
 */
