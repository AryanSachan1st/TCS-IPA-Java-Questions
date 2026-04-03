package Coding35Marks.Solutions;

class TravelAgencies {
    private int regNo, price;
    private String agencyName, packageType;
    private boolean flightFacility;

    public TravelAgencies(int regNo, String agencyName, String packageType, int price, boolean flightFacility) {
        this.regNo = regNo;
        this.agencyName = agencyName;
        this.packageType = packageType;
        this.price = price;
        this.flightFacility = flightFacility;
    }

    // setters
    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }
    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }
    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setFlightFacility(boolean flightFacility) {
        this.flightFacility = flightFacility;
    }

    // getters
    public int getRegNo() {
        return this.regNo;
    }
    public String getAgencyName() {
        return this.agencyName;
    }
    public String getPackageType() {
        return this.packageType;
    }
    public int getPrice() {
        return this.price;
    }
    public boolean getFlightFacility() {
        return this.flightFacility;
    }
}

public class Solution1 {
    private static int findAgencyWithHighestPackagePrice(TravelAgencies[] agencies) {
        int maxPrice = Integer.MIN_VALUE;

        for (TravelAgencies agency: agencies) {
            maxPrice = Math.max(maxPrice, agency.getPrice());
        }

        return maxPrice == Integer.MIN_VALUE ? 0 : maxPrice;
    }

    private static TravelAgencies agencyDetailsForGivenIdAndType(TravelAgencies[] agencies, int regNo, String packageType) {
        for (TravelAgencies agency: agencies) {
            if (agency.getFlightFacility()) {
                if (agency.getRegNo() == regNo && agency.getPackageType().equalsIgnoreCase(packageType)) {
                    return agency;
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        TravelAgencies agency1 = new TravelAgencies(101, "Agency1", "PK101", 5000, true);
        TravelAgencies agency2 = new TravelAgencies(102, "Agency2", "PK201", 15000, true);
        TravelAgencies agency3 = new TravelAgencies(103, "Agency3", "PK301", 5000, false);

        TravelAgencies[] agencies = {agency1, agency2, agency3};

        int maxPrice = findAgencyWithHighestPackagePrice(agencies);
        if (maxPrice == 0) {
            System.out.println("No Agency exists");
        } else {
            System.out.println(maxPrice);
        }

        TravelAgencies agency = agencyDetailsForGivenIdAndType(agencies, 101, "PK101");
        if (agency == null) {
            System.out.println("Agency Not Found with these parameters");
        } else {
            System.out.println("AgencyName: " + agency.getAgencyName() + ", Price: " + agency.getPrice());
        }
    }
}