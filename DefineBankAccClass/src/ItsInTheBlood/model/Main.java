package ItsInTheBlood.model;

import ItsInTheBlood.model.controller.HealthManager;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        InputOutputManager.getInstance().run(HealthManager.getInstance());

    }
}
