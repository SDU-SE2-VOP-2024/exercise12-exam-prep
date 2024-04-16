package laundry_facade;


public interface LaundryMachine {

    String getModel();

    double getPrice(int prog);

    String getProgName(int prog);
}
