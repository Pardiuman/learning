package part1;

public class StringTwo {

    public static void main(String[] args) {
        /*int number=10;
        double sqr=Math.sqrt(number);
        System.out.println(sqr);


        int num=5;
        int ans=0;
        while(num>=0){
            ans+=num;
            num--;
        }
        System.out.println(ans);

        Scanner scn=new Scanner(System.in);
        String str="";

        while(str!="no"){
            System.out.println("shall we carry on?");
            str=scn.next();
            if(str.equals("no"))
                break;
        }

        int n=10;

        while(n!=0) {
            System.out.println("input 0 to exit");
            n=scn.nextInt();
//            if(n==0)
//                break;

        }

        print(10);*/


        // Strings topic

        String Str = "pardium";
        String str1="pardium";

        str1 = "dhankhar";
        System.out.println(str1);
//        Str="dhankhar";
        System.out.println(Str);


        String name = new String("Pardium Dhankhar");
        String lname=new String("Pardium Dhankhar");
        System.out.println(name);

        String abc="";
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            abc+=ch;
        }
        System.out.println(abc);

        StringBuilder alpha = new StringBuilder();
        for(int i=0; i<26; i++){
            char ch = (char)('a'+i);
            alpha.append(ch);
        }
        System.out.println(alpha);
//        System.out.println(abc);
        /*ArrayList<String> person=new ArrayList<>();
        Scanner scn=new Scanner(System.in);
        while(true){
            System.out.println("enter name:- ");
            String pname=scn.nextLine();
            if(pname.isEmpty())
                break;
            person.add(new person);
        }
        System.out.println(person);*/

        StringBuilder sBuild = new StringBuilder("abrakadabra");

    }

    public static int print(int number) {
        int ans = 0;
//        while(ans!=number){
//            System.out.println(ans);
//            ans++;
        System.out.println(number);
        if (number == 1)
            return ans;

        return print(number-1);



    }
}
