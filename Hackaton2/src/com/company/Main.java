package com.company;

public class Main {

    public static void main(String[] args) {
        String path = "carData.xlsx";
        View view = new View();
        Controller controller = new Controller();
        Model model = new Model();
        controller.setModel(model);

        view.create();
        System.getProperty("java.class.path");
    }
}
