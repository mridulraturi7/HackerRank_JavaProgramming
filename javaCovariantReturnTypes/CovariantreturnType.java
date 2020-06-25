package javaCovariantReturnTypes;

public class CovariantReturnType {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine().trim();
        Region region = null;
        switch (s) {
          case "WestBengal":
            region = new WestBengal();
            break;
          case "AndhraPradesh":
            region = new AndhraPradesh();
            break;
        }
        Flower flower = region.yourNationalFlower();
        System.out.println(flower.whatsYourName());
      }
    
}