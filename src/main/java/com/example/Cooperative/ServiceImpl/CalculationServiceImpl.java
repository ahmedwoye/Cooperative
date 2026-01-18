package com.example.Cooperative.ServiceImpl;

import com.example.Cooperative.Entity.Calculation;
import com.example.Cooperative.Enum.OperationType;
import com.example.Cooperative.Repository.CalculationRepository;
import com.example.Cooperative.Service.CalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CalculationServiceImpl implements CalculationService {

private final  CalculationRepository repository;

    public CalculationServiceImpl(CalculationRepository repository) {
        this.repository = repository;
    }

    @Override
        public Calculation addNumbers(int a, int b) {
            Calculation calculation = new Calculation();
            calculation.setNumber1(a);
            calculation.setNumber2(b);
            calculation.setResult(a + b);
            calculation.setOperationType(OperationType.ADD);

            return repository.save(calculation);
        }
}
