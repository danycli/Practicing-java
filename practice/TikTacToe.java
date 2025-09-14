public class TikTacToe {
    static void table(char a, char b,char c,char d, char e, char f, char g, char h, char i){
        System.out.println("     |     |");
        System.out.println("   "+a+" |  "+b+"  |  "+c+"");
        System.out.println("_____|_____|_____");
        System.out.println("     |     |");
        System.out.println("   "+d+" |  "+e+"  |  "+f+"");
        System.out.println("_____|_____|_____");
        System.out.println("     |     |");
        System.out.println("   "+g+" |  "+h+"  |  "+i+"");
        System.out.println("     |     |");
    }
    static void main(String[] args){
        char a='1',b='2',c='3',d='4',e='5',f='6',g='7',h='8',i='9';
        table(a,b,c,d,e,f,g,h,i);
        char ch;
        int move = 0;
        
    }
}
