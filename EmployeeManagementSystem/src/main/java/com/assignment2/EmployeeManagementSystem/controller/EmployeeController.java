package com.assignment2.EmployeeManagementSystem.controller;


import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/")
public class EmployeeController {
//    @Autowired
//    private EmployeeRepository employeeRepository;
//
//    @GetMapping("/employees")
//    public List<Employee> getAllEmployees() {
//        return employeeRepository.findAll();
//    }
//    @PostMapping("/employees1")
//    public Employee createEmployee(@RequestBody Employee employee) {
//        return (Employee) employeeRepository.save(employee);
//    }
    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/home")

    public String get(){
        return "home";
    }
//    @GetMapping("/employees/{id}")
//    public ResponseEntity<Employee> getEmployeeById(@PathVariable(value = "id") Long employeeId)
//            throws ResourceNotFoundException {
//        Employee employee = employeeRepository.findById(employeeId)
//                .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));
//        return ResponseEntity.ok().body(employee);
//    }

}
