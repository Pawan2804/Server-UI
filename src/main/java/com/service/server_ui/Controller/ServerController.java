package com.service.server_ui.Controller;

import com.service.server_ui.Models.Service;
import com.service.server_ui.Service.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ServerController {
    @Autowired
    public ServerService serverService;
    @GetMapping("/servicehealth")
    public List<Service> getAllService(){
        return serverService.getAllServers();
    }
    @PostMapping("/servicehealth")
    public Service createService(@RequestBody Service service){
        return serverService.saveServer(service);
    }
    @DeleteMapping("/servicehealth/{id}")
    public String deleteService(@PathVariable Long id){
        return serverService.deleteServer(id);
    }

}
