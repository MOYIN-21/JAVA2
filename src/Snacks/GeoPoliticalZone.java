package Snacks;

public enum GeoPoliticalZone {
    NORTH_EAST("", "", "", "", "", ""),

    NORTH_WEST("", "", "", "", "", "", ""),

    NORTH_CENTRAL("", "", "", "", "", "", ""),

    SOUTH_EAST("", "", "", "", ""),

    SOUTH_SOUTH("", "", "", "", "", ""),

    SOUTH_WEST("", "", "", "", "", "");


    GeoPoliticalZone(String state1, String state2, String state3, String state4, String state5, String state6, String state7) {
    }

    GeoPoliticalZone(String zone1, String zone2, String zone3, String zone4, String zone5, String zone6) {
    }

    GeoPoliticalZone(String zone1, String zone2, String zone3, String zone4, String zone5) {
    }


    public GeoPoliticalZone setNorthWest() {
        return NORTH_WEST;
    }

    public String getNorthWest() {
        return "JIGAWA,KADUNA ,KASTINA, KEBBI, KANO, SOKOTO, ZAMFARA";
    }

    public GeoPoliticalZone setNorthEast() {
        return NORTH_EAST;
    }

    public String getNorthWEast() {
        return "EBONYI, ABIA, ANAMBRA, IMO, ENUGU";
    }

    public GeoPoliticalZone setNorthCentral(){
        return NORTH_CENTRAL;
    }

    public String getNorth_Central() {
        return "BENUE, KOGI, KWARA, NASARAWA, NIGER, PLATEAU, F.C.T";
    }

    public GeoPoliticalZone setSouthEast() {
        return SOUTH_EAST;
    }

    public String getSouthEast() {
        return "EBONYI, ABIA, ANAMBRA, IMO, ENUGU";
    }
    public GeoPoliticalZone setSouthWest() {
        return SOUTH_WEST;
    }

    public String getSouthWest(){
        return "LAGOS, OSUN, OYO, EKITI, OGUN, ONDO";
    }

    public GeoPoliticalZone setSouthSouth() {
        return SOUTH_SOUTH;
    }

    public String getSouthSouth(){
        return "DELTA, EDO, AKWA IBOM, BAYALSA, CROSS RIVER, RIVER";
    }
}




