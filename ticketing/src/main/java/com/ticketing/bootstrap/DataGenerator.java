package com.ticketing.bootstrap;


import com.ticketing.dto.ProjectDTO;
import com.ticketing.dto.RoleDTO;
import com.ticketing.dto.UserDTO;
import com.ticketing.enums.Gender;
import com.ticketing.enums.Status;
import com.ticketing.service.ProjectService;
import com.ticketing.service.RoleService;
import com.ticketing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataGenerator implements CommandLineRunner {

    RoleService roleService;
    UserService userService;
    ProjectService projectService;

    @Autowired
    public DataGenerator(RoleService roleService, UserService userService, ProjectService projectService) {
        this.roleService = roleService;
        this.userService = userService;
        this.projectService = projectService;
    }

    @Override
    public void run(String... args) throws Exception {

        RoleDTO adminRole = new RoleDTO(1L,"Admin");
        RoleDTO managerRole = new RoleDTO(2L,"Manager");
        RoleDTO employeeRole = new RoleDTO(3L,"Employee");

        roleService.save(adminRole);
        roleService.save(managerRole);
        roleService.save(employeeRole);

        UserDTO user1 = new UserDTO("John", "Kesy",
                "admin@cybertek.com", "abc", true, "7459684532", adminRole, Gender.MALE);
        UserDTO user5 = new UserDTO("John", "Kesy",
                "admin2@cybertek.com", "abc", true, "7459684532", adminRole, Gender.MALE);
        UserDTO user2 = new UserDTO("Delisa",
                "Norre", "T001@cybertek.com", "123", true, "8567412358", managerRole, Gender.FEMALE);
        UserDTO user3 = new UserDTO("Craig", "Jark",
                "P001@cybertek.com", "123", true, "7777775566", employeeRole, Gender.MALE);
        UserDTO user4 = new UserDTO("Shaun",
                "Hayns", "S001@cybertek.com", "123", true, "3256987412", employeeRole, Gender.MALE);

        userService.save(user1);
        userService.save(user2);
        userService.save(user3);
        userService.save(user4);
        userService.save(user5);


        ProjectDTO project1 = new ProjectDTO("Spring MVC", "PR001", user1, LocalDate.now(),LocalDate.now().plusDays(25),"Creating cont", Status.OPEN);
        ProjectDTO project2 = new ProjectDTO("Spring ORM", "PR002", user2, LocalDate.now(),LocalDate.now().plusDays(25),"Creating dont", Status.IN_PROGRESS);

       projectService.save(project1);
       projectService.save(project2);

    }
}
