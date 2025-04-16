package views;

import java.util.Scanner;

public class ShowConsole {
    private  Scanner scanner;
    
    public ShowConsole(){
        this.scanner=new Scanner(System.in);
    }
    public void ShowBanner(){
        System.out.println("-----Metodos de busqueda----");
    }
    public int inputCode(){
        System.out.println("Ingrese el codigo: ");
        int code= scanner.nextInt();
        return code;
    }

    public int inputName(){
        System.out.println("Ingrese el nombre: ");
        int nombre= scanner.nextInt();
        return nombre;
    }
    public String inputName2(){
        System.out.println("Ingrese el nombre: ");
        String nombre= scanner.nextLine();
        return nombre;
    }

    public void showMessagge(String message){
        System.out.println(message);
    }
}
