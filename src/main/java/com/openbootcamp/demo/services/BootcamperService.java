package com.openbootcamp.demo.services;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.openbootcamp.demo.models.Bootcamper;

@Service
public class BootcamperService {
    private List<Bootcamper> bootcampersList = new ArrayList<Bootcamper>();

    public List<Bootcamper> getAll() {
        return bootcampersList;
    }

    public Bootcamper getOne(String name) {

        for (Bootcamper bootcamper : this.bootcampersList) {
            if (bootcamper.getName().equalsIgnoreCase(name)) {
                return bootcamper;
            }
        }

        return null;
    }

    public boolean add(Bootcamper bootcamper) {
        return bootcampersList.add(bootcamper);
    }

}
