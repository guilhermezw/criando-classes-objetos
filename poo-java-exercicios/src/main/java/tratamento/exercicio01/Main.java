package tratamento.exercicio01;

import tratamento.exercicio01.model.entities.Reservation;
import tratamento.exercicio01.model.exception.GlobalException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try{
            System.out.print("Room number: ");
            int number = sc.nextInt();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(sc.next());
            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date checkOut = sdf.parse(sc.next());

            Reservation reservation = new Reservation(number , checkIn , checkOut);
            System.out.println("Reservation: " + reservation);
            System.out.println();
            System.out.println("Enter data to update the reservation: ");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());

            reservation.updateDates(checkIn , checkOut);
            System.out.println("Reservation: " + reservation);
        } catch (ParseException erro){
            System.out.println("Invalid date format");
        } catch (GlobalException erro){
            System.out.println("Error in reservation: " + erro.getMessage());
        } catch (RuntimeException erro){
            System.out.println("Unexpected error");
        }



    }
}
