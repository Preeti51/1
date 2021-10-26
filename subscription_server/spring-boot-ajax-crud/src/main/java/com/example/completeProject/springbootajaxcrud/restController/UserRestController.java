package com.example.completeProject.springbootajaxcrud.restController;

import com.example.completeProject.springbootajaxcrud.entity.User;
import com.example.completeProject.springbootajaxcrud.repository.UserRepository;
import com.example.completeProject.springbootajaxcrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins="*")
public class UserRestController {
    @Autowired
    UserService userService;

    // get the user list
    @GetMapping("/user")
    public List<User> getUserList(){
        return userService.getUserList();
    }

    // get the user
    @GetMapping("/user/{userId}")
    public User getUser(@PathVariable String userId)
    {
        return userService.getUserById(Integer.parseInt(userId));
    }

    // login user
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Map<String,String> map){
        System.out.println(map.toString());

        User user = userService.getUserByEmailAndPassword(map.get("email"),map.get("password"));
//        System.out.println(user);
        if(user!=null){
            return new ResponseEntity<String>(user.getId().toString(),HttpStatus.OK);}
        else {
            return new ResponseEntity < String > ("Not Found",HttpStatus.NOT_FOUND);
        }
    }

    // add the user
    @PostMapping(path = "/user",consumes = "application/json")
    public User addUser(@RequestBody User user){
        userService.saveOrUpdateUser(user);
        return user;
    }

    // update the user
    @PutMapping(path = "/user", consumes = "application/json")
    public User updateUser(@RequestBody User user){
        userService.saveOrUpdateUser(user);
        return user;
    }

    //delete the user
    @DeleteMapping("/user/{userId}")
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable String userId)
    {
        try{
            userService.deleteUser(Integer.parseInt(userId));
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

//     @Autowired
//    private CourseService courseService;
//
//    @GetMapping("/home")
//    public String home()
//    {
//        return "Welcome to courses application";
//    }
//
//    //get the courses
//
//    @GetMapping("/courses")
//    public List<Course> getCourses()
//    {
//        return this.courseService.getCourses();
//    }
//
//    //get the course
//
//    @GetMapping("/courses/{courseId}")
//    public Course getCourse(@PathVariable String courseId)
//    {
//        return this.courseService.getCourses(Long.parseLong(courseId));
//    }
//
//    // course add
//    @PostMapping(path = "/courses",consumes = "application/json")
//    public Course addCourse(@RequestBody Course course)
//    {
//        return this.courseService.addCourse(course);
//    }
//
//    //update course using PUT request
//    @PutMapping(path="/courses",consumes = "application/json")
//    public Course updateCourse(@RequestBody Course course)
//    {
//        return this.courseService.updateCourse(course);
//    }
//
//    //delete the course
//    @DeleteMapping("/courses/{courseId}")
//    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId)
//    {
//        try{
//            this.courseService.deleteCourse(Long.parseLong(courseId));
//            return new ResponseEntity<>(HttpStatus.OK);
//        } catch (Exception e) {
//            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }

}
