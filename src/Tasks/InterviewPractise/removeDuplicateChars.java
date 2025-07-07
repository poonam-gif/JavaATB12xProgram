package Tasks.InterviewPractise;

public class removeDuplicateChars {
    public static void main(String[] args) {
        String s = "automation" ;

        char[] ch = s.toCharArray();
        boolean[] visited = new boolean[ch.length]; // default false
        System.out.println("Character Frequency:");

       // System.out.print("Unique Characters: ");
        for (int i =0;i<ch.length;i++){
            if (visited[i]) {
                continue; // already counted
            }
            int count =1;
            for (int j=i+1;j<ch.length;j++){
                if(ch[i] ==ch[j]){
                    count = count +1;
                    visited[j] = true; // mark as visited
                }
            }
            visited[i] = true;
            System.out.println("Character '" + ch[i] + "' occurs " + count + " times.");

// Print if it's unique
//            if (count == 1) {
//                System.out.print(ch[i] + " ");
//            }
        }
    }
}
