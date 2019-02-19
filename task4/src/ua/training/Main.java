package ua.training;

import ua.training.controller.*;
import ua.training.model.*;
import ua.training.view.*;

public class Main {

    public static void main(String[] args) {
        // Initialization
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        // Run
        controller.processUser();
    }

}