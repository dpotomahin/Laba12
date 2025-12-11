package ua.lviv.iot.algo.part1.lab12.manager;

import ua.lviv.iot.algo.part1.lab12.model.Projector;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ProjectorManager {
    private Set<Projector> projectors = new HashSet<>();

    public void addProjector(Projector projector) {
        this.projectors.add(projector);
    }

    public Set<Projector> getProjectors() {
        return new HashSet<>(projectors);
    }

    public Map<String, Projector> getProjectorsMapByModel() {
        Map<String, Projector> projectorMap = new HashMap<>();
        for (Projector projector : projectors) {
            projectorMap.put(projector.getModel(), projector);
        }
        return projectorMap;
    }

    public Map<String, List<Projector>> groupProjectorsByBrand() {
        return projectors.stream()
                .collect(Collectors.groupingBy(Projector::getBrand));
    }

    public Map<String, Integer> getCountByResolution() {
        Map<String, Integer> countMap = new HashMap<>();
        for (Projector projector : projectors) {
            countMap.put(projector.getResolution(), countMap.getOrDefault(projector.getResolution(), 0) + 1);
        }
        return countMap;
    }
}
