package practice;
import java.util.Scanner;
public class TicTacToe{
    public static void main(String[] args) {
        char a = '1', b = '2', c = '3', d = '4', e = '5', f = '6', g = '7', h = '8', i = '9';
        table(a, b, c, d, e, f, g, h, i);
        Scanner pl = new Scanner(System.in);
        int p1;
        int p2;
        int num = 1;
        int move = 1;
        int player = 1;
        while (player == 1 || player == 2) {
            if (move > 9) {
                break;
            }
            if (player == 1) {
                System.out.println("Player 1(X) turns(1-9):");
                p1 = pl.nextInt();
                while (p1 < 1 || p1 > 9) {
                    System.out.println("Invalid Input!");
                    p1 = pl.nextInt();
                }
                while (p1 > 0 && p1 < 10) {
                    if (p1 == 1 && a != 'X' && a != 'O') {
                        a = 'X';
                        break;
                    } else if (p1 == 2 && b != 'X' && b != 'O') {
                        b = 'X';
                        break;
                    } else if (p1 == 3 && c != 'X' && c != 'O') {
                        c = 'X';
                        break;
                    } else if (p1 == 4 && d != 'X' && d != 'O') {
                        d = 'X';
                        break;
                    } else if (p1 == 5 && e != 'X' && e != 'O') {
                        e = 'X';
                        break;
                    } else if (p1 == 6 && f != 'X' && f != 'O') {
                        f = 'X';
                        break;
                    } else if (p1 == 7 && g != 'X' && g != 'O') {
                        g = 'X';
                        break;
                    } else if (p1 == 8 && h != 'X' && h != 'O') {
                        h = 'X';
                        break;
                    } else if (p1 == 9 && i != 'X' && i != 'O') {
                        i = 'X';
                        break;
                    } else {
                        System.out.println("Invalid Input!");
                        p1 = pl.nextInt();
                    }
                }
                table(a, b, c, d, e, f, g, h, i);
                move++;
                player++;
                if ((a == 'X' && b == 'X' && c == 'X') ||
                        (d == 'X' && e == 'X' && f == 'X') ||
                        (g == 'X' && h == 'X' && i == 'X') ||
                        (a == 'X' && e == 'X' && i == 'X') ||
                        (c == 'X' && e == 'X' && g == 'X') ||
                        (a == 'X' && d == 'X' && g == 'X') ||
                        (b == 'X' && e == 'X' && h == 'X') ||
                        (c == 'X' && f == 'X' && i == 'X')) {
                    System.out.println("Player 1 wins**");
                    num = 2;
                    break;
                }
            }
            if (move > 9) {
                break;
            }
            if (player == 2) {
                System.out.println("Player 2(O) turns(1-9):");
                p2 = pl.nextInt();
                while (p2 < 1 || p2 > 9) {
                    System.out.println("Invalid Input!");
                    p2 = pl.nextInt();
                }
                while (p2 > 0 && p2 < 10) {
                    if (p2 == 1 && a != 'X' && a != 'O') {
                        a = 'O';
                        break;
                    } else if (p2 == 2 && b != 'X' && b != 'O') {
                        b = 'O';
                        break;
                    } else if (p2 == 3 && c != 'X' && c != 'O') {
                        c = 'O';
                        break;
                    } else if (p2 == 4 && d != 'X' && d != 'O') {
                        d = 'O';
                        break;
                    } else if (p2 == 5 && e != 'X' && e != 'O') {
                        e = 'O';
                        break;
                    } else if (p2 == 6 && f != 'X' && f != 'O') {
                        f = 'O';
                        break;
                    } else if (p2 == 7 && g != 'X' && g != 'O') {
                        g = 'O';
                        break;
                    } else if (p2 == 8 && h != 'X' && h != 'O') {
                        h = 'O';
                        break;
                    } else if (p2 == 9 && i != 'X' && i != 'O') {
                        i = 'O';
                        break;
                    } else {
                        System.out.println("Invalid Input!");
                        p2 = pl.nextInt();
                    }
                }
                table(a, b, c, d, e, f, g, h, i);
                move++;
                player--;
                if ((a == 'O' && b == 'O' && c == 'O') ||
                        (d == 'O' && e == 'O' && f == 'O') ||
                        (g == 'O' && h == 'O' && i == 'O') ||
                        (a == 'O' && e == 'O' && i == 'O') ||
                        (c == 'O' && e == 'O' && g == 'O') ||
                        (a == 'O' && d == 'O' && g == 'O') ||
                        (b == 'O' && e == 'O' && h == 'O') ||
                        (c == 'O' && f == 'O' && i == 'O')) {
                    System.out.println("Player 2 wins**");
                    num = 2;
                    break;
                }
            }
        }
        if (num % 2 != 0) {
            System.out.println("It's a draw!");
        }
        pl.close();
    }
}
}