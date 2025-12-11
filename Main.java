package ua.lviv.iot.algo.part1.lab12;

import ua.lviv.iot.algo.part1.lab12.manager.ProjectorManager;
import ua.lviv.iot.algo.part1.lab12.model.Projector;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ProjectorManager manager = new ProjectorManager();

        manager.addProjector(new Projector("Epson", "X100", "1920x1080", 5000, 450.0));
        manager.addProjector(new Projector("Sony", "VPL-HW45", "1920x1080", 6000, 1200.0));
        manager.addProjector(new Projector("Epson", "HomeCinema", "3840x2160", 4000, 800.0));
        manager.addProjector(new Projector("BenQ", "TK850", "3840x2160", 3000, 1500.0));
        manager.addProjector(new Projector("Epson", "X100", "1920x1080", 5000, 450.0)); 

        System.out.println("All projectors in Set (duplicates removed):");
        for (Projector p : manager.getProjectors()) {
            System.out.println(p);
        }

        System.out.println("\nGrouped by Brand:");
        Map<String, List<Projector>> grouped = manager.groupProjectorsByBrand();
        grouped.forEach((brand, list) -> {
            System.out.println(brand + ": " + list);
        });

        System.out.println("\nCount by Resolution:");
        Map<String, Integer> counts = manager.getCountByResolution();
        counts.forEach((res, count) -> {
            System.out.println(res + ": " + count);
        });
    }
}
