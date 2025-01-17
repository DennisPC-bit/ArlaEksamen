package BE;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Employee {
    IntegerProperty id = new SimpleIntegerProperty();
    StringProperty firstName = new SimpleStringProperty();
    StringProperty lastName = new SimpleStringProperty();
    IntegerProperty screenNumber = new SimpleIntegerProperty();
    StringProperty description  = new SimpleStringProperty();

    public Employee(int id, String firstName, String lastName, int screenNumber, String description){
        this.id.set(id);
        this.firstName.set(firstName);
        this.lastName.set(lastName);
        this.screenNumber.set(screenNumber);
        this.description.set(description);
    }

    public int getId() {
        return id.get();
    }

    public int getScreenNumber() {
        return screenNumber.get();
    }

    public String getFirstName() {
        return firstName.get();
    }

    public String getLastName() {
        return lastName.get();
    }

    public String getDescription() {
        return description.get();
    }
}
