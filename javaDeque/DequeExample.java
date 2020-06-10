package javaDeque;

public class DequeExample {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();

        HashSet<Integer> myHash = new HashSet<>();
        int unique = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();

            deque.add(num);
            myHash.add(num);

            if(deque.size() == m)
            {
                if(myHash.size() > unique)
                {
                    unique = myHash.size();
                }
                int f = deque.remove();
                if(!deque.contains(f))
                {
                    myHash.remove(f);
                }
            }
        }
        System.out.println(unique);
    }            
    
}