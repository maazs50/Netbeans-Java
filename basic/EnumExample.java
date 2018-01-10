package basic;//import Lang.PowerState;

enum PowerState {

    OFF("The power is off"),
    ON("The usage power is high"),
    SUSPEND("The power usage is low");
    private String description;

    private PowerState(String d) {
        description = d;
    }

    public String getDescription() {
        return description;
    }
}

 class EnumExample {

    private static PowerState ps = PowerState.SUSPEND;

    public static void main(String as[]) {

        switch (ps) {
            case ON:
                System.out.println(ps.getDescription());
                break;
            case OFF:
                System.out.println(ps.getDescription());
                break;
            case SUSPEND:
                System.out.println(ps.getDescription());
                break;
            default:
                break;
        }

    }
}
