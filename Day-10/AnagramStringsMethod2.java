public class AnagramStringsMethod2 {
    public static void main(String[] args) throws Exception {
        String a = "l%ist8en";
        String b = "silent%8";

        boolean isAnagram = true;

        int al[] = new int [256];
        // int bl[] = new int [256];

        for (char c : a.toCharArray()) {
            int pos = (int) c;
            al[pos]++;
        }

        for (char c : b.toCharArray()) {
            int pos = (int) c;
            al[pos]--;
        }

        for (int i = 0; i < al.length; i++) {
            if(al[i] != 0) {
                isAnagram=false;
                break;
            }
        }

        if (isAnagram) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
        
    }
}
