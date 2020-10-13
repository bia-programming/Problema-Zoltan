package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Car> cars=new ArrayList<>();
        ArrayList<Suv> suv=new ArrayList<>();
        int a=1,b=1;

        System.out.println("1.Vizualizare car: ");
        System.out.println("2.Vizualizare suv: ");
        System.out.println("3.Adaugare car: ");
        System.out.println("4.Adaugare suv: ");
        System.out.println("5.Sterge o masina dupa id: ");
        System.out.println("6.Sterge suv dupa id:");
        System.out.println("7.Actualizeaza masina dupa id: ");
        System.out.println("8.Actualizeaza suv dupa id:");
        System.out.println("0.Iesire");
        System.out.println("Introduceti optiunea: ");
        String choice = scanner.next();
        do {
            switch (choice) {
                case "1":
                    for(int i=0;i<cars.size();i++){
                        System.out.println("Id: " +cars.get(i).getId());
                        System.out.println("Wind shiled: " +cars.get(i).isWindShiled());
                        System.out.println("Wheels: " +cars.get(i).getWheels());
                        System.out.println("Is leather: " +cars.get(i).isLeather());
                        System.out.println("Seats: " +cars.get(i).getSeats());
                    }
                    break;

                case "2":
                    for(int j=0;j<suv.size();j++){
                        System.out.println("Id: "+suv.get(j).getId());
                        System.out.println("Wind shiled: "+suv.get(j).isWindShiled());
                        System.out.println("Wheels: "+suv.get(j).getWheels());
                        System.out.println("Suspension type: "+suv.get(j).getSuspensionType());
                        System.out.println("Has removale roof: "+ suv.get(j).isHasRemovableRoof());
                    }
                    break;

                case "3":
                    System.out.println("Doors: ");
                    scanner.nextLine();
                    int doors=scanner.nextInt();

                    System.out.println("Wind shiled: ");
                    scanner.nextLine();
                    boolean windShiled=scanner.nextBoolean();

                    System.out.println("Wheels: ");
                    scanner.nextLine();
                    int wheels=scanner.nextInt();

                    System.out.println("Is leather: ");
                    scanner.nextLine();
                    boolean isLeather=scanner.nextBoolean();

                    System.out.println("Seats");
                    scanner.nextLine();
                    int seats=scanner.nextInt();

                    Car c=new Car(a,doors,windShiled,wheels,isLeather,seats);
                    cars.add(c);
                    a++;
                    break;

                case "4":
                    System.out.println("Doors: ");
                    scanner.nextLine();
                    int door=scanner.nextInt();

                    System.out.println("Wind shiled: ");
                    scanner.nextLine();
                    boolean windshiled=scanner.nextBoolean();

                    System.out.println("Wheels: ");
                    scanner.nextLine();
                    int wheel=scanner.nextInt();

                    System.out.println("Suspension type: ");
                    scanner.nextLine();
                    String suspensiontype=scanner.next();

                    System.out.println("Has removable roof: ");
                    scanner.nextLine();
                    boolean hasRemovableroof=scanner.nextBoolean();

                    Suv s=new Suv(b,door,windshiled,wheel,suspensiontype,hasRemovableroof);
                    suv.add(s);
                    b++;
                    break;

                case "5":
                    System.out.println("Introduceti id-ul: ");
                    int choice2 = scanner.nextInt();
                    for(int i=0;i<cars.size();i++){
                        if(choice2==cars.get(i).getId())
                            cars.remove(cars.get(i));
                    }
                    break;

                case "6":
                    System.out.println("Introduceti id-ul: ");
                    int Choice = scanner.nextInt();
                    for(int k=0;k<suv.size();k++){
                        if(Choice==suv.get(k).getId())
                            suv.remove(suv.get(k));
                    }
                    break;

                case "7":
                    System.out.println("Introduceti id-ul: ");
                    int choice3=scanner.nextInt();
                    for(int u=0;u<cars.size();u++){
                        if (choice3==cars.get(u).getId()) {
                            System.out.println("Doors: ");
                            scanner.nextLine();
                            int Door = scanner.nextInt();

                            System.out.println("Wind shiled: ");
                            scanner.nextLine();
                            boolean WindShiled = scanner.nextBoolean();

                            System.out.println("Wheels: ");
                            scanner.nextLine();
                            int Wheels = scanner.nextInt();

                            System.out.println("Is leather: ");
                            scanner.nextLine();
                            boolean IsLeather = scanner.nextBoolean();

                            System.out.println("Seats");
                            scanner.nextLine();
                            int Seats = scanner.nextInt();
                            c = new Car(1, Door, WindShiled, Wheels, IsLeather, Seats);
                            cars.add(c);
                        }
                    }
                    break;

                case "8":
                    System.out.println("Introduceti id-ul:");
                    int choice4=scanner.nextInt();
                    for(int v=1;v<suv.size();v++){
                        if (choice4==suv.get(v).getId()){
                            System.out.println("Doors: ");
                            scanner.nextLine();
                            int Doors=scanner.nextInt();

                            System.out.println("Wind shiled: ");
                            scanner.nextLine();
                            boolean Windshiled=scanner.nextBoolean();

                            System.out.println("Wheels: ");
                            scanner.nextLine();
                            int Wheels=scanner.nextInt();

                            System.out.println("Suspension type: ");
                            scanner.nextLine();
                            String Suspensiontype=scanner.next();

                            System.out.println("Has removable roof: ");
                            scanner.nextLine();
                            boolean HasRemovableroof=scanner.nextBoolean();

                            s=new Suv(2,Doors,Windshiled,Wheels,Suspensiontype,HasRemovableroof);
                            suv.add(s);
                        }
                    }
                    break;
            }

            System.out.println("1.Vizualizare car: ");
            System.out.println("2.Vizualizare suv: ");
            System.out.println("3.Adaugare car: ");
            System.out.println("4.Adaugare suv: ");
            System.out.println("5.Sterge o masina dupa id: ");
            System.out.println("6.Sterge suv dupa id:");
            System.out.println("7.Actualizeaza masina dupa id: ");
            System.out.println("8.Actualizeaza suv dupa id:");
            System.out.println("0.Iesire");
            System.out.println("Introduceti optiunea: ");
            choice = scanner.next();
        } while (choice != "0");
    }
}