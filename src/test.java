public class test {
    public static void main(String[] args){
        int [] mylist;
        mylist = new int[500];
        for (int i = 1; i <= 500; i++) {
            mylist[i-1] = i;
        }
        //for (int x : mylist ){
           // if (x % 2 != 0 && x < 340){
                //System.out.println(x);
          //  }
        //}

        for (int y: mylist){
            if (y % 3 == 0 || y % 5 == 0 || y % 8 == 0){
                System.out.println(y);
            }
        }
        }

    }

