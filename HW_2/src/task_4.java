/*
 * Разработайте программу, которая выбросит Exception,
 * когда пользователь вводит пустую строку.
 * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */

import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.printf("Введите сообщение: ");
        isEmpty(in.nextLine());
    }

    private static void isEmpty(String message){
        Scanner in = new Scanner(System.in);
        while(true){
            if(message.isEmpty()){
                System.out.println("Пустые строки вводить нельзя");
                System.out.printf("Введите сообщение: ");
                message = in.nextLine();
            }
            else{
                break;
            }
        }
    }
}
