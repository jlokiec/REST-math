package pl.threee.recruitmenttask.services;

import org.springframework.stereotype.Service;

@Service
public class MathService {
    public double add(double val1, double val2) {
        return val1 + val2;
    }
}
