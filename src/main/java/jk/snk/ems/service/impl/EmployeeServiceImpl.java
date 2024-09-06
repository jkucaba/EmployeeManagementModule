package jk.snk.ems.service.impl;

import jk.snk.ems.dto.EmployeeDto;
import jk.snk.ems.entity.Employee;
import jk.snk.ems.mapper.EmployeeMapper;
import jk.snk.ems.repository.EmployeeRepository;
import jk.snk.ems.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {

        Employee employee = EmployeeMapper.maptoEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.maptoEmployeeDto(savedEmployee);
    }
}
