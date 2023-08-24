import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер фигуры: ");
        int num = scanner.nextInt();

      for (int k = 0; k < num; k++) {
          if (k % 2 == 0) {
        for (int i = 0; i < num; i++) {
            /*  if (i % 2 == 0) {*/
            for (int j = 0; j < num; j++) {
                if (j % 2 == 0) {
                    Chess smallChess = new Chess(num);
                } else {
                    Empty emptyChess = new Empty(num);
                }
            }
            System.out.println();


        }

        } else {
              for (int i = 0; i < num; i++) {
                  /*  if (i % 2 == 0) {*/
                  for (int j = 0; j < num; j++) {
                      if (j % 2 == 0) {
                          Empty emptyChess = new Empty(num);
                      } else {
                          Chess smallChess = new Chess(num);
                      }
                  }
                  System.out.println();

              }
          }
        }
    }
}

