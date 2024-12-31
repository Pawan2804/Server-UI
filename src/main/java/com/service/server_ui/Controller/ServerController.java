package com.service.server_ui.Controller;

import com.service.server_ui.Models.Service;
import com.service.server_ui.Service.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Map;
@CrossOrigin(origins = "http://localhost:4200")
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
    public Service createService(@RequestBody Service service) throws IOException {
        return serverService.saveServer(service);
    }
//@PostMapping("/servicehealth")
//public ResponseEntity<String> uploadService(
//        @RequestParam("name") String name,
//        @RequestParam("statusLocation") Map<String, String> statusLocation,
//        @RequestParam(value = "file", required = false) MultipartFile file
//) {
//    try {
//        serverService.saveServer(name, statusLocation, file);
//        return ResponseEntity.ok("Service uploaded successfully!");
//    } catch (IOException e) {
//        return ResponseEntity.badRequest().body("Error uploading service: " + e.getMessage());
//    }
//}
    @DeleteMapping("/servicehealth/{id}")
    public String deleteService(@PathVariable Long id){
        return serverService.deleteServer(id);
    }

}
