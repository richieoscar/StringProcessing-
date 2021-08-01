public class Part3 {

    public boolean twoOccurence(String a, String b) {
        boolean itOccurs = false;
        int res = b.indexOf(a);
        int endOfB = b.length() - 1;
        if (res == -1) {
            System.out.println( a +" was not found in " + b);
            return itOccurs;
        }
        else if (res != -1 && res != endOfB) {
            System.out.println("First occurence at index " + res);
            int res2 = b.indexOf(a, res + 1);
            if (res2 != -1) {
                itOccurs = true;
                System.out.println("Second occurence at index " + res2);
            }
        }

        return itOccurs;
    }


    public String lastPart(String find, String in){
       int index = in.indexOf(find);
       String sub ="";
       if(index == -1){
           sub = in;
       }
       if(index == 0){
            sub = in.substring(index + find.length());
       }
       if(index >0 && find.length() ==1){
          sub = in.substring(index +find.length()); 
       }
       if(index > 0 && find.length()>1 ){
           sub = in.substring(index + find.length());
       }
       if(index == in.length()-1){
           sub = "End of String";
       }
       
       System.out.println("Index =" +index);
       return sub;
    }

    public String reverseString(String s){
        String[] chars = s.split("");
        int len = chars.length ;
        int d = 1;
        for(int i =0; i<chars.length; i++){
            chars[i] = chars[len - d];
            d++;
        }
        return chars.toString();
    }
}
