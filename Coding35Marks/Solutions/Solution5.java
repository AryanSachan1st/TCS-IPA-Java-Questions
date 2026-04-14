package Coding35Marks.Solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class Flight {
    private String flightId, airline, origin, destination;
    private double farePerSeat;
    private int totalSeats, bookedSeats;

    // constructor
    public Flight(String flightId, String airline, String origin, String destination, double farePerSeat, int totalSeats, int bookedSeats) {
        this.flightId = flightId;
        this.airline = airline;
        this.origin = origin;
        this.destination = destination;
        this.farePerSeat = farePerSeat;
        this.totalSeats = totalSeats;
        this.bookedSeats = bookedSeats;
    }

    // getters
    public String getFlightId() {
        return this.flightId;
    }
    public String getAirline() {
        return this.airline;
    }
    public String getOrigin() {
        return this.origin;
    }
    public String getDestination() {
        return this.destination;
    }
    public double getFarePerSeat() {
        return this.farePerSeat;
    }
    public int getTotalSeats() {
        return this.totalSeats;
    }
    public int getBookedSeats() {
        return this.bookedSeats;
    }

    // methods
    public int getAvailableSeats() {
        int availSeats = this.totalSeats - this.bookedSeats;
        return availSeats < 0 ? 0 : availSeats;
    }
    public boolean isFullyBooked() {
        return getAvailableSeats() != 0 ? true : false;
    }
    public double getTotalRevenue() {
        double totalRevenue = this.bookedSeats * this.farePerSeat;
        return Math.floor(totalRevenue * 100)/100.0;
    }
}

public class Solution5 {
    private static String findCheapestFlight(Flight[] flights, String origin, String destination) {
        double lowestPrice = Double.MAX_VALUE;
        Flight cheapestFlight = null;

        for (Flight flight: flights) {
            if (flight.getOrigin().equalsIgnoreCase(origin) && flight.getDestination().equalsIgnoreCase(destination)) {
                if (flight.getFarePerSeat() < lowestPrice) {
                    lowestPrice = flight.getFarePerSeat();
                    cheapestFlight = flight;
                }
            }
        }
        return cheapestFlight != null ? cheapestFlight.getFlightId() : "No Flights Available";
    }
    private static Flight[] getFlightByAirline(Flight[] flights, String airline) {
        List<Flight> filteredFlights = new ArrayList<>();
        PriorityQueue<Flight> minHeap = new PriorityQueue<>((f1, f2) -> Double.compare(f1.getFarePerSeat(), f2.getFarePerSeat()));

        for (Flight flight: flights) {
            if (flight.getAirline().equalsIgnoreCase(airline)) {
                minHeap.add(flight);
            }
        }

        while (!minHeap.isEmpty()) {
            filteredFlights.add(minHeap.poll());
        }
        return filteredFlights.isEmpty() ? null : filteredFlights.toArray(new Flight[0]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of flights: ");
        int n = sc.nextInt();
        sc.nextLine();

        Flight[] flights = new Flight[n];

        for (int i=0; i<n; i++) {
            System.out.print("Enter flightId: ");
            String flightId = sc.nextLine();

            System.out.print("Enter airline: ");
            String airline = sc.nextLine();

            System.out.print("Enter origin: ");
            String origin = sc.nextLine();

            System.out.print("Enter destination: ");
            String destination = sc.nextLine();

            System.out.print("Enter fare per seat: ");
            double farePerSeat = sc.nextDouble();
            
            System.out.print("Enter totalSeats: ");
            int totalSeats = sc.nextInt();

            System.out.print("Enter booked seats: ");
            int bookedSeats = sc.nextInt();
            sc.nextLine();

            Flight flight = new Flight(flightId, airline, origin, destination, farePerSeat, totalSeats, bookedSeats);

            flights[i] = flight;
        }

        System.out.print("Enter test origin: ");
        String testOrigin = sc.nextLine();

        System.out.print("Enter test destination: ");
        String testDestination = sc.nextLine();

        System.out.print("Enter airline: ");
        String testAirline = sc.nextLine();

        for (Flight flight: flights) {
            System.out.println(flight.getFlightId() + " " + flight.getAvailableSeats() + " " + flight.isFullyBooked() + " " + flight.getTotalRevenue());
        }

        System.out.println(findCheapestFlight(flights, testOrigin, testDestination));
        Flight[] filteredFlights = getFlightByAirline(flights, testAirline);

        if (filteredFlights == null) {
            System.out.println("No flights found for airline: " + testAirline);
        } else {
            for (Flight flight: filteredFlights) {
                System.out.println(flight.getFlightId() + " " + flight.getAirline() + " " + flight.getFarePerSeat() + " " + flight.getAvailableSeats());
            }
        }

        sc.close();
    }
}