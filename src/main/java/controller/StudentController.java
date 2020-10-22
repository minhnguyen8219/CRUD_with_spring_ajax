package controller;

import model.Province;
import model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.province.IProvinceService;
import service.student.IStudentService;

@Controller
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private IProvinceService provinceService;

    @Autowired
    private IStudentService studentService;

    @ModelAttribute("provinces")
    public Iterable<Province> provinces() {
        return provinceService.findAll();
    }

    @GetMapping("")
    public ModelAndView listStudent() {
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("students", studentService.findAll());
        return modelAndView;
    }

//
//    @PostMapping("/create")
//    public ResponseEntity<Student> create(@RequestBody Student student) {
//        studentService.save(student);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
//
//    @GetMapping("/findAll")
//    public ResponseEntity<Iterable<Student>> findAll() {
//        return new ResponseEntity<>(studentService.findAll(), HttpStatus.OK);
//    }
//
//    @GetMapping("/search/{name}")
//    public ResponseEntity<Iterable<Student>> findAllByName(@PathVariable String name) {
//        return new ResponseEntity<>(studentService.findAllByNameContaining(name), HttpStatus.OK);
//    }

}
