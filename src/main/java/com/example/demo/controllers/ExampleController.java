package com.example.demo.controllers;

import java.util.List;

import com.example.demo.model.ExampleModel;
import com.example.demo.services.ExampleService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
public class ExampleController {
	@GetMapping("/get")
    public List<ExampleModel> getAllImages(){
        
        return ExampleService.getAllImages();
    }

	@GetMapping("/get/{imgId}")
    public ExampleModel getImgById(@PathVariable Long imgId) {
        return ExampleService.getImageById(imgId);
    }

	@PostMapping("")
    public ExampleModel addImage(@RequestBody ExampleModel imgInfo){
        return ExampleService.addImage(imgInfo);
    }

	@PutMapping("/update/{imgId}")
    public ExampleModel updateImg(@PathVariable Long imgId, @RequestBody ExampleModel imgInfo){
        return ExampleService.updateImg(imgId, imgInfo);
    }

    @DeleteMapping("/delete/{imgId}")
    public ExampleModel deleteImg(@PathVariable Long imgId){
        return ExampleService.deleteImg(imgId);
    }
}
